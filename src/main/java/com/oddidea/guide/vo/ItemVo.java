package com.oddidea.guide.vo;

public class ItemVo {

	private int itemNo;
	private String itemName;
	private String itemDescription;
	private String itemIcon;
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemIcon() {
		return itemIcon;
	}
	public void setItemIcon(String itemIcon) {
		this.itemIcon = itemIcon;
	}
	
	@Override
	public String toString() {
		return "ItemVo [itemNo=" + itemNo + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", itemIcon=" + itemIcon + "]";
	}
	
}
