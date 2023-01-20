package app;

import java.io.IOException;
import java.util.List;

public interface ReadFile {
    String readMessageFromFileByID(long ID) throws IOException;
    List<String> getMessagesAsListFromMailSubject(String subject) throws IOException;
}
