class Item {
	int id;
	String name;
	double price;
	// TODO add variable.
	int taxType;

	// TODO constructor
	public Item(int id, String name, double price, int taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	int getTaxType() {
		return taxType;
	}

	int setId(int id) {
		return this.id = id;
	}

	String setName(String name) {
		return this.name = name;
	}

	double setPrice(double price) {
		return this.price = price;
	}

	int setTaxType(int taxType) {
		return this.taxType = taxType;
	}
	// TODO setters and getters

	double taxReturn() {
		// TODO
	}
}