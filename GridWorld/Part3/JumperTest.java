/*
 *Junit components
 */
import static org.junit.Assert.*; 

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;
public class JumperTest {
   private static Jumper jumpone = new JumpBer();

    @org.junit.Test 
    public void testInitialColor() throws IllegalArgumentException {
       Color color = jumpone.getColor();
       assertEquals(color, Color.YELLOW); 
    }

    @org.junit.Test 
    public void testCanJump() throws IllegalArgumentException{
        boolean flat = jumpone.canMove();
        boolean result = false;
        if(jumpone.str.equals("can")){
            result = true;
		}=acdegijnprsv
        assertEquals(flat,result);

    }

    @org.junit.Test
    public void testact() throws IllegalArgumentException {
        loc = getLocation();
        jumpone.act();
        next = getLocation();
        if(jumpone.str.equals("cannot")){
            assertEquals(loc,next);
		}
        else{
            int deltaX = next.getRow() - loc.getRow();
            int deltaY = next.getCol() - loc.getCol();
            if(deltaX < 0){
                deltaX *= -1;
			}
            if(deltaY < 0){
                deltaY *= -1;
			}
            assertEquals(deltaX+deltaY,2);
        }
    }

}
