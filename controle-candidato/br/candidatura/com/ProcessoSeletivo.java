package br.candidatura.com;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento:");
		for (int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº "+ (indice+1) +" é "+ candidatos[indice]);
		}
		System.out.println("\nForma abreviada de interação for each");
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi "+ candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", 
				"Fabricio", "Mirela", "Daniela", "Jorge" };
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato +" solicitou o seguinte valor de salario: "+ salarioPretendido );
			if(salarioBase >= salarioPretendido) {
				System.out.println("o candidato "+ candidato +" foi selecionado para a vaga.");
				candidatosSelecionados++;
			} 
			candidatoAtual++;
		}
	}
	
	static double valorPretendido(){
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}

}
