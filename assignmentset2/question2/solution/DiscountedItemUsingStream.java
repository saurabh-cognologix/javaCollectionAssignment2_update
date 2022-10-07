package corejava.collection.assignmentset2.question2.solution;

import corejava.collection.assignmentset2.question2.model.Customer;

import java.util.*;
import java.util.stream.Collectors;

public class DiscountedItemUsingStream {
    public Map<String,Double> productWithHighestPrice(List<Customer> customerList){
        return customerList.stream()
                .collect(Collectors.groupingBy(
                        Customer::getProductName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Customer::getPrice)),
                                e->e.map(Customer::getPrice).orElse((double) -1)
                        )

                ));
    }
    public Set<String> customerListStream(List<Customer> customerList,Map<String,Double> tempMap){
        return customerList.stream()
                .filter(
                        e->tempMap.containsKey(e.getProductName()) && e.getPrice()<tempMap.get(e.getProductName())
                ).map(Customer::getCustomerName)
                .collect(Collectors.toSet());
    }
}
