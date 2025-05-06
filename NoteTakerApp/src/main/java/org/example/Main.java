package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        NoteManager noteManager = new NoteManager();

        Note note1 = new Note(1, "Meeting Notes", "Discuss project milestones", LocalDate.now(), "Work");
    }
}