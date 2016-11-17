package fr.paris10.miage.product;

public class Factory {
	private static Factory factory = new Factory();

	private Factory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Factory getInstance() {

		return factory;
	}
	
	public Product creeProduct(String nomDuProduit) {
		
		if (nomDuProduit.equals("ProduitA")) return new ProductA();
		if (nomDuProduit.equals("ProduitB")) return new ProductB();
		if (nomDuProduit.equals("ProduitC")) return new ProductC();
		return null;
		
		
		
	}
}
