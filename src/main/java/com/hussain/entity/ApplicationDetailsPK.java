package com.hussain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ApplicationDetailsPK implements Serializable {

    @Column(name = "ORG_ID")
    private Long orgId;

    @Column(name = "APPLICATION_ID")
    private Long applicationId;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ApplicationDetailsPK)) return false;
//        ApplicationDetailsPK other = (ApplicationDetailsPK) o;
//        return Objects.equals(getApplicationId(), other.getApplicationId()) &&
//                Objects.equals(getOrgId(), other.getOrgId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getApplicationId(), getOrgId());
//    }
}
