import jdk.nashorn.internal.objects.Global;

public class Foo {

  
  
  public static void main (String[] args) {
    

    // We are in main. AKA Somewhere outside of our class. We use our class here 
    // Create an array in main. Initialize the array with Random values. Yes use the random class   

    Fizz GlobalFizz = new Fizz();

//    int[] rngArray = new int [100];
//    int[] temp = new int[100];
//    for(int i = 0; i < rngArray.length; i++) {
//     rngArray[i] = (int)(Math.random()*100);
//       temp = rngArray.clone();
//      System.out.println(temp);
////     //System.arraycopy(a, 0, b, 0, a.length);
////      System.arraycopy(rngArray,0,0,rngArray.length);
//      String temp1 =GlobalFizz.fizz(rngArray, 3);
//      String temp2 =GlobalFizz.buzz(rngArray, 5);
//      String temp3 = GlobalFizz.fizzBuzz(rngArray, 15);
//
//      System.out.println("temp1: " +temp1 + "Array at i: " + rngArray);

  //  }
      // Setting initial values of arr using array initialization
      int[] arr = {4,3,4,6,7,8,21,15,9,5,4,3,36,45,46};
      String temper =  GlobalFizz.fizz(arr,3);
      System.out.println(temper);
      String temperTantrum = GlobalFizz.buzz(arr,2);
      System.out.println("this should fail with value of :" + temperTantrum);
    // **Instantiate** a Fizz class. //Make sure you are passing in all correct arguments
    // Call fizz function
    // Call buzz function
    // call fizzbuzz function
    
  }
  
}
