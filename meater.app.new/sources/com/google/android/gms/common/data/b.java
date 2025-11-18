package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String[] strArrG = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleA = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                strArrG = SafeParcelReader.g(parcel, iR);
            } else if (iL == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, iR, CursorWindow.CREATOR);
            } else if (iL == 3) {
                iT2 = SafeParcelReader.t(parcel, iR);
            } else if (iL == 4) {
                bundleA = SafeParcelReader.a(parcel, iR);
            } else if (iL != 1000) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        DataHolder dataHolder = new DataHolder(iT, strArrG, cursorWindowArr, iT2, bundleA);
        dataHolder.U0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
