package dev.langchain4j.data.message;

import java.util.Objects;

public class SystemMessage extends ChatMessage {

    public SystemMessage(String text) {
        super(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemMessage that = (SystemMessage) o;
        return Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "SystemMessage {" +
                " text = \"" + text + "\"" +
                " }";
    }

    public static SystemMessage from(String text) {
        return new SystemMessage(text);
    }

    public static SystemMessage systemMessage(String text) {
        return from(text);
    }
}
