package codingdojo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageRendererTest4 {
    @Test
    public void message_renderer() throws URISyntaxException, IOException {
        var header = new String(Files.readAllBytes(Paths.get(getClass().getResource("header.txt").toURI())));
        var body = new String(Files.readAllBytes(Paths.get(getClass().getResource("body.txt").toURI())));
        var footer = new String(Files.readAllBytes(Paths.get(getClass().getResource("footer.txt").toURI())));
        var message = new Message(header, body, footer);
        var sut = new MessageRenderer();

        String html = sut.render(message);

        assertTrue(html.startsWith("<h1>Lorem ipsum dolor sit amet"));
        assertTrue(html.endsWith("doloribus asperiores repellat.</i>"));
    }
}
