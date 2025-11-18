package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzarl implements Parcelable.Creator<zzark> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzark createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        boolean zM14459w = false;
        ArrayList<String> arrayListM14454r = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzark(zM14459w, arrayListM14454r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzark[] newArray(int i2) {
        return new zzark[i2];
    }
}
