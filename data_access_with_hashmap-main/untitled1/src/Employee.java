import java.util.ArrayList;
import java.util.HashMap;

class Employee extends  Branch {

    private int employee_id;
    private String employee_name;
    private String employee_branch;

    private int branch_id_employee;

    public Employee(int employee_id, String employee_name, int branch_id_employee, String employee_branch) {
        super(branch_id_employee, employee_branch);
        this.setId(employee_id);
        this.setName(employee_name);
        this.setEmployee_branch(employee_branch);
        this.setBranch_id(branch_id_employee);

    }

    static void display_customer(HashMap<Integer,Customer> customerHashMap) {
        System.out.println("\n--------------Customer List---------------\n");
        System.out.println(String.format("%-30s%-30s%-30s%-30s%-30s", "ID", " Receiver ", "Sender ", "Current Place", "Shipment ID"));
        for (Customer a : customerHashMap.values()) {
            System.out.println(String.format("%-30s%-30s%-30s%-30s%-30s", a.getCustomer_id(), a.getCustomer_name(), a.getSender_name(), a.getCurrent_place(), a.getShipment_id()));
        }
    }

    public int getId() {
        return employee_id;
    }

    public void setId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return employee_name;
    }

    public void setName(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_branch() {
        return employee_branch;
    }

    public void setEmployee_branch(String employee_branch) {
        this.employee_branch = employee_branch;
    }

    public int getBranch_id_employee() {
        return branch_id_employee;
    }

    public void setBranch_id_employee(int branch_id_employee) {
        this.branch_id_employee = branch_id_employee;
    }
}