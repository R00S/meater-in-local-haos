package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MEATERSSIDEncryptionType implements WireEnum {
    MEATER_SSID_ENCRYPTION_TYPE_NONE(0),
    MEATER_SSID_ENCRYPTION_TYPE_WEP(1),
    MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP(2),
    MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP_AES(3),
    MEATER_SSID_ENCRYPTION_TYPE_WPA_AES(4),
    MEATER_SSID_ENCRYPTION_TYPE_WPA2_AES(5);

    public static final ProtoAdapter<MEATERSSIDEncryptionType> ADAPTER = ProtoAdapter.newEnumAdapter(MEATERSSIDEncryptionType.class);
    private final int value;

    MEATERSSIDEncryptionType(int i10) {
        this.value = i10;
    }

    public static MEATERSSIDEncryptionType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return MEATER_SSID_ENCRYPTION_TYPE_WPA2_AES;
                        }
                        return MEATER_SSID_ENCRYPTION_TYPE_WPA_AES;
                    }
                    return MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP_AES;
                }
                return MEATER_SSID_ENCRYPTION_TYPE_WPA_TKIP;
            }
            return MEATER_SSID_ENCRYPTION_TYPE_WEP;
        }
        return MEATER_SSID_ENCRYPTION_TYPE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
