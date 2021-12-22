package com.example.codepath.codepath.notCodepath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPB
{
    public static void main(String[] args)
    {
        String url = "curl https://zzcjen.zendesk.com//api/v2/users -u emaril@umich.edu/token:V8iMbgbRRXPrP5BVQ33nWC2lmMhebkMzRJAmfkJW";
        String url2 = "curl https://zzcjen.zendesk.com/api/v2/tickets -v -u emaril@umich.edu:Alejandro79";
        String url3 = "curl https://zzcjen.zendesk.com/api/v2/tickets -u emaril@umich.edu/token:V8iMbgbRRXPrP5BVQ33nWC2lmMhebkMzRJAmfkJW";
        String[] command = url3.split(" ");
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;
        try
        {
            p = process.start();
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ( (line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }

            String result = builder.toString();
            System.out.print(result);

        }
        catch (IOException e)
        {   System.out.print("error");
            e.printStackTrace();
        }
    }
}
