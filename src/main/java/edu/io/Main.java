package edu.io;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.set("mode", "dark");
        config.set("test", 1);

        System.out.println(config.get("mode", String.class));
        System.out.println(config.get("test", Integer.class));

        System.out.println(config.get("mode"));
    }
}
