package com.hussain.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@Getter
@Setter
@Audited
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedBy
    @Column(name = "INSERTED_BY")
    private String insertedBy;

    @CreatedDate
    @Column(name = "INSERTED_ON")
    private LocalDateTime insertedOn;

    @LastModifiedBy
    @Column(name = "UPDATED_BY")
    protected String updatedBy;

    @LastModifiedDate
    @Column(name = "UPDATED_ON")
    private LocalDateTime updatedOn;
}