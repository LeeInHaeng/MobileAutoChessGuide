package com.oddidea.guide.vo;

public class ItemCommentVo {

	private int itemNo;
	private String muuid;
	private int goodUnitNo1;
	private int goodUnitNo2;
	private int goodUnitNo3;
	private int goodUnitNo4;
	private int goodUnitNo5;
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getMuuid() {
		return muuid;
	}
	public void setMuuid(String muuid) {
		this.muuid = muuid;
	}
	public int getGoodUnitNo1() {
		return goodUnitNo1;
	}
	public void setGoodUnitNo1(int goodUnitNo1) {
		this.goodUnitNo1 = goodUnitNo1;
	}
	public int getGoodUnitNo2() {
		return goodUnitNo2;
	}
	public void setGoodUnitNo2(int goodUnitNo2) {
		this.goodUnitNo2 = goodUnitNo2;
	}
	public int getGoodUnitNo3() {
		return goodUnitNo3;
	}
	public void setGoodUnitNo3(int goodUnitNo3) {
		this.goodUnitNo3 = goodUnitNo3;
	}
	public int getGoodUnitNo4() {
		return goodUnitNo4;
	}
	public void setGoodUnitNo4(int goodUnitNo4) {
		this.goodUnitNo4 = goodUnitNo4;
	}
	public int getGoodUnitNo5() {
		return goodUnitNo5;
	}
	public void setGoodUnitNo5(int goodUnitNo5) {
		this.goodUnitNo5 = goodUnitNo5;
	}
	
	@Override
	public String toString() {
		return "ItemCommentVo [itemNo=" + itemNo + ", muuid=" + muuid + ", goodUnitNo1=" + goodUnitNo1
				+ ", goodUnitNo2=" + goodUnitNo2 + ", goodUnitNo3=" + goodUnitNo3 + ", goodUnitNo4=" + goodUnitNo4
				+ ", goodUnitNo5=" + goodUnitNo5 + "]";
	}
	
}
