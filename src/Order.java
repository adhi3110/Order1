import java.util.ArrayList;

public class Order {

    private ArrayList<OrderedItem> orderedItems = new ArrayList<OrderedItem>();
    private int orderId;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    void addordererItem(OrderedItem item){
        orderedItems.add(item);
    }

    public ArrayList<OrderedItem> getOrderedItems() {
        return orderedItems;
    }
}
