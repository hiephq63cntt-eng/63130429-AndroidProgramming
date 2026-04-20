package Thigk2.HoQuangHiep;

public class DiaDiem {

    private int hinh;
    private String ten;
    private String diaChi;

    public DiaDiem(int hinh, String ten, String diaChi) {
        this.hinh = hinh;
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public int getHinh() {
        return hinh;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }
}