import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public final class DancingBugRunner {
	private DancingBugRunner(){}
	public static void main(String[] args)
	{
		int count[] = {1,2,3,4,5,6,7};
		ActorWorld world = new ActorWorld();
		/*
		 *construct new actor
		*/
		DancingBug tom = new DancingBug(count);
		tom.setColor(Color.RED);
		world.add(new Location(4,4),tom);
		world.show();
	}
}
