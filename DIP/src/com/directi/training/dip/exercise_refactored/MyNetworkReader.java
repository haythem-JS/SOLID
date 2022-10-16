package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;

public class MyNetworkReader implements IReader {
    private String _fileName;
    private String _protocol;
    private String _location;

    public MyNetworkReader(String protocol, String location, String fileName){
        _fileName = fileName;
        _protocol = protocol;
        _location = location;
    }

    public String read() throws IOException{
        URL url;
        url = new URL(_protocol, _location, _fileName);
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        return inputString;
    }   
    
}