public class IndividualCustomer extends Customer{
    private String customerName;
    private String tcNo;
    private String customerSurname;

    public String getCustomerSurname() {
        return customerSurname;
    }



    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}
