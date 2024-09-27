package com.tka.inventory;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {
	     public static void main(String[] args) {
	        int choice;
	        ArrayList<Product> al1 = new ArrayList<>(); // Use generic ArrayList
	        Scanner sc = new Scanner(System.in);
	        int ch;

	        do {
	            System.out.println("1. Add Product");
	            System.out.println("2. Display all products");
	            System.out.println("3. Search by cost range");
	            System.out.println("4. Delete product");
	            System.out.println("5. Update product cost");
	            System.out.println("6. Purchase");
	            System.out.println("Enter your choice:");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: {
	                    System.out.println("Enter id, name, category and cost:");
	                    int id = sc.nextInt();
	                    String name = sc.next();
	                    String category = sc.next();
	                    float cost = sc.nextFloat();
	                    if (cost <= 0) {
	                        System.out.println("Cost must be greater than 0.");
	                        break;
	                    }
	                    ProductData.addProduct(new Product(id, name, category, cost));
	                    break;
	                }
	                case 2: {
	                    al1 = ProductData.dispProduct();
	                    System.out.println(al1);
	                    break;
	                }
	                case 3: {
	                    System.out.println("Enter cost range (min max):");
	                    int r1 = sc.nextInt();
	                    int r2 = sc.nextInt();
	                    ProductData.search(r1, r2);
	                    break;
	                }
	                case 4: {
	                    System.out.println("Enter product ID to delete:");
	                    int pid = sc.nextInt();
	                    ProductData.delete(pid);
	                    break;
	                }
	                case 5: {
	                    System.out.println("Enter product ID and new cost:");
	                    int pid = sc.nextInt();
	                    float pcost = sc.nextFloat();
	                    ProductData.update(pid, pcost);
	                    break;
	                }
	                case 6: {
	                    System.out.println("Enter product name and quantity to purchase:");
	                    String prodName = sc.next();
	                    int qty = sc.nextInt();
	                    ProductData.purchase(prodName, qty);
	                    break;
	                }
	                default: {
	                    System.out.println("Invalid choice.");
	                    break;
	                }
	            }
	            System.out.println("Enter 1 to continue, else enter 0:");
	            ch = sc.nextInt();
	        } while (ch == 1);
	        sc.close();
	    }
	}



