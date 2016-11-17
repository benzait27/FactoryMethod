package fr.paris10.miage.product;

final class ProductA implements Product {

	public ProductA() {
		super();
	}

	@Override
	public Product creerProduit() {

		return new ProductA();
	}



	@Override
	public void perform() {
		System.out.println(" I ’m a ProductA , doing my stuff");
		
	}

}
