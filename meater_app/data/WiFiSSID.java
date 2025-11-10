package com.apptionlabs.meater_app.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSIDEncryptionType;
import java.util.Objects;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public class WiFiSSID implements Parcelable {
    public static final Parcelable.Creator<WiFiSSID> CREATOR = new Parcelable.Creator<WiFiSSID>() { // from class: com.apptionlabs.meater_app.data.WiFiSSID.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WiFiSSID createFromParcel(Parcel parcel) {
            return new WiFiSSID(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WiFiSSID[] newArray(int i10) {
            return new WiFiSSID[i10];
        }
    };
    private Integer RSSI;
    private MEATERSSIDEncryptionType encryptionType;
    private h name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.name, ((WiFiSSID) obj).getName());
        }
        return false;
    }

    public MEATERSSIDEncryptionType getEncryptionType() {
        return this.encryptionType;
    }

    public h getName() {
        return this.name;
    }

    public Integer getRSSI() {
        return this.RSSI;
    }

    public void setEncryptionType(MEATERSSIDEncryptionType mEATERSSIDEncryptionType) {
        this.encryptionType = mEATERSSIDEncryptionType;
    }

    public void setName(h hVar) {
        this.name = hVar;
    }

    public void setRSSI(Integer num) {
        this.RSSI = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.name.I());
        parcel.writeByteArray(this.name.L());
        parcel.writeInt(this.encryptionType.getValue());
        parcel.writeInt(this.RSSI.intValue());
    }

    public WiFiSSID() {
    }

    private WiFiSSID(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        this.name = h.B(bArr);
        this.encryptionType = MEATERSSIDEncryptionType.fromValue(parcel.readInt());
        this.RSSI = Integer.valueOf(parcel.readInt());
    }
}
