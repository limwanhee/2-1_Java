package test.constructor;

public class USBMemory {
	private int capacity;
	private String color;
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	public void printInfo() {
		System.out.printf("용량 : %dGB, 생상 : %s\n", capacity, color);
	}
	
	public void writeMemory() {
		printInfo();
		System.out.printf("USB Memory에 데이터를 저장한다.\n");
	}
	
	public void readMemory() {
		printInfo();
		System.out.printf("USB Memory에 데이터를 읽는다.\n");
	}
}
