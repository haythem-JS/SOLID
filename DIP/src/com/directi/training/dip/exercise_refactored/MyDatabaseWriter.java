package com.directi.training.dip.exercise_refactored;

public class MyDatabaseWriter implements IWriter {

    public void write(String input) {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }   
    
}