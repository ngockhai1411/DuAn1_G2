/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

/**
 *
 * @author Admin
 */
public class Topping {

    private int id_Topping;
    private String ma;
    private String ten;
    private double gia;

    public Topping() {
    }

    public Topping(int id_Topping, String ma, String ten, double gia) {
        this.id_Topping = id_Topping;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public int getId_Topping() {
        return id_Topping;
    }

    public void setId_Topping(int id_Topping) {
        this.id_Topping = id_Topping;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}
