public class Customer {
    private String customer_id, name, phone;

    public Customer() {

    }

    public Customer(String customer_id, String name, String phone) {
        this.customer_id = customer_id;
        this.name = name;
        this.phone = phone;
    }

    public String getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}