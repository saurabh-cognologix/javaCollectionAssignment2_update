package corejava.collection.assignmentset2.question2.solution;

import corejava.collection.assignmentset2.question2.model.Customer;

import java.util.*;
import java.util.stream.Collectors;

public class DiscountedItemUsingStream {
    //This function is used to find each product with heighest price
    // In key -> product Name
    //& In Value -> heighest price of each product
    public Map<String,Double> productWithHighestPrice(List<Customer> customerList){
        return customerList.stream()
                .collect(Collectors.groupingBy(
                        Customer::getProductName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Customer::getPrice)),
                                e->e.map(Customer::getPrice).orElse((double) -1)
                                //orElse((double) -1) =>used to remove Optional<Double>
                        )

                ));
    }

    //Storing customer Name in set
    public Set<String> customerListStream(List<Customer> customerList,Map<String,Double> tempMap){
        return customerList.stream()
                .filter(
                        e->tempMap.containsKey(e.getProductName()) && e.getPrice()<tempMap.get(e.getProductName())
                ).map(Customer::getCustomerName)
                .collect(Collectors.toSet());
    }
}
