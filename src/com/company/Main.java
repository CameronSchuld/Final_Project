package com.company;

import com.company.data.data;
import com.company.FileManager.fileManager;
import com.company.Interface.Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        data data1 = new data();
        fileManager fileManager = new fileManager();
        Interface io = new Interface();

        System.out.println("Type out some characters and hit enter to save them. Press 'q' to exit.\n\n");

        String contents = "";

        while(true){
            contents = io.uncheckedInput("Type Something: ");
            fileManager.NoteCreation(contents);

            if(contents == "q")
                break;
        }

    }
}
