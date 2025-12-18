package dao;

import db.DBConnection;
import model.Element;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ElementDAO {
	
	public Element getElementByAtomicNumber(int atomicNumber) {
		String sql = "SELECT * FROM elements WHERE atomic_number = ?";
		Element element = null;
		
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, atomicNumber);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				element = new Element(
						rs.getInt("atomic_number"),
						rs.getString("name"),
						rs.getString("symbol"),
						rs.getDouble("atomic_mass"),
						rs.getInt("period"),
						rs.getInt("group_no"),
						rs.getString("category"),
						rs.getString("state_at_room_temp")
						);
			}
		} catch (Exception e) {
            e.printStackTrace();
		}
		return element;
	}
	
	public Element getElementBySymbol(String symbol) {
		String sql = "SELECT * FROM elements WHERE symbol = ?";
		Element element = null;
		
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(2, symbol);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				element = new Element(
						rs.getInt("atomic_number"),
						rs.getString("name"),
						rs.getString("symbol"),
						rs.getDouble("atomic_mass"),
						rs.getInt("period"),
						rs.getInt("group_no"),
						rs.getString("category"),
						rs.getString("state_at_room_temp")
						);
			}
		}catch (Exception e) {
            e.printStackTrace();
		}
		return element;
	}
	
}	