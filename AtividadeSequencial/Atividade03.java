package atividadesequencial;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner entradas= new Scanner(System.in);
		
		int horas, minutos, segundos, seg;
		
		
		System.out.println("Digite a dura??o do evento em segundos: ");
		segundos=entradas.nextInt();
		
		horas = segundos/3600;
		minutos = segundos % 3600 / 60;
		seg = segundos % 3600 % 60;
		
		System.out.println("\"A dura??o do evento foi de\", horas,\" horas \", minutos,\" minutos e\", seg,\" segundos ");
		horas = entradas.nextInt();
		minutos = entradas.nextInt();
		seg = entradas.nextInt();
		
		entradas.close();

	}

}
