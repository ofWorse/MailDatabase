package app.impl;

import app.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFileImpl implements ReadFile {

    private final FileReader fileReader;

    public ReadFileImpl(String filePath)
            throws FileNotFoundException {
        fileReader = new FileReader(filePath);
    }

    @Override
    public String readMessageFromFileByID(long ID) throws IOException {
        Pattern pattern = Pattern.compile(Profiler.getNumberOfMail());
        var bufferedReader = new BufferedReader(fileReader);
        String line;
        Matcher matcher;
        while ((line = bufferedReader.readLine()) != null) {
            matcher = pattern.matcher(line);
            if (matcher.find())
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


    @Override
    public List<String> getMessagesAsListFromMailSubject(String subject) throws IOException {
        List<String> resList = new ArrayList<>();
        Pattern pattern = Pattern.compile(Profiler.getMailTheme());
        var bufferedReader = new BufferedReader(fileReader);
        String line;
        Matcher matcher;

        while ((line = bufferedReader.readLine()) != null) {
            matcher = pattern.matcher(line);
            if(matcher.find()) {
                bufferedReader.read(Profiler.getMail().toCharArray());
                while(bufferedReader.readLine() != Profiler.getResponseTo())
                    resList.add(bufferedReader.readLine());
            }
        }
        return resList;
    }
}
