package com.phegondev.PhegonHotal.service.interfac;


import com.phegondev.PhegonHotal.dto.LoginRequest;
import com.phegondev.PhegonHotal.dto.Response;
import com.phegondev.PhegonHotal.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

