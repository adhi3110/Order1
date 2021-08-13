import java.util.ArrayList;

public class Customer {

    private int id;
    private String name;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double TotalOrderValue() {
        double Total =0;
        for(Order o:orders)
        {
            Total += o.getOrderValue();
        }
        return Total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order) {
        orders.add(order);
    }
}
