package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1MeaterLinkMajorVersion implements WireEnum {
    MEATER_LINK_MAJOR_V1(1),
    MEATER_LINK_MAJOR_LATEST(7),
    MEATER_LINK_ID(21578);

    public static final ProtoAdapter<V1MeaterLinkMajorVersion> ADAPTER = ProtoAdapter.newEnumAdapter(V1MeaterLinkMajorVersion.class);
    private final int value;

    V1MeaterLinkMajorVersion(int i10) {
        this.value = i10;
    }

    public static V1MeaterLinkMajorVersion fromValue(int i10) {
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 21578) {
                    return null;
                }
                return MEATER_LINK_ID;
            }
            return MEATER_LINK_MAJOR_LATEST;
        }
        return MEATER_LINK_MAJOR_V1;
    }

    public int getValue() {
        return this.value;
    }
}
