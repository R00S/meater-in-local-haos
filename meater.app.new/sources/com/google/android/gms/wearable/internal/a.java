package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                strF2 = SafeParcelReader.f(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new DataItemAssetParcelable(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataItemAssetParcelable[i10];
    }
}
