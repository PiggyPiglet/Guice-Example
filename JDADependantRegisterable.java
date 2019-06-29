import com.google.inject.Inject;
import net.dv8tion.jda.api.JDA;
import org.slf4j.LoggerFactory;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class JDADependantRegisterable extends Registerable {
    @Inject private JDA jda;

    @Override
    protected void execute() {
        LoggerFactory.getLogger("JDA-STARTUP").info("{} is the bot's token.", jda.getToken());
    }
}
