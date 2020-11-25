/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 * A <code>Jumper</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class Jumper extends Actor
{

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
	private String str = "";
    public Jumper()
    {
        setColor(Color.YELLOW);

    }
    
    public String getStr(){
    	return str;
    }
    /**
     * determine whether a Jump Bug can move
     * if yes, we will return true; else we will return true;
     */
    public boolean canJump()
    {
        Location loc = getLocation();
        Location nextone = loc.getAdjacentLocation(getDirection());
        Location nexttwo = nextone.getAdjacentLocation(getDirection());
        Grid<Actor> gr = getGrid();
        if (gr == null){
            str = "cannot";
            return false;
        }
        // 如果前面第一个格子或者第二个格子不合法就返回false
        if (!gr.isValid(nextone) || !gr.isValid(nexttwo))
        {  
            str = "cannot";
              return false;
        }
        Actor nextneighbor2 = gr.get(nexttwo);
        if(nextneighbor2 == null || nextneighbor2 instanceof Jumper){
            str = "can";
            return true;
        }
        else{
            str = "cannot";   
            return false;
        }
       
    }
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
       if(canJump())
       {
        Location loc = getLocation();
        Location nextone = loc.getAdjacentLocation(getDirection());
        Location nexttwo = nextone.getAdjacentLocation(getDirection());
        moveTo(nexttwo);
       }
       else
       {
           setDirection(getDirection() + Location.HALF_RIGHT);
       }
    }
}
