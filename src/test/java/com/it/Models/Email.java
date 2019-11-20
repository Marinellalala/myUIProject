package com.it.Models;

import java.util.Objects;

public class Email {
    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    private String receiver;
    private String subject;
    private String text;

    public Email(String receiver, String subject, String text) {
        this.receiver = receiver;
        this.subject = subject;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return getReceiver().equals(email.getReceiver()) &&
                getSubject().equals(email.getSubject()) &&
                getText().regionMatches(0, email.getText(),0, getText().length());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReceiver(), getSubject(), getText());
    }
}
