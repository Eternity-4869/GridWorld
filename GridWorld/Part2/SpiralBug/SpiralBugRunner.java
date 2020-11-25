
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains Circle bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public final class SpiralBugRunner
{
	private SpiralBugRunner(){}
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
	/*
	 *construct new actor
	 */
        SpiralBug tom = new SpiralBug(3);
        tom.setColor(Color.RED);
        world.add(new Location(7,8), tom);
        world.show();
    }
}
