/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.util.personalization.core.domain;

import com.root101.swing.material.standards.MaterialColors;
import com.root101.swing.material.standards.MaterialIcons;
import com.root101.swing.derivable_icons.IconTTF;
import com.root101.json.jackson.JACKSON;
import java.util.HashMap;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class Personalization extends HashMap<String, Object> {

    //beep
    public static final String KEY_DO_BEEP = "swing_personalization.key.boolean.do_beep";
    public static final Object VALUE_DO_BEEP = true;

    //system tray
    public static final String KEY_HIDE_TO_SYSTEM_TRAY = "swing_personalization.key.boolean.hide_to_system_tray";
    public static final Object VALUE_HIDE_TO_SYSTEM_TRAY = true;

    public static final String KEY_SHOW_NOTIF_AFTER_TRAY = "swing_personalization.key.boolean.show_notification_after_tray";
    public static final Object VALUE_SHOW_NOTIF_AFTER_TRAY = true;

    public static final String KEY_USE_ANTIALIASING = "swing_personalization.key.boolean.use_antialiasing";
    public static final Object VALUE_USE_ANTIALIASING = true;
    public static final String KEY_USE_SHADOW = "swing_personalization.key.boolean.use_shadow";
    public static final Object VALUE_USE_SHADOW = true;
    public static final String KEY_COLOR_SHADOW_OFF = "swing_personalization.key.color.shadow_off";
    public static final Object VALUE_COLOR_SHADOW_OFF = MaterialColors.GREY_400;

    public static final String KEY_USE_ANIMATIONS = "swing_personalization.key.boolean.use_animations";
    public static final Object VALUE_USE_ANIMATIONS = true;
    public static final String KEY_USE_ANIMATIONS_NOTIFICATIONS = "swing_personalization.key.boolean.use_animations_notifications";
    public static final Object VALUE_USE_ANIMATIONS_NOTIFICATIONS = true;

    public static final String KEY_USE_DOUBLE_DELETE_CHECK = "swing_personalization.key.boolean.use_double_delete_check";
    public static final Object VALUE_USE_DOUBLE_DELETE_CHECK = true;

    //button view, add, edit & cancel
    public static final String KEY_COLOR_BUTTON_ADD = "swing_personalization.key.color.button_add";
    public static final Object VALUE_COLOR_BUTTON_ADD = MaterialColors.GREEN_700;
    public static final String KEY_COLOR_BUTTON_EDIT = "swing_personalization.key.color.button_edit";
    public static final Object VALUE_COLOR_BUTTON_EDIT = MaterialColors.BLUE_800;
    public static final String KEY_COLOR_BUTTON_VIEW = "swing_personalization.key.color.button_view";
    public static final Object VALUE_COLOR_BUTTON_VIEW = MaterialColors.BLUEGREY_700;
    public static final String KEY_COLOR_BUTTON_CANCEL = "swing_personalization.key.color.button_cancel";
    public static final Object VALUE_COLOR_BUTTON_CANCEL = MaterialColors.RED_700;

    //iconos view, edit & add para los proyectos
    public static final String KEY_ICON_BUTTON_ADD = "swing_personalization.key.icon.button_add";
    public static final Object VALUE_ICON_BUTTON_ADD = (IconTTF) MaterialIcons.ADD.deriveIcon(24f);
    public static final String KEY_ICON_BUTTON_EDIT = "swing_personalization.key.icon.button_edit";
    public static final Object VALUE_ICON_BUTTON_EDIT = (IconTTF) MaterialIcons.EDIT.deriveIcon(24f);
    public static final String KEY_ICON_BUTTON_VIEW = "swing_personalization.key.icon.button_view";
    public static final Object VALUE_ICON_BUTTON_VIEW = (IconTTF) MaterialIcons.VIEW_MODULE.deriveIcon(24f);

    //money
    public static final String KEY_COLOR_MONEY_POSITIVE = "swing_personalization.key.color.money_positive";
    public static final Object VALUE_COLOR_MONEY_POSITIVE = MaterialColors.GREEN_900;

    public static final String KEY_COLOR_MONEY_NEGATIVE = "swing_personalization.key.color.money_negative";
    public static final Object VALUE_COLOR_MONEY_NEGATIVE = MaterialColors.REDA_700;

    //text fields
    public static final String KEY_COLOR_ACCENT = "swing_personalization.key.color.accent";
    public static final Object VALUE_COLOR_ACCENT = MaterialColors.BLUEA_400;
    public static final String KEY_COLOR_WRONG = "swing_personalization.key.color.wrong";
    public static final Object VALUE_COLOR_WRONG = MaterialColors.RED_800;

    //panel
    public static final String KEY_COLOR_BACKGROUND_PANEL = "swing_personalization.key.color.background_panel";
    public static final Object VALUE_COLOR_BACKGROUND_PANEL = MaterialColors.WHITE;

    //foregrounds
    public static final String KEY_COLOR_FOREGROUND_FOR_DARK = "swing_personalization.key.color.foreground_for_dark";
    public static final Object VALUE_COLOR_FOREGROUND_FOR_DARK = MaterialColors.WHITE;
    public static final String KEY_COLOR_FOREGROUND_FOR_WHITE = "swing_personalization.key.color.foreground_for_white";
    public static final Object VALUE_COLOR_FOREGROUND_FOR_WHITE = MaterialColors.DARK_BLACK;

    //main
    public static final String KEY_COLOR_MAIN = "swing_personalization.key.color.main";
    public static final Object VALUE_COLOR_MAIN = MaterialColors.BLUEA_200;
    public static final String KEY_COLOR_SECUNDARY = "swing_personalization.key.color.secundary";
    public static final Object VALUE_COLOR_SECUNDARY = MaterialColors.BLUE_900;

    //notificaciones principalmente
    public static final String KEY_INT_NOTIFICATION_DURATION = "swing_personalization.key.int.notification_duration";
    public static final Object VALUE_INT_NOTIFICATION_DURATION = 3;

    public static final String KEY_COLOR_DONE = "swing_personalization.key.color.done";
    public static final Object VALUE_COLOR_DONE = MaterialColors.GREEN_700;
    public static final String KEY_COLOR_ERROR = "swing_personalization.key.color.error";
    public static final Object VALUE_COLOR_ERROR = MaterialColors.REDA_700;
    public static final String KEY_COLOR_INFO = "swing_personalization.key.color.info";
    public static final Object VALUE_COLOR_INFO = MaterialColors.BLUE_700;
    public static final String KEY_COLOR_WARNING = "swing_personalization.key.color.warning";
    public static final Object VALUE_COLOR_WARNING = MaterialColors.YELLOWA_700;

    //tooltip
    public static final String KEY_INT_TOOLTIP_INITIAL_DELAY = "swing_personalization.key.int.tooltip_init_delay";
    public static final Object VALUE_INT_TOOLTIP_INITIAL_DELAY = 300;
    public static final String KEY_INT_TOOLTIP_DISMISS_DELAY = "swing_personalization.key.int.tooltip_desmiss_delay";
    public static final Object VALUE_INT_TOOLTIP_DISMISS_DELAY = 30 * 1000;

    public Personalization() {
        super.put(KEY_DO_BEEP, VALUE_DO_BEEP);
        super.put(KEY_HIDE_TO_SYSTEM_TRAY, VALUE_HIDE_TO_SYSTEM_TRAY);
        super.put(KEY_SHOW_NOTIF_AFTER_TRAY, VALUE_SHOW_NOTIF_AFTER_TRAY);

        super.put(KEY_USE_ANTIALIASING, VALUE_USE_ANTIALIASING);
        super.put(KEY_USE_SHADOW, VALUE_USE_SHADOW);
        super.put(KEY_COLOR_SHADOW_OFF, VALUE_COLOR_SHADOW_OFF);

        super.put(KEY_USE_ANIMATIONS, VALUE_USE_ANIMATIONS);
        super.put(KEY_USE_ANIMATIONS_NOTIFICATIONS, VALUE_USE_ANIMATIONS_NOTIFICATIONS);

        super.put(KEY_USE_DOUBLE_DELETE_CHECK, VALUE_USE_DOUBLE_DELETE_CHECK);

        super.put(KEY_COLOR_BUTTON_ADD, VALUE_COLOR_BUTTON_ADD);
        super.put(KEY_COLOR_BUTTON_EDIT, VALUE_COLOR_BUTTON_EDIT);
        super.put(KEY_COLOR_BUTTON_VIEW, VALUE_COLOR_BUTTON_VIEW);
        super.put(KEY_COLOR_BUTTON_CANCEL, VALUE_COLOR_BUTTON_CANCEL);

        super.put(KEY_ICON_BUTTON_ADD, VALUE_ICON_BUTTON_ADD);
        super.put(KEY_ICON_BUTTON_EDIT, VALUE_ICON_BUTTON_EDIT);
        super.put(KEY_ICON_BUTTON_VIEW, VALUE_ICON_BUTTON_VIEW);

        super.put(KEY_COLOR_MONEY_POSITIVE, VALUE_COLOR_MONEY_POSITIVE);
        super.put(KEY_COLOR_MONEY_NEGATIVE, VALUE_COLOR_MONEY_NEGATIVE);

        super.put(KEY_COLOR_ACCENT, VALUE_COLOR_ACCENT);
        super.put(KEY_COLOR_WRONG, VALUE_COLOR_WRONG);

        super.put(KEY_COLOR_BACKGROUND_PANEL, VALUE_COLOR_BACKGROUND_PANEL);

        super.put(KEY_COLOR_FOREGROUND_FOR_DARK, VALUE_COLOR_FOREGROUND_FOR_DARK);
        super.put(KEY_COLOR_FOREGROUND_FOR_WHITE, VALUE_COLOR_FOREGROUND_FOR_WHITE);

        super.put(KEY_COLOR_MAIN, VALUE_COLOR_MAIN);
        super.put(KEY_COLOR_SECUNDARY, VALUE_COLOR_SECUNDARY);

        super.put(KEY_INT_NOTIFICATION_DURATION, VALUE_INT_NOTIFICATION_DURATION);
        super.put(KEY_COLOR_DONE, VALUE_COLOR_DONE);
        super.put(KEY_COLOR_ERROR, VALUE_COLOR_ERROR);
        super.put(KEY_COLOR_INFO, VALUE_COLOR_INFO);
        super.put(KEY_COLOR_WARNING, VALUE_COLOR_WARNING);

        super.put(KEY_INT_TOOLTIP_INITIAL_DELAY, VALUE_INT_TOOLTIP_INITIAL_DELAY);
        super.put(KEY_INT_TOOLTIP_DISMISS_DELAY, VALUE_INT_TOOLTIP_DISMISS_DELAY);

    }

    public <T> T getType(String key, Class<T> type) {
        try {
            return JACKSON.convert(get(key), type);
        } catch (Exception e) {
            return (T) get(key);
        }
    }

}
