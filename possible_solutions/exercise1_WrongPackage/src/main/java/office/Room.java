package office;

import java.util.Set;

import equipment.RoomEquipment;

public class Room {
	
	private String name;
	
	private Office office;
	
	private Set<RoomEquipment> roomEquipment;

	public Office getOffice() {
		return office;
	}

	public String getName() {
		return name;
	}

	public Set<RoomEquipment> getRoomEquipment() {
		return roomEquipment;
	}
	
}
