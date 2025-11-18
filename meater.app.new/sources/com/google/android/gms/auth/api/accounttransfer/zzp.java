package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzp implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ArrayList<String> arrayListM14454r = null;
        ArrayList<String> arrayListM14454r2 = null;
        ArrayList<String> arrayListM14454r3 = null;
        ArrayList<String> arrayListM14454r4 = null;
        ArrayList<String> arrayListM14454r5 = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 3:
                    arrayListM14454r2 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 4:
                    arrayListM14454r3 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 5:
                    arrayListM14454r4 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 6:
                    arrayListM14454r5 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzo(iM14427E, arrayListM14454r, arrayListM14454r2, arrayListM14454r3, arrayListM14454r4, arrayListM14454r5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i2) {
        return new zzo[i2];
    }
}
