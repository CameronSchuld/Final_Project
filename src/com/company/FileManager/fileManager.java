package com.company.FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class fileManager {

    public int numberOfFiles = -1;


    //Counts amount of files and updates numberOfFiles
    public int FileCount()
    {
        int fileCount = 0;
        boolean exists = false;
        String fileName = "";


        while(!exists)
        {
            fileName = "note" + fileCount + ".txt";
            File tempFile = new File(fileName);
            if(!tempFile.exists())
            {
                exists = true;
            }
            else
            {
                fileCount++;
            }
        }

        numberOfFiles = fileCount;
        return fileCount;
    }



    //Creating a file and naming it note + the number of files
    public int NoteCreation(String contents) {
        int errorCatch = -1;

        FileCount();

        String fileName = "note" + String.valueOf(numberOfFiles) + ".txt";

        try {
            File newFile = new File(fileName);
            if (newFile.createNewFile()) {
                System.out.println("File Created");//File was successfully created
            }
            else {
                System.out.println("File was not created");//File was not created
            }
        }
        catch(IOException e){
            System.out.println("Error");//Error
            e.printStackTrace();
        }

        //Writing 'contents' to the file
        try{
            FileWriter contentWriter = new FileWriter(fileName);
            contentWriter.write(contents);
            contentWriter.close();
        }
        catch (IOException e){
            System.out.println("Error");//error occurred
            e.printStackTrace();
        }

        System.out.println("\n\n" + numberOfFiles + "\n" + fileName + "\n");


        return errorCatch;
    }
}
