package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum ProbeCookSetupState implements WireEnum {
    PROBE_COOK_SETUP_STATE_NONE(0),
    PROBE_COOK_SETUP_STATE_SAME(1),
    PROBE_COOK_SETUP_STATE_PROBE_SETUP_OLDER(2),
    PROBE_COOK_SETUP_STATE_PROBE_SETUP_NEWER(3),
    PROBE_COOK_SETUP_STATE_PROBE_SETUP_INVALID(4);

    public static final ProtoAdapter<ProbeCookSetupState> ADAPTER = ProtoAdapter.newEnumAdapter(ProbeCookSetupState.class);
    private final int value;

    ProbeCookSetupState(int i10) {
        this.value = i10;
    }

    public static ProbeCookSetupState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return PROBE_COOK_SETUP_STATE_PROBE_SETUP_INVALID;
                    }
                    return PROBE_COOK_SETUP_STATE_PROBE_SETUP_NEWER;
                }
                return PROBE_COOK_SETUP_STATE_PROBE_SETUP_OLDER;
            }
            return PROBE_COOK_SETUP_STATE_SAME;
        }
        return PROBE_COOK_SETUP_STATE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
