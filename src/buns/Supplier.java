package buns;

public class Supplier {
    int id;
    String nameTag;
    String supplierEmail;

    public Supplier() {};

    public Supplier(int id, String nameTag, String supplierEmail) {
        this.id = id;
        this.nameTag = nameTag;
        this.supplierEmail = supplierEmail;
    }

    public int getId() {
        return id;
    }

    public String getNameTag() {
        return nameTag;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }
}
