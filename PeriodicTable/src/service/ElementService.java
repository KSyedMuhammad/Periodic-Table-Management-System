package service;

import dao.ElementDAO;
import model.Element;

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
}