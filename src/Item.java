public class Item {

    private int Itemno;
    private String description;
    private double rate;

    public Item(){
    Itemno = 0;
    }

    public Item(int itemno, String description, double rate) {
        Itemno = itemno;
        this.description = description;
        this.rate = rate;
    }

    public int getItemno() {
        return Itemno;
    }

    public void setItemno(int itemno) {
        Itemno = itemno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
