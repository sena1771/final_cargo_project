
public class Customer extends Shipment  {
    private   int customer_id;
    private  String customer_name;
    private String sender_name;
    private String current_place_customer;
    private int current_place_id;
    private int shipment_id;

    public Customer(int customer_id,String customer_name,String sender_name,int current_place_id,String current_place_customer,int shipment_id) {
        super(shipment_id,sender_name,customer_name,current_place_id,current_place_customer);
        this.setCurrent_place_customer(current_place_customer);
        this.setCustomer_id(customer_id);
        this.setCurrent_place_id(current_place_id);
        this.setCustomer_name(customer_name);
        this.setShipment_id(shipment_id);
        this.setSender_name(sender_name);
    }
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public String getCurrent_place_customer() {
        return current_place_customer;
    }

    public void setCurrent_place_customer(String current_place_customer) {
        this.current_place_customer = current_place_customer;
    }

    @Override
    public int getCurrent_place_id() {
        return current_place_id;
    }

    @Override
    public void setCurrent_place_id(int current_place_id) {
        this.current_place_id = current_place_id;
    }
}