package com.springboot.test.User.Repository;

import com.springboot.test.User.Enity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    public User findByAccount(String account);
}
