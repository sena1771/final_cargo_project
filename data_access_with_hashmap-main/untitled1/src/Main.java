import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id_scanner;
        int id_new;
        int key_1=0;
        int kb=0;
        int kc=0;
        int kd=0;
        int k_shipment=0;
        String name;
        String branch;
        HashMap<Integer, Shipment> shipmentHashMap = new HashMap<>();
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        HashMap<Integer,Transportation> transportationHashMap=new HashMap<>();
        HashMap<Integer,Customer> customerHashMap=new HashMap<>();
        HashMap<Integer,Branch> branchHashMap=new HashMap<>();

        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String mainmenu= ("Enter the system as a:  \n 1-Administrator \n " +
                "2-Branch employee \n " +
                "3-Transportation personnel \n" +
                "4-Customer\n" +
                "5-Exit");
        boolean control_exit=true;
        while (control_exit){
            System.out.println(mainmenu);
            int enter = scanner.nextInt();

            switch (enter) {
                case 1:
                    boolean controlflag=true;
                    while (controlflag==true) {
                        System.out.println("\n---------Welcome to the X Cargo Company------\n");
                        String menu = ("1). Add Employee to the DataBase\n" +
                                "3). Delete Employee \n" +
                                "4). List All Employees \n" +
                                "5). EXIT\n" +
                                "6). Add Transportation Personnel \n " +
                                "8). Remove Transportation Personnel \n " +
                                "9). List All Transportation Personnel \n" +
                                "10) . Add Branch \n " +
                                "11) . Remove Branch \n" +
                                "12). List All Branches");
                        System.out.println(menu);
                        System.out.println("Enter your choice : ");
                        int ch = scan.nextInt();

                        switch (ch) {
                            case 1:
                                System.out.println("\nAdd Employee to the list:\n");
                                System.out.println("Enter Name :");
                                name = scan.next();
                                System.out.println("Enter Branch Name: ");
                                branch = scan.next();
                                boolean a = false;
                                for (int i = 0; i < branchHashMap.size(); i++) {
                                    if (branchHashMap.get(i).getBranch_name().equals(branch)) {
                                        employeeHashMap.put(kb,new Employee(kb, name, branchHashMap.get(i).getBranch_id(), branch));
                                            kb++;
                                           Company.display_employee(employeeHashMap);
                                        a = true;
                                        break;
                                           }
                                        }
                                    if (!a) {
                                    System.out.println("This branch does not exist.TRY AGAIN!");
                                         }
                                    break;

                                    case 3:
                                System.out.println("\nEmployee ID:");
                                id_scanner = scan.nextInt();
                                int k = 0;
                                try {
                                    for (Employee e : employeeHashMap.values()) {
                                        if (id_scanner == e.getId()) {
                                            employeeHashMap.remove(id_scanner);
                                           Company.display_employee(employeeHashMap);
                                            k++;
                                        }
                                    }
                                    if (k == 0) {
                                        System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                    }
                                } catch (Exception ex) {
                                    System.out.println(ex);
                                }
                                break;
                            case 4:
                               Company.display_employee(employeeHashMap);
                                break;

                            case 5:
                                System.out.println("\nFiles are saved");
                                controlflag=false;
                                break;
                            case 6:
                                System.out.println("Enter Name :");
                                name = scan.next();
                                System.out.println("Enter Branch: ");
                                branch = scan.next();
                                boolean p = false;
                                for (int nn = 0; nn < branchHashMap.size(); nn++) {
                                    if (branchHashMap.get(nn).getBranch_name().equals(branch)) {

                                            transportationHashMap.put(kc,new Transportation(kc, name, branchHashMap.get(nn).getBranch_id(), branch));
                                            kc++;
                                            Company.display_transportation(transportationHashMap);
                                            p = true;
                                            break;

                                    }
                                    if (!p) {
                                        System.out.println("This branch does not exist.TRY AGAIN!");
                                    }
                                }
                                break;
                            case 8:
                                System.out.println("\nPersonnel ID :");
                                id_scanner = scan.nextInt();
                                int k1 = 0;
                                try {
                                    for (Transportation e : transportationHashMap.values()) {
                                        if (id_scanner == e.getTransportation_id()) {
                                            transportationHashMap.remove(id_scanner);
                                           Company.display_transportation(transportationHashMap);
                                            k1++;
                                        }
                                    }
                                    if (k1 == 0) {
                                        System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                    }
                                } catch (Exception ex) {
                                    System.out.println(ex);

                                }
                                break;
                            case 9:
                               Company.display_transportation(transportationHashMap);
                                break;
                            case 10:
                                System.out.println("Enter Branch Name :");
                                name = scan.next();

                                    branchHashMap.put(key_1, new Branch(key_1, name));
                                key_1++;
                                Admin.display3(branchHashMap);
                                break;
                            case 11:
                                System.out.println("\nBranch ID :");
                                id_scanner = scan.nextInt();
                                int g = 0;
                                try {
                                    for (Branch e : branchHashMap.values()) {
                                        if (id_scanner == e.getBranch_id()) {
                                            branchHashMap.remove(id_scanner);
                                            Admin.display3(branchHashMap);
                                            g++;
                                            int k2 = 0;
                                            for (Transportation pl: transportationHashMap.values()) {
                                                if (id_scanner == pl.getTransportation_branch_id()) {
                                                    for(int ks=0;ks<transportationHashMap.size();ks++) {
                                                    transportationHashMap.remove(ks); }
                                                    k2++;
                                                }
                                                }
                                            for (Employee pl: employeeHashMap.values()) {
                                                if (id_scanner == pl.getBranch_id_employee()) {
                                                    for(int ks=0;ks<employeeHashMap.size();ks++) {
                                                        employeeHashMap.remove(ks); }
                                                    k2++;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (g == 0) {
                                        System.out.println("\nBranch is not available, Please enter a valid ID!!");
                                    }
                                } catch (Exception ex) {
                                    System.out.println(ex);
                                }
                                break;
                            case 12:
                              Admin.display3(branchHashMap);
                                break;

                                default:
                                System.out.println("\nEnter a correct choice from the List :");
                                break;
                        }
                    } break;

                    case 2:
                        Scanner sca = new Scanner(System.in);
                        System.out.println("Employee ID: ");
                        int id_employee = sca.nextInt();
                        boolean b = false;

                    for (int i = 0; i < employeeHashMap.size(); i++) {
                        if (employeeHashMap.get(i).getId() == id_employee) {
                            System.out.println("Succesfully has been entered the system");
                            b = true;
                        }
                    }
                        if (!b) {
                        System.out.println("This employee ID does not exist.TRY AGAIN!");
                        break;
                    }
                    boolean controlflag_2=true;
                        while (controlflag_2==true) {

                        System.out.println("1). Add Shipment \n" +
                                "2). Remove the Shipment\n" +
                                "3). Add Cargo Status: \n" +
                                "4). EXIT\n" +
                                "5). List Customers\n" +
                                "6).List Shipment Informations");
                        System.out.println("Enter your choice : ");
                        int chf = scan.nextInt();

                        switch (chf) {
                            case 1:
                                System.out.println("Enter Sender Name :");
                                name = scan.next();
                                System.out.println("Enter Receiver Name:  ");
                                branch=scan.next();
                                for (int i = 0; i < employeeHashMap.size(); i++) {

                                    if (employeeHashMap.get(i).getId() == id_employee) {

                                            customerHashMap.put(kd,new Customer(kd, branch, name, employeeHashMap.get(i).getBranch_id_employee(), employeeHashMap.get(i).getEmployee_branch(), k_shipment));

                                            kd++;
                                            Employee.display_customer(customerHashMap);
                                            shipmentHashMap.put(k_shipment,new Shipment(k_shipment, name, branch, employeeHashMap.get(i).getBranch_id_employee(), employeeHashMap.get(i).getEmployee_branch()));
                                            k_shipment++;
                                            Admin.display4(shipmentHashMap);
                                    } }
                                break;
                            case 2:
                                System.out.println("\nRemove Customer and Shipment :");
                                id_scanner = scanner.nextInt();
                                int j = 0;
                                try {
                                    for (Customer g : customerHashMap.values()) {
                                        if (id_scanner == g.getCustomer_id()) {
                                            customerHashMap.remove(id_scanner);
                                            Employee.display_customer(customerHashMap);
                                            j++;
                                        }
                                    }
                                    for (Shipment g : shipmentHashMap.values()) {
                                        if (id_scanner == g.getId()) {
                                            shipmentHashMap.remove(id_scanner);
                                            Admin.display4(shipmentHashMap);
                                            j++;
                                        }

                                    }
                                    if (j == 0) {
                                        System.out.println("\nCustomer is not available, Please enter a valid ID!!");
                                    }
                                } catch (Exception ex3) {
                                    System.out.println(ex3);
                                }
                                break;
                            case 3:
                                System.out.println("Shipment ID: ");
                                int idm = scan.nextInt();
                                boolean c = false;
                                for (int l = 0; l < shipmentHashMap.size(); l++) {
                                    if (shipmentHashMap.get(l).getId() == (idm)) {
                                        System.out.println("Successfully has been entered the system");
                                        System.out.println("Updated the cargo status Shipment \t"+idm+"\tto the your branch ");
                                        for(int i=0;i<employeeHashMap.size();i++) {
                                            if (employeeHashMap.get(i).getId() == id_employee) {
                                                shipmentHashMap.get(l).setCurrent_place(employeeHashMap.get(i).getEmployee_branch());
                                                customerHashMap.get(l).setCurrent_place(employeeHashMap.get(i).getEmployee_branch());
                                            }
                                        }
                                    } }
                                break;

                            case 5:
                               Employee.display_customer(customerHashMap);
                                break;
                            case 4:
                                System.out.println("\nFiles are saved");
                                controlflag_2 =false;
                                break;

                            case 6:
                               Admin.display4(shipmentHashMap);
                                break;
                            default:
                                System.out.println("\nEnter a correct choice from the List :");
                                break;
                        }
                        }
                        break;

                case 4:
                    System.out.println("Enter the shipment ID to show the Cargo Status: ");
                    int sc = scan.nextInt();
                    boolean u = false;
                    for (int i = 0; i < shipmentHashMap.size(); i++) {
                        if (shipmentHashMap.get(i).getId() == (sc)) {
                            System.out.println("Succesfully has been entered the system\n");
                            System.out.println("Cargo Information: \n");
                            System.out.println("Sender-----" + shipmentHashMap.get(i).getSender());
                            System.out.println("Receiver----" + shipmentHashMap.get(i).getReceiver());
                            System.out.println("Current Place-----" + shipmentHashMap.get(i).getCurrent_place());
                            break;
                        } else {
                            System.out.println("This tracking ID does not exist");
                        }
                    }
                    break;
                case 5:
                    System.out.println("System has been closed successfully ");
                    System.exit(0);
                case 3:
                    boolean flag2=true;
                    while (flag2) {
                        System.out.println("1).Update the Shipment : \n" +
                                "2). EXIT");
                        int ff = scanner.nextInt();
                        switch (ff) {
                            case 1:
                                System.out.println("Transportation personnel ID: ");
                                id_scanner = scan.nextInt();
                                for (int i = 0; i < transportationHashMap.size(); i++) {
                                    if (id_scanner == transportationHashMap.get(i).getTransportation_id()) {
                                        System.out.println("Succesfully has been entered the system ");
                                        System.out.println("Enter the shipment id_scanner which you want to update as a delivered: ");
                                        id_new = scan.nextInt();
                                        for (int k = 0; k < shipmentHashMap.size(); k++) {
                                            if (id_new == shipmentHashMap.get(i).getId()) {
                                                shipmentHashMap.get(i).setCurrent_place("Delivered");
                                               Admin.display4(shipmentHashMap);
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                u = true;
                                if (!u) {
                                    System.out.println("Personnel ID does not exist.TRY AGAIN!");
                                    break;
                                }

                            case 2:
                                System.out.println("\nFiles are saved");
                                flag2=false;
                                break;
                        }
                    }
                default:
                    System.out.println("\nEnter a correct choice from the List :");
            }
        } } }