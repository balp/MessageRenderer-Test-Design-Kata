from message_renderer.message import Message
from message_renderer.message_renderer import MessageRenderer, HeaderRenderer, BodyRenderer, FooterRenderer

from approvaltests.approvals import verify


def test_message_renderer_6():
    message = Message("header", "body", "footer")
    sut = MessageRenderer()
    html = sut.render(message)
    verify(html)
