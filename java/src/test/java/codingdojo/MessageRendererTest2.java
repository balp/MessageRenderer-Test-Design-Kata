package codingdojo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageRendererTest2 {

    @Test
    public void message_renderer_implemented_correctly() throws IOException {

        var location = System.getProperty("user.dir");
        var sourceCode = new String(Files.readAllBytes(Path.of(location, "src", "main", "java", "codingdojo",  "MessageRenderer.java")));
        assertEquals(sourceCode, """
package codingdojo;
                
import java.util.List;
                
public class MessageRenderer implements Renderer {
    private List<Renderer> subRenderers;
                
    public MessageRenderer() {
        this.subRenderers = List.of(
                new HeaderRenderer(),
                new BodyRenderer(),
                new FooterRenderer()
        );
    }
                
    public List<Renderer> getSubRenderers() {
        return subRenderers;
    }
                
    public String render(Message message) {
        return subRenderers.stream()
                .map(x -> x.render(message))
                .reduce("", (l, r) -> l + r);
    }
}
""");
    }
}
