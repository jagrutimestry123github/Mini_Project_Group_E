package com.velocity;

import java.util.Scanner;

public class EcommerceMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Displaying the main menu
        System.out.println("Welcome to E-Commerce based application");
        System.out.println("User Operations:");
        System.out.println("1. User Registration");
        System.out.println("2. User Login");
        System.out.println("3. View Product Items in Sorted Order");
        System.out.println("4. Buy Product");
        System.out.println("5. View Cart");
        System.out.println("6. Purchase the Item");
        System.out.println("Admin Operations:");
        System.out.println("7. Add Product Item");
        System.out.println("8. Calculate Bill");
        System.out.println("9. Display Amount to End User");
        System.out.println("10. Check Quantity");
        System.out.println("11. Check Registered Users");
        System.out.println("12. Check a Particular User's History");
        System.out.println("Guest Operations:");
        System.out.println("13. View Product Items");
        System.out.println("14. Not Purchase Item");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        // Switch case to handle user input
        switch (choice) {
            case 1:
                // Implement user registration functionality
                System.out.println("User Registration");
                // Implement logic for user registration
                break;
            case 2:
                // Implement user login functionality
                System.out.println("User Login");
                // Implement logic for user login
                break;
            case 3:
                // Implement viewing product items in sorted order
                System.out.println("View Product Items in Sorted Order");
                // Implement logic to display products in sorted order
                break;
            case 4:
                // Implement buying a product
                System.out.println("Buy Product");
                // Implement logic for buying a product
                break;
            case 5:
                // Implement viewing user's cart
                System.out.println("View Cart");
                // Implement logic to view user's cart
                break;
            case 6:
                // Implement purchasing the item in the cart
                System.out.println("Purchase the Item");
                // Implement logic for purchasing the item
                break;
            case 7:
                // Implement adding a product item (Admin operation)
                System.out.println("Add Product Item");
                // Implement logic for adding a product item
                break;
            case 8:
                // Implement calculating bill (Admin operation)
                System.out.println("Calculate Bill");
                // Implement logic for calculating bill
                break;
            case 9:
                // Implement displaying amount to end user (Admin operation)
                System.out.println("Display Amount to End User");
                // Implement logic for displaying amount to end user
                break;
            case 10:
                // Implement checking quantity (Admin operation)
                System.out.println("Check Quantity");
                // Implement logic for checking quantity
                break;
            case 11:
                // Implement checking registered users (Admin operation)
                System.out.println("Check Registered Users");
                // Implement logic for checking registered users
                break;
            case 12:
                // Implement checking a particular user's history (Admin operation)
                System.out.println("Check a Particular User's History");
                // Implement logic for checking a particular user's history
                break;
            case 13:
                // Implement viewing product items (Guest operation)
                System.out.println("View Product Items");
                // Implement logic for viewing product items
                break;
            case 14:
                // Implement not purchasing item (Guest operation)
                System.out.println("Not Purchase Item");
                // Implement logic for not purchasing item
                break;
            default:
                System.out.println("Please select a valid choice");
        }

        sc.close(); // Closing the scanner
    }
}

