import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
	private int steps;
	private int length;
	private int [] danceTime;
	
	/*
	 * Constructs a Dancing Bug
	 * @param the side length
	 */
	public DancingBug(int []times)
	{
		steps = 0;
		length = times.length;
		danceTime = new int[length];
		
		int i = 0;
		for(i = 0; i < length; i++){
			danceTime[i] = times[i];
		}
	}
	
	/*
	 * Moves to the next location of the Dancing
	 */
	 public void act()
	 {
        /*
         *dance times
         */
		 int i = 0;
		 for(i = 0; i < danceTime[steps]; i++){
			 turn();
		 }
		 if(canMove()){
			 move();
			 steps++;
		 }
		 else{
			 turn();
		 }
	/*reset the length*/
		 if(steps == length){
			 steps = 0;
		 }
	 }
}
