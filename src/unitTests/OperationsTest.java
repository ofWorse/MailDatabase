package unitTests;

import app.impl.OperationsImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OperationsTest {

    private OperationsImpl operations;


    @Test
    public void displayMessageByID() throws IOException {
        operations = new OperationsImpl();
        final int ID = 1;
        String actual = "Здравствуйте. Как ваши дела???";
        String testing = operations.displayMessageByID(ID);

        Assertions.assertEquals(actual, testing);
    }

    @Test
    public void findMailsByMailSubject() {
        String subject = "Работа";

        List<String> actualMails = new ArrayList<>();
        actualMails.add("Здравствуйте. Как ваши дела???");
        actualMails.add("Привет. Нормально.\n" +
                "А у тебя как?");
        actualMails.add("Да нормально, вот, справляюсь потихоньку.");

        List<String> testingMails = operations.findMailsByMailSubject(subject);

        Assertions.assertEquals(actualMails, testingMails);
    }

    @Test
    public void removeMailByID() throws IOException {
        final int ID = 2;
        String actual = "*Письмо удалено*";

        boolean done = operations.removeMailByID(ID);
        String testing = operations.displayMessageByID(ID);

        Assertions.assertTrue(done);
        Assertions.assertEquals(actual, testing);
    }

    @Test
    public void addNewMail() {
        String from = "markmalaniya2015@mail.ru";
        String to = "valmarana@mail.ru";
        String theme = "Тестовая тема";
        String mail = "Это тестовое письмо,\nкоторое проверяет корректность добавления письма.";

        boolean done = operations.addNewMail(from, to, theme, mail);
        Assertions.assertTrue(done);
    }

   /* @Test
    public void sendAllEmailsFromSpecificSenderOrRecipient() {

    }*/

}
