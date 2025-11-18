package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbe implements Parcelable.Creator<zzbd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        List<ClientIdentity> listM14456t = zzbd.f27643f;
        LocationRequest locationRequest = null;
        String strM14452p = null;
        String strM14452p2 = null;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v != 1) {
                switch (iM14458v) {
                    case 5:
                        listM14456t = SafeParcelReader.m14456t(parcel, iM14425C, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                        break;
                    case 7:
                        zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                        break;
                    case 8:
                        zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                        break;
                    case 9:
                        zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                        break;
                    case 10:
                        strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                        break;
                    default:
                        SafeParcelReader.m14433K(parcel, iM14425C);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m14451o(parcel, iM14425C, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzbd(locationRequest, listM14456t, strM14452p, zM14459w, zM14459w2, zM14459w3, strM14452p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd[] newArray(int i2) {
        return new zzbd[i2];
    }
}
