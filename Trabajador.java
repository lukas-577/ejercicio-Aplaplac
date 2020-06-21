package cl.lmedinar.clase3.cuarto.ejercicioHerenciaApaplac;

public class Trabajador {
	
	String nombre;
	Integer salarioMinimo = 300000;
	
//	String numCadena = Integer.toString(obtenerSalario());
	
	//constructor 
	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}
	//metodo obtenerSalario
	public Integer obtenerSalario() {
		
		
		return salarioMinimo;
	}
	
	// setter and getter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(Integer salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Trabajador nombre: " + nombre + " salarioMinimo: " + salarioMinimo + "\n" ;
	}
	
	
	
	
	

}
