package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2MeaterLinkMajorVersion implements WireEnum {
    V2MEATER_LINK_MAJOR_V1(1),
    V2MEATER_LINK_MAJOR_LATEST(12),
    V2MEATER_LINK_ID(21578);

    public static final ProtoAdapter<V2MeaterLinkMajorVersion> ADAPTER = ProtoAdapter.newEnumAdapter(V2MeaterLinkMajorVersion.class);
    private final int value;

    V2MeaterLinkMajorVersion(int i10) {
        this.value = i10;
    }

    public static V2MeaterLinkMajorVersion fromValue(int i10) {
        if (i10 != 1) {
            if (i10 != 12) {
                if (i10 != 21578) {
                    return null;
                }
                return V2MEATER_LINK_ID;
            }
            return V2MEATER_LINK_MAJOR_LATEST;
        }
        return V2MEATER_LINK_MAJOR_V1;
    }

    public int getValue() {
        return this.value;
    }
}
