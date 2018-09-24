import java.util.*;

public class SpeedTest{
  public static void main(String[] args){
    //Increase the testValue to be able to run the tests for more 10 seconds (btw 1000 milliseconds = 1 second)
    int testValue= 100000000;
    Random rand = new Random();
    // Add element in the vector object
    long k = addElementInVector(testValue, rand);
    System.out.println("It took "+k+" millisecond to add "+testValue+  " the components in the vector object.");
    // Finish to add the element in the vector object 
    
    //Add element in the array list object
    long l = addElementInArrayList(testValue,rand);
    System.out.println("It took "+ l + " millisecond to add "+testValue+  " the components in the array list." );
    
    long m = addElementInArray(testValue,rand);
    System.out.println("It took "+ m + " millisecond to add  "+testValue+  " the components in the array." );
    System.out.println("End of the first part of the assignment! CONCLUSION: Array>Array List>Vectors");
    
    System.out.println(" ");
    
    System.out.println("Start of the second part of the assignment");
    
    System.out.println(" ");
    System.out.println("The result of the sum for the linked list is : " + sumIteratorArrayList(testValue,rand)+" millisecond.");
    
    //Creation of the iterator for the Vector 
    // Add the variables that you need to time the execution time (do it the same way that it was done for the previous ones)
    System.out.println(" ");
    System.out.println("The result of the sum for the Vector elements is : " + sumIteratorVector(testValue,rand)+" millisecond." );
    
    System.out.println(" ");
    System.out.println("The result of the sum for the traditional Array is : " + sumIteratorArray(testValue,rand)+" millisecond." );
    System.out.println("End of the second part of the assignment! CONCLUSION: Array>Vectors>Array List");
    
  }
  // function to add element in vector 
  private static long addElementInVector(int testValue, Random rand){
    long addInVectorInitialTime = System.currentTimeMillis();
    Vector<Integer> vector = new Vector<Integer>();
    for(int i = 0; i<testValue; i++){
      vector.add(rand.nextInt(10));
    }
    long addVectorfinalTime = System.currentTimeMillis() - addInVectorInitialTime;
    return addVectorfinalTime;
  }
  // function to add element in array list
  private static long addElementInArrayList(int testValue, Random rand){
    long addInArrayListInitialTime = System.currentTimeMillis();
    
    ArrayList<Integer> x = new ArrayList<Integer>();
    for(int i = 0; i<testValue; i++){
      x.add(rand.nextInt(10));
    }
    
    long addInArrayListFinalTime = System.currentTimeMillis() - addInArrayListInitialTime;
    return addInArrayListFinalTime;
  }
  // function to add element in array 
  private static long addElementInArray(int testValue, Random rand){
    long addInArrayInitialTime = System.currentTimeMillis();
    // Finished to add the element in the array list
    
    int [] array = new int [testValue];
    for(int i = 0; i<testValue; i++){
      array[i] = rand.nextInt(10);
    }
    
    long addInArrayFinalTime = System.currentTimeMillis() - addInArrayInitialTime;
    return addInArrayFinalTime;
  }
  //function to sum element using iterator in array list 
  private static long sumIteratorArrayList(int testValue, Random rand){
    
    long addInArrayListInitialTime = System.currentTimeMillis();
    
    ArrayList<Integer> x = new ArrayList<Integer>();
    for(int i = 0; i<testValue; i++){
      x.add(rand.nextInt(10));
    }
    
    // Creation of the iterator of the array list
    
    // Create a new large creation for the array list
    Iterator<Integer> iteratorArrayList = x.iterator();
    int sum = 0;
    // Add the variables that you need to time the execution time (do it the same way that it was done for the previous ones)
    while(iteratorArrayList.hasNext()){
      int value = iteratorArrayList.next();
      sum = sum +value;
    }
    
    long addInArrayListFinalTime = System.currentTimeMillis() - addInArrayListInitialTime;
    return addInArrayListFinalTime;
  }
  
  //Function to sum element usig iterator for vector
  private static long sumIteratorVector(int testValue, Random rand){
    Vector<Integer> vector = new Vector<Integer>();
    for(int i = 0; i<testValue; i++){
      vector.add(rand.nextInt(10));
    }
    Iterator<Integer> iteratorVector = vector.iterator();
    int VectorSum = 0;
    long addInVectorInitialTime = System.currentTimeMillis();
    while(iteratorVector.hasNext()){
      int value = iteratorVector.next();
      VectorSum = VectorSum +value;
    }
    long addVectorfinalTime = System.currentTimeMillis() - addInVectorInitialTime;
    return addVectorfinalTime;
  }
  //function to do the sum in an array 
  private static long sumIteratorArray(int testValue, Random rand){
    long addInArrayInitialTime = System.currentTimeMillis();
    // Finished to add the element in the array list
    
    int [] array = new int [testValue];
    for(int i = 0; i<testValue; i++){
      array[i] = rand.nextInt(10);
    }
    
    // Summation for the array 
    // Add the variables that you need to time the execution time (do it the same way that it was done for the previous ones)
    int sumArray = 0;
    long addInArrayTime = System.currentTimeMillis();
    for (int i =0; i < testValue; i++) {
      sumArray = sumArray+ array[i];
    }
    long addArrayfinalTime = System.currentTimeMillis() - addInArrayTime;
    return addArrayfinalTime;
  }
  
}