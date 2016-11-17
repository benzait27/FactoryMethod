package fr.paris10.miage.product;

final class ProductB implements Product {

	public ProductB() {
		super();
	}

	@Override
	public Product creerProduit() {

		return new ProductB();
	}

	public void doIt() {
		System.out.println(" I ’m a ProductB , doing it ");
	}

}
