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
    public String readMessageFromFileByID(long ID) throws IOException {
        var bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(Profiler.getNumberOfMail()))
                return getMessageFromFile(bufferedReader, Profiler.getSkipInterval());
        }
        return null;
    }

    private String getMessageFromFile(BufferedReader bufferedReader, int skipInterval)
            throws IOException {
        for(int i = 0; i < skipInterval; i++)
            bufferedReader.readLine();
        bufferedReader.read(Profiler.getMail().toCharArray());
        return bufferedReader.readLine();
    }


}
