package corejava.collection.assignmentset2.question2;

import corejava.collection.assignmentset2.question2.model.Customer;
import corejava.collection.assignmentset2.question2.parser.CustomerParser;
import corejava.collection.assignmentset2.question2.solution.DiscountedItem;
import corejava.collection.assignmentset2.question2.solution.DiscountedItemUsingStream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String filePath = "JavaTraining/src/corejava/collection/assignmentset2/question2/input/input.csv";
        CustomerParser customerParser = new CustomerParser();
        List<Customer> customerList = customerParser.parseCSVFile(filePath);
        //customerList.forEach(System.out::println);

        DiscountedItem discountedItem = new DiscountedItem();
        Map<String,Double> map =  discountedItem.getProductWithHighPrice(customerList);
        Set<String> customerName = discountedItem.customerList(customerList,map);
        System.out.println(customerName);


        //Using Stream
        System.out.println("-----------------Using Stream ------------------");
        DiscountedItemUsingStream discountedItemUsingStream = new DiscountedItemUsingStream();
        Map<String, Double> maxItemPrice =discountedItemUsingStream.productWithHighestPrice(customerList);
        Set<String> customerSet = discountedItemUsingStream.customerListStream(customerList,maxItemPrice);
        customerSet.forEach(System.out::println);
    }
}
