package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageRendererTest3 {
    @Test
    public void message_renderer() {
        var sut = new MessageRenderer();
        var message = new Message("h", "b", "f");
        String html = sut.render(message);
        assertEquals("<h1>h</h1><b>b</b><i>f</i>", html);
    }
}
