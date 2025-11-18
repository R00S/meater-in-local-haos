package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<CloudMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CloudMessage createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 1) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                intent = (Intent) SafeParcelReader.m14451o(parcel, iM14425C, Intent.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CloudMessage[] newArray(int i2) {
        return new CloudMessage[i2];
    }
}
