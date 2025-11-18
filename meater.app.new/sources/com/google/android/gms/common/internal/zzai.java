package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        int iM14427E2 = 0;
        int iM14427E3 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 3) {
                zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 4) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new RootTelemetryConfiguration(iM14427E, zM14459w, zM14459w2, iM14427E2, iM14427E3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new RootTelemetryConfiguration[i2];
    }
}
