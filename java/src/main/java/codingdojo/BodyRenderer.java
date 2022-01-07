package codingdojo;

class BodyRenderer implements Renderer {

    @Override
    public String render(Message message) {
        return String.format("<b>%s</b>", message.body());
    }
}
