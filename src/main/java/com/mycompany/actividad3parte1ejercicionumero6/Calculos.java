/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte1ejercicionumero6;

/**
 *
 * @author Knoknozo
 */
public class Calculos {
    public static String ecuacion( int a, int b, int c){
        double dis,ecu,ecu1,ecu2;
        String resultado;
        dis = (Math.pow(b,2)-(4*a*c));
        if (a==0){
            resultado = "no leyó o que? a no puede ser 0";
        }
        else{
            if(dis>0){
                ecu1 = ((-b)+ Math.sqrt(dis))/(2*a);
                ecu2 = ((-b)- Math.sqrt(dis))/(2*a);
                resultado = "x1 = "+ecu1+" y x2 = "+ecu2;
            }
            else if (dis==0){
                ecu = -b/(2*a);
                resultado = "x = "+ecu;
            }
            else{
                resultado = "el problema no tiene solucion";
            }
        }
        return resultado;
}
}

