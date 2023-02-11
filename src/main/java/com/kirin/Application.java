package com.kirin;

import com.kirin.Calculation.KurinCalculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("@@@@@#######||||||| KiriN |||||||#######@@@@@\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Video Length: ");
        String videoLength = input.nextLine();
        System.out.print("Loop Length: ");
        String loopLength = input.nextLine();

        KurinCalculator kurinCalculator = new KurinCalculator(videoLength, loopLength);
        kurinCalculator.calculate();

        System.out.println("\n@@@@@#######||||||| KiriN |||||||#######@@@@@");
    }
}