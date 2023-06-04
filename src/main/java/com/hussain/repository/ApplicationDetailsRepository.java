package com.hussain.repository;

import com.hussain.entity.ApplicationDetails;
import com.hussain.entity.ApplicationDetailsPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Shahzad Hussain 
 */
@Repository
public interface ApplicationDetailsRepository extends JpaRepository<ApplicationDetails, ApplicationDetailsPK>{
    Optional<ApplicationDetails> findByApplicationDetailsPK_OrgIdAndApplicationDetailsPK_ApplicationId(Long orgId, Long applicationId);
}