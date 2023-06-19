from message_renderer.message import Message
from message_renderer.message_renderer import MessageRenderer, HeaderRenderer, BodyRenderer, FooterRenderer
from bs4 import BeautifulSoup

from approvaltests.approvals import verify


def test_message_renderer_7():
    with open("resources/header.txt", "r") as f:
        header = f.read()
    with open("resources/body.txt", "r") as f:
        body = f.read()
    with open("resources/footer.txt", "r") as f:
        footer = f.read()
    message = Message(header, body, footer)
    sut = MessageRenderer()
    html = sut.render(message)
    with open("resources/expected.html", "r") as f:
        expected = f.read()
    soup = BeautifulSoup(html, "html5lib")
    print(soup.prettify(formatter="html5"))
    assert expected == soup.prettify(formatter="html5")
