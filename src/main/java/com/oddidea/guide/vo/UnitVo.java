package com.oddidea.guide.vo;

public class UnitVo {

	private int unitNo;
	private String unitName;
	private String unitEngName;
	private int price;
	private String hp;
	private String armor;
	private String resistance;
	private String attack;
	private String speed;
	private String range;
	private String dps;
	private String unitIcon;
	private String previewIcon;
	private int tier;
	private int jobNo;
	
	private String skillName;
	private String skillDescription;
	private String skillCooldown;
	private String skillIcon;
	
	private String speciesName;
    private String speciesIcon;
    
    private String jobName;
    private String jobIcon;
	
	public int getUnitNo() {
		return unitNo;
	}
	public void setUnitNo(int unitNo) {
		this.unitNo = unitNo;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitEngName() {
		return unitEngName;
	}
	public void setUnitEngName(String unitEngName) {
		this.unitEngName = unitEngName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public String getResistance() {
		return resistance;
	}
	public void setResistance(String resistance) {
		this.resistance = resistance;
	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getDps() {
		return dps;
	}
	public void setDps(String dps) {
		this.dps = dps;
	}
	public String getUnitIcon() {
		return unitIcon;
	}
	public void setUnitIcon(String unitIcon) {
		this.unitIcon = unitIcon;
	}
	public String getPreviewIcon() {
		return previewIcon;
	}
	public void setPreviewIcon(String previewIcon) {
		this.previewIcon = previewIcon;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDescription() {
		return skillDescription;
	}
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}
	public String getSkillCooldown() {
		return skillCooldown;
	}
	public void setSkillCooldown(String skillCooldown) {
		this.skillCooldown = skillCooldown;
	}
	public String getSkillIcon() {
		return skillIcon;
	}
	public void setSkillIcon(String skillIcon) {
		this.skillIcon = skillIcon;
	}
	
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	public String getSpeciesIcon() {
		return speciesIcon;
	}
	public void setSpeciesIcon(String speciesIcon) {
		this.speciesIcon = speciesIcon;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobIcon() {
		return jobIcon;
	}
	public void setJobIcon(String jobIcon) {
		this.jobIcon = jobIcon;
	}
	
	@Override
	public String toString() {
		return "UnitVo [unitNo=" + unitNo + ", unitName=" + unitName + ", unitEngName=" + unitEngName + ", price="
				+ price + ", hp=" + hp + ", armor=" + armor + ", resistance=" + resistance + ", attack=" + attack
				+ ", speed=" + speed + ", range=" + range + ", dps=" + dps + ", unitIcon=" + unitIcon + ", previewIcon="
				+ previewIcon + ", tier=" + tier + ", jobNo=" + jobNo + ", skillName=" + skillName
				+ ", skillDescription=" + skillDescription + ", skillCooldown=" + skillCooldown + ", skillIcon="
				+ skillIcon + ", speciesName=" + speciesName + ", speciesIcon=" + speciesIcon + ", jobName=" + jobName
				+ ", jobIcon=" + jobIcon + "]";
	}
	
}
