package corejava.collection.assignmentset2.question2.mapper;

import corejava.collection.assignmentset2.question2.model.Customer;

public class CustomerMapper {
    public static Customer map(String data){
        String[] arr = data.split(",");
        String customerName = arr[0].trim();
        String storeLocation = arr[1].trim();
        Integer dayMonth = Integer.parseInt(arr[2].trim());
        String productName = arr[3].trim();
        Double price = Double.parseDouble(arr[4].trim());
        String paymentType = arr[5].trim();
        Customer customer = new Customer(customerName,storeLocation,dayMonth,productName,price,paymentType);
        return customer;
    }
}
