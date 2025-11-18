package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzu implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        HashSet hashSet = new HashSet();
        String strM14452p = null;
        byte[] bArrM14443g = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    hashSet.add(1);
                    break;
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    hashSet.add(2);
                    break;
                case 3:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrM14443g = SafeParcelReader.m14443g(parcel, iM14425C);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, iM14425C, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.m14451o(parcel, iM14425C, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        if (parcel.dataPosition() == iM14434L) {
            return new zzt(hashSet, iM14427E, strM14452p, iM14427E2, bArrM14443g, pendingIntent, deviceMetaData);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(iM14434L);
        throw new SafeParcelReader.ParseException(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt[] newArray(int i2) {
        return new zzt[i2];
    }
}
