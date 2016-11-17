package fr.paris10.miage.Client;

import fr.paris10.miage.product.Factory;
import fr.paris10.miage.product.Product;

public class Client {
	Factory f = Factory.getInstance();
	 Product prodA; 
	 Product prodB; 
	 public Client(){ 
		 Product  prodA = new ProductA();
		 }
	 public void foo(){ 
			 prodA.doYourStuff(); 
			 ProductB myProdB = new ProductB();
			 myProdB.doIt();
			 ProductC myProdC = new ProductC();
	
	 
			 myProdB.perform(); 
			 } 
	 
			 } 
	
	 
}
