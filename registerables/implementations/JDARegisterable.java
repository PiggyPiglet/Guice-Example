package me.piggypiglet.gary.registerables.implementations;

import me.piggypiglet.gary.registerables.Registerable;
import net.dv8tion.jda.api.JDABuilder;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class JDARegisterable extends Registerable {
    @Override
    protected void execute() {
        try {
            addProvider(new JDABuilder("token").build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}