package com.alessandroch.minecraft.scoreboard;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

	public String scoreboardName;
	public List<Score> scores = new ArrayList<Score>();
	
	public Scoreboard(String name, String[] scores) 
	{
		this.scoreboardName = name;
		for(String score : scores) 
		{
			this.scores.add(new Score(score));
		}
	}
}
