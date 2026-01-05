package indradwiprabowo.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriterTest {

    @Test
    void writer() {
        Path path = Path.of("write.txt");
        try(Writer stream = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 100; i++) {
                stream.write("Hello World\n");
                stream.flush();
            }
        } catch (IOException exception) {
            Assertions.fail(exception);
        }
    }

}
