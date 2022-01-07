package codingdojo;

import org.junit.jupiter.api.Test;
import org.w3c.tidy.Tidy;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class MessageRendererTest7 {
    @Test
    public void message_renderer() throws URISyntaxException, IOException {
        var header = new String(Files.readAllBytes(Paths.get(getClass().getResource("header.txt").toURI())));
        var body = new String(Files.readAllBytes(Paths.get(getClass().getResource("body.txt").toURI())));
        var footer = new String(Files.readAllBytes(Paths.get(getClass().getResource("footer.txt").toURI())));
        var message = new Message(header, body, footer);
        var sut = new MessageRenderer();

        String html = sut.render(message);

        Tidy tidy = new Tidy();
        StringWriter output = new StringWriter();
        var dom = tidy.parseDOM(new StringReader(html), output);
        var errors = tidy.getParseErrors();
        assertEquals(0, errors);
        assertTrue(dom.hasChildNodes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        tidy.pprint(dom, outputStream);
        var result = outputStream.toString("UTF-8");
        var expected = new String(Files.readAllBytes(Paths.get(getClass().getResource("expected.html").toURI())));
        assertEquals(expected, result);
    }
}
