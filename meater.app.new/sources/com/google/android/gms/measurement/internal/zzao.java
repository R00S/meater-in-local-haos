package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzao implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundleM14442f = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzam(bundleM14442f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i2) {
        return new zzam[i2];
    }
}
