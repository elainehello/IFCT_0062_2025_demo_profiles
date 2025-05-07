package com.elainevalles.demoprofiles;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("application.properties")) {
            props.load(input);
        } catch (Exception e){
            e.printStackTrace();
        }
        String color = props.getProperty("color");
        System.out.println("El color es:" + color);
    }
}