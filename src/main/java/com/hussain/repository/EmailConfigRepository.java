package com.hussain.repository;

import com.hussain.entity.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailConfigRepository extends JpaRepository<EmailConfig,Long> {
}
