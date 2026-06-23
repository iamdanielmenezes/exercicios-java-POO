package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Aluno> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			int curso = sc.nextInt();
			set.add(new Aluno(curso));
		}
			
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for(int i=0; i<b; i++) {
			int curso = sc.nextInt();
			set.add(new Aluno(curso));
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			int curso = sc.nextInt();
			set.add(new Aluno(curso));
		}
		
		System.out.print("Total students: " + set.size());
		
		sc.close();
	}

}
