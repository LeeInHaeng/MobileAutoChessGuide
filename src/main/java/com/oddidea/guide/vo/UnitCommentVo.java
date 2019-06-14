package com.oddidea.guide.vo;

public class UnitCommentVo {

	private long commentNo;
	private String regDate;
	private String content;
	private int unitNo;
	
	private int goodCnt;
	private int badCnt;
	
	public long getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(long commentNo) {
		this.commentNo = commentNo;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUnitNo() {
		return unitNo;
	}
	public void setUnitNo(int unitNo) {
		this.unitNo = unitNo;
	}
	public int getGoodCnt() {
		return goodCnt;
	}
	public void setGoodCnt(int goodCnt) {
		this.goodCnt = goodCnt;
	}
	public int getBadCnt() {
		return badCnt;
	}
	public void setBadCnt(int badCnt) {
		this.badCnt = badCnt;
	}
	
	@Override
	public String toString() {
		return "UnitCommentVo [commentNo=" + commentNo + ", regDate=" + regDate + ", content=" + content + ", unitNo="
				+ unitNo + ", goodCnt=" + goodCnt + ", badCnt=" + badCnt + "]";
	}
}
