package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MyFileReader implements IReader {
    private String _fileName;

    public MyFileReader(String fileName){
        _fileName = fileName;
    }

    public void read() throws IOException{
        BufferedWriter writer = BufferedReader(new FileReader(_fileName));
        StringBuilder fileContent = new StringBuilder();
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            fileContent.append(aLine);
        }
        reader.close();
        return fileContent.toString();
    }   
    
}