from message_renderer.message import Message
from message_renderer.message_renderer import MessageRenderer, HeaderRenderer, BodyRenderer, FooterRenderer


def test_message_renderer_3():
    message = Message("h", "b", "f")

    sut = MessageRenderer()

    html = sut.render(message)
    assert "<h1>h</h1><b>b</b><i>f</i>" == html
