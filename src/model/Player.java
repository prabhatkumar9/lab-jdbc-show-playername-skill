package model;
public class Player{
    private long playerId;
    private String name;
    private String country;
    private Skill skill;
    
    public long getPlayerId() {
	return playerId;
    }
    public void setPlayerId(long playerId) {
	this.playerId = playerId;
    }
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getCountry() {
	return country;
    }
    public void setCountry(String country) {
	this.country = country;
    }
    public Skill getSkill() {
	return skill;
    }
    public void setSkill(Skill skill) {
	this.skill = skill;
    }
}
