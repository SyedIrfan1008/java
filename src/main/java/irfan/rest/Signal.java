package irfan.rest;

public enum Signal {
	
		RED("stop",30),YELLOW("wait",5),GREEN("move",20);
		String action;
		int time;
		Signal(String action,int time){
			this.action=action;
			this.time=time;
		}
}
