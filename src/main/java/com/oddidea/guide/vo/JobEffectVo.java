package com.oddidea.guide.vo;

public class JobEffectVo {

	private int jobNo;
	private String jobName;
	private int jobCondition;
	private String jobDescription;
	
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getJobCondition() {
		return jobCondition;
	}
	public void setJobCondition(int jobCondition) {
		this.jobCondition = jobCondition;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	
	@Override
	public String toString() {
		return "SpeciesEffectVo [jobNo=" + jobNo + ", jobName=" + jobName + ", jobCondition=" + jobCondition
				+ ", jobDescription=" + jobDescription + "]";
	}
}
