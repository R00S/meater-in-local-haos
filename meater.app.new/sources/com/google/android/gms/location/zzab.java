package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 3600000;
        long jM14429G2 = 600000;
        long jM14429G3 = Long.MAX_VALUE;
        long jM14429G4 = 0;
        int iM14427E = 102;
        boolean zM14459w = false;
        int iM14427E2 = Integer.MAX_VALUE;
        float fM14423A = 0.0f;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 3:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 4:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 5:
                    jM14429G3 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 6:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 7:
                    fM14423A = SafeParcelReader.m14423A(parcel, iM14425C);
                    break;
                case 8:
                    jM14429G4 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new LocationRequest(iM14427E, jM14429G, jM14429G2, zM14459w, jM14429G3, iM14427E2, fM14423A, jM14429G4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
