package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    public User getUserById(Integer id) {
        User user = userService.findById(id);

        return user;
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    public List<User> searchUsers(User user) {
        List<User> users = new ArrayList<>();
        users = userService.searchUsers;
        return;
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    public void createUser(@Valid @RequestBody UserRequest user) {

        return;
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してくださいa
    public void updateUser() {
        return;
    }

}
