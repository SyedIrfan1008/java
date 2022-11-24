package irfan.rest;

public abstract  class car implements vehicle2 {

	@Override
	public String wheelCount() {
		// TODO Auto-generated method stub
		return "car having number of wheels:" +4;
	}

	@Override
	public String fuelType() {
		// TODO Auto-generated method stub
		return "car fueltype is :"+ "petrol";
	}

	@Override
	public String seatCount() {
		// TODO Auto-generated method stub
		return "car having seats:" + 5;
	}

}
