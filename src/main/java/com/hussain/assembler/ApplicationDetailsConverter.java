package com.hussain.assembler;

import com.hussain.entity.ApplicationDetails;
import com.hussain.entity.ApplicationDetailsPK;
import com.hussain.request.ExcelRequest;
import com.hussain.response.ApplicationDetailsResponse;
import com.hussain.utils.DateTimeUtil;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shahzad Hussain
 */
public class ApplicationDetailsConverter {
    public static List<ApplicationDetails> getEntityListFromRequest(List<ExcelRequest> request) {
        if ((CollectionUtils.isEmpty(request)))
            return Collections.emptyList();
        return request.parallelStream().map(ApplicationDetailsConverter::getEntityFromRequest).collect(Collectors.toList());
    }

    public static ApplicationDetails getEntityFromRequest(ExcelRequest request) {
        if (request == null)
            return null;
        ApplicationDetails applicationDetails = new ApplicationDetails();
        ApplicationDetailsPK applicationDetailsPK = new ApplicationDetailsPK();
        applicationDetailsPK.setOrgId(1L);
        applicationDetailsPK.setApplicationId(request.getApplicationCode());
        applicationDetails.setApplicationDetailsPK(applicationDetailsPK);
        applicationDetails.setClientId(request.getClientId());
        applicationDetails.setAppliedOn(DateTimeUtil.stringToLocalDate(request.getAppliedOn(),DateTimeUtil.DD_MM_YYYY));
        applicationDetails.setAppliedAmount(request.getAppliedAmount());
        applicationDetails.setApplicationStatus(request.getApplicationStatus());
        applicationDetails.setAppRejReason(request.getAppRejReason());
//        applicationDetails.setRemarks(request.getRemarks());
        applicationDetails.setCenterId(request.getCenterId());
        applicationDetails.setCenterGroupCode(request.getCenterGroupCode());
//        applicationDetails.setLoanPurposeId(request.getLoanPurposeId());
        applicationDetails.setEligibilityAmount(request.getEligibilityAmount());
//        applicationDetails.setExpectedDisbursementOn(request.getExpectedDisbursementOn());
//        applicationDetails.setFoId(request.getFoId());
        applicationDetails.setCycle(request.getCycle());
        applicationDetails.setApprovedOn(DateTimeUtil.stringToLocalDate(request.getApprovedOn(),DateTimeUtil.DD_MM_YYYY));
//        applicationDetails.setProcessingCharge(request.getProcessingCharge());
//        applicationDetails.setInsuranceCharge(request.getInsuranceCharge());
//        applicationDetails.setPayableAmount(request.getPayableAmount());
        applicationDetails.setBureauResult(request.getBureauResult());
//        applicationDetails.setIsTopUp(request.getIsTopUp());
//        applicationDetails.setIsAgreementCopyAvail(request.getIsAgreementCopyAvail());
//        applicationDetails.setHomeVisitFlg(request.getHomeVisitFlg());
//        applicationDetails.setMandateRequestOn(request.getMandateRequestOn());
//        applicationDetails.setMandateStatus(request.getMandateStatus());
//        applicationDetails.setMandateRejReason(request.getMandateRejReason());
//        applicationDetails.setMandateUmrn(request.getMandateUmrn());
        applicationDetails.setInfoVerifiedStatus(request.getInfoVerifiedStatus());
//        applicationDetails.setInfoVerifiedOn(request.getInfoVerifiedOn());
//        applicationDetails.setInfoVerifiedBy(request.getInfoVerifiedBy());
//        applicationDetails.setInfoVerifiedRejReason(request.getInfoVerifiedRejReason());
//        applicationDetails.setInfoVerifiedRejCount(request.getInfoVerifiedRejCount());
        applicationDetails.setExtApplicationId(request.getExtApplicationId());
//        applicationDetails.setKycSource(request.getKycSource());
//        applicationDetails.setProductGroupId(request.getProductGroupId());
//        applicationDetails.setProductId(request.getProductId());
//        applicationDetails.setPpiAnswer(request.getPpiAnswer());
//        applicationDetails.setPpiScore(request.getPpiScore());
        applicationDetails.setBmPpiAnswer(request.getBmPpiAnswer());
        applicationDetails.setBmPpiScore(request.getBmPpiScore());
//        applicationDetails.setLoanSubPurposeId(request.getLoanSubPurposeId());
        applicationDetails.setCersaiCharge(request.getCersaiCharge());
        applicationDetails.setDocumentationCharge(request.getDocumentationCharge());
//        applicationDetails.setSecurityDeposit(request.getSecurityDeposit());
        applicationDetails.setExtCustId(request.getExtCustId());
        applicationDetails.setEkycNumber(request.getEkycNumber());
//        applicationDetails.setEKycReferenceKey(request.getEKycReferenceKey());
        applicationDetails.setApplicationCode(request.getApplicationCode());
        applicationDetails.setExtLanNo(request.getExtLanNo());
//        applicationDetails.setSanctionDate(request.getSanctionDate());
//        applicationDetails.setSanctionAmount(request.getSanctionAmount());
        applicationDetails.setExtLoanId(request.getExtLoanId());
//        applicationDetails.setIsMobileVerified(request.getIsMobileVerified());
//        applicationDetails.setIsHealthCareDisbursed(request.getIsHealthCareDisbursed());
        applicationDetails.setEmiDate(request.getEmiDate());
//        applicationDetails.setFirstEmiDate(request.getFirstEmiDate());
//        applicationDetails.setSanctionStatus(request.getSanctionStatus());
//        applicationDetails.setSanctionedBy(request.getSanctionedBy());
        applicationDetails.setClmLenderId(request.getClmLenderId());
        applicationDetails.setClmSchemeId(request.getClmSchemeId());
        return applicationDetails;

    }

    public static ApplicationDetailsResponse getResponseFromEntity(ApplicationDetails request) {
        if (request == null)
            return null;
        ApplicationDetailsResponse applicationDetailsResponse = new ApplicationDetailsResponse();
        applicationDetailsResponse.setApplicationDetailsId(request.getApplicationDetailsPK().getApplicationId());
        applicationDetailsResponse.setClientId(request.getClientId());
        applicationDetailsResponse.setAppliedOn(request.getAppliedOn());
        applicationDetailsResponse.setAppliedAmount(request.getAppliedAmount());
        applicationDetailsResponse.setApplicationStatus(request.getApplicationStatus());
        applicationDetailsResponse.setAppRejReason(request.getAppRejReason());
        applicationDetailsResponse.setRemarks(request.getRemarks());
        applicationDetailsResponse.setCenterId(request.getCenterId());
        applicationDetailsResponse.setCenterGroupCode(request.getCenterGroupCode());
        applicationDetailsResponse.setLoanPurposeId(request.getLoanPurposeId());
        applicationDetailsResponse.setEligibilityAmount(request.getEligibilityAmount());
        applicationDetailsResponse.setExpectedDisbursementOn(request.getExpectedDisbursementOn());
        applicationDetailsResponse.setFoId(request.getFoId());
        applicationDetailsResponse.setCycle(request.getCycle());
        applicationDetailsResponse.setApprovedOn(request.getApprovedOn());
        applicationDetailsResponse.setProcessingCharge(request.getProcessingCharge());
        applicationDetailsResponse.setInsuranceCharge(request.getInsuranceCharge());
        applicationDetailsResponse.setPayableAmount(request.getPayableAmount());
        applicationDetailsResponse.setBureauResult(request.getBureauResult());
        applicationDetailsResponse.setIsTopUp(request.getIsTopUp());
        applicationDetailsResponse.setIsAgreementCopyAvail(request.getIsAgreementCopyAvail());
        applicationDetailsResponse.setHomeVisitFlg(request.getHomeVisitFlg());
        applicationDetailsResponse.setMandateRequestOn(request.getMandateRequestOn());
        applicationDetailsResponse.setMandateStatus(request.getMandateStatus());
        applicationDetailsResponse.setMandateRejReason(request.getMandateRejReason());
        applicationDetailsResponse.setMandateUmrn(request.getMandateUmrn());
        applicationDetailsResponse.setInfoVerifiedStatus(request.getInfoVerifiedStatus());
        applicationDetailsResponse.setInfoVerifiedOn(request.getInfoVerifiedOn());
        applicationDetailsResponse.setInfoVerifiedBy(request.getInfoVerifiedBy());
        applicationDetailsResponse.setInfoVerifiedRejReason(request.getInfoVerifiedRejReason());
        applicationDetailsResponse.setInfoVerifiedRejCount(request.getInfoVerifiedRejCount());
        applicationDetailsResponse.setExtApplicationId(request.getExtApplicationId());
        applicationDetailsResponse.setKycSource(request.getKycSource());
        applicationDetailsResponse.setProductGroupId(request.getProductGroupId());
        applicationDetailsResponse.setProductId(request.getProductId());
        applicationDetailsResponse.setPpiAnswer(request.getPpiAnswer());
        applicationDetailsResponse.setPpiScore(request.getPpiScore());
        applicationDetailsResponse.setBmPpiAnswer(request.getBmPpiAnswer());
        applicationDetailsResponse.setBmPpiScore(request.getBmPpiScore());
        applicationDetailsResponse.setLoanSubPurposeId(request.getLoanSubPurposeId());
        applicationDetailsResponse.setCersaiCharge(request.getCersaiCharge());
        applicationDetailsResponse.setDocumentationCharge(request.getDocumentationCharge());
        applicationDetailsResponse.setSecurityDeposit(request.getSecurityDeposit());
        applicationDetailsResponse.setExtCustId(request.getExtCustId());
        applicationDetailsResponse.setEkycNumber(request.getEkycNumber());
        applicationDetailsResponse.setEKycReferenceKey(request.getEKycReferenceKey());
        applicationDetailsResponse.setApplicationCode(request.getApplicationCode());
        applicationDetailsResponse.setExtLanNo(request.getExtLanNo());
        applicationDetailsResponse.setSanctionDate(request.getSanctionDate());
        applicationDetailsResponse.setSanctionAmount(request.getSanctionAmount());
        applicationDetailsResponse.setExtLoanId(request.getExtLoanId());
        applicationDetailsResponse.setIsMobileVerified(request.getIsMobileVerified());
        applicationDetailsResponse.setIsHealthCareDisbursed(request.getIsHealthCareDisbursed());
        applicationDetailsResponse.setEmiDate(request.getEmiDate());
        applicationDetailsResponse.setFirstEmiDate(request.getFirstEmiDate());
        applicationDetailsResponse.setSanctionStatus(request.getSanctionStatus());
        applicationDetailsResponse.setSanctionedBy(request.getSanctionedBy());
        applicationDetailsResponse.setClmLenderId(request.getClmLenderId());
        applicationDetailsResponse.setClmSchemeId(request.getClmSchemeId());
        return applicationDetailsResponse;

    }

    public static ApplicationDetails getEntityFromResponse(ApplicationDetailsResponse request, ApplicationDetails applicationDetails) {
        if (request != null) {
            applicationDetails.setClientId(request.getClientId());
            applicationDetails.setAppliedOn(request.getAppliedOn());
            applicationDetails.setAppliedAmount(request.getAppliedAmount());
            applicationDetails.setApplicationStatus(request.getApplicationStatus());
            applicationDetails.setAppRejReason(request.getAppRejReason());
            applicationDetails.setRemarks(request.getRemarks());
            applicationDetails.setCenterId(request.getCenterId());
            applicationDetails.setCenterGroupCode(request.getCenterGroupCode());
            applicationDetails.setLoanPurposeId(request.getLoanPurposeId());
            applicationDetails.setEligibilityAmount(request.getEligibilityAmount());
            applicationDetails.setExpectedDisbursementOn(request.getExpectedDisbursementOn());
            applicationDetails.setFoId(request.getFoId());
            applicationDetails.setCycle(request.getCycle());
            applicationDetails.setApprovedOn(request.getApprovedOn());
            applicationDetails.setProcessingCharge(request.getProcessingCharge());
            applicationDetails.setInsuranceCharge(request.getInsuranceCharge());
            applicationDetails.setPayableAmount(request.getPayableAmount());
            applicationDetails.setBureauResult(request.getBureauResult());
            applicationDetails.setIsTopUp(request.getIsTopUp());
            applicationDetails.setIsAgreementCopyAvail(request.getIsAgreementCopyAvail());
            applicationDetails.setHomeVisitFlg(request.getHomeVisitFlg());
            applicationDetails.setMandateRequestOn(request.getMandateRequestOn());
            applicationDetails.setMandateStatus(request.getMandateStatus());
            applicationDetails.setMandateRejReason(request.getMandateRejReason());
            applicationDetails.setMandateUmrn(request.getMandateUmrn());
            applicationDetails.setInfoVerifiedStatus(request.getInfoVerifiedStatus());
            applicationDetails.setInfoVerifiedOn(request.getInfoVerifiedOn());
            applicationDetails.setInfoVerifiedBy(request.getInfoVerifiedBy());
            applicationDetails.setInfoVerifiedRejReason(request.getInfoVerifiedRejReason());
            applicationDetails.setInfoVerifiedRejCount(request.getInfoVerifiedRejCount());
            applicationDetails.setExtApplicationId(request.getExtApplicationId());
            applicationDetails.setKycSource(request.getKycSource());
            applicationDetails.setProductGroupId(request.getProductGroupId());
            applicationDetails.setProductId(request.getProductId());
            applicationDetails.setPpiAnswer(request.getPpiAnswer());
            applicationDetails.setPpiScore(request.getPpiScore());
            applicationDetails.setBmPpiAnswer(request.getBmPpiAnswer());
            applicationDetails.setBmPpiScore(request.getBmPpiScore());
            applicationDetails.setLoanSubPurposeId(request.getLoanSubPurposeId());
            applicationDetails.setCersaiCharge(request.getCersaiCharge());
            applicationDetails.setDocumentationCharge(request.getDocumentationCharge());
            applicationDetails.setSecurityDeposit(request.getSecurityDeposit());
            applicationDetails.setExtCustId(request.getExtCustId());
            applicationDetails.setEkycNumber(request.getEkycNumber());
            applicationDetails.setEKycReferenceKey(request.getEKycReferenceKey());
            applicationDetails.setApplicationCode(request.getApplicationCode());
            applicationDetails.setExtLanNo(request.getExtLanNo());
            applicationDetails.setSanctionDate(request.getSanctionDate());
            applicationDetails.setSanctionAmount(request.getSanctionAmount());
            applicationDetails.setExtLoanId(request.getExtLoanId());
            applicationDetails.setIsMobileVerified(request.getIsMobileVerified());
            applicationDetails.setIsHealthCareDisbursed(request.getIsHealthCareDisbursed());
            applicationDetails.setEmiDate(request.getEmiDate());
            applicationDetails.setFirstEmiDate(request.getFirstEmiDate());
            applicationDetails.setSanctionStatus(request.getSanctionStatus());
            applicationDetails.setSanctionedBy(request.getSanctionedBy());
            applicationDetails.setClmLenderId(request.getClmLenderId());
            applicationDetails.setClmSchemeId(request.getClmSchemeId());
        }
        return applicationDetails;
    }

    public static List<ApplicationDetailsResponse> getResponseListFromEntityList(List<ApplicationDetails> requestList) {
        if (!CollectionUtils.isEmpty(requestList)) {
            return requestList.parallelStream().map(ApplicationDetailsConverter::getResponseFromEntity).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}