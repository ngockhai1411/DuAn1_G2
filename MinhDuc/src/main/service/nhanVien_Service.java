/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.service;

import main.Interface.DAO;
import Repo.DBContext;
import java.util.List;
import main.model.nhanVien;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class nhanVien_Service implements DAO<nhanVien, Integer> {

    @Override
    public List<nhanVien> getAll() {
        ArrayList<nhanVien> list = new ArrayList<>();
        try {
            String sql = "select * from NhanVien";
            Connection cn = DBContext.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            ResultSet rs = pms.executeQuery();
            while (rs.next()) {
                nhanVien n = new nhanVien();
                n.setId_NhanVien(rs.getInt(1));
                n.setMaNV(rs.getString(2));
                n.setHoTen(rs.getString(3));
                n.setNgaySinh(rs.getDate(4));
                n.setDiaChi(rs.getString(5));
                n.setCCCD(rs.getString(6));
                n.setGioiTinh(rs.getBoolean(7));
                n.setTrangThai(rs.getBoolean(8));
                n.setEmail(rs.getString(9));
                n.setSdt(rs.getString(10));
                n.setImageNV(rs.getString(11));
                n.setVaiTro(rs.getBoolean(14));
                list.add(n);
            }
        } catch (Exception e) {
            System.out.println("Lỗi getAll nhân viên");
        }
        return list;
    }

    @Override
    public Integer add(nhanVien tt) {
        Integer row = null;
        try {
            String sql = "insert into NhanVien(MaNhanVien, HoTen,NgaySinh, CCCD, GioiTinh, DiaChi, Email, SoDienThoai, TrangThai, VaiTro)\n"
                    + "			values(?,?,?,?,?,?,?,?,?,?)";
            Connection cn = DBContext.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setObject(1, tt.getMaNV());
            pms.setObject(2, tt.getHoTen());
            pms.setObject(3, (Date) tt.getNgaySinh());
            pms.setObject(4, tt.getCCCD());
            pms.setObject(5, tt.isGioiTinh());
            pms.setObject(6, tt.getDiaChi());
            pms.setObject(7, tt.getEmail());
            pms.setObject(8, tt.getSdt());
            pms.setObject(9, tt.isTrangThai());
            pms.setObject(10, tt.isVaiTro());
            row = pms.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    @Override
    public Integer update(nhanVien tt) {
        Integer row = null;
        try {
            String sql = "update NhanVien\n"
                    + "set MaNhanVien = ?, HoTen= ?,NgaySinh = ?, CCCD= ?, GioiTinh= ?, DiaChi= ?, Email= ? , SoDienThoai= ?, TrangThai= ?, VaiTro= ?\n"
                    + "where id_NhanVien like ?";
            Connection cn = DBContext.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setObject(1, tt.getMaNV());
            pms.setObject(2, tt.getHoTen());
            pms.setObject(3, (Date) tt.getNgaySinh());
            pms.setObject(4, tt.getCCCD());
            pms.setObject(5, tt.isGioiTinh());
            pms.setObject(6, tt.getDiaChi());
            pms.setObject(7, tt.getEmail());
            pms.setObject(8, tt.getSdt());
            pms.setObject(9, tt.isTrangThai());
            pms.setObject(10, tt.isVaiTro());
            pms.setObject(11, tt.getId_NhanVien());
            row = pms.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    @Override
    public Integer xoa(Integer id) {
        Integer row = null;
        try {
            String sql = "delete NhanVien\n"
                    + "where id_NhanVien like ?";
            Connection cn = DBContext.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setInt(1, id);
            row = pms.executeUpdate();
        } catch (Exception e) {
            System.out.println("Lối xóa service");
        }
        return row;
    }

    @Override
    public List<nhanVien> timKemTheoID(Integer id) {
        ArrayList<nhanVien> listTK = new ArrayList<>();
        try {
            String sql = "select * from NhanVien\n"
                    + "where id_NhanVien like ?";
            Connection cn = DBContext.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setInt(1, id);
            ResultSet rs = pms.executeQuery();
            while (rs.next()) {
                nhanVien n = new nhanVien();
                n.setId_NhanVien(rs.getInt(1));
                n.setMaNV(rs.getString(2));
                n.setHoTen(rs.getString(3));
                n.setNgaySinh(rs.getDate(4));
                n.setDiaChi(rs.getString(5));
                n.setCCCD(rs.getString(6));
                n.setGioiTinh(rs.getBoolean(7));
                n.setTrangThai(rs.getBoolean(8));
                n.setEmail(rs.getString(9));
                n.setSdt(rs.getString(10));
                n.setImageNV(rs.getString(11));
                n.setVaiTro(rs.getBoolean(14));
                listTK.add(n);
            }
        } catch (Exception e) {
            System.out.println("Lỗi getAll tìm kiếm nhân viên");
        }
        return listTK;
    }

}
