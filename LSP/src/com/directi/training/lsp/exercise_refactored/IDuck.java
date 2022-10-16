package com.directi.training.lsp.exercise_refactored;

public interface IDuck {
    public class DuckException extends Exception{
        public void IDuckException (String message) {super(message);}
    }

    public void swim() throws DuckException;
    public void quack() throws DuckException;

}
