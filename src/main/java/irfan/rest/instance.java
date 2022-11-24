package irfan.rest;

public class instance<irf> {
irf x;
public String getType() {
	if (x instanceof Integer)
		return "int";
	else if(x  instanceof Float||x instanceof Double)
		return "decimal";
	else if (x instanceof String)
				return "text";
	return "Other";
	
}
}
