package com.company;

public class Main {

    public static void main(String[] args) {

        int numero[] = llenarArrayList(5);
        imprimirArray(numero);
    }

    public static void imprimirArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
        public static int[]llenarArrayList(int a){
                int numero [] = new int[10];
                for (int i =0; i<numero.length; i++){
                    numero[i]=a;
                    a++;
                }
                return numero;
        }

    }



