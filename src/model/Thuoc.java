/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author nguye
 */
public class Thuoc implements Serializable{
    private String maThuoc, tenThuoc,thanhPhan, donVi;
    private LocalDate ngaySX, HSD;
    private int soLuong;
    private double giaNhap;
    private NhaCungCap ncc;
//    Khoi tao constructor
    public Thuoc() {
    }

    public Thuoc(String maThuoc, String tenThuoc, String thanhPhan, String donVi, LocalDate ngaySX, LocalDate HSD, int soLuong, double giaNhap,NhaCungCap ncc) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.thanhPhan = thanhPhan;
        this.donVi = donVi;
        this.ngaySX = ngaySX;
        this.HSD = HSD;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.ncc = ncc;
    }
    
    public Object getObjThuoc() {
		Object[] obj = {getMaThuoc(),getTenThuoc(),getGiaNhap(),getSoLuong()};
		return obj;
	}
    
    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public LocalDate getHSD() {
        return HSD;
    }

    public void setHSD(LocalDate HSD) {
        this.HSD = HSD;
    }

    public LocalDate getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(LocalDate ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getThanhPhan() {
        return thanhPhan;
    }

    public void setThanhPhan(String thanhPhan) {
        this.thanhPhan = thanhPhan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

	@Override
	public int hashCode() {
		return Objects.hash(maThuoc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thuoc other = (Thuoc) obj;
		return Objects.equals(maThuoc, other.maThuoc);
	}

	@Override
	public String toString() {
		return "Thuoc [maThuoc=" + maThuoc + ", tenThuoc=" + tenThuoc + ", thanhPhan=" + thanhPhan + ", donVi=" + donVi
				+ ", ngaySX=" + ngaySX + ", HSD=" + HSD + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", ncc="
				+ ncc.getMaNhaCungCap() + "]";
	}

    
    
    
    
    
    
    
}
