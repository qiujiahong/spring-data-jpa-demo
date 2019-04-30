package com.nick.datajpa.repository;

import com.nick.datajpa.domain.User;
import com.nick.datajpa.domain.User1;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//public interface UserRepository  extends CrudRepository<User,Integer> {
public interface UserRepository  extends JpaRepository<User,Integer> {
    //自定义类型，FROM 后面的是类名，而不是表名
    @Query(value = "SELECT new com.nick.datajpa.domain.User1(a.id, a.name, a.email, 'normal') FROM User a WHERE a.name = ?1")
    List<User1> findUser1s(String name);
}

