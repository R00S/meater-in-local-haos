package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zai implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String strM14452p2 = null;
        zaa zaaVar = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        boolean zM14459w = false;
        int iM14427E3 = 0;
        boolean zM14459w2 = false;
        int iM14427E4 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 3:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 4:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 7:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 8:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 9:
                    zaaVar = (zaa) SafeParcelReader.m14451o(parcel, iM14425C, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new FastJsonResponse.Field(iM14427E, iM14427E2, zM14459w, iM14427E3, zM14459w2, strM14452p, iM14427E4, strM14452p2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i2) {
        return new FastJsonResponse.Field[i2];
    }
}
