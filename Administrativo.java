package cl.lmedinar.clase3.cuarto.ejercicioHerenciaApaplac;

public class Administrativo extends Trabajador{
	
	
	//constructor del padre 
	public Administrativo(String nombre,int aniosDeServicio, int nivelDeCargo) {
		super(nombre);
		this.aniosDeServicio = aniosDeServicio;
		this.nivelDeCargo= nivelDeCargo;
	}
	
	int aniosDeServicio;
	int nivelDeCargo;
	
	
	@Override
	public Integer obtenerSalario() {
		salarioMinimo = salarioMinimo*aniosDeServicio*nivelDeCargo;
		
		return salarioMinimo;
	}
	
	@Override
	public String toString() {
		return "Trabajador nombre: " + nombre + " salario: " + obtenerSalario() + "\n" ;
	}
	

}
