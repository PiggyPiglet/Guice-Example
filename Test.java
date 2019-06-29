package me.piggypiglet.gary;

import com.google.inject.Inject;
import lombok.Getter;
import net.dv8tion.jda.api.JDA;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class Test {
    @Inject private Test2 test2;
    @Inject private JDA jda;

    public void test() {
        System.out.println(test2.getTest());
        System.out.println(jda.getToken());
    }
}
