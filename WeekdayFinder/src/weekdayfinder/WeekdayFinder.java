package weekdayfinder;
import java.util.Scanner;

/**
 * This program receives a set of 3 numbers indicating the month, day, and <br>
 * year of a given date. The program takes this date and finds out whether or<br>
 * not it is a valid date and if it is valid, it will determine the day of the<br>
 * week that date occurred and if it happened during a leap year.<br>
 * @author Feroz Mughal
 * @since 02/21/2017
 * Course: CSC 1350<br>
 * Section: 001
 * PAWS ID: FMUGHA2
 * project #: 1 <br>
 * Instructor: Dr. Duncan <br>
 */

public class WeekdayFinder 
{
    public static void main(String[] args) {
        Scanner keyBd = new Scanner(System.in);
        System.out.print("Enter numberic values for month, day and year of a date> ");
        int month = keyBd.nextInt();
        int day = keyBd.nextInt();
        int year = keyBd.nextInt();       
        
        if (month > 12 || month < 1 || day < 1 || day > 31 || year < 1584){
            System.out.println(month+ "/" + day + "/" + year + " is not a valid date.");
        }
        
        else if (month == 4 || month == 6 || month == 9 || month == 11 && day > 30){
                System.out.println(month+ "/" + day + "/" + year + " is not a valid date.");
        }
      
        else if (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
            
        if ((month == 2) && (day > 29)) {
                System.out.println(month+ "/" + day + "/" + year + " is not a valid date.");
            }
            
        else{
            int century = year/100;
            int u = 2*(3-(century%4));
            int v = year%100;
            int w = v/4;
            int m;
            String dateDay = "Day";
            
            if (month == 2 || month == 8){
                m = 2;
            }          
            else if (month == 3 || month == 11){
                m = 3;
            }
            else if (month == 5){
                m = 1;
            }
            else if (month == 6){
                m = 4;
            }
            else if (month == 9 || month == 12){
                m = 5;
            }
            else if (month == 10){
                m = 0;
            }
            else{
                m = 6;
            }
            
            int y = u + v + w + m + day;
            int dayOfTheWeek = y%7;
                
            if (dayOfTheWeek == 0){
                    dateDay = "Sunday";
                }
            else if (dayOfTheWeek == 1){
                    dateDay = "Monday";
                }
            else if (dayOfTheWeek == 2){
                    dateDay = "Tuesday";
                }
            else if (dayOfTheWeek == 3){
                    dateDay = "Wednesday";
                }
            else if (dayOfTheWeek == 4){
                    dateDay = "Thursday";
                }
            else if (dayOfTheWeek == 5){
                    dateDay = "Friday";
                }
            else if (dayOfTheWeek == 6){
                    dateDay = "Saturday";
                }           
            System.out.println(dateDay + ", " + month + "/" + day + "/" + year + " occurs during a leap year.");   
        }
        }
                     
        else{ 
            
            if (month == 2 && day > 28){
                System.out.println(month+ "/" + day + "/" + year + " is not a valid date.");
            }
            
            else{
            int century = year/100;
            int u = 2*(3-(century%4));
            int v = year%100;
            int w = v/4;
            int m;
            String dateDay = "Day";
            
            if (month == 1 || month == 10){
                m = 0;
            }          
            else if (month == 4 || month == 7){
                m = 6;
            }
            else if (month == 5){
                m = 1;
            }
            else if (month == 6){
                m = 4;
            }
            else if (month == 8){
                m = 2;
            }
            else if (month == 9 || month == 12){
                m = 5;
            }
            else{
                m = 3;
            }
            
            int y = u + v + w + m + day;
            int dayOfTheWeek = y%7;
                
            if (dayOfTheWeek == 0){
                    dateDay = "Sunday";
                }
            else if (dayOfTheWeek == 1){
                    dateDay = "Monday";
                }
            else if (dayOfTheWeek == 2){
                    dateDay = "Tuesday";
                }
            else if (dayOfTheWeek == 3){
                    dateDay = "Wednesday";
                }
            else if (dayOfTheWeek == 4){
                    dateDay = "Thursday";
                }
            else if (dayOfTheWeek == 5){
                    dateDay = "Friday";
                }
            else if (dayOfTheWeek == 6){
                    dateDay = "Saturday";
                }
            
            System.out.println(dateDay + ", " + month + "/" + day + "/" + year + " does not occur during a leap year.");
            }
        }     
    }
}
