package edu.atria.java.inheritance;

public class Mp extends Citizen{
	private int Id;
	private String name;
	private String party;

	//constructor
	public Mp(long aadharNo, long voterid, String nationality, int id, String name, String party) {
		super(aadharNo, voterid, nationality);
		Id = id;
		this.name = name;
		this.party = party;
	}
	
	//getters and setters 
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	//toString
	@Override
	public String toString() {
		return "Mp [Id=" + Id + ", name=" + name + ", party=" + party + ", getAadharNo=" + getAadharNo()
				+ ", getVoterid=" + getVoterid() + ", getNationality=" + getNationality() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

	

}
