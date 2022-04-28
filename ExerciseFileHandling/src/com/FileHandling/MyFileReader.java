package com.FileHandling;

import java.io.*;

public class MyFileReader {

    //Q2
    MyFileReader() {

    }

    //Q1
    public static void main(String[] args) {
        MyFileReader myFileReader = new MyFileReader();
        myFileReader.readAndPrint();
        myFileReader.writeMyFile();
    } // end of Main class

    public void readAndPrint() {
        File file = new File("C:\\Users\\RakinKhan\\Desktop\\Java\\JiraNote.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line = null;
            while (br.readLine() != null) {
                line = br.readLine();
                System.out.println(line);
            } // while loop

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally { // Q3e
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } // een of finally
    } // end of readAndPrint

    //part 2 Q5
    public void writeMyFile(){
        BufferedWriter bw;
        
    } // end of writeMyFile


} // end of MyFileReader
