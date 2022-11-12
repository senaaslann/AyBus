package com.aybuke.AyBus.repository.entity;

import java.util.Scanner;

public class Menu {
    public void Menu(){
        System.out.println("Menu");
        System.out.println("1.Rezervasyon");
        System.out.println("2.Tum yolculari koltuk numaralari ile goruntule");
        System.out.println("3.Uygun koltuk numaralarini goster");
        System.out.println("4.Arama yapin");
        System.out.println("5.Cikis");
    }

    public void manager(){
        Scanner scanner = new Scanner(System.in);
        Menu();


        System.out.println("Islem No :");
        int choose = scanner.nextInt();


    }

}
