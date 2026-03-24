package thomc.appmonan;

public class MonAn {

    private String tenMonAn;
    private int donGia;
    private String moTa;
    private int hinhAnh;

    public MonAn(String tenMonAn, int donGia, String moTa, int hinhAnh) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public int getDonGia() {
        return donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }
}