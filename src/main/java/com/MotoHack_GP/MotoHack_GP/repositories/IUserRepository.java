package com.MotoHack_GP.MotoHack_GP.repositories;

import com.MotoHack_GP.MotoHack_GP.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
