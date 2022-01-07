package codingdojo;

class FooterRenderer implements Renderer {

    @Override
    public String render(Message message) {
        return String.format("<i>%s</i>", message.footer());
    }
}
