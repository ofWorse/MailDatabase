package app;

import java.io.IOException;
import java.util.List;

public interface Operations {
    String displayMessageByID(int ID) throws IOException;
    List<String> findMailsByMailSubject(String subject) throws IOException;
    boolean removeMailByID(int ID);
    boolean addNewMail(String from, String to, String theme, String mail);
}
