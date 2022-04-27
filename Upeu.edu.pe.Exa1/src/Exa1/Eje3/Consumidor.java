/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exa1.Eje3;

/**
 *
 * @author Usuario
 */
public class Consumidor implements Runnable{
        Cola colaCompartida;
        public Consumidor(Cola cola){
                this.colaCompartida=cola;
        }

        @Override
        public void run() {
                int num;
                while (true){
                        num=colaCompartida.desencolar();
                        if (num!=-1){
                                System.out.println("Consumidor recuperó el numero:"+num);
                        } /* Fin del if*/
                } /*Fin del bucle infinito*/
        } /* Fin del run()*/
} /*Fin de la clase Consumidor*/
