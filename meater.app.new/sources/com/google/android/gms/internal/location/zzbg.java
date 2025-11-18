package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbg implements Parcelable.Creator<zzbf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbf createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        zzbd zzbdVar = null;
        IBinder iBinderM14426D = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderM14426D2 = null;
        IBinder iBinderM14426D3 = null;
        int iM14427E = 1;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    zzbdVar = (zzbd) SafeParcelReader.m14451o(parcel, iM14425C, zzbd.CREATOR);
                    break;
                case 3:
                    iBinderM14426D = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, iM14425C, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderM14426D2 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 6:
                    iBinderM14426D3 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzbf(iM14427E, zzbdVar, iBinderM14426D, pendingIntent, iBinderM14426D2, iBinderM14426D3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbf[] newArray(int i2) {
        return new zzbf[i2];
    }
}
