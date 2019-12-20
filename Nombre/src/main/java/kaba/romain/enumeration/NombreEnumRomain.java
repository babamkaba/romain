package kaba.romain.enumeration;

public enum NombreEnumRomain {
	
	M(1000),CM(900), D(500),CD(400),C(100), XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);

	private final int code;
	
	private NombreEnumRomain(int code) {
		
		this.code = code;
		
	}
	public int getCode() {
		return code;
	}

}
