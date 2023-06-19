from message_renderer.message import Message


class HeaderRenderer:
    def render(self, message: Message) -> str:
        return f"<h1>{message.header}</h1>"


class BodyRenderer:
    def render(self, message: Message) -> str:
        return f"<b>{message.body}</b>"


class FooterRenderer:
    def render(self, message: Message) -> str:
        return f"<i>{message.footer}</i>"


class MessageRenderer:
    def __init__(self):
        self._sub_renderers = [
            HeaderRenderer(),
            BodyRenderer(),
            FooterRenderer(),
        ]

    def sub_rendereres(self):
        return self._sub_renderers

    def render(self, message: Message) -> str:
        return ''.join(map(lambda x: x.render(message), self._sub_renderers))
