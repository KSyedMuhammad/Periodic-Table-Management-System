package service;
import dao.ElementDAO;
import model.Element;
import java.util.ArrayList;
import java.util.List;

public class ElementService {
	private ElementDAO dao = new ElementDAO();
	public void findByAtomicNumber (int atomicNumber) {
		Element element = dao.getElementByAtomicNumber(atomicNumber);
		if(element != null) {
			System.out.println(element);
		}else {
			System.out.println("Element not found!");
		}
	}
	public void findByAtomicSymbol (String symbol) {
		Element element = dao.getElementBySymbol(symbol);
		if(element != null) {
			System.out.println(element);
		}else {
			System.out.println("Element not found!");
		}
	}
	public void viewAllElements() {
		List<Element> elements = dao.getAllElements();
		System.out.println("\n-------------------------------------------------------------------------------------------------");
	    System.out.printf("%-15s %-15s %-8s %-12s %-6s %-6s %-20s %-10s%n",
	            "Atomic No", "Name", "Symbol", "Mass", "Period", "Group", "Category", "State");
	    System.out.println("-------------------------------------------------------------------------------------------------");
	    for (Element e : elements) {
	        System.out.printf("%-15d %-15s %-8s %-12.2f %-6d %-6d %-20s %-10s%n",
	                e.getAtomicNumber(),
	                e.getName(),
	                e.getSymbol(),
	                e.getAtomicMass(),
	                e.getPeriod(),
	                e.getGroupNo(),
	                e.getCategory(),
	                e.getStateAtRoomTemp());
	    }
	    System.out.println("-------------------------------------------------------------------------------------------------");

	}
}