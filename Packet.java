
/**
* The <code>Heap</code> class implements a heap of <code>HeapItem</code>
* objects.
*    
*
* @author Mingtong Wu
*    e-mail: mingtong.wu@stonybrook.edu
*    Stony Brook ID:110033615
**/
import java.util.*;

public class Packet extends LinkedList {
	public static int packetCount = 0;
	private int id, packetSize, timeArrive = 0, timeToDest = 0;

	public Packet() {
	}

	public Packet(int id, int packetSize, int timeArrive) {
		this.setId(id);
		this.setPacketSize(packetSize);
		this.setTimeToDest(this.packetSize / 100);
		this.setTimeArrive(timeArrive);
	}

	public int getId() {
		return this.id;
	}

	public int getPacketSize() {
		return this.packetSize;
	}

	public int getTimeArrive() {
		return this.timeArrive;
	}

	public int getTimeToDest() {
		return this.timeToDest;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPacketSize(int packetSize) {
		this.packetSize = packetSize;
	}

	public void setTimeArrive(int timeArrive) {
		this.timeArrive = timeArrive;
	}

	public void setTimeToDest(int timeToDest) {
		this.timeToDest = timeToDest;
	}

	public static int getPacketCounter() {
		return ++packetCount;
	}

	public boolean isDone() {
		return this.timeToDest == 0;
	}
	public void timeGoes(){
		this.timeToDest--;
	}

	public String toString() {
		return String.format("[%d, %d, %d]", this.id, this.timeArrive, this.timeToDest);
	}
}
