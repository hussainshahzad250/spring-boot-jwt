package com.hussain.request;

import com.poiji.annotation.ExcelCell;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Shahzad Hussain
 */
@Data
@ToString
public class ExcelRequest {

	@ExcelCell(0)
	private String appRejReason;

	@ExcelCell(1)
	private Long applicationCode;

	@ExcelCell(2)
	private String applicationStatus;

	@ExcelCell(3)
	private BigDecimal appliedAmount;

	@ExcelCell(4)
	private String appliedOn;

	@ExcelCell(5)
	private String approvedOn;

	@ExcelCell(6)
	private String bmPpiAnswer;

	@ExcelCell(7)
	private Integer bmPpiScore;

	@ExcelCell(8)
	private String bureauResult;

	@ExcelCell(9)
	private String centerGroupCode;

	@ExcelCell(10)
	private Long centerId;

	@ExcelCell(11)
	private Integer cersaiCharge;

	@ExcelCell(12)
	private Long clientId;

	@ExcelCell(13)
	private String clmLenderId;

	@ExcelCell(14)
	private Long clmSchemeId;

	@ExcelCell(15)
	private Integer cycle;

	@ExcelCell(16)
	private Integer documentationCharge;

	@ExcelCell(17)
	private String ekycReferenceKey;

	@ExcelCell(18)
	private String ekycNumber;

	@ExcelCell(19)
	private String ekycSkipReason;

	@ExcelCell(20)
	private Long eligibilityAmount;

	@ExcelCell(21)
	private Long emiDate;

	@ExcelCell(22)
	private String expectedDisbursementOn;

	@ExcelCell(23)
	private String extApplicationId;

	@ExcelCell(24)
	private String extCustId;

	@ExcelCell(25)
	private String extLanNo;

	@ExcelCell(26)
	private String extLoanId;

	@ExcelCell(27)
	private String infoVerifiedStatus;

	ExcelRequest() {
	}

}