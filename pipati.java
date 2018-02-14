/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author Yesica
 */
public class Ppt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // TODO code application logic here
        int victorias[] = new int [99];
        int jugador []= new int[9];
        int maquina[]= new int [9];
        int tabla[][] = new int [3][99];
        int maquinaV=0;
        int jugadorV=0;
        
        
        int cont=1;
        int colector=0; //variable que guarda la seleccion del jugador
        
        
        victorias[0]=1; //piedra
        victorias[1]=2;//papel
        victorias[2]=3; //tijeras
        int resp;
        
        do
        {
            resp=0;
            cont=0;
            System.out.println("MENU");
            System.out.println("PIPATI");
            System.out.println("1: JUGAR");
            System.out.println("2: PUNTAJES");
            System.out.println("0: SALIR");
            System.out.println("op: ");
            resp= s.nextInt();
            
            
            
        
        for(int vueltas=0;vueltas<10;vueltas++)
        {
            
            Random aleatorios = new Random(System.currentTimeMillis());
            int intAleatorios = aleatorios.nextInt(4);//numeros entre 1 y 3
        
            //llena el vector de la maquina con numeros aleatorios
            for(int i=0;i<maquina.length;i++)
            {
                //maquina[i]=intAleatorios;
                maquina[i]=(int) (Math.random()*3+1);//numeros entre 1 y 3
            }
            int i=0;//incremento del vector del jugador
            int j=0;//incremento del vector de la maquina
            int k=3; // incremento del vector que contiene las victorias del jugador
        
        
            System.out.println("JUEGO: "+cont);
            System.out.println("piedra=1 /papel=2 /tijeras=3");
            colector = s.nextInt();
            jugador[i]=colector;
            
            if(jugador[i]==1 && maquina[j]==1)
            {
                
                System.out.println("empate");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
            }
            if(jugador[i]==1 && maquina[j]==2)
            {
                System.out.println("gana maquina");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
                maquinaV++;
            }
            if(jugador[i]==1 && maquina[j]==3)
            {
                System.out.println("gana jugador");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
                victorias[k]=jugador[i];
                jugadorV++;
            }
            if(jugador[i]==2 && maquina[j]==1)
            {
                System.out.println("gana jugador");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
                victorias[k]=jugador[i];
                jugadorV++;
            }
            
            if(jugador[i]==2 && maquina[j]==2)
            {
                System.out.println("empate");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
            }
            if(jugador[i]==2 && maquina[j]==3)
            {
                System.out.println("gana maquina");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
                maquinaV++;
            }
            if(jugador[i]==3 && maquina[j]==1)
            {
                System.out.println("gana maquina");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
                maquinaV++;
            }
            if(jugador[i]==3 && maquina[j]==2)
            {
                System.out.println("gana jugador");
                System.out.println("jugador: "+ jugador[i]+" vs "+ "maquina: "+ maquina[j]);
                victorias[k]=jugador[i];
                jugadorV++;
            }
            if(jugador[i]==3 && maquina[j]==3)
            {
                System.out.println("empate");
                System.out.println("jugador: " + jugador[i]+" vs "+ "maquina: "+ maquina[j]);
            }
            
            i++;
            j++;
            k++;
            
            cont++;
            
            
        }
           
        //int aux=0;//recorre los dos vectores de la maquina y el jugador
        if(maquinaV > jugadorV)
        {
            System.out.println("GANA MAQUINA");
        }else
        {
            System.out.println("GANA JUGADOR");
        }
            System.out.println("\n");
        
        //VECTOR DE 100
        System.out.println("VISTORIAS DEL JUGADOR");
        for(int x=0;x<victorias.length;x++)
        {
            System.out.println("["+victorias[x]+"]");
            System.out.println("\n");
        }
            
        }while(resp!=0);
        
        System.out.println("FIN DEL JUEGO");
        
    }
    
}
