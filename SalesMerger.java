import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesMerger {
    public static void main(String[] args) {
        // Data for Branch A and Branch B (e.g., monthly revenue)
        List<Double> branchA = new ArrayList<>(Arrays.asList(1200.50, 2500.0, 1800.75));
        List<Double> branchB = new ArrayList<>(Arrays.asList(900.0, 3100.25, 2200.0));

        // Create a combined data set
        List<Double> totalSalesData = new ArrayList<>(branchA);
        totalSalesData.addAll(branchB); // This adds all elements from branchB to the list

        // Calculate the grand total
        double grandTotal = 0;
        for (double sale : totalSalesData) {
            grandTotal += sale;
        }

        System.out.println("Combined Sales Records: " + totalSalesData);
        System.out.println("Total Revenue for both branches: $" + grandTotal);
    }
}