import java.util.ArrayList;

public class Company {

    private int companyId;
    private String Name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void addCustomers(Customer customer) {
        customers.add(customer);
    }

    public void addItems(Item item) {
        items.add(item);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotalWorthOfOrderPlaced1(){
        double sum = 0;
        for(int i=0;i<customers.size();i++)
        {
            Customer c = customers.get(i);
            ArrayList<Order> o = c.getOrders();
            double tempsum =0;
            for(int j =0;j<o.size();j++)
            {
                Order temp = o.get(j);
                for(int k = 0;k<temp.getOrderedItems().size();k++)
                {
                    OrderedItem temp1 = temp.getOrderedItems().get(k);
                    tempsum += temp1.getQuantity() * temp1.getItem().getRate();
                }
            }
            if (c instanceof RegisteredCustomer)
            {
                RegisteredCustomer cust = (RegisteredCustomer) c;
                tempsum = tempsum * (100 - cust.getDiscount())/100  ;
            }
            sum += tempsum;
        }
        return sum;
    }

    public double getTotalWorthOfOrderPlaced2(){
        double sum = 0;
        for(Customer c:customers)
        {
            sum += c.TotalOrderValue();
        }
        return sum;
    }

}
