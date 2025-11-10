package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2MEATERSSIDEncryptionType implements WireEnum {
    V2MEATER_SSID_ENCRYPTION_TYPE_NONE(0),
    V2MEATER_SSID_ENCRYPTION_TYPE_WEP(1),
    V2MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP(2),
    V2MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP_AES(3),
    V2MEATER_SSID_ENCRYPTION_TYPE_WPA_AES(4),
    V2MEATER_SSID_ENCRYPTION_TYPE_WPA2_AES(5);

    public static final ProtoAdapter<V2MEATERSSIDEncryptionType> ADAPTER = ProtoAdapter.newEnumAdapter(V2MEATERSSIDEncryptionType.class);
    private final int value;

    V2MEATERSSIDEncryptionType(int i10) {
        this.value = i10;
    }

    public static V2MEATERSSIDEncryptionType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return V2MEATER_SSID_ENCRYPTION_TYPE_WPA2_AES;
                        }
                        return V2MEATER_SSID_ENCRYPTION_TYPE_WPA_AES;
                    }
                    return V2MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP_AES;
                }
                return V2MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP;
            }
            return V2MEATER_SSID_ENCRYPTION_TYPE_WEP;
        }
        return V2MEATER_SSID_ENCRYPTION_TYPE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
