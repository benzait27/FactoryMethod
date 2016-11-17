package fr.paris10.miage.Client;

import fr.paris10.miage.product.Factory;
import fr.paris10.miage.product.Product;

public class Client {
	Factory f = Factory.getInstance();
	Product prodA;

	public Client() {
		super();
		prodA = f.creeProduct("ProduitA");
	}

	public void foo() {
		prodA.perform();
		Product myProdB = f.creeProduct("ProduitB");
		myProdB.perform();
		Product myProdC = f.creeProduct("ProduitC");
		myProdC.perform();
	}

}
