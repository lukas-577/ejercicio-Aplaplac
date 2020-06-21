package cl.lmedinar.clase3.cuarto.ejercicioHerenciaApaplac;

public class Director extends Trabajador {
	
	
	
	

	public Director(String nombre, String departamento) {
		super(nombre);
		this.departamento = departamento;
	}

	String departamento;

	@Override
	public Integer obtenerSalario() {
		salarioMinimo *= 10;
		
		return salarioMinimo;
	}
	
	@Override
	public String toString() {
		return "Trabajador nombre: " + nombre + " salario: " + obtenerSalario() + "\n" ;
	}
	
	
	

}
