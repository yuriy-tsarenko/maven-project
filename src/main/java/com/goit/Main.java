package com.goit;

import com.goit.dto.CurrencyDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;

public class Main {

    //TODO: add the absolute path to file 'ex1.json'
    private static final String PATH = "change_me";

    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
        CurrencyDto dto = gson.fromJson(FileReaderUtil.read(new File(PATH)), CurrencyDto.class);
        System.out.println(dto);
        System.out.println("====================================");
        dto.setCurrency(null);
        String toJson = gson.toJson(dto);
        System.out.println(toJson);
    }
}
