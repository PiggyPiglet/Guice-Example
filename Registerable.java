import com.google.inject.Injector;

import java.util.function.Consumer;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public abstract class Registerable {
    private BinderModule module;

    protected abstract void execute();

    protected Registerable addProvider(Consumer<BinderModule> moduleConsumer) {
        moduleConsumer.accept(module);
        return this;
    }

    public void run(BinderModule module) {
        this.module = module;
        execute();
    }
}
