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
