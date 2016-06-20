package ar.edu.unlam.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	public void probarTragamonedasConNumerosAleatorios() {
		Tragamonedas tragamonedas = new Tragamonedas();
		tragamonedas.activar();
		tragamonedas.imprimirEstado();
		if(tragamonedas.entregaPremio()){
			System.out.println("Todos los tambores están en la misma posición. Ganaste!");
		}
		else
			System.out.println("Los tambores no están en la misma posición. Perdiste!");
	}
	
	@Test
	public void probarTragamonedasConNumerosIguales() {
		Tragamonedas tragamonedas = new Tragamonedas();
		//tragamonedas.activar();
		tragamonedas.imprimirEstado();
		if(tragamonedas.entregaPremio()){
			System.out.println("Todos los tambores están en la misma posición. Ganaste!");
		}
		else
			System.out.println("Los tambores no están en la misma posición. Perdiste!");
	}

}
