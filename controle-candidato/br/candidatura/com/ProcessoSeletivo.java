package br.candidatura.com;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	//case4
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do{
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
		} while( continuarTentando && tentativasRealizadas < 3);
		
		if (atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + " NA "+ 
					tentativasRealizadas +"ª TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato + 
					", NÚMERO MÁXIMO DE TENTATIVAS "+ tentativasRealizadas);
	}
	
	//metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	//case 3
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
	
	//case 2
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
	
	//case 1
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
