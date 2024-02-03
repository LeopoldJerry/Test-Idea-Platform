package ru.vasilyev.egor;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class Parser {
    public static String readJson(String pathToJson) {
        try {
            return Files.readString(Path.of(pathToJson)).toString().trim().replaceFirst("\ufeff", "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Ticket> jsonToTickets(String json) {
        TicketsList ticket = new Gson().fromJson(json, TicketsList.class);
        return ticket.getTickets();
    }
}
