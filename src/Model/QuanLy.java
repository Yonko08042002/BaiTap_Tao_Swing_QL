/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JComboBox;

/**
 *
 * @author ASUS
 */
public class QuanLy {
    private int MaTailieu;
    private String TenNhaXuatBan;
    private int SoBanPhathanh;
    private String TenSach;
    private String TacGia;
    private int SoTrang ;
    private int SoPhatHanh;
    private int ThangPhatHanh ;
    private int NgayPhatHanh;
    private String TheLoai;

    public QuanLy() {
    }

    public QuanLy(int MaTailieu, String TenNhaXuatBan, int SoBanPhathanh, String TenSach, String TacGia, int SoTrang, int SoPhatHanh, int ThangPhatHanh, int NgayPhatHanh,String TheLoai) {
        this.MaTailieu = MaTailieu;
        this.TenNhaXuatBan = TenNhaXuatBan;
        this.SoBanPhathanh = SoBanPhathanh;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.SoTrang = SoTrang;
        this.SoPhatHanh = SoPhatHanh;
        this.ThangPhatHanh = ThangPhatHanh;
        this.NgayPhatHanh = NgayPhatHanh;
        this.TheLoai = TheLoai;
    }

    QuanLy(int i, String chelsea, int i0, String tin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaTailieu() {
        return MaTailieu;
    }

    public String getTenNhaXuatBan() {
        return TenNhaXuatBan;
    }

    public int getSoBanPhathanh() {
        return SoBanPhathanh;
    }

    public String getTenSach() {
        return TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public int getSoPhatHanh() {
        return SoPhatHanh;
    }

    public int getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public int getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setMaTailieu(int MaTailieu) {
        this.MaTailieu = MaTailieu;
    }

    public void setTenNhaXuatBan(String TenNhaXuatBan) {
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public void setSoBanPhathanh(int SoBanPhathanh) {
        this.SoBanPhathanh = SoBanPhathanh;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    public void setSoPhatHanh(int SoPhatHanh) {
        this.SoPhatHanh = SoPhatHanh;
    }

    public void setThangPhatHanh(int ThangPhatHanh) {
        this.ThangPhatHanh = ThangPhatHanh;
    }

    public void setNgayPhatHanh(int NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    @Override
    public String toString() {
        return "QuanLy{" + "MaTailieu=" + MaTailieu + ", TenNhaXuatBan=" + TenNhaXuatBan + ", SoBanPhathanh=" + SoBanPhathanh + ", TenSach=" + TenSach + ", TacGia=" + TacGia + ", SoTrang=" + SoTrang + ", SoPhatHanh=" + SoPhatHanh + ", ThangPhatHanh=" + ThangPhatHanh + ", NgayPhatHanh=" + NgayPhatHanh + ", TheLoai=" + TheLoai + '}';
    }

    public void getSoBanPhathanh(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTheLoai(JComboBox<String> cboTheLoai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
   
}
