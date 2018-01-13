package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CzytaniePliku {


    void odzczytajPlik() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = classLoader.getResource("plik.txt").getFile();
        File file = new File(filePath);

        file.getAbsolutePath();

        boolean czyPlikIstnieje = file.exists();
        System.out.println(czyPlikIstnieje);


        List<String> linie = Files.readAllLines(file.toPath());

        List<Uczen> uczniowie = new ArrayList<>();
        int numer = 1;
        for (String l : linie){
            String[] liniaPodzielona = l.split(",");
        Uczen uczen = new Uczen();
        uczen.setImie(liniaPodzielona[0]);
        uczen.setNazwisko(liniaPodzielona[1]);
        uczen.getOceny()[0] = Integer.parseInt(liniaPodzielona[2]);
        uczen.getOceny()[1] = Integer.parseInt(liniaPodzielona[3]);
        uczen.getOceny()[2] = Integer.parseInt(liniaPodzielona[4]);
        uczen.setNumerUcznia(numer++);
        uczniowie.add(uczen);
    }
        System.out.println(uczniowie.get(0));
        System.out.println(uczniowie.get(1));
}}