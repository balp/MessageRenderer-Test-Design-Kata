from message_renderer.message_renderer import MessageRenderer, HeaderRenderer, BodyRenderer, FooterRenderer


def test_message_renderer_1():
    sut = MessageRenderer()

    sub_renders = sut.sub_rendereres()
    assert len(sub_renders) == 3
    assert isinstance(sub_renders[0], HeaderRenderer)
    assert isinstance(sub_renders[1], BodyRenderer)
    assert isinstance(sub_renders[2], FooterRenderer)
