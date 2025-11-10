package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MCNotificationType implements WireEnum {
    NOTIFICATION_TYPE_INFO(0),
    NOTIFICATION_TYPE_WARNING(1),
    NOTIFICATION_TYPE_CONNECTION_LOST(2),
    NOTIFICATION_TYPE_READY_FOR_RESTING(3),
    NOTIFICATION_TYPE_COOK_READY(4),
    NOTIFICATION_TYPE_ALERT(5),
    NOTIFICATION_TYPE_SLIGHTLY_OVERCOOKED(6),
    NOTIFICATION_TYPE_OVERCOOK(7),
    NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING(8),
    NOTIFICATION_TYPE_PUT_PROBE_BACK_IN_CHARGER(9),
    NOTIFICATION_TYPE_AMBIENT_OUTSIDE_RANGE(10),
    NOTIFICATION_TYPE_RECIPE_PROGRESS(11),
    NOTIFICATION_TYPE_FLARE_UP(12);

    public static final ProtoAdapter<MCNotificationType> ADAPTER = ProtoAdapter.newEnumAdapter(MCNotificationType.class);
    private final int value;

    MCNotificationType(int i10) {
        this.value = i10;
    }

    public static MCNotificationType fromValue(int i10) {
        switch (i10) {
            case 0:
                return NOTIFICATION_TYPE_INFO;
            case 1:
                return NOTIFICATION_TYPE_WARNING;
            case 2:
                return NOTIFICATION_TYPE_CONNECTION_LOST;
            case 3:
                return NOTIFICATION_TYPE_READY_FOR_RESTING;
            case 4:
                return NOTIFICATION_TYPE_COOK_READY;
            case 5:
                return NOTIFICATION_TYPE_ALERT;
            case 6:
                return NOTIFICATION_TYPE_SLIGHTLY_OVERCOOKED;
            case 7:
                return NOTIFICATION_TYPE_OVERCOOK;
            case 8:
                return NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING;
            case 9:
                return NOTIFICATION_TYPE_PUT_PROBE_BACK_IN_CHARGER;
            case 10:
                return NOTIFICATION_TYPE_AMBIENT_OUTSIDE_RANGE;
            case 11:
                return NOTIFICATION_TYPE_RECIPE_PROGRESS;
            case 12:
                return NOTIFICATION_TYPE_FLARE_UP;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
