package com.nick.datajpa.service;

import com.nick.datajpa.domain.User;
import com.nick.datajpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestService {

    @Autowired
    UserRepository userRepository;

   public void matcher(){
        User user = new User();
        user.setName("nick");
        List<User> users =  findPeople(user);
        log.info("users={}",users.toString());
    }



    List<User> findPeople(User probe) {
        return userRepository.findAll(Example.of(probe));
    }
}
