package collegecourse;

import java.util.Scanner;

public class CollegeCourse {

 public static String dept;
 static int courseNum;
 static int credits;
 static double fee;
static int cost;

   
        static Scanner input=new Scanner(System.in);
    
    public static void main (String[] args){
    

        
    }
    
    public CollegeCourse (String dept, int courseNum, int credits){
    
        CollegeCourse.dept = dept;
        CollegeCourse.courseNum= courseNum;
        CollegeCourse.credits= credits;
        
        fee=cost*credits;
    }
    
    public void display(){
        
        
    
    System.out.println(dept+ courseNum+ " "+ "is "+ credits+" credits, with a cost of $"+ fee + ".");
    }
}

   
