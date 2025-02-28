package com.ayshriv.linkmindbackend.repository;

import com.ayshriv.linkmindbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface UserRepository extends JpaRepository<User,Long> {
}
