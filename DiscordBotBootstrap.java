import com.google.inject.Injector;

import java.util.stream.Stream;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class DiscordBotBootstrap {
    private DiscordBotBootstrap() {
        BinderModule module = new BinderModule(getClass());
        Injector injector = module.createInjector();
        injector.injectMembers(this);

        Stream.of(JDARegisterable.class, JDADependantRegisterable.class).map(injector::getInstance).forEach(r -> r.run(module));
    }

    public static void main(String[] args) {
        new DiscordBotBootstrap();
    }
}
