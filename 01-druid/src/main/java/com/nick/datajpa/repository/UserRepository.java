package com.nick.datajpa.repository;

import com.nick.datajpa.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer> {
}
