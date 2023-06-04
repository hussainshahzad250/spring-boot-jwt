package com.hussain.pojo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class ApplicationDetailsPojo {
	private Long clientId;
	private LocalDate appliedOn;
	private BigDecimal appliedAmount;
	private String applicationStatus;
	private String appRejReason;
	private String remarks;
	private Long centerId;
	private String centerGroupCode;
	private Integer loanPurposeId;
	private Long eligibilityAmount;
	private LocalDate expectedDisbursementOn;
	private String foId;
	private Integer cycle;
	private LocalDate approvedOn;
	private Long processingCharge;
	private Long insuranceCharge;
	private Long payableAmount;
	private String bureauResult;
	private String isTopUp;
	private String isAgreementCopyAvail;
	private String homeVisitFlg;
	private LocalDate mandateRequestOn;
	private String mandateStatus;
	private String mandateRejReason;
	private String mandateUmrn;
	private String infoVerifiedStatus;
	private LocalDateTime infoVerifiedOn;
	private String infoVerifiedBy;
	private String infoVerifiedRejReason;
	private Integer infoVerifiedRejCount;
	private String extApplicationId;
	private String kycSource;
	private Integer productGroupId;
	private Integer productId;
	private String ppiAnswer;
	private Integer ppiScore;
	private String bmPpiAnswer;
	private Integer bmPpiScore;
	private Integer loanSubPurposeId;
	private Integer cersaiCharge;
	private Integer documentationCharge;
	private Integer securityDeposit;
	private String extCustId;
	private String ekycNumber;
	private String eKycReferenceKey;
	private Long applicationCode;
	private String extLanNo;
	private LocalDate sanctionDate;
	private BigDecimal sanctionAmount;
	private String extLoanId;
	private String isMobileVerified;
	private String isHealthCareDisbursed;
	private Long emiDate;
	private Date firstEmiDate;
	private String sanctionStatus;
	private String sanctionedBy;
	private String clmLenderId;
	private Long clmSchemeId;

}
