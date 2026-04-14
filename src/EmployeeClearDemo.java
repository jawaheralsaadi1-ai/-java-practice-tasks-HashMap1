import java.util.HashMap;


public class EmployeeClearDemo {
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
            //Use the clear() method to remove all elements from the map
            empIDsWithNamesMap.clear();
            System.out.println(" Update  Employee List after clearing it  " + empIDsWithNamesMap);
            //Use the size() method again to confirm that the map is empty
            System.out.println(" The new total number of employee  " + empIDsWithNamesMap.size());
            //Print a message showing that all records have been removed
            System.out.println("All records have been removed");

        }
        }
