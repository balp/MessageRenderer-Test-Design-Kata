package codingdojo;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class MessageRendererTest6 {
    @Test
    public void message_renderer() {
        var message = new Message("header", "body", "footer");
        var sut = new MessageRenderer();

        String html = sut.render(message);

        Approvals.verify(html);
    }
}
