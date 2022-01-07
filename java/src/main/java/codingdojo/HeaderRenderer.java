package codingdojo;

class HeaderRenderer implements Renderer {

    @Override
    public String render(Message message) {
        return String.format("<h1>%s</h1>", message.header());
    }
}
