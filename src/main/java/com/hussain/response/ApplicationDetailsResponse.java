package com.hussain.response;

import com.hussain.pojo.ApplicationDetailsPojo;

public class ApplicationDetailsResponse extends ApplicationDetailsPojo {
	private Long applicationDetailsId;

	public Long getApplicationDetailsId() {
		return applicationDetailsId;
	}

	public void setApplicationDetailsId(Long applicationDetailsId) {
		this.applicationDetailsId = applicationDetailsId;
	}
}