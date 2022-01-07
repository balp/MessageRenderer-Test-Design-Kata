package codingdojo;

class FooterRenderer implements Renderer {

    @Override
    public String render(Message message) {
        return String.format("<footer>%s</footer>", message.footer());
    }
}
