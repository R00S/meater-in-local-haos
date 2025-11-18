package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrM14446j = null;
        int[] iArrM14446j2 = null;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m14451o(parcel, iM14425C, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 3:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 4:
                    iArrM14446j = SafeParcelReader.m14446j(parcel, iM14425C);
                    break;
                case 5:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 6:
                    iArrM14446j2 = SafeParcelReader.m14446j(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM14459w, zM14459w2, iArrM14446j, iM14427E, iArrM14446j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionTelemetryConfiguration[i2];
    }
}
