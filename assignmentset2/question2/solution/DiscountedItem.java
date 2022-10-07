package corejava.collection.assignmentset2.question2.solution;

import corejava.collection.assignmentset2.question2.model.Customer;

import java.util.*;

public class DiscountedItem {
    public Map<String,Double> getProductWithHighPrice(List<Customer> customerList){
        Map<String,Double> tempMap = new HashMap<>();
        Double higherProductPrice = 0.0;
        for(Customer customer : customerList){
            String productName = customer.getProductName();
            Double price = customer.getPrice();
            if(tempMap.containsKey(productName.trim()) && tempMap.get(productName)<price){
                higherProductPrice = price;
                tempMap.put(productName,higherProductPrice);
            } else if (!tempMap.containsKey(productName.trim())) {
                tempMap.put(productName,price);
            }
        }
        //tempMap.forEach((k,v)-> System.out.println(k+ "   " +v));
        return tempMap;
    }

    public Set<String> customerList(List<Customer> customerList,Map<String,Double> tempMap){
        Set<String> customerSet = new HashSet<>();
        for (Customer customer : customerList){
            String productName = customer.getProductName();
            Double price = customer.getPrice();
            String customerName = customer.getCustomerName();
            if(tempMap.containsKey(productName.trim()) && price<tempMap.get(productName)){
                customerSet.add(customerName);
            }
        }
        return customerSet;

    }
}
