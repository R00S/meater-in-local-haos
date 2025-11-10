package com.apptionlabs.meater_app.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.apptionlabs.meater_app.v2protobuf.V2NetworkSettings;
import com.apptionlabs.meater_app.v3protobuf.NetworkSettings;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public class NetworkSettingsObject implements Parcelable {
    public static final Parcelable.Creator<NetworkSettingsObject> CREATOR = new Parcelable.Creator<NetworkSettingsObject>() { // from class: com.apptionlabs.meater_app.data.NetworkSettingsObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkSettingsObject createFromParcel(Parcel parcel) {
            NetworkSettingsObject networkSettingsObject = new NetworkSettingsObject();
            networkSettingsObject.ssid = parcel.readString();
            networkSettingsObject.ipAddress = parcel.readString();
            networkSettingsObject.networkMask = parcel.readString();
            networkSettingsObject.gateway = parcel.readString();
            networkSettingsObject.dns = parcel.readString();
            return networkSettingsObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkSettingsObject[] newArray(int i10) {
            return new NetworkSettingsObject[i10];
        }
    };
    public String dns;
    public String gateway;
    public String ipAddress;
    public String networkMask;
    public String ssid;

    public NetworkSettingsObject() {
    }

    private static int lengthOfCString(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public String WiFiNetworkNameFromBuffer(byte[] bArr) {
        return new String(bArr, 0, lengthOfCString(bArr), StandardCharsets.UTF_8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String hexStringToByteArray(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            arrayList.add(Integer.valueOf(b10 & 255));
        }
        return TextUtils.join(".", arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.ssid);
        parcel.writeString(this.ipAddress);
        parcel.writeString(this.networkMask);
        parcel.writeString(this.gateway);
        parcel.writeString(this.dns);
    }

    public NetworkSettingsObject(NetworkSettings networkSettings) {
        this.ssid = WiFiNetworkNameFromBuffer(networkSettings.ssid.L());
        this.ipAddress = hexStringToByteArray(networkSettings.ipv4address.L());
        h hVar = networkSettings.ipv4mask;
        if (hVar != null) {
            this.networkMask = hexStringToByteArray(hVar.L());
        }
        h hVar2 = networkSettings.ipv4gateway;
        if (hVar2 != null) {
            this.gateway = hexStringToByteArray(hVar2.L());
        }
        h hVar3 = networkSettings.ipv4dns;
        if (hVar3 != null) {
            this.dns = hexStringToByteArray(hVar3.L());
        }
    }

    public NetworkSettingsObject(V2NetworkSettings v2NetworkSettings) {
        this.ssid = WiFiNetworkNameFromBuffer(v2NetworkSettings.ssid.L());
        this.ipAddress = hexStringToByteArray(v2NetworkSettings.ipv4address.L());
        h hVar = v2NetworkSettings.ipv4mask;
        if (hVar != null) {
            this.networkMask = hexStringToByteArray(hVar.L());
        }
        h hVar2 = v2NetworkSettings.ipv4gateway;
        if (hVar2 != null) {
            this.gateway = hexStringToByteArray(hVar2.L());
        }
        h hVar3 = v2NetworkSettings.ipv4dns;
        if (hVar3 != null) {
            this.dns = hexStringToByteArray(hVar3.L());
        }
    }
}
