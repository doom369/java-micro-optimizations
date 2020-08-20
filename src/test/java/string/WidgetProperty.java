package string;

import java.util.HashMap;
import java.util.Map;

public enum WidgetProperty {

    LABEL,
    COLOR,
    ON_LABEL,
    OFF_LABEL,
    MIN,
    MAX;

    public static final WidgetProperty[] values = values();

    private final static Map<String, WidgetProperty> cache;
    static {
        cache = new HashMap<>();
        for (WidgetProperty widgetProperty : values()) {
            cache.put(widgetProperty.name(), widgetProperty);
        }
    }

    public static WidgetProperty valueOfMap(String value) {
        return cache.get(value);
    }

    public static WidgetProperty valueOfSwitch(String value) {
        switch (value) {
            case "LABEL" :
                return WidgetProperty.LABEL;
            case "COLOR" :
                return WidgetProperty.COLOR;
            case "ON_LABEL" :
                return WidgetProperty.ON_LABEL;
            case "OFF_LABEL" :
                return WidgetProperty.OFF_LABEL;
            case "MIN" :
                return WidgetProperty.MIN;
            case "MAX" :
                return WidgetProperty.MAX;
        }
        return null;
    }

}
