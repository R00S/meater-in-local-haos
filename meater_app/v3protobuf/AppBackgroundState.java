package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum AppBackgroundState implements WireEnum {
    APP_BACKGROUND_STATE_FOREGROUND(0),
    APP_BACKGROUND_STATE_BACKGROUND(1);

    public static final ProtoAdapter<AppBackgroundState> ADAPTER = ProtoAdapter.newEnumAdapter(AppBackgroundState.class);
    private final int value;

    AppBackgroundState(int i10) {
        this.value = i10;
    }

    public static AppBackgroundState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return APP_BACKGROUND_STATE_BACKGROUND;
        }
        return APP_BACKGROUND_STATE_FOREGROUND;
    }

    public int getValue() {
        return this.value;
    }
}
