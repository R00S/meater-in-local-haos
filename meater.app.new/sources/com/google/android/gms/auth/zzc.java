package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<AccountChangeEventsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEventsResponse createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        ArrayList arrayListM14456t = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, AccountChangeEvent.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new AccountChangeEventsResponse(iM14427E, arrayListM14456t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEventsResponse[] newArray(int i2) {
        return new AccountChangeEventsResponse[i2];
    }
}
