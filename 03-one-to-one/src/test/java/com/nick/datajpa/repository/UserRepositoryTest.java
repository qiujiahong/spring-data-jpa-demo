package com.nick.datajpa.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void test(){
       //log.info("users:{}",userRepository.findAll());
       // Page<User> users = userRepository.findAll(PageRequest.of(1, 20, Sort.by("name")));
       log.info("user1:{}",userRepository.findUser1s("nick"));

    }
}