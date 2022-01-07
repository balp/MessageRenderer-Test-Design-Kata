package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MessageRendererTest5 {

    @Test
    public void message_renderer() {
        var sut = new MessageRenderer();

        var renderers = sut.getSubRenderers();

        assertNotNull(sut);
        assertNotNull(renderers);
    }
}
