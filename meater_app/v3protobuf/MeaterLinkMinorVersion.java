package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MeaterLinkMinorVersion implements WireEnum {
    MEATER_LINK_MINOR_V0(0),
    MEATER_LINK_MINOR_LATEST(4);

    public static final ProtoAdapter<MeaterLinkMinorVersion> ADAPTER = ProtoAdapter.newEnumAdapter(MeaterLinkMinorVersion.class);
    private final int value;

    MeaterLinkMinorVersion(int i10) {
        this.value = i10;
    }

    public static MeaterLinkMinorVersion fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 4) {
                return null;
            }
            return MEATER_LINK_MINOR_LATEST;
        }
        return MEATER_LINK_MINOR_V0;
    }

    public int getValue() {
        return this.value;
    }
}
