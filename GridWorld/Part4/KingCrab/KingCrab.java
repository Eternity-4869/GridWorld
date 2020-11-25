import java.util.ArrayList;

import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * A KingCrab causes each actor that it processes to move one location 
 * further away from the KingCrab. 
 * If the actor cannot move away, the KingCrab removes it from the grid. <br />
 */
public class KingCrab extends CrabCritter
{   
    /*
     * s default constructor
     */
    public KingCrab() {
        
    }
    /*
     * override the processActors method
     */
    public void processActors(ArrayList<Actor> actors)
    {
        Grid gr= getGrid();
        Location loc = getLocation();

        for (Actor a : actors)
        {
            int toward = loc.getDirectionToward(a.getLocation());
               Location neighborLoc = a.getLocation().getAdjacentLocation(toward);
            if(gr.isValid(neighborLoc)){
                a.moveTo(neighborLoc);
            }
            else{
                a.removeSelfFromGrid();
            }
        }
    }
}


