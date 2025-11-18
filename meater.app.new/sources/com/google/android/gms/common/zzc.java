package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        int iM14427E = 0;
        long jM14429G = -1;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 2) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new Feature(strM14452p, iM14427E, jM14429G);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new Feature[i2];
    }
}
