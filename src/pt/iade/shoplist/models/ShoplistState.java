package pt.iade.shoplist.models;

public enum ShoplistState {
	// If we only wanted the values:
	//REQUEST,ONGOING,FINISHED,CANCELED;
	// But we need the message:
	REQUEST ("Not started yet"),
	ONGOING("Started, but still missing items"),
	FINISHED ("All items bought"),
	CANCELED ("Not need or not valid");
	private final String message;

	private ShoplistState(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

}
