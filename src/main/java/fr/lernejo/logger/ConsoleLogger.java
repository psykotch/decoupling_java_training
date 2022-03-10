package fr.lernejo.logger;

import static java.lang.System.*;

public class ConsoleLogger implements Logger {

    public void log(String Message) {
        System.out.println(Message);
    }
}
