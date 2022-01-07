package codingdojo;

class BodyRenderer implements Renderer {

    @Override
    public String render(Message message) {
        return String.format("<body>%s</body>", message.body());
    }
}
