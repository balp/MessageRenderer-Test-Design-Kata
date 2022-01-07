package codingdojo;

class HeaderRenderer implements Renderer {

    @Override
    public String render(Message message) {
        return String.format("<header>%s</header>", message.header());
    }
}
