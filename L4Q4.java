/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;

import java.util.Scanner;

/**
 *
 * @author warre
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean isLeapYear = false;
        int daysBeforeMay;
        int daysBeforeAug;
        int spaceMay, spaceAug;
        int firstDayMay, firstDayAug;

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = sc.nextInt();

        //determine whether the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            daysBeforeMay = 121;
            daysBeforeAug = 213;
        } else {
            daysBeforeMay = 120;
            daysBeforeAug = 212;
        }

        spaceMay = daysBeforeMay % 7;
        spaceAug = daysBeforeAug % 7;

        firstDayMay = firstDay + spaceMay;
        firstDayAug = firstDay + spaceAug;

        if (firstDayMay > 6) {
            firstDayMay = firstDayMay - 7;
        }
        if (firstDayAug > 6) {
            firstDayAug = firstDayAug - 7;
        }

        System.out.println("May Calendar: ");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        int j;
        switch (firstDayMay) {
            case 0 -> {
                j = 0;//start to fill from Sunday
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }
                }
            }

            case 1 -> {
                j = 1;//Start with Monday
                System.out.print("\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }
                }
            }

            case 2 -> {
                j = 2;//Start with Tuesday
                System.out.print("\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }
                }

            }
            case 3 -> {
                j = 3;//Start with Wednesday
                System.out.print("\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }
                }
            }

            case 4 -> {
                j = 4;//Start with Thursday
                System.out.print("\t\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }
                }
            }
            case 5 -> {
                j = 5;//Start with Friday
                System.out.print("\t\t\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }
                }
            }

            case 6 -> {
                j = 6;//Start with Saturday
                System.out.print("\t\t\t\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (j == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    j++;
                    if (j > 6) {
                        j = 0;
                    }

                }
            }

        }

        System.out.println("\n");//leave two lines

        
        System.out.println("August Calendar: ");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        int c;
        switch (firstDayAug) {
            case 0 -> {
                c = 0;//start to fill from Sunday
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }
                }
            }

            case 1 -> {
                c = 1;//Start with Monday
                System.out.print("\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }
                }
            }

            case 2 -> {
                c = 2;//Start with Tuesday
                System.out.print("\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }
                }

            }
            case 3 -> {
                c = 3;//Start with Wednesday
                System.out.print("\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }
                }
            }

            case 4 -> {
                c = 4;//Start with Thursday
                System.out.print("\t\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }
                }
            }
            case 5 -> {
                c = 5;//Start with Friday
                System.out.print("\t\t\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }
                }
            }

            case 6 -> {
                c = 6;//Start with Saturday
                System.out.print("\t\t\t\t\t\t");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i);
                    if (c == 6) {
                        System.out.print("\n");
                    } else {
                        System.out.print("\t");
                    }
                    c++;
                    if (c > 6) {
                        c = 0;
                    }

                }
            }

        }

        System.out.println("");//leave a line

    }

}
