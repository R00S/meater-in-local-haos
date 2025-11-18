package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzki implements Parcelable.Creator<zzkj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkj createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        Long lM14430H = null;
        Float fM14424B = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        Double dM14462z = null;
        long jM14429G = 0;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 4:
                    lM14430H = SafeParcelReader.m14430H(parcel, iM14425C);
                    break;
                case 5:
                    fM14424B = SafeParcelReader.m14424B(parcel, iM14425C);
                    break;
                case 6:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 7:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 8:
                    dM14462z = SafeParcelReader.m14462z(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzkj(iM14427E, strM14452p, jM14429G, lM14430H, fM14424B, strM14452p2, strM14452p3, dM14462z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkj[] newArray(int i2) {
        return new zzkj[i2];
    }
}
