

public class Fizz {

  // write a program that prints numbers 1 - 100 and for each multiple of 3 print fizz, for multiples of 5 print buzz,
  // for multiples of 15 print fizzbuzz
  
  // look at the sub problem that you can solve
  
  public String fizz(int [] temp, int n ) {
    
    // pass an array in

    String localfizz = "fizz";
    
    // go through the array and compare indexes and if the number is divisible by 3 return fizz
    
    for(int i = 0; i < temp.length; ++i) {
      if ((n % 3) == 0)
        return "Fizz";
    }
    return "Nothing found";
  }


  public String buzz(int[] temp2, int n2) {
    //pass in an array and initialize local variables
    
    String localbuzz = "buzz";
    
    // go through the array and compare indexes and if the number is divisible by 5 return buzz
    
    for( int j = 0; j < temp2.length; ++j) {
      if(n2 % 5 == 0) {
        return localbuzz;
      }
    }
    return "Not a mod of 5";
    
  }
  public String fizzBuzz(int[] temp3, int n3) {
    //pass in an array and initialize local variables
    String localfizzbuzz = "fizzbuzz";
    // go through the array and comapre indexes and if the number is divisible by 15 return fizzbuzz
    for(int k = 0; k < temp3.length; k++) {
      if (n3 % 15 == 0) {
        return localfizzbuzz;
      }else {
        return "Not found";
      }
    }
      return "Nothing found";
  }
  
  
}
