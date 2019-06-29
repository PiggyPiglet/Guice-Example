import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import lombok.Setter;
import net.dv8tion.jda.api.JDA;

import javax.annotation.Nonnull;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class BinderModule extends AbstractModule {
    private final Class main;

    @Setter private JDA jda = null;

    public BinderModule(Class main) {
        this.main = main;
    }

    public Injector createInjector() {
        return Guice.createInjector(this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void configure() {
        bind(main).toInstance(main);
    }

    @Provides
    @Nonnull
    public JDA getJDA() {
        return jda;
    }
}
