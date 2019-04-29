package com.nick.datajpa.repository;

import com.nick.datajpa.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//public interface UserRepository  extends CrudRepository<User,Integer> {
public interface UserRepository  extends PagingAndSortingRepository<User,Integer> {

}

