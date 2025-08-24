package com.bhuvanasri.assignment3.BTS;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	
	 private List<Product> items;

	    public Bookshelf() {
	        items = new ArrayList<>();
	    }

	    public void addItem(Product item) {
	        items.add(item);
	    }

	    public void showAllItems() {
	        for (Product item : items) {
	            item.displayInfo();
	            System.out.println("-------------------");
	        }
	    }
}