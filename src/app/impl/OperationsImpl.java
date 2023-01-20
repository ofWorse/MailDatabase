package app.impl;

import app.Operations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class OperationsImpl implements Operations {

    private ReadFileImpl readFile;

    public OperationsImpl() throws FileNotFoundException {
        readFile = new ReadFileImpl("mailTest.txt");
    }

    @Override
    public String displayMessageByID(int ID) throws IOException {
        return readFile.readMessageFromFileByID(ID);
    }

    @Override
    public List<String> findMailsByMailSubject(String subject) {
        return null;
    }

    @Override
    public boolean removeMailByID(int ID) {
        return false;
    }

    @Override
    public boolean addNewMail(String from, String to, String theme, String mail) {
        return false;
    }
}
