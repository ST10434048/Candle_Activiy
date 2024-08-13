package com.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // benji and jess did the main function
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Do you want a scented or non scented candle? 1/2: ");//1=scented
        String ScentedOrNorm = br.readLine();
        if (ScentedOrNorm.equals("1")) {
            Scented_Candle candle = new Scented_Candle();
            System.out.print("Choose a scent: \n1)Lavender\n2)Rosemary\n3)Vanilla\n4)Spearmint\n: ");
            String scent = br.readLine();
            switch (scent) {
                case "1":
                    candle.setScent("Lavender");
                    break;
                case "2":
                    candle.setScent("Rosemary");
                    break;
                case "3":
                    candle.setScent("Vanilla");
                    break;
                case "4":
                    candle.setScent("Spearmint");
                    break;
            }
            System.out.print("What size candle would you like: ");
            String size = br.readLine();
            candle.setHeight(Integer.parseInt(size));
            candle.CandlePrice(candle.getHeight());
            System.out.print("Enter the colour name: ");
            candle.setColour(br.readLine());
            System.out.println("\n\nScented Candle info");
            System.out.println(candle);
        } else {
            Candle candle = new Candle();
            System.out.print("What size candle would you like: ");
            String size = br.readLine();
            candle.setHeight(Integer.parseInt(size));
            candle.CandlePrice(candle.getHeight());
            System.out.print("Enter the colour name: ");
            candle.setColour(br.readLine());
            System.out.println("\n\nCandle info");
            System.out.println(candle);
        }
    }
}