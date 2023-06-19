from message_renderer.message import Message
from message_renderer.message_renderer import MessageRenderer, HeaderRenderer, BodyRenderer, FooterRenderer


def test_message_renderer_4():
    with open("resources/header.txt", "r") as f:
        header = f.read()
    with open("resources/body.txt", "r") as f:
        body = f.read()
    with open("resources/footer.txt", "r") as f:
        footer = f.read()
    message = Message(header, body, footer)

    sut = MessageRenderer()

    html = sut.render(message)
    assert html.startswith("<h1>Lorem ipsum dolor sit amet")
    assert html.endswith("doloribus asperiores repellat.</i>")
