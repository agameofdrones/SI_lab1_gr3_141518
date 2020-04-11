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
	
	// TODO setters and getters
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

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setTaxType(int taxType) {
		this.taxType = taxType;
	}

	double getTaxReturn() {
		return price * 0.15;
	}
}