package app.impl;

public class Profiler {
    private static final String numberOfMail = "№ \\d$";
    private static final String mailAddress = "[a-zA-Z]@mail.ru";
    private static final String theme = "\\[[^~`'\\./,!@#$%^&*()_+=-]\\]";
    private static final String from = "адрес отправителя: ";
    private static final String to = "адрес получателя: ";
    private static final String mailTheme = "тема: ";
    private static final String mail = "письмо: ";
    private static final String responseTo = "в ответ на: ";
    private static final int skipInterval = 3;

    public static String getNumberOfMail() {
        return numberOfMail;
    }

    public static String getMailAddress() {
        return mailAddress;
    }

    public static String getTheme() {
        return theme;
    }

    public static int getSkipInterval() {
        return skipInterval;
    }

    public static String getFrom() {
        return from;
    }

    public static String getTo() {
        return to;
    }

    public static String getMailTheme() {
        return mailTheme;
    }

    public static String getMail() {
        return mail;
    }

    public static String getResponseTo() {
        return responseTo;
    }

}
