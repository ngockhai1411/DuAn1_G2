/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

/**
 *
 * @author Admin
 */
public class chiTietHoaDon {

    private int id_ChiTietHoaDon;
    private String ma;
    private int soLuong;
    private double giaSp;
    private double tongTien;
    private double giamGia;
    private String diaChi;
    private String hotLine;
    private String moTa;
    private int id_HoaDon;
    private int id_chiTietSanPham;

    public chiTietHoaDon() {
    }

    public chiTietHoaDon(int id_ChiTietHoaDon, String ma, int soLuong, double giaSp, double tongTien, double giamGia, String diaChi, String hotLine, String moTa, int id_HoaDon, int id_chiTietSanPham) {
        this.id_ChiTietHoaDon = id_ChiTietHoaDon;
        this.ma = ma;
        this.soLuong = soLuong;
        this.giaSp = giaSp;
        this.tongTien = tongTien;
        this.giamGia = giamGia;
        this.diaChi = diaChi;
        this.hotLine = hotLine;
        this.moTa = moTa;
        this.id_HoaDon = id_HoaDon;
        this.id_chiTietSanPham = id_chiTietSanPham;
    }

    public int getId_ChiTietHoaDon() {
        return id_ChiTietHoaDon;
    }

    public void setId_ChiTietHoaDon(int id_ChiTietHoaDon) {
        this.id_ChiTietHoaDon = id_ChiTietHoaDon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHotLine() {
        return hotLine;
    }

    public void setHotLine(String hotLine) {
        this.hotLine = hotLine;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getId_HoaDon() {
        return id_HoaDon;
    }

    public void setId_HoaDon(int id_HoaDon) {
        this.id_HoaDon = id_HoaDon;
    }

    public int getId_chiTietSanPham() {
        return id_chiTietSanPham;
    }

    public void setId_chiTietSanPham(int id_chiTietSanPham) {
        this.id_chiTietSanPham = id_chiTietSanPham;
    }

}
