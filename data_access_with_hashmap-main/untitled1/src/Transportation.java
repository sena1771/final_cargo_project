class Transportation extends Branch {
    private String transportation_name;
    private int transportation_id;
    private String transportation_branch;
    private int transportation_branch_id;

    public Transportation(int transportation_id,String transportation_name,int transportation_branch_id,String transportation_branch) {
        super(transportation_branch_id,transportation_branch);
        this.setTransportation_id(transportation_id);
        this.setTransportation_branch(transportation_branch);
        this.setTransportation_name(transportation_name);
        this.setTransportation_branch_id(transportation_branch_id);
        setBranch_id(transportation_branch_id);
        // super.setBranch_id(transportation_branch_id); //important one
    }

    public String toString()
    {
        return "\nTransportation Personnel Details :" + "\nID: " + this.transportation_id + "\nName: " + this.transportation_name + "\nBranch: " +
                this.transportation_branch+ "\nBranch ID: " + this.transportation_branch_id ;
    }
    public String getTransportation_name() {
        return transportation_name;
    }

    public void setTransportation_name(String transportation_name) {
        this.transportation_name = transportation_name;
    }

    public int getTransportation_id() {
        return transportation_id;
    }

    public void setTransportation_id(int transportation_id) {
        this.transportation_id = transportation_id;
    }

    public String getTransportation_branch() {
        return transportation_branch;
    }

    public void setTransportation_branch(String transportation_branch) {
        this.transportation_branch = transportation_branch;
    }

    public int getTransportation_branch_id() {
        return transportation_branch_id;
    }

    public void setTransportation_branch_id(int transportation_branch_id) {
        this.transportation_branch_id = transportation_branch_id;
    }
}
