package com.bamba.crm.repository;

import com.bamba.crm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface I_UserRepository extends JpaRepository<User,Long> {
}
