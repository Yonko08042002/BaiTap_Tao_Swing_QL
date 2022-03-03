/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import BT2.Connect;
import Model.QuanLy;
import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class QuanLyDAO {

    public int add(QuanLy ql) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert QuanLyTaiLieu(TenNhaXuatBan,SoBanPhathanh,tenSach,TacGia,SoTrang,SoPhatHanh,ThangPhatHanh,NgayPhatHanh,TheLoai)"
                            + "values(?,?,?,?,?,?,?,?,?)";
            conn = Connect.JDBCConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ql.getTenNhaXuatBan());
            sttm.setInt(2, ql.getSoBanPhathanh());
            sttm.setString(3, ql.getTenSach());
            sttm.setString(4, ql.getTacGia());
            sttm.setInt(5, ql.getSoTrang());
            sttm.setInt(6, ql.getSoPhatHanh());
            sttm.setInt(7, ql.getNgayPhatHanh());
            sttm.setInt(8, ql.getThangPhatHanh());
            sttm.setString(9, ql.getTheLoai());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public int edit(QuanLy ql) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update QuanLyTaiLieu set TenNhaXuatBan = ?,SoBanPhathanh = ?,tenSach = ?,TacGia = ?,SoTrang = ?,SoPhatHanh = ?,ThangPhatHanh = ? ,NgayPhatHanh = ?,TheLoai= ? where MaTailieu = ?";
            conn = Connect.JDBCConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ql.getTenNhaXuatBan());
            sttm.setInt(2, ql.getSoBanPhathanh());
            sttm.setString(3, ql.getTenSach());
            sttm.setString(4, ql.getTacGia());
            sttm.setInt(5, ql.getSoTrang());
            sttm.setInt(6, ql.getSoPhatHanh());
            sttm.setInt(7, ql.getNgayPhatHanh());
            sttm.setInt(8, ql.getThangPhatHanh());
            sttm.setString(9, ql.getTheLoai());
            sttm.setInt(10, ql.getMaTailieu());
            if (sttm.executeUpdate() > 0) {
                System.out.println("edit thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public int del(int MaTailieu ) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete QuanLyTaiLieu where MaTailieu = ?";
            conn = Connect.JDBCConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, MaTailieu);
            if (sttm.executeUpdate() > 0) {
                System.out.println("delete thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public List<QuanLy> getAllQuanLy(){
        List<QuanLy> ls =new ArrayList<>();
        Connection conn = Connect.JDBCConnection();      
        try{
            String sSQL = "select * from QuanLyTaiLieu ";
            PreparedStatement preparedStatement = conn.prepareStatement(sSQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                QuanLy ql = new QuanLy();
                ql.setMaTailieu(rs.getInt(1));
                ql.setTenNhaXuatBan(rs.getString(2));
                ql.setSoBanPhathanh(rs.getInt(3));
                ql.setTenSach(rs.getString(4));
                ql.setTacGia(rs.getString(5));
                ql.setSoTrang(rs.getInt(6));
                ql.setSoPhatHanh(rs.getInt(7));
                ql.setThangPhatHanh(rs.getInt(8));
                ql.setNgayPhatHanh(rs.getInt(9));
                ql.setTheLoai(rs.getString(10));
                ls.add(ql);
            }
        }catch (Exception e){
            System.out.println("Lỗi:" + e.toString());
        }finally{
            try{                
                conn.close();
            }catch(Exception e){
                
            }
        }
        return ls;
    }
    public QuanLy getQuanLyByMaTaiLieu(int MaTaiLieu){
        Connection conn =null;
        PreparedStatement sttm =null;
        ResultSet rs =null;
        QuanLy ql = new QuanLy();
        try{
            String sSQL = "select * from QuanLyTaiLieu where MaTaiLieu =?";
            conn = Connect.JDBCConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, MaTaiLieu);
            rs = sttm.executeQuery();
            while(rs.next()){
                ql.setMaTailieu(rs.getInt(1));
                ql.setTenNhaXuatBan(rs.getString(2));
                ql.setSoBanPhathanh(rs.getInt(3));
                ql.setTenSach(rs.getString(4));
                ql.setTacGia(rs.getString(5));
                ql.setSoTrang(rs.getInt(6));
                ql.setSoPhatHanh(rs.getInt(7));
                ql.setThangPhatHanh(rs.getInt(8));
                ql.setNgayPhatHanh(rs.getInt(9));
                ql.setTheLoai(rs.getString(10));
                return ql;
            }
        }catch(Exception e){
            System.out.println("Lỗi:"+e.toString());
        }finally {
        try{
            conn.close();
            sttm.close();
            rs.close();
        }catch(Exception e){
            
        }
    }
        return null;
    }
    
    public static void main(String[] args) {
        QuanLyDAO dao = new QuanLyDAO();
        QuanLy ql = new QuanLy(3, "Mu", 1, "Con Gái là gì 1", "Tuấn", 3, 3, 3, 3, "Sách");
       dao.add(ql);
//       dao.edit(ql);
//       dao.del(2);
         System.out.println("=>"+dao.getQuanLyByMaTaiLieu(3));
    }
}
