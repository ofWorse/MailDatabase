package app.impl;

import app.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileImpl implements ReadFile {

    private final FileReader fileReader;

    public ReadFileImpl(String filePath)
            throws FileNotFoundException {
        fileReader = new FileReader(filePath);
    }

    @Override
    public String readLinesFromFileByID(long ID)
            throws IOException {
        var bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(Profiler.getNumberOfMail()))
                return line;
        }
        return null;
    }

    private String getStringsOfMail(BufferedReader bufferedReader)
            throws IOException {
        String finalString = "";
        String line;
        while ((line = bufferedReader.readLine()) != null
                && !line.equals("\n")) {
            finalString += line;
        }
        return finalString;
    }

}
