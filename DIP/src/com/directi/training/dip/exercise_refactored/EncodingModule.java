package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule
{
    public void encode(IReader reader, IWriter writer) throws IOException
    {
        String content = reader.read();
        String encodedContent = Base64.getEncoder().encodeToString(content.getBytes());
        writer.write(encodedContent);
    }

   
}

