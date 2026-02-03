package bus_Resv;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity; // Getters and Setters are created for Retrieve the Values
	
	 Bus(int no, boolean ac,int cap)
	{
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	
	
	public int getBusNo() { // Getters = To get the values !
		return busNo;
	}



	public void setBusNo(int busNo) { // Setters = To set the values !
		this.busNo = busNo;
	}



	public boolean isAc() {
		return ac;
	}



	public void setAc(boolean ac) {
		this.ac = ac;
	}



	public void setCapacity(int cap)
	{
		capacity = cap;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void displayBusInfo()
	{
		
		System.out.println("Bus No: "+busNo + " AC : "+ac +" Total Capacity: "+capacity);
		
	}
	
	
}
