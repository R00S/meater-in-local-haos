package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2333b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        C2333b c2333b = null;
        int iT = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                c2333b = (C2333b) SafeParcelReader.e(parcel, iR, C2333b.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new Status(iT, strF, pendingIntent, c2333b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
