package test.constructor;

public class RunUSBMemory {

	public static void main(String[] args) {
		USBMemory usb1 = new USBMemory(16, "Silver");
		USBMemory usb2 = new USBMemory(32, "Black");
		
		usb1.writeMemory();
		usb1.readMemory();
		
		usb2.writeMemory();
		usb2.readMemory();
	}

}
