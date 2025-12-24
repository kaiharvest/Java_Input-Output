package indradwiprabowo.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputStreamTest {

    @Test
    void read() {
        Path path = Path.of("pom.xml");

        try (InputStream stream = Files.newInputStream(path)) {
            StringBuilder builder = new StringBuilder();
            int data;

            while ((data = stream.read()) != -1) {
                builder.append((char) data);
            }
            System.out.println(builder.toString());

        } catch (Exception exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void readByte() {
        Path path = Path.of("pom.xml");

        try (InputStream stream = Files.newInputStream(path)) {
            StringBuilder builder = new StringBuilder();
            byte[] buffer = new byte[1024];
            int length;

            while ((length = stream.read()) != -1) {
                builder.append(new String(buffer, 0, length));
            }
            System.out.println(builder.toString());

        } catch (Exception exception) {
            Assertions.fail(exception);
        }
    }

}
