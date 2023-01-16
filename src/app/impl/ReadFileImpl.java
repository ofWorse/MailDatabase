package app.impl;

import app.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileImpl implements ReadFile {

    private FileReader fileReader;

    public ReadFileImpl(String filePath) throws FileNotFoundException {
        fileReader = new FileReader(filePath);
    }

    @Override
    public String readLinesFromFileByID(int ID) throws IOException {
        var bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(Profiler.getNumberOfMail()))
                return findAndReturnStringsOfMail();
        }
        return null;
    }

    private String findAndReturnStringsOfMail() {

    }

}
