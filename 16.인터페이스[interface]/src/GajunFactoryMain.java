
public class GajunFactoryMain {

	public static void main(String[] args) {
		
		GajunTV tv1 = new GajunTV();
		GajunTV tv2 = new GajunTV();
		GajunTV tv3 = new GajunTV();

		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		
		GajunSmartPhone sm1 = new GajunSmartPhone();
		GajunSmartPhone sm2 = new GajunSmartPhone();
		GajunSmartPhone sm3 = new GajunSmartPhone();
		/*	
		GajunOnOff g1=tv1;
		GajunOnOff g2=tv2;
		GajunOnOff g3=tv3;
		GajunOnOff g4=audio1;
		GajunOnOff g5=audio2;
		*/
		
		
		GajunOnOff[] gajuns = new GajunOnOff[8];
		gajuns[0] = tv1;
		gajuns[1] = tv2;
		gajuns[2] = tv3;
		gajuns[3] = audio1;
		gajuns[4] = audio2;
		gajuns[5] = sm1;
		gajuns[6] = sm2;
		gajuns[7] = sm3;
		
		System.out.println("------------가전제품검사소----------------");
		
		GajunGumsa gajunGumsa=new GajunGumsa();
		gajunGumsa.setGajuns(gajuns);
		gajunGumsa.gumsa();
		
		/*
		 * 난 절대로 자식클래스타입을 사용안할래요 
		 * 난 부모타입[GajumOnOff,GajunVolume] 만사용할래요 
		 * 그래야 가전제품검사 프로그램을
		 * 한번만들어서 변경없이 계속사용할수있으니까요~~~
	     */
		
		
		
		/*
		
		GajunOnOff[] recvGajuns=gajuns;
		for (GajunOnOff gajunOnOff : recvGajuns) {
			gajunOnOff.on();
			GajunVolume gajunVolume = (GajunVolume)gajunOnOff;
			gajunVolume.up();
			gajunVolume.down();
			gajunOnOff.off();
			System.out.println("--------------검사 끝..출고...--------------");
		}
		*/
		

	}

}
