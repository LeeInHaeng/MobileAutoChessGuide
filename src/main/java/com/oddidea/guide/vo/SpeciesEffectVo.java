package com.oddidea.guide.vo;

public class SpeciesEffectVo {

	private int speciesNo;
	private String speciesName;
	private int speciesCondition;
	private String speciesDescription;
	
	public int getSpeciesNo() {
		return speciesNo;
	}
	public void setSpeciesNo(int speciesNo) {
		this.speciesNo = speciesNo;
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	public int getSpeciesCondition() {
		return speciesCondition;
	}
	public void setSpeciesCondition(int speciesCondition) {
		this.speciesCondition = speciesCondition;
	}
	public String getSpeciesDescription() {
		return speciesDescription;
	}
	public void setSpeciesDescription(String speciesDescription) {
		this.speciesDescription = speciesDescription;
	}
	
	@Override
	public String toString() {
		return "SpeciesEffectVo [speciesNo=" + speciesNo + ", speciesName=" + speciesName + ", speciesCondition="
				+ speciesCondition + ", speciesDescription=" + speciesDescription + "]";
	}
	
}
