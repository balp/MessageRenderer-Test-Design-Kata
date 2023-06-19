from message_renderer.message import Message
from message_renderer.message_renderer import MessageRenderer, HeaderRenderer, BodyRenderer, FooterRenderer


def test_message_renderer_5():
    sut = MessageRenderer()

    assert sut is not None
    assert sut.sub_rendereres() is not None
