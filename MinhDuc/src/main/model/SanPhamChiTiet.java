/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

/**
 *
 * @author HP
 */
public class SanPhamChiTiet {

    private String MaSP;
    private String TenSP;
    private String LoaiSP;
    private float GiaSP;
    private String sizeSP;
    private String MoTa;
    private String GhiChu;
    private int TrangThai;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(String MaSP, String TenSP, String LoaiSP, float GiaSP, String sizeSP, String MoTa, String GhiChu, int TrangThai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.LoaiSP = LoaiSP;
        this.GiaSP = GiaSP;
        this.sizeSP = sizeSP;
        this.MoTa = MoTa;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String LoaiSP) {
        this.LoaiSP = LoaiSP;
    }

    public float getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(float GiaSP) {
        this.GiaSP = GiaSP;
    }

    public String getSizeSP() {
        return sizeSP;
    }

    public void setSizeSP(String sizeSP) {
        this.sizeSP = sizeSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", LoaiSP=" + LoaiSP + ", GiaSP=" + GiaSP + ", sizeSP=" + sizeSP + ", MoTa=" + MoTa + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }

}
