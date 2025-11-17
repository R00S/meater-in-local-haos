package com.apptionlabs.meater_app.model;

import kotlin.Metadata;
import wh.m;

/* compiled from: MEATERDeviceExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"isG2MeaterBlock", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "isG2MeaterPlus", "isMeaterPlus", "isMeaterPlusSE", "isOriginalMeater", "app_playstoreLiveRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class MEATERDeviceExtKt {
    public static final boolean isG2MeaterBlock(MEATERDevice mEATERDevice) {
        m.f(mEATERDevice, "<this>");
        if (mEATERDevice.getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR && mEATERDevice.getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO) {
            return false;
        }
        return true;
    }

    public static final boolean isG2MeaterPlus(MEATERDevice mEATERDevice) {
        m.f(mEATERDevice, "<this>");
        if (mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS) {
            return true;
        }
        return false;
    }

    public static final boolean isMeaterPlus(MEATERDevice mEATERDevice) {
        m.f(mEATERDevice, "<this>");
        if (mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.PLUS) {
            return true;
        }
        return false;
    }

    public static final boolean isMeaterPlusSE(MEATERDevice mEATERDevice) {
        m.f(mEATERDevice, "<this>");
        if (mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.PLUS_SE) {
            return true;
        }
        return false;
    }

    public static final boolean isOriginalMeater(MEATERDevice mEATERDevice) {
        m.f(mEATERDevice, "<this>");
        if (mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.PROBE) {
            return true;
        }
        return false;
    }
}
