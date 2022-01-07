package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageRendererTest3 {
    @Test
    public void rendering_a_message() {
        var sut = new MessageRenderer();
        var message = new Message("h", "b", "f");
        String html = sut.render(message);
        assertEquals("<header>h</header><body>b</body><footer>f</footer>", html);
    }
}
