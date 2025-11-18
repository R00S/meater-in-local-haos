package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundleM14442f = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            } else if (iM14458v == 2) {
                featureArr = (Feature[]) SafeParcelReader.m14455s(parcel, iM14425C, Feature.CREATOR);
            } else if (iM14458v == 3) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 4) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m14451o(parcel, iM14425C, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzj(bundleM14442f, featureArr, iM14427E, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzj[i2];
    }
}
