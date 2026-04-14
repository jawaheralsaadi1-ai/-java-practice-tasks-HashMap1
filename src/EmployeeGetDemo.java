
import java.util.HashMap;

public class EmployeeGetDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");
        System.out.println(" Full Employees List : " + empIDsWithNamesMap);
        String name1 = empIDsWithNamesMap.get(102);
        System.out.println("Retrieve  Name form ID '102' : " + name1);
        String name2 = empIDsWithNamesMap.get(105);
        System.out.println("Retrieve Second Name form ID '105' : " + name2);


    }
    }
