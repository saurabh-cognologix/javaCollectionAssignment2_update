package corejava.collection.assignmentset2.question2;

import corejava.collection.assignmentset2.question2.model.Customer;
import corejava.collection.assignmentset2.question2.parser.CustomerParser;
import corejava.collection.assignmentset2.question2.solution.DiscountedItem;

import java.util.List;
import java.util.Map;
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
    }
}
