package uz.qazaprayers.config;

import com.pengrad.telegrambot.TelegramBot;

import java.util.ResourceBundle;

public class BotConfiguration {
    private static final ResourceBundle settings = ResourceBundle.getBundle("application");

    private static final ThreadLocal<TelegramBot> telegramBotThreadLocal  = ThreadLocal.withInitial(
            ()-> new TelegramBot(settings.getString("bot.token"))
    );

    public static TelegramBot get(){
        return telegramBotThreadLocal.get();
    }
}
