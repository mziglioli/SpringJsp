package com.springangular.controller;

import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springangular.model.User;
import com.springangular.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController extends ControllerDefault<UserService> {

    @RequestMapping(value = "/new", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User teste() {
        User user = new User();
        user.setName("marcelo");
        user.setEmail("m@m.m");

        User user2 = new User();
        user2.setName("mallmann");
        user2.setEmail("m@m.m");

        getService().save(user);
        getService().save(user2);

        return getService().save(user2);

    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<User> findAll() {
        return getService().findAll();
    }

}
