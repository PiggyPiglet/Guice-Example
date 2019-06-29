package me.piggypiglet.gary.guice;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.internal.JDAImpl;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public enum Providers {
    JDA(JDAImpl.class),
    UNKNOWN(null);

    private final Class clazz;

    Providers(Class clazz) {
        this.clazz = clazz;
    }

    public static Providers fromClass(Class clazz) {
        for (Providers provider : values()) {
            if (provider.clazz == clazz) {
                return provider;
            }
        }

        return UNKNOWN;
    }
}
