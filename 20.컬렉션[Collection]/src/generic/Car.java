/*
  1.주차장에서 차객체를 생성할클래스(틀)
  2.Car객체의 주소를 저장할수있는타입
  
 */
package generic;

import java.util.Objects;

public class Car {
	
	/*
	 * 멤버필드(변수)
	 */
	private String no;		//차량번호
	private int inTime;		//입차시간
	private int outTime;	//출차시간
	private int fee;		//주차요금
	/*
	 * 생성자 오버로딩
	 */
	public Car() {
		
	}
	public Car(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	public Car(String no,int inTime,int outTime,int fee) {
		this.no=no;
		this.inTime=inTime;
		this.outTime=outTime;
		this.fee=fee;
	}
	
	/*
	 * 멤버메쏘드(행위)
	 */
	/*
	 *  입차데이타(번호,시간)대입
	 */
	public void setIpChaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	/*
	 * 출차시간멤버필드outTime대입
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	/*
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	
	public static void headerPrint() {
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("-------------------------------------\n");
	}
	/*
	 * 차량정보출력
	 */
	public void print() {
		System.out.printf("%6s %8d %8d    ₩ %d\n",this.no,this.inTime,this.outTime,this.fee);
	}
	//getter,setter
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	@Override
	public String toString() {
		return "Car[no=" + no + ",inTime=" + inTime + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Car)) {
			return false;
		}
		Car other=(Car)obj;
		return this.no.equals(other.no) && this.inTime==other.inTime;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.no,this.inTime);
	}

	
}
