package com.apptionlabs.meater_app.v1protobuf;

import com.apptionlabs.meater_app.model.DeviceFirmwareVersion;
import java.math.BigInteger;

/* loaded from: /tmp/meat/meat/classes.dex */
public class BlockInfo {
    public int batteryLevel;
    public long deviceID;
    public DeviceFirmwareVersion firmwareVersion;
    public int wifiSignalLevel;

    public static BlockInfo fromV1MasterMessage(V1MasterMessage v1MasterMessage) {
        String str = v1MasterMessage.header.deviceID;
        if (str != null && str.length() >= 9 && v1MasterMessage.masterBatteryLevel != null && v1MasterMessage.header.deviceID.startsWith("BLK-")) {
            String[] split = v1MasterMessage.header.deviceID.split("-");
            if (split.length == 3) {
                String str2 = split[1];
                String str3 = split[2];
                if (str2.split("\\.").length >= 2) {
                    BlockInfo blockInfo = new BlockInfo();
                    blockInfo.firmwareVersion = DeviceFirmwareVersion.fromString(str2);
                    blockInfo.deviceID = new BigInteger(str3, 16).longValue();
                    blockInfo.batteryLevel = v1MasterMessage.masterBatteryLevel.intValue();
                    Integer num = v1MasterMessage.wifiSignalLevel;
                    if (num != null) {
                        blockInfo.wifiSignalLevel = num.intValue();
                    }
                    return blockInfo;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
