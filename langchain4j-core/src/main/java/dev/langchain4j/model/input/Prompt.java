package dev.langchain4j.model.input;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;

import java.util.Objects;

import static dev.langchain4j.data.message.AiMessage.aiMessage;
import static dev.langchain4j.data.message.SystemMessage.systemMessage;
import static dev.langchain4j.data.message.UserMessage.userMessage;

public class Prompt {

    private final String text;

    public Prompt(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public SystemMessage toSystemMessage() {
        return systemMessage(text);
    }

    public UserMessage toUserMessage() {
        return userMessage(text);
    }

    public AiMessage toAiMessage() {
        return aiMessage(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prompt that = (Prompt) o;
        return Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Prompt {" +
                " text = \"" + text + "\"" +
                " }";
    }

    public static Prompt from(String text) {
        return new Prompt(text);
    }
}
