package cl.lmedinar.clase3.cuarto.ejercicioHerenciaApaplac;

public class Desarrollador extends Trabajador {
	
	
	public Desarrollador(String nombre, int horasDeDesarrollo,int precioPorHora) {
		super(nombre);
		this.horasDeDesarrollo = horasDeDesarrollo;
		this.precioPorHora = precioPorHora;
		
	

		
	}
	int horasDeDesarrollo;
	int precioPorHora;
	
	@Override
	public Integer obtenerSalario() {
		salarioMinimo = salarioMinimo +(horasDeDesarrollo*precioPorHora);
		
		return salarioMinimo;
	}
	
	@Override
	public String toString() {
		return "Trabajador nombre: " + nombre + " salario: " + obtenerSalario() + "\n" ;
	}

}
