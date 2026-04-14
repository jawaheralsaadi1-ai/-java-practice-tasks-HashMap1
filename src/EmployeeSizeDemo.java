import java.util.HashMap;


public class EmployeeSizeDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();

//Add at least 5 employee records using the put() method
        empIDsWithNamesMap.put(101, "Ali");
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");

       // Display all elements in the HashMap
        System.out.println(" Full Employees List : " + empIDsWithNamesMap);

       //Use the size() method to display the total number of employee records
        System.out.println(" the total number of employee  " + empIDsWithNamesMap.size());
        String addName1 = empIDsWithNamesMap.put(106, "Wala");
        System.out.println(" The new total number of employee  " + empIDsWithNamesMap.size());
        //Display the updated HashMap
        System.out.println(" Update  Employee List after Add new one 'Wala' : " + empIDsWithNamesMap);
        System.out.println(" The new total number of employee  " + empIDsWithNamesMap.size());


    }
}