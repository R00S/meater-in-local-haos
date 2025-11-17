package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MeaterLinkMajorVersion implements WireEnum {
    MEATER_LINK_MAJOR_V1(1),
    MEATER_LINK_MAJOR_LATEST(17),
    MEATER_LINK_ID(21578);

    public static final ProtoAdapter<MeaterLinkMajorVersion> ADAPTER = ProtoAdapter.newEnumAdapter(MeaterLinkMajorVersion.class);
    private final int value;

    MeaterLinkMajorVersion(int i10) {
        this.value = i10;
    }

    public static MeaterLinkMajorVersion fromValue(int i10) {
        if (i10 != 1) {
            if (i10 != 17) {
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
