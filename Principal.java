package cl.lmedinar.clase3.cuarto.ejercicioHerenciaApaplac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Principal {
	public static void main(String[] args) {
		
		//definir el texto del menu
		System.out.println("Bienvenido al sistema  ");
		System.out.println("- Ingrese una opcion");
		System.out.println("- 1: Ordenar por salario");
		System.out.println("- 2: Ordenar por nombre");
		
		Scanner sc = new Scanner (System.in);
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
		case 1 : 
			System.out.println("ingreso opcion 1");
			break;
		
		case 2: 
			System.out.println("ingreso opcion 2");
			break;
		
		default:
			System.out.println("opcion invalida,saliendo del sistema");
		
		}
		
		//instancia de objetos 
		Desarrollador fullStack = new Desarrollador("Maria",20,56000);
		Desarrollador backend = new Desarrollador("Hector",10,43000);
		Director directorTI = new Director("Benito","tecnologias de informacion");
		Administrativo secretario = new Administrativo("Antonio",7,2);
		
		//listar los trabajadores
		List <Trabajador> trabajadores = new ArrayList<>();
		trabajadores.add(fullStack);
		trabajadores.add(backend);
		trabajadores.add(directorTI);
		trabajadores.add(secretario);
		
		//para que me liste los nombres o recorrer con el forEach
		trabajadores.forEach(tr-> System.out.println(tr.getNombre()));
		
		//para que me los ordene alfabeticamente
		List<Trabajador> trabajadoresOrdenados = trabajadores.stream()
				.sorted((o1,o2)->o1.getNombre().compareTo(o2.getNombre()))
				.collect(Collectors.toList());
		System.out.println(trabajadoresOrdenados);
		
		
		//ordenar por salario
		List<Trabajador> trabajadoresOrdenadosSalario = trabajadores.stream()
				.sorted((o3,o4)->o3.getSalarioMinimo().compareTo(o4.getSalarioMinimo()))
				.collect(Collectors.toList());
		
		System.out.println(trabajadoresOrdenadosSalario);
//		// esto es lo mismo no es necesario poner .toString por que viene por defecto
//		// y lo sobreescribi 
//		System.out.println(directorTI);
////		System.out.println(directorTI.toString());
		
		directorTI.getSalarioMinimo();
		
		System.out.println(directorTI.obtenerSalario());
		
		System.out.println(fullStack.obtenerSalario());
		
		System.out.println(secretario.obtenerSalario());
	}
	
	

}
