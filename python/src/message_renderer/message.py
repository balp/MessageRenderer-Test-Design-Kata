import dataclasses


@dataclasses.dataclass(frozen=True)
class Message:
    header: str
    body: str
    footer: str
