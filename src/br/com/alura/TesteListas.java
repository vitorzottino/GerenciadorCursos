package br.com.alura;

import java.util.ArrayList;

public class TesteListas {
    public static void main(String[] args) throws Exception {
        String aula1 = "Aprendendo listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeira = aulas.get(0);
        System.out.println("Primeira aula: " + primeira);
        

    }
}
