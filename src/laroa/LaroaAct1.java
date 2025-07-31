package laroa;

import java.util.Scanner;

 class act2 {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        
        
        System.out.print("Enter name: ");
        String name  = sci.nextLine();
        System.out.print("Enter marks in Science: ");
        int scie = sci.nextInt();
        System.out.print("Enter marks in History: ");
         int hist = sci.nextInt();
        System.out.print("Enter marks in Math: ");
         int math = sci.nextInt();
        System.out.print("Enter marks in Soc: ");
         int soc = sci.nextInt();
        System.out.print("Enter marks in Arts: ");
         int art = sci.nextInt();
         
         int total = scie + hist+ math+ soc+ art;
         float percentage = (float) (total / 5.0);
         
         String remarks;
         
        if(percentage < 70){
        remarks = "Fail";
        
        }else if( percentage <= 75) {
            remarks = "Poor";
            }else if (percentage <= 80){
                remarks = "Fair";
            }else if (percentage <= 85){
                remarks = "Good";
            }else if (percentage <= 90){
                remarks = "Very Good";
            }else{
                remarks = "Execellent";
            }
        System.out.println("Total Marks: "+ total);
        System.out.println("Total Percentage: "+percentage);
        System.out.println("Remarks: "+remarks);
        System.out.println("Congrats "+name+" you Passed");
}
}