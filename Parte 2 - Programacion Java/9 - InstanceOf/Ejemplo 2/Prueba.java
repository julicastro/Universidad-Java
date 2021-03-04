package ar.edu.unlam.alumno;

public class Prueba {

	public static void main(String args[]) {
		
		Empleado empleado = new Empleado ("Julian", 25000.0);
		Gerente gerente = new Gerente ("Agustina",30000.0,"Contabilidad");
	
		
		System.out.println("POLIMORFISMO: ");
		imprimirPolimorfismo(empleado);
		imprimirPolimorfismo(gerente);
		
		empleado = new Personal("Carlos",5000.0,"Contabilidad", "Turno mañana-tarde");
		
		System.out.println("");
		System.out.println("INSTANCE OF: ");
		
		ImprimirInstanceOf(empleado);
		ImprimirInstanceOf(gerente);
		
		//EL PRIMERO VA A DECIR ES PERSONAL XQ EL "empleado = new Personal"
	}
	
	public static void imprimirPolimorfismo(Empleado empleado) {
		System.out.println("Empleado: " + empleado.obtenerDetalles());
	}
	
	public static void ImprimirInstanceOf(Empleado empleado) {
		if(empleado instanceof Personal) {
			System.out.println("Es personal");
			Personal personal = (Personal) empleado;
			System.out.println("Personal: " + personal.obtenerDetalles());
		}else if(empleado instanceof Gerente) {
			System.out.println("Es gerente");
			Gerente gerente = (Gerente) empleado;
			System.out.println("Personal: " + gerente.obtenerDetalles());
		}else if(empleado instanceof Empleado) {
			System.out.println("Es empleado");
			//No es necesario trasnformar porque ya es empleado
			System.out.println("Personal: " + empleado.obtenerDetalles());
		}else if(empleado instanceof Object) {
			System.out.println("Es un objeto");
			empleado.toString();
		}
		
		
		
		
	}
	
	
	
}