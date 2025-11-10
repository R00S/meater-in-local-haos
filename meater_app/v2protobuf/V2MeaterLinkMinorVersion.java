package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2MeaterLinkMinorVersion implements WireEnum {
    V2MEATER_LINK_MINOR_V0(0),
    V2MEATER_LINK_MINOR_LATEST(2);

    public static final ProtoAdapter<V2MeaterLinkMinorVersion> ADAPTER = ProtoAdapter.newEnumAdapter(V2MeaterLinkMinorVersion.class);
    private final int value;

    V2MeaterLinkMinorVersion(int i10) {
        this.value = i10;
    }

    public static V2MeaterLinkMinorVersion fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 2) {
                return null;
            }
            return V2MEATER_LINK_MINOR_LATEST;
        }
        return V2MEATER_LINK_MINOR_V0;
    }

    public int getValue() {
        return this.value;
    }
}
