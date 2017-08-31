import java.util.*;

public class StreamLined {

    //Defined Constants
    private static final float GRAVITY= -9.81f;
    private static final float VELOCITY= 50.5f;
    private static final float PI= 3.1415f;

    public static void main(String[] args) {

        //declare and initialize  variables/obj
        Scanner stdin = new Scanner(System.in);
        float angle= 1;

        //Println Welcome Message and instructions
        System.out.println("Welcome! This Program calculates the distance a projectile flies given a launch angle." +
                " Enter an angle of '0' to exit. Fire Away!");

        //loop until user inputs 0
        while (angle !=0){
            //prompt user for input of angle
            System.out.println("Enter the launch angle to fire your projectile");
            angle = stdin.nextFloat();

            if (angle !=0){
                //call Range_Finder function and print result to the hundredth decimal point
                System.out.printf("Your projectile lands %.2f meters away.\n",StreamLined.rangeFinder(angle));
            } //end if statement
            else {
                //end loop
                System.out.println("Goodbye!");
            } //end else statement

        } //end while loop
    }//end method main

    private static float rangeFinder(float angle){

        //calculates and returns value: (velocity^2 * sine(2*angle converted to degrees*PI))/ |gravity|
        return (float) ((Math.pow(VELOCITY,2) * Math.sin(2 * (angle/180*PI))) / Math.abs(GRAVITY));
    }//End method rangeFinder

}//end class Test1