/*
 Sophia Gorman
 SDEV200 - Assignment 10.14
 3/29/2025
 */

public class TenUML {
        public static void main(String[] args) {
            //Two dates are created
            MyDate firstdate = new MyDate();
            MyDate seconddate = new MyDate(34355555133101L);
            
            //Outputs both new dates
            System.out.println("The second date is: " + firstdate.getMonth() + "/" + firstdate.getDay() + 
                "/" + firstdate.getYear());
            System.out.println("The first date is: " + seconddate.getMonth() + "/" + seconddate.getDay() + 
                "/" + seconddate.getYear());
        }
    }

