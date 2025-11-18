package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzvt implements Parcelable.Creator<zzvs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvs createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m14451o(parcel, iM14425C, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzvs(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvs[] newArray(int i2) {
        return new zzvs[i2];
    }
}
