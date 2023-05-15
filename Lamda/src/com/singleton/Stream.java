package com.singleton;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

public class Stream {
	
	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		
		productlist.add(new Product(1,"pen",10));
		productlist.add(new Product(2,"book",20));
		productlist.add(new Product(3,"laptop",30));
		
productlist.stream().filter(p-> p.price>10).forEach(p->System.out.println(p.name));	
	}
	

}
