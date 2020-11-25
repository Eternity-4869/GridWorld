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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

/** 
 * A <code>CrabCritter</code> looks at a limited set of neighbors when it eats and moves. 
 * <br /> 
 * This class is not tested on the AP CS A and AB exams. 
 */
public class QuickCrab extends CrabCritter{    

    public QuickCrab()
    {
        setColor(Color.ORANGE);
    }
/**     
 * A crab gets the actors in the three locations immediately in front, to its     
 * front-right and to its front-left     
 * @return a list of actors occupying these locations    
 */	   
/**    
 * @return list of empty locations immediately to the right and to the left   
 */   
    public ArrayList<Location> getMoveLocations()    
    {    	
        ArrayList<Location> one = new ArrayList<Location>();    
	    ArrayList<Location> two = new ArrayList<Location>();    	
        Grid grid = getGrid();    
	    Location location = getLocation();   
 	    int direction = getDirection();  
        int[] dirs =  
          { Location.LEFT, Location.RIGHT };    
            for(int dir : dirs){           
            	Location neighborLoc = location.getAdjacentLocation(direction + dir);        	
                if(grid.isValid(neighborLoc)){        	
	                if(grid.get(neighborLoc) == null){      
  			            one.add(neighborLoc);    
    			        Location twoSpace = neighborLoc.getAdjacentLocation(direction + dir);  
      			        if(grid.isValid(twoSpace)){     
   				            if(grid.get(twoSpace) == null){      
              					two.add(twoSpace);        			
	                        }        		
	                    }        	
	                }       
 	            }       
            }        
            if(two.size() == 0){    
    	        return one;    
			}
            else{	 		
	            return two;    
			}
    }  
  /**     
    * Finds the valid adjacent locations of this critter in different    
    * directions.    
    * @param directions - an array of directions (which are relative to the    
    * current direction)    
    * @return a set of valid locations that are neighbors of the current  
    * location in the given directions     
    */
}


























