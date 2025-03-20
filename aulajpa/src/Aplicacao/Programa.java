package Aplicacao;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1= new Pessoa(1,"carlos@gmail.com","Carlos da Silva");
		Pessoa p2= new Pessoa(2,"carlosernesto@gmail.com","Carlos Ernesto");
		Pessoa p3= new Pessoa(3,"carlosjose@gmail.com","Carlos Jose");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
