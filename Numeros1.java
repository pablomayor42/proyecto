/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.formatoNumerico;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author maytompa
 */
public class Numeros1 
{
    public static void main(String[] args) 
    {
        
        //FORMATEO NUMERICO CON LA CLASE NUMBERFORMAT
        
        double cantidad= 1234.567;
        
        NumberFormat nf = NumberFormat.getInstance();//Mas interesante
        nf.setMaximumFractionDigits(1);//Para poner los decimales que quieres coger
        
        System.out.println(nf.format(cantidad));
        
        NumberFormat nf2 = NumberFormat.getCurrencyInstance();//Dos decimales y simbolo moneda Mas interesante
        System.out.println(nf2.format(cantidad));
        
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);//Dos decimales y simbolo moneda
        System.out.println(nf3.format(cantidad));
        
        NumberFormat nf4 = NumberFormat.getPercentInstance();//Lo multiplica por cien y pone el simbolo %
        nf4.setMinimumFractionDigits(2);
        System.out.println(nf4.format(0.1234));
        
        NumberFormat nf5 = NumberFormat.getIntegerInstance();//Dos decimales y simbolo moneda
        System.out.println(nf5.format(0.1234));
    }
}
