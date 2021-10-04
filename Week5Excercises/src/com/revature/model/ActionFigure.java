package com.revature.model;

public class ActionFigure extends Doll {
	private String skill;

	public ActionFigure() {
		this.skill ="Arrow Shooting";
		this.name = "Oliver Queen"; 
		this.eyeColor = "blue"; 
	}
	
	public ActionFigure(String skill, String name, String eyeColor) {
		super(name, eyeColor);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	} 
	
	public void useSkill() {
		System.out.println("Ka pow I am using skill "+this.skill);
	}
}
