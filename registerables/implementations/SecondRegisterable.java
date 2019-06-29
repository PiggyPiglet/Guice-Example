package me.piggypiglet.gary.registerables.implementations;

import com.google.inject.Inject;
import me.piggypiglet.gary.registerables.Registerable;
import net.dv8tion.jda.api.JDA;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class SecondRegisterable extends Registerable {
    @Inject private JDA jda;

    @Override
    protected void execute() {
        System.out.println(jda.getAccountType());
    }
}
