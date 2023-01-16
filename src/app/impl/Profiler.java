package app.impl;

public class Profiler {
    private static final String numberOfMail = "[№]\s\\d";
    private static final String mailAddress = "[a-zA-Z]@mail.ru";
    private static final String theme = "[^~`'\\./,!@#$%^&*()_+=-]";

    public static String getNumberOfMail() {
        return numberOfMail;
    }

    public static String getMailAddress() {
        return mailAddress;
    }

    public static String getTheme() {
        return theme;
    }

    //var words = line.toLowerCase().split("[\\p{Punct}\\d\\s«…»–]+");
}
