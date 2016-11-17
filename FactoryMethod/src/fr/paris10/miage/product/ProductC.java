package fr.paris10.miage.product;

final class ProductC implements Product {

	public ProductC() {
		super();
	}

	@Override
	public Product creerProduit() {

		return new ProductC();
	}

	public void perform() {
		System.out.println(" I ’m a ProductC , performing");
	}

}
