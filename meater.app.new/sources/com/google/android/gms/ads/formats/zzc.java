package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<PublisherAdViewOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        IBinder iBinderM14426D = null;
        IBinder iBinderM14426D2 = null;
        boolean zM14459w = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 2) {
                iBinderM14426D = SafeParcelReader.m14426D(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iBinderM14426D2 = SafeParcelReader.m14426D(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new PublisherAdViewOptions(zM14459w, iBinderM14426D, iBinderM14426D2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions[] newArray(int i2) {
        return new PublisherAdViewOptions[i2];
    }
}
