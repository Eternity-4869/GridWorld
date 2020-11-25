
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains Zbugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public final class ZBugRunner
{
	private ZBugRunner(){}
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
	/*
	 *construct new actor
	*/
        ZBug tom = new ZBug(4);
        tom.setColor(Color.RED);
        world.add(new Location(4,1), tom);
        world.show();
    }
}
