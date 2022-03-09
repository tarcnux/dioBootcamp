package br.com.tarcnux;

import java.time.LocalDate;

import br.com.tarcnux.dominio.Curso;
import br.com.tarcnux.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(6);
		
		curso2.setTitulo("Curso de HTML e CSS");
		curso2.setDescricao("Descrição do curso  HTML e CSS");
		curso2.setCargaHoraria(12);
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
