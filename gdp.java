
class gdp {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 1000;

    for (int i = n; i >= 1; --i) {
     
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  }
}