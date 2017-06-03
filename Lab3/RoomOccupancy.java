/**
 * 
 * @author mike91doby
 *
 */
public class RoomOccupancy {
	// class properties
	private static int totalNumber = 0;
	
	// instance properties
	private int numberInRoom = 0;
	
	// class methods
	public static int getTotal() {
		return totalNumber;
	}
	
	// instance methods
	public boolean addOneToRoom() {
		++numberInRoom;
		++totalNumber;
		return true;
	}
	
	public boolean removeOneFromRoom() {
		if(numberInRoom > 0) {
			--numberInRoom;
			--totalNumber;
			return true;
		} else {
			return false;
		}
	}
	
	public int getNumber() {
		return numberInRoom;
	}
	
}
