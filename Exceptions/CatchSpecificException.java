import java.io.*;

class ExampleForSpecificException{
    public static void main(String args[]){
          try {
            int avgMarks = 189/0;
            System.out.print("Avg marks: " + avgMarks);
        }  
         catch(ArithmeticException e) {
            System.out.print("This exception is called as Arithmatic Exception");
        }

        catch(Exception e) {
            System.out.print(" Exception");
        }  
    }

}
