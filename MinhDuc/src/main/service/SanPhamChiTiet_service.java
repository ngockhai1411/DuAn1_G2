/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.service;

import Repo.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.model.SanPhamChiTiet;

/**
 *
 * @author HP
 */
public class SanPhamChiTiet_service {

    private final Connection con = DBContext.getConnection();

    public ArrayList<SanPhamChiTiet> getList() {
        ArrayList<SanPhamChiTiet> listS = new ArrayList<>();
        String sql = "select MaSanPham, TenSanPham, LoaiSanPham.TenLoaiSanPham, Gia, Size, MoTa, GhiChu, SanPham.TrangThai\n"
                + " from SanPham join LoaiSanPham on SanPham.id_LoaiSanPham = LoaiSanPham.id_LoaiSanPham";
        Connection con = DBContext.getConnection();
        try {
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                SanPhamChiTiet sp = new SanPhamChiTiet();
                sp.setMaSP(rs.getString("MaSanPham"));
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setLoaiSP(rs.getString("TenLoaiSanPham"));
                sp.setGiaSP(rs.getFloat("Gia"));
                sp.setSizeSP(rs.getString("Size"));
                sp.setMoTa(rs.getString("MoTa"));
                sp.setGhiChu(rs.getString("GhiChu"));
                sp.setTrangThai(rs.getInt("TrangThai"));

                listS.add(sp);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listS;
    }
}
