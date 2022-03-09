package br.com.tarcnux;

import java.time.LocalDate;

import br.com.tarcnux.dominio.Bootcamp;
import br.com.tarcnux.dominio.Curso;
import br.com.tarcnux.dominio.Dev;
import br.com.tarcnux.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descri��o do curso Java");
		curso1.setCargaHoraria(6);
		
		curso2.setTitulo("Curso de HTML e CSS");
		curso2.setDescricao("Descri��o do curso  HTML e CSS");
		curso2.setCargaHoraria(12);
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descri��o da mentoria");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println("XP curso1: " + curso1.calcularXp());
//		System.out.println(curso2);
//		System.out.println("XP curso2: " + curso2.calcularXp());
//		System.out.println(mentoria);
//		System.out.println("XP mentoria: " + mentoria.calcularXp());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devTarcnux = new Dev();
		devTarcnux.setNome("Tarc�sio Nunes");
		devTarcnux.inscreverBootcamp(bootcamp);
		System.out.println("XP do Tat�: " + devTarcnux.calcularTotalXp());
		devTarcnux.progredir();
		devTarcnux.progredir();
		
		Dev devAlice = new Dev();
		devAlice.setNome("Alice Brusque");
		devAlice.inscreverBootcamp(bootcamp);
		System.out.println("XP do Alice: " + devAlice.calcularTotalXp());
		devAlice.progredir();
		
		
		System.out.println("Conte�dos inscritos do devTarcnux: " + devTarcnux.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos do devTarcnux: " + devTarcnux.getConteudosConcluidos());
		System.out.println("XP do Tat�: " + devTarcnux.calcularTotalXp());
		
		System.out.println("Conte�dosinscritos  do devAlice: " + devAlice.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos do devAlice: " + devAlice.getConteudosConcluidos());
		System.out.println("XP do Alice: " + devAlice.calcularTotalXp());
		
	}

}
