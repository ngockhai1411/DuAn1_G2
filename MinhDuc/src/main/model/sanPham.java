/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

/**
 *
 * @author Admin
 */
public class sanPham {

    private int id_sanPham;
    private String ma;
    private String ten;
    private String trangThai;

    public sanPham() {
    }

    public sanPham(int id_sanPham, String ma, String ten, String trangThai) {
        this.id_sanPham = id_sanPham;
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
    }

    public int getId_sanPham() {
        return id_sanPham;
    }

    public void setId_sanPham(int id_sanPham) {
        this.id_sanPham = id_sanPham;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
