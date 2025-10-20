package edu.io;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private static AppConfig instance;
    private final Map<String, Object> config = new HashMap<>();

    private AppConfig() {}

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public <T> void set(String key, T value) {
        config.put(key, value);
    }

    public <T> T get(String key, Class<T> type) {
        Object value = config.get(key);
        if (value == null) throw new RuntimeException("No value for key: " + key);
        return type.cast(value);
    }

    public Object get(String key) {
        return config.get(key);
    }
}