import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class JDARegisterable extends Registerable {
    @Override
    protected void execute() {
        addProvider(m -> {
           try {
               m.setJda(new JDABuilder("token")
                       .setActivity(Activity.playing("game"))
                       .build());
           } catch (Exception e) {
               e.printStackTrace();
           }
        });
    }
}