import java.util.HashMap;

class  Shipment extends Branch {
    private int id;
    private String sender;
    private String receiver;
    private String current_place;
    private int current_place_id;

    public Shipment(int id, String sender, String receiver, int current_place_id, String current_place) {
        super(current_place_id,current_place);
        this.setCurrent_place_id(current_place_id);
        this.setId(id);
        this.setCurrent_place(current_place);

        this.setSender(sender);
        this.setReceiver(receiver);
    }
    public String toString()
    {
        return "\nShipment Details :" + "\nID: " + this.id + "\nSender Name: " + this.sender + "\nReceiver Name: " +
                this.receiver+ "\n Current Place: " + this.current_place ;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getCurrent_place() {
        return current_place;
    }

    public void setCurrent_place(String current_place) {
        this.current_place = current_place;
    }

    public int getCurrent_place_id() {
        return current_place_id;
    }

    public void setCurrent_place_id(int current_place_id) {
        this.current_place_id = current_place_id;
    }
}