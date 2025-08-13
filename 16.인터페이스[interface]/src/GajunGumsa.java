
public class GajunGumsa {
	private GajunOnOff[] gajuns;
	
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns=gajuns;
		
	}
	
	
	
	public void gumsa() {
		
		for (GajunOnOff gajunOnOff : gajuns) {
			gajunOnOff.on();
			GajunVolume gajunVolume = (GajunVolume)gajunOnOff;
			gajunVolume.up();
			gajunVolume.down();
			gajunOnOff.off();
			System.out.println("--------------검사 끝..출고...--------------");
		}
		
		
	}
	
	

}
