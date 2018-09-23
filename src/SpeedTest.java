import java.util.*;

public class SpeedTest{
  public static void main(String[] args){
	  //Increase the testValue to be able to run the tests for more 10 seconds (btw 1000 milliseconds = 1 second)
    int testValue= 10;
    Random rand = new Random();
    // Add element in the vector object
    
    Vector<Integer> v = new Vector<Integer>();
    long addInVectorInitialTime = System.currentTimeMillis();
    for(int i = 0; i<testValue; i++){
      v.add(rand.nextInt(10));
    }
    long addVectorfinalTime = System.currentTimeMillis() - addInVectorInitialTime;
    System.out.println("It took "+addVectorfinalTime+" milli seconds to add the components in the vector object");
    // Finish to add the element in the vector object 
    
    //Add element in the array list object 
    long addInArrayListInitialTime = System.currentTimeMillis();

    ArrayList<Integer> x = new ArrayList<Integer>();
    for(int i = 0; i<testValue; i++){
    	x.add(rand.nextInt(10));
    }
    
    long addInArrayListFinalTime = System.currentTimeMillis() - addInArrayListInitialTime;
    
    System.out.println(" It took "+ addInArrayListFinalTime + " milli seconds to add all the elements in the array list" );
    
    
    long addInArrayInitialTime = System.currentTimeMillis() - addInArrayListInitialTime;

    // Finished to add the element in the array list

     int [] array = new int [testValue];
     for(int i = 0; i<testValue; i++){
    	 array[i] = rand.nextInt(10);
     }
     
     long addInArrayFinalTime = System.currentTimeMillis() - addInArrayInitialTime;
     
     System.out.println("All the elements got added in the array  and it took " +  addInArrayFinalTime + " milli seconds");
     
     //Finished to add the element in the array
     
     System.out.println(" ");
   
     System.out.println("End of the first part of the assignment");
     
     System.out.println(" ");

     System.out.println("Start of the second part of the assignment");

     
    // Creation of the iterator of the array list  
     // Create a new large creation for the array list
     Iterator<Integer> iteratorArrayList = x.iterator();
     int sum = 0;
     // Add the variables that you need to time the execution time (do it the same way that it was done for the previous ones)
     while(iteratorArrayList.hasNext()){
    	 int value = iteratorArrayList.next();
    	 System.out.println("The next value with the for Loop is: " + value);   
    	 sum = sum +value;
     }
     System.out.println("The iterator finish to visit all the elements of the list");
     System.out.println(" ");
     System.out.println("The result of the sum for the linked list is :" + sum );
     
     //Creation of the iterator for the Vector 
     // Add the variables that you need to time the execution time (do it the same way that it was done for the previous ones)
     Iterator<Integer> iteratorVector = v.iterator();
     int VectorSum = 0;
     while(iteratorVector.hasNext()){
    	 int value = iteratorVector.next();
    	 VectorSum = VectorSum +value;
     }
     System.out.println("The result of the sum for the Vector elements is :" + VectorSum );
     
     System.out.println(" ");
      
     // Summation for the array 
     // Add the variables that you need to time the execution time (do it the same way that it was done for the previous ones)
     int sumArray = 0;
     for (int i =0; i < testValue; i++) {
    	 sumArray = sumArray+ array[i];
     }
     
     System.out.println("The summation of all the element in array is equal to  " + sumArray );
     
  }
}