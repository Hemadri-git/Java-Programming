package test;



public class Sports {
	
	private String sportName;
	private int teamSize;
	private String sportType;
	
	public Sports() {
		sportName = null;
		teamSize = 0;
		sportType = null;
		
	}

	public Sports(String sportName, int teamSize) {
		super();
		this.sportName = sportName;
		this.teamSize = teamSize;
		
		if(sportName == null) {
			System.err.println("can't be null");
		}
		else if (teamSize == 0) {
			System.err.println("Can't be zero");
		}
	}

	public Sports(String sportName, int teamSize, String sportType) {
		super();
		this.sportName = sportName;
		this.teamSize = teamSize;
		this.sportType = sportType;
		
		if(sportName == null) {
			System.err.println("can't be null");
		}
		else if (teamSize == 0) {
			System.err.println("Can't be zero");
		}
		else if (sportType == null) {
			System.err.println("cant be null");
		}
	}

	@Override
	public String toString() {
		return "Sports [sportName=" + sportName + ", teamSize=" + teamSize + ", sportType=" + sportType + "]";
	}

	
	
	
	
	

}
	


