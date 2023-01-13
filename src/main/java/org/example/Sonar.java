package org.example;

class Sonar {
    public  void sum (int numero ){
            numero = numero + numero;

        }

        public static void main( String[] args){
        int numero = 5;
        Sonar s = new Sonar();
        s.sum(numero);
        }

        }