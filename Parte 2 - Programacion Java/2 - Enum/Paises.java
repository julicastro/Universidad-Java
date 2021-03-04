package udemy.java.universidad;

public enum Paises {

	ARGENTINA (45000000),
	CHILE(16000000),
	URUGUAY(3000000),
	PARAGUAY(6000000),
	BOLIVIA(40000000),
	VENEZUELA(30000000),
	BRASIL(200000000),
	PERU(30000000),
	ECUADOR(120000000);
	
	private final int habitantes;
	
	Paises(int habitantes){
		this.habitantes=habitantes;
	}
	public int getHabitantes() {
		return this.habitantes;
	}
	
}
