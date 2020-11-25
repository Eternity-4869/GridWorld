
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug{
	private int steps;
    private int sideLength;
	/*
	 *direction:0 means turn to right,1 means left-down,2 means left,3 means stop
	 */
    private int direction;

    
    /*
     *Make the ZBug face east before beginning its "Z" pattern.
     */
    public ZBug(int length)
    {
    	steps = 0;
    	sideLength = length;
    	direction = 0;
    	setDirection(Location.EAST);
    }
    
    public void act()
    {
    	if (direction == 3){
    		return;
    	}
    	if(canMove()){
        if (steps < sideLength)
        {
            move();
            steps++;
        }
        else
        {
        	direction++;
            steps = 0;
           switch(direction){
           		case 1:
           			setDirection(Location.SOUTHWEST);
           			break;
           		case 2:
           			setDirection(Location.EAST);
           			break;
           			default:
           				break;
           }
        }
    	}
    	else {
    		return;
    	}
    }
}

