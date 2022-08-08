import java.util.ArrayList;
import java.util.HashMap;

public class Admin {



    static void display3( HashMap<Integer,Branch> branchHashMap)
    {
        System.out.println("\n--------------Branch List---------------\n");
        System.out.println(String.format("%-10s%-10s", "ID","Name"));
        for(Branch e : branchHashMap.values())
        {
            System.out.println(String.format("%-10s%-10s",e.getBranch_id(),e.getBranch_name()));
        } }
    static void display4(HashMap<Integer,Shipment>shipmentHashMap)
    {
        System.out.println("\n--------------Shipment List---------------\n");
        System.out.println(String.format("%-20s%-20s%-20s%-20s", "ID","Name", "Name Receiver","Current Place"));
        for(Shipment e : shipmentHashMap.values())
        {
            System.out.println(String.format("%-20s%-20s%-20s%-20s",e.getId(),e.getSender(),e.getReceiver(), e.getCurrent_place()));
        } }

}