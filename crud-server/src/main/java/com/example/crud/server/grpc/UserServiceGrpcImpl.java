package com.example.crud.server.grpc;

import com.example.common.grpc.user.dto.AddUserRequest;
import com.example.common.grpc.user.dto.SearchUserRequest;
import com.example.common.grpc.user.dto.UserResponse;
import com.example.crud.server.model.UserDemo;
import com.hushow.demo.grpc.user.service.UserGrpc.UserImplBase;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;


@GrpcService
@Slf4j
public class UserServiceGrpcImpl  extends UserImplBase{


    @Override
    public void list(SearchUserRequest request, StreamObserver<UserResponse> responseObserver) {
        List<UserDemo> list = new ArrayList<>();
        list.add(UserDemo.builder().age(12).name("宋江").address("梁山").id(100).build());
        list.add(UserDemo.builder().age(1311).name("孙悟空").address("水帘洞").id(101).build());
        list.stream().forEach(c -> {
            UserResponse ur = UserResponse.newBuilder().setAddress(c.getAddress()).setAge(c.getAge()).setId(c.getId())
                    .setName(c.getName()).build();
            responseObserver.onNext(ur);
        });
        responseObserver.onCompleted();
    }

    @Override
    public void add(AddUserRequest request, StreamObserver<UserResponse> responseObserver) {
        log.info("start add");



        //构造rpc响应参数
        UserResponse reply = UserResponse.newBuilder().setId(1).setName(request.getName()).setAge(request.getAge())
                .setAddress(request.getAddress()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

        log.info("end add");
    }
}
