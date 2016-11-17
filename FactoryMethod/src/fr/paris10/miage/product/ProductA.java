package fr.paris10.miage.product;

final class ProductA implements Product {

	public ProductA() {
		super();
	}

	@Override
	public Product creerProduit() {

		return new ProductA();
	}

	public void doYourStuff() {
		System.out.println(" I ’m a ProductA , doing my stuff");
	}

}
