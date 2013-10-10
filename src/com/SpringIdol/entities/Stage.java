package com.SpringIdol.entities;
public class Stage{
	private Stage ()
	{
		
	}
	// Une classe StageHolder qui assure le Singleton :
	private static class StageSingletonHolder
	{
		static Stage stage = new Stage ();
	}
	//	La méthode de factory à appeler :
	public static Stage getInstance ()
	{
		return StageSingletonHolder.stage;
	}
	public void turnOnLights()
	{
		System.out.println("lights turned On !");
	}
	public void turnOffLights()
	{
		System.out.println("lights turned Off !");
	}
}
