package ss17_BinaryFile_Serialization.Bai_tap;

import java.io.Serializable;

public class SuperMarket implements Serializable {
    private int MaSanPham;
    private String TenSanPham;
    private String HanSanXuat;
    private double Gia;

    public SuperMarket(int maSanPham, String tenSanPham, String hanSanXuat, double gia) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        HanSanXuat = hanSanXuat;
        Gia = gia;
    }

    public SuperMarket() {
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getHanSanXuat() {
        return HanSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        HanSanXuat = hanSanXuat;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "SuperMarket{" +
                "MaSanPham=" + MaSanPham +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", HanSanXuat='" + HanSanXuat + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}
