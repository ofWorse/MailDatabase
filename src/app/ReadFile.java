package app;

import java.io.IOException;

public interface ReadFile {
    String readMessageFromFileByID(long ID) throws IOException;
}
