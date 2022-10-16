package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class MyFileWriter implements IWriter {
    private String _fileName;

    public MyFileWriter(String fileName){
        _fileName = fileName;
    }

    public void write(String input) throws IOException{
        BufferedWriter writer = BufferedWriter(new FileWriter(_fileName));
        writer.write(input);
        writer.close();
    }
    
}