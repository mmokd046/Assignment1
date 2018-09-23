import java.util.*;

public class SpeedTest{
  public static void main(String[] args){
    int testValue=100;
    Random rng = new Random(System.currentTimeMillis());
    
    
    
    Vector<Integer> v = new Vector<Integer>();
    
    
    double a = System.currentTimeMillis();
    for(int i = 0; i<testValue; i++){
      v.add(rng.nextInt(10));
    }

//    for (String nextValue : dataSet) {
//            System.out.println("The next value with the for Loop is: " + nextValue);
//        }
    double b = System.currentTimeMillis();
    double c = b-a;
    System.out.println("It took "+c+" milli seconds for the VECTOR");
    
    ArrayList<Integer> x = new ArrayList<Integer>();
    Iterator<Integer> itr = x.iterator();
    double d = System.currentTimeMillis();
    for(int i = 0; i<testValue; i++){
      x.add(rng.nextInt(10));
    }
    while(itr.hasNext()){
      System.out.println("The next value with the for Loop is: " + itr.next());     
    }
    double e = System.currentTimeMillis();
    double f = e-d;
    System.out.println("It took "+f+" milli seconds for the ARRAYLIST");
    
    LinkedList<Integer> z = new LinkedList<Integer>();
    double j = System.currentTimeMillis();
    for(int i = 0; i<testValue; i++){
      z.add(rng.nextInt(10));
    }
    double k = System.currentTimeMillis();
    double l = e-d;
    System.out.println("It took "+l+" milli seconds for the LINKEDLIST");
    
    int y[]= new int [testValue];
    double g =  System.currentTimeMillis();
    for(int i = 0; i<testValue; i++){
      y[i]=rng.nextInt(10);
    }
    double h =  System.currentTimeMillis();
    double i =  h-g;
    System.out.println("It took "+i+" milli seconds for the ARRAY");
    
    System.out.println("Vector's are "+f/c+" times faster.");
  }
}