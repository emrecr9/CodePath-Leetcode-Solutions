package com.example.codepath.codepath.notCodepath;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix
{

    public static void main (String [] args) throws IOException {
            File myObj = new File("filename.txt");
            	myObj.createNewFile();
            File matrixFile = new File("test");
            Scanner fileOpen = new Scanner(matrixFile);
            List<Long> M, N;
            int i = 0, j1 = 0, j2 = 0, k = 0;

            M = new ArrayList<>();
            N = new ArrayList<>();

            while (fileOpen.hasNextLine())
            {
                System.out.println(fileOpen.nextLine());
            }
            
            fileOpen.close();
    }
}
