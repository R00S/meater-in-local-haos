package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        zzj zzjVar = zzm.f27671g;
        List<ClientIdentity> listM14456t = zzm.f27670f;
        String strM14452p = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                zzjVar = (zzj) SafeParcelReader.m14451o(parcel, iM14425C, zzj.CREATOR);
            } else if (iM14458v == 2) {
                listM14456t = SafeParcelReader.m14456t(parcel, iM14425C, ClientIdentity.CREATOR);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzm(zzjVar, listM14456t, strM14452p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i2) {
        return new zzm[i2];
    }
}
