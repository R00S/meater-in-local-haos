package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1MeaterLinkMinorVersion implements WireEnum {
    MEATER_LINK_MINOR_V0(0),
    MEATER_LINK_MINOR_LATEST(1);

    public static final ProtoAdapter<V1MeaterLinkMinorVersion> ADAPTER = ProtoAdapter.newEnumAdapter(V1MeaterLinkMinorVersion.class);
    private final int value;

    V1MeaterLinkMinorVersion(int i10) {
        this.value = i10;
    }

    public static V1MeaterLinkMinorVersion fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
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
