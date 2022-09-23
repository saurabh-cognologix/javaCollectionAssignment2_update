package corejava.collection.assignmentset2.question2.model;

public class Customer {
    private String customerName;
    private String storeLocation;
    private Integer dayMonth;
    private String productName;
    private Double price;
    private String paymentType;

    public Customer(String customerName, String storeLocation, Integer dayMonth, String productName, Double price, String paymentType) {
        this.customerName = customerName;
        this.storeLocation = storeLocation;
        this.dayMonth = dayMonth;
        this.productName = productName;
        this.price = price;
        this.paymentType = paymentType;
    }

    public Customer() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public Integer getDayMonth() {
        return dayMonth;
    }

    public void setDayMonth(Integer dayMonth) {
        this.dayMonth = dayMonth;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", storeLocation='" + storeLocation + '\'' +
                ", dayMonth=" + dayMonth +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
