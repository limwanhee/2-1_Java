package test.object;

public class RunTV {

	public static void main(String[] args) {
		TV tv1 = new TV(); //Main Memory에 적재한다. (객체가 생성된다.)
		TV tv2 = new TV();
		
		tv1.setProducer("LG전자");
		tv1.setColor("white");
		tv1.setModelNum("LG202207016");
		tv1.setChannel(6);
		
		tv2.setProducer("삼성전자");
		tv2.setColor("black");
		tv2.setModelNum("SM2022070161");
		tv2.setChannel(1);

		tv1.powerOn();
		tv1.upChannel();
		tv1.upChannel();
		tv1.upChannel();
		
		for (int i = 0; i < 10; i++) {
			tv1.upVolume();	
		}
		
		tv2.powerOn();
		
		for (int i = 0; i < 20; i++) {
			tv2.upChannel();
		}
		
		tv2.downChannel();
		
	}

}
