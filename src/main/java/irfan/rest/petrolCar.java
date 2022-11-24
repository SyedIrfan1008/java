package irfan.rest;

public class petrolCar extends car {
	

	@Override
	public String fuelType() {
		// TODO Auto-generated method stub
		return "car fuel type is :"+"petrol";
	}

	@Override
	public String seatCount() {
		// TODO Auto-generated method stub
		return "car having number of seats:"+5;
	}

	@Override
	public String wheelCount() {
		// TODO Auto-generated method stub
		return "car having number of wheels is:"+ 4;
	}

}
