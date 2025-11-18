package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzam implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ArrayList<String> arrayListM14454r = null;
        String strM14452p = HttpUrl.FRAGMENT_ENCODE_SET;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
            } else if (iM14458v == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, iM14425C, PendingIntent.CREATOR);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzal(arrayListM14454r, pendingIntent, strM14452p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i2) {
        return new zzal[i2];
    }
}
