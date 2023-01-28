package com.example.javalessonone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication
{
    public static void main(String[] args)
    {
        String a="4893520617";
        int len1=a.length();
        String b="Kazakhstan";
        int len2=b.length();
        // 1
        // if (len1 > len2){
        //  System.out.println("Строка а длиннее строки б");
        //}
        //if (len1 < len2){
        //    System.out.println("Строка б длиннее строки а");
        //}
        //else{


        System.out.println(len1==len2);
        // 2
        String c= a.replace("89","");
        String d=c.replace("20","");
        System.out.println(d);
        // 3
        String aa=d.substring(0,1);
        String ab=d.substring(1,2);
        String ac=d.substring(2,3);
        String ad=d.substring(3,4);
        String ae=d.substring(4,5);
        String af=d.substring(5,6);
        int ba=Integer.parseInt(aa);
        int bb=Integer.parseInt(ab);
        int bc=Integer.parseInt(ac);
        int bd=Integer.parseInt(ad);
        int be=Integer.parseInt(ae);
        int bf=Integer.parseInt(af);
        System.out.println(ba+" "+bb+" "+bc+" "+bd+" "+be+" "+bf);
        // 4
        System.out.println(b.charAt(0)+" "+b.charAt(1)+" "+b.charAt(2)+" "+b.charAt(3)+" "+b.charAt(4)+" "+b.charAt(5)+" "+b.charAt(6)+" "+b.charAt(7)+" "+b.charAt(8)+" "+b.charAt(9));
        //5
        System.out.println(b.substring(1,2).toUpperCase()+b.substring(2,4));
        //6
        System.out.println(b.substring(0,1)+b.substring(2,3).toUpperCase()+a.charAt(6)+a.charAt(8)+a.charAt(9)+b.substring(1,4).toUpperCase());
        //7
        System.out.println(b.substring(1,4).toUpperCase());
        //8
        System.out.println("Полное имя: "+b.substring(1,4).toUpperCase()+"MAT");


    }
}