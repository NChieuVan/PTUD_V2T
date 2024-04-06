package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import connetDataBase.*;
import model.Thuoc;

public class Thuoc_Dao {
	ArrayList<Thuoc> dsThuoc;
	Thuoc t;
	
	
	public Thuoc_Dao(ArrayList<Thuoc> dsThuoc, Thuoc t) {
		super();
		this.dsThuoc = dsThuoc;
		this.t = t;
	}
	
	public ArrayList<Thuoc> getallThuoc() {
		try {
			Connection con = connetDataBase.JDBCuntil.getInstance().getConnetion();
			String sql = "Select * from NhanVien";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				String maThuoc = rs.getString(1);
				String tenThuoc = rs.getString(2);
//				int tuoi = rs.getInt(3);
//				PhongBan pBan = new PhongBan(rs.getString(4));
//				double tien = rs.getDouble(5);
//				NhanVien s = new NhanVien(manv, hoten, tuoi, pBan, tien);
				dsThuoc.add(t);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsThuoc;
	}

	
}
