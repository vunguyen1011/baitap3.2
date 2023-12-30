package listview_nangcao;

public class list {
    private String ten;
    private int tuoi;
    private int image;

    public list(String ten, int tuoi, int image) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}