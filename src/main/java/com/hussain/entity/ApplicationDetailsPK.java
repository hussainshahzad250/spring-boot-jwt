package com.hussain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
@Setter
//@Embeddable
public class ApplicationDetailsPK implements Serializable {

    @Column(name = "ORG_ID")
    private Long orgId;

    @Column(name = "APPLICATION_ID")
    private Long applicationId;
}
