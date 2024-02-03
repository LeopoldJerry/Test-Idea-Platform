package ru.vasilyev.egor;

import java.util.List;

public class Main {
    public static final String PATH = "tickets.json";

    public static void main(String[] args) {

        String json = Parser.readJson(PATH);

        List<Ticket> tickets = Parser.jsonToTickets(json);

        System.out.println(Calculator.getResult(tickets));
    }
}