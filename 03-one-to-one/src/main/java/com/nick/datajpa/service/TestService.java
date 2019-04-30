package com.nick.datajpa.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TestService {

    @Autowired
    UserRepository userRepository;

    public void matcher() {
        User user = new User();
        user.setName("nic");
        user.setEmail("www");
        List<User> users = findPeople(user);
        log.info("users={}", users.toString());


       Optional<User>  u1 = userRepository.findOne(Example.of(user));
        List<User> users1 = userRepository.findAll(Example.of(user));
    }


    List<User> findPeople(User probe) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())
                .withMatcher("email", ExampleMatcher.GenericPropertyMatchers.contains());
        return userRepository.findAll(Example.of(probe, matcher));
    }
}
