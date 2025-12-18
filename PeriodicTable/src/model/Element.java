package model;

public class Element {
	
	private int atomicNumber;
	private String name;
	private String symbol;
	private double atomicMass;
	private int period;
	private int groupNo;
	private String category;
	private String stateAtRoomTemp;
	
	public Element() {} 
	
	public Element(int atomicNumber,String name, String symbol, double atomicMass, 
			int period, int groupNo, String category,String stateAtRoomTemp ) {
		
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;
		this.atomicMass = atomicMass;
		this.period = period;
		this.groupNo = groupNo;
		this.category = category;
		this.stateAtRoomTemp = stateAtRoomTemp;
		
	}
	
	public int getAtomicNumber() {return atomicNumber;}
	public void setAtomicNumber(int atomicNumber) {this.atomicNumber = atomicNumber;}
	public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSymbol() {return symbol;}
    public void setSymbol(String symbol) {this.symbol = symbol;}
    public double getAtomicMass() {return atomicMass;}
    public void setAtomicMass(double atomicMass) {this.atomicMass = atomicMass;}
    public int getPeriod() {return period;}
    public void setPeriod(int period) {this.period = period;}
    public int getGroupNo() {return groupNo;}
    public void setGroupNo(int groupNo) {this.groupNo = groupNo;}
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}
    public String getStateAtRoomTemp() {return stateAtRoomTemp;}
    public void setStateAtRoomTemp(String stateAtRoomTemp) {this.stateAtRoomTemp = stateAtRoomTemp;}
    
    @Override
    public String toString() {
    	return "---------------------------------\n" +
                "Atomic Number : " + atomicNumber + "\n" +
                "Name          : " + name + "\n" +
                "Symbol        : " + symbol + "\n" +
                "Atomic Mass   : " + atomicMass + "\n" +
                "Period        : " + period + "\n" +
                "Group         : " + groupNo + "\n" +
                "Category      : " + category + "\n" +
                "State         : " + stateAtRoomTemp + "\n" +
                "---------------------------------";
    
    }
}
    
