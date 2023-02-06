import java.util.ArrayList;

public class CafeUtil {

  int getStreakGoal() {
    int i = 1;
    int sum = 0;
    int numsWeeks = 10;
    while (i <= numsWeeks) {
      sum += i;
      i++;
    }
    return sum;
  }

  double getOrderTotal(double[] prices) {
    double sum = 0;
    int i;
    for (i = 0; i < prices.length; i++) {
      sum += prices[i];
    }
    return sum;
  }

  void displayMenu(ArrayList<String> menuItems) {
    for (Integer i = 0; i < menuItems.size(); i++) {
      System.out.println((i ) +" "+ menuItems.get(i));
    }
  }
  
  void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name: ");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName+"!");
    System.out.println("There are "+ customers.size() +" people in front of you");
    customers.add(userName);
    System.out.println(customers);
  }
}
