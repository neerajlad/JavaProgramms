package arraypkg;

public class JavaStringArray {
    public static void main(String args[]){
           
           
            String[] myFirstStringArray = new String[]{"String 1", "String 2", "String 3"};
           
//            int b[] = { 33, 3, 4, 5 };
//            int a[] = new int[5];
//            int[] x = new int[5];
            //first declare String array
            String[] mySecondStringArray = new String[3];
           
            //Observe that giving size is mandatory here. While there was no size given in the first method.
           
            //Now Assign individual String array elements
            mySecondStringArray[0] = "String 1";
            mySecondStringArray[1] = "String 2";
            mySecondStringArray[2] = "String 3";
           
           System.out.println("============== Printing value by array Index");
            //this will retrieve second element of first String array
            System.out.println("myFirstStringArray[1]"+myFirstStringArray[1]);
           
            System.out.println("============== Printing all value from array with Normal For");
            //iterate the String array using loop
            for(int i=0; i < mySecondStringArray.length; i++){
                    System.out.println("mySecondStringArray[" + i + "]" + mySecondStringArray[i]);
            }
            
            System.out.println("============== Printing all value from array with Normal For each");
            for(String s : myFirstStringArray)
            {
            	System.out.println(s);
            }
            System.out.println("Print string"+myFirstStringArray);
    }
}