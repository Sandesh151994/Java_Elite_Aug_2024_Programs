package penta.java.exception;

import java.io.IOException;

class TeamSizeExceedException extends Exception
{
	TeamSizeExceedException(String msg)
	{
		super(msg);
	}
}
class CricketTeam 
{
	void addTeamsize(int size) 
	{
		System.out.println("Checking team size.....");
		if(size>11||size<11)
		{
			try {
			throw new TeamSizeExceedException("Team limit should be 11");
			}
			catch(TeamSizeExceedException e)
			{
				e.printStackTrace();
			}
			}
		System.out.println("Done......");
	}
	
}

public class CustomException {

	public static void main(String[] args)  {
		
		CricketTeam ct=new CricketTeam();
		ct.addTeamsize(10);;

	}

}
