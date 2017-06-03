
public class Lab3a {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create two rooms
		RoomOccupancy room1 = new RoomOccupancy();
		RoomOccupancy room2 = new RoomOccupancy();
		
		// add people to both rooms
		room1.addOneToRoom();
		room1.addOneToRoom();
		room2.addOneToRoom();
		
		// show results
		System.out.print("Room one has this many people: ");
		System.out.println(room1.getNumber());
		System.out.print("Room two has this many people: ");
		System.out.println(room2.getNumber());
		System.out.print("All rooms have this many people: ");
		System.out.println(RoomOccupancy.getTotal());
		
		// subtract people from both rooms - show that you can't go negative
		room1.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		
		// show results
		System.out.println();
		System.out.print("Room one has this many people: ");
		System.out.println(room1.getNumber());
		System.out.print("Room two has this many people: ");
		System.out.println(room2.getNumber());
		System.out.print("All rooms have this many people: ");
		System.out.println(RoomOccupancy.getTotal());
	}

}
