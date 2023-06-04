package com.hussain.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Audited
@AuditTable(value = "APPLICATION_DETAIL_H")
@EntityListeners(AuditingEntityListener.class)
@Table(name = "APPLICATION_DETAIL")
@IdClass(ApplicationDetailsPK.class)
public class ApplicationDetails extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -2338626292552177485L;

    //	@EmbeddedId
//	private ApplicationDetailsPK applicationDetailsPK;

	@Id
    @OrderColumn
	@Column(name = "ORG_ID")
    private Long orgId;
	@Id
    @Column(name = "APPLICATION_ID")
    private Long applicationId;

    @Column(name = "CLIENT_ID")
    private Long clientId;

    @Column(name = "APPLIED_ON")
    private LocalDate appliedOn;

    @Column(name = "APPLIED_AMOUNT")
    private BigDecimal appliedAmount;

    @Column(name = "APPLICATION_STATUS")
    private String applicationStatus;

    @Column(name = "APP_REJ_REASON")
    private String appRejReason;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "CENTER_ID")
    private Long centerId;

    @Column(name = "CENTER_GROUP_CODE")
    private String centerGroupCode;

    @Column(name = "LOAN_PURPOSE_ID")
    private Integer loanPurposeId;

    @Column(name = "ELIGIBILITY_AMOUNT")
    private Long eligibilityAmount;

    @Column(name = "EXPECTED_DISBURSEMENT_ON")
    private LocalDate expectedDisbursementOn;

    @Column(name = "FO_ID")
    private String foId;

    @Column(name = "CYCLE")
    private Integer cycle;

    @Column(name = "APPROVED_ON")
    private LocalDate approvedOn;

    @Column(name = "PROCESSING_CHARGE")
    private Long processingCharge;

    @Column(name = "INSURANCE_CHARGE")
    private Long insuranceCharge;

    @Column(name = "PAYABLE_AMOUNT")
    private Long payableAmount;

    @Column(name = "BUREAU_RESULT")
    private String bureauResult;

    @Column(name = "IS_TOPUP")
    private String isTopUp;

    @Column(name = "IS_AGREEMENT_COPY_AVAIL")
    private String isAgreementCopyAvail;

    @Column(name = "HOME_VISIT_FLG")
    private String homeVisitFlg;

    @Column(name = "MANDATE_REQUEST_ON")
    private LocalDate mandateRequestOn;

    @Column(name = "MANDATE_STATUS")
    private String mandateStatus;

    @Column(name = "MANDATE_REJ_REASON")
    private String mandateRejReason;

    @Column(name = "MANDATE_UMRN")
    private String mandateUmrn;

    @Column(name = "INFO_VERIFIED_STATUS")
    private String infoVerifiedStatus;

    @Column(name = "INFO_VERIFIED_ON")
    private LocalDateTime infoVerifiedOn;

    @Column(name = "INFO_VERIFIED_BY")
    private String infoVerifiedBy;

    @Column(name = "INFO_VERIFIED_REJ_REASON")
    private String infoVerifiedRejReason;

    @Column(name = "INFO_VERIFIED_REJ_COUNT")
    private Integer infoVerifiedRejCount;

    @Column(name = "EXT_APPLICATION_ID")
    private String extApplicationId;

    @Column(name = "KYC_SOURCE")
    private String kycSource;

    @Column(name = "PRODUCT_GROUP_ID")
    private Integer productGroupId;

    @Column(name = "PRODUCT_ID")
    private Integer productId;

    @Column(name = "PPI_ANSWER")
    private String ppiAnswer;

    @Column(name = "PPI_SCORE")
    private Integer ppiScore;

    @Column(name = "BM_PPI_ANSWER")
    private String bmPpiAnswer;

    @Column(name = "BM_PPI_SCORE")
    private Integer bmPpiScore;

    @Column(name = "LOAN_SUB_PURPOSE_ID")
    private Integer loanSubPurposeId;

    @Column(name = "CERSAI_CHARGE")
    private Integer cersaiCharge;

    @Column(name = "DOCUMENTATION_CHARGE")
    private Integer documentationCharge;

    @Column(name = "SECURITY_DEPOSIT")
    private Integer securityDeposit;

    @Column(name = "EXT_CUST_ID")
    private String extCustId;

    @Column(name = "EKYC_NUMBER")
    private String ekycNumber;

    @Column(name = "EKYC_REFERENCE_KEY")
    private String eKycReferenceKey;

    @Column(name = "APPLICATION_CODE")
    private Long applicationCode;

    @Column(name = "EXT_LAN_NO")
    private String extLanNo;

    @Column(name = "SANCTION_DATE")
    private LocalDate sanctionDate;

    @Column(name = "SANCTION_AMOUNT")
    private BigDecimal sanctionAmount;

    @Column(name = "EXT_LOAN_ID")
    private String extLoanId;

    @Column(name = "IS_MOBILE_VERIFIED")
    private String isMobileVerified;

    @Column(name = "IS_HEALTH_CARE_DISBURSED")
    private String isHealthCareDisbursed;

    @Column(name = "EMI_DATE")
    private Long emiDate;

    @Column(name = "FIRST_EMI_DATE")
    private Date firstEmiDate;

    @Column(name = "SANCTION_STATUS")
    private String sanctionStatus;

    @Column(name = "SANCTIONED_BY")
    private String sanctionedBy;

    @Column(name = "CLM_LENDER_ID")
    private String clmLenderId;

    @Column(name = "CLM_SCHEME_ID")
    private Long clmSchemeId;


    @Column(name = "JLG_SUCESS")
    private String jlgSucess;

    @Column(name = "REFERENCE_LOAN")
    private Long referenceLoan;

    @Column(name = "OTHER_HOSPICASH_AMT")
    private BigDecimal otherHospicashAmt;

    @Column(name = "IS_EKYC_VERIFIED")
    private String isEKycVerified;

    @Column(name = "EKYC_SKIP_REASON")
    private String ekycSkipReason;

}