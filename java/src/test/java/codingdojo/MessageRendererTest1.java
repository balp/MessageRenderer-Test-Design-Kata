package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageRendererTest1 {
    @Test
    void message_renderer() {
        var sut = new MessageRenderer();

        var renderers = sut.getSubRenderers();
        assertEquals(3, renderers.size());
        assertTrue(renderers.get(0) instanceof HeaderRenderer);
        assertTrue(renderers.get(1) instanceof BodyRenderer);
        assertTrue(renderers.get(2) instanceof FooterRenderer);
    }

}
