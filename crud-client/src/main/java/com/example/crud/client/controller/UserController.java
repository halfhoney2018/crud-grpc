package com.example.crud.client.controller;

import com.example.common.grpc.user.dto.AddUserRequest;
import com.example.common.grpc.user.dto.SearchUserRequest;
import com.example.common.grpc.user.dto.UserResponse;
import com.hushow.demo.grpc.user.service.UserGrpc;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @GrpcClient("userDemoClient")
    private UserGrpc.UserBlockingStub blockingStub;

    @GetMapping("test")
    public void createUser(){
        log.info("开始testAdd");
        AddUserRequest request = AddUserRequest.newBuilder().setAddress("长沙").setAge(28).setName("啊虎1").build();
        UserResponse response;
        try {
            response = blockingStub.add(request);
        } catch (StatusRuntimeException e) {
            log.error("RPC failed: " + e.getMessage(), e);
            throw e;
        }
        log.info("testAdd结果: " + response.getName());
    }

    @GetMapping("list")
    public void list(){

        log.info("开始listTest");
        SearchUserRequest request = SearchUserRequest.newBuilder().setName("虎").build();
        Iterator<UserResponse> response;
        try {
            response = blockingStub.list(request);
        } catch (StatusRuntimeException e) {
            log.error("RPC failed: " + e.getMessage(), e);
            throw e;
        }

        while (response.hasNext()) {
            log.info("listTest结果: " + response.next());
        }
    }
}
