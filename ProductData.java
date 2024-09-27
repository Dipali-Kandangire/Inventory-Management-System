package com.tka.inventory;
import java.util.ArrayList;
import com.tka.inventory.Product;

public class ProductData{
	   static ArrayList<Product> al = new ArrayList(); // Static product list

	    // Add product to the list
	    public static void addProduct(Product p) {
	        al.add(p);
	        System.out.println("Product added: " + p);
	    }

	    // Display all products
	    public static ArrayList<Product> dispProduct() {
	        return al;
	    }

	    // Search products by cost range
	    public static void search(int r1, int r2) {
	        boolean found = false;
	        for (Product p : al) {
	            if (p.getPcost() >= r1 && p.getPcost() <= r2) {
	                System.out.println(p);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No products found in the given price range.");
	        }
	    }

	    // Delete a product by ID
	    public static void delete(int pid) {
	        boolean found = false;
	        for (Product p : al) {
	            if (p.getPid() == pid) {
	                al.remove(p);
	                System.out.println("Product deleted: " + p);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Product with ID " + pid + " not found.");
	        }
	    }

	    // Update product cost
	    public static void update(int pid, float pcost) {
	        boolean found = false;
	        for (Product p : al) {
	            if (p.getPid() == pid) {
	                p.setPcost(pcost);
	                System.out.println("Product updated: " + p);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Product with ID " + pid + " not found.");
	        }
	    }

	    // Purchase a product and calculate the total bill
	    public static void purchase(String pnm, int qty) {
	        float billamt = 0;
	        boolean found = false;
	        for (Product p : al) {
	            if (pnm.equals(p.getPnm())) {
	                billamt = qty * p.getPcost();
	                System.out.println("Total bill for " + qty + " " + pnm + "(s): $" + billamt);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Product " + pnm + " not found.");
	        }
	    }
	}



