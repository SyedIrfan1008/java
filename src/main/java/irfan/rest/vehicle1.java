
	package irfan.rest;

	public interface vehicle1 {
		String maxSpeed="car max speed is:"+120;
		 String wheelCount();
		 String fuelType();
		default String color() {
			return "car colour is:"+ "white";
		}

	}

