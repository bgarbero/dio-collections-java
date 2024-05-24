package main.java.list.PesquisaList.somadenumeros;

import main.java.list.PesquisaList.catalogodelivros.Livro;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeroList.isEmpty()) {
            for (Numero numero : numeroList) {
                soma += numero.getNumero();
            }
            return soma;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!numeroList.isEmpty()) {
            for (Numero numero : numeroList) {
                if (numero.getNumero() > maiorNumero) {
                    maiorNumero = numero.getNumero();
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = 1000000000;
        if (!numeroList.isEmpty()) {
            for (Numero numero : numeroList) {
                if (numero.getNumero() < menorNumero) {
                    menorNumero = numero.getNumero();
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(numeroList.toString());
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
