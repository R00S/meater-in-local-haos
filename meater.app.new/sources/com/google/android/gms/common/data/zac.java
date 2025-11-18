package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zac implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String[] strArrM14453q = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleM14442f = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strArrM14453q = SafeParcelReader.m14453q(parcel, iM14425C);
            } else if (iM14458v == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m14455s(parcel, iM14425C, CursorWindow.CREATOR);
            } else if (iM14458v == 3) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 4) {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            } else if (iM14458v != 1000) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        DataHolder dataHolder = new DataHolder(iM14427E, strArrM14453q, cursorWindowArr, iM14427E2, bundleM14442f);
        dataHolder.m14266p0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
