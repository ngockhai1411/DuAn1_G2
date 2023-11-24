/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class khuyenMai {

    private int id_khuyenMaiSanPham;
    private String maKM;
    private double tiemGiam;
    private double giamToiDa;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int trangThai;

    public khuyenMai() {
    }

    public khuyenMai(int id_khuyenMaiSanPham, String maKM, double tiemGiam, double giamToiDa, Date ngayBatDau, Date ngayKetThuc, int trangThai) {
        this.id_khuyenMaiSanPham = id_khuyenMaiSanPham;
        this.maKM = maKM;
        this.tiemGiam = tiemGiam;
        this.giamToiDa = giamToiDa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public int getId_khuyenMaiSanPham() {
        return id_khuyenMaiSanPham;
    }

    public void setId_khuyenMaiSanPham(int id_khuyenMaiSanPham) {
        this.id_khuyenMaiSanPham = id_khuyenMaiSanPham;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public double getTiemGiam() {
        return tiemGiam;
    }

    public void setTiemGiam(double tiemGiam) {
        this.tiemGiam = tiemGiam;
    }

    public double getGiamToiDa() {
        return giamToiDa;
    }

    public void setGiamToiDa(double giamToiDa) {
        this.giamToiDa = giamToiDa;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
