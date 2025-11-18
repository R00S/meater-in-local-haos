package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator<SafeBrowsingData> {
    /* renamed from: a */
    static void m23604a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, safeBrowsingData.m23597Y(), false);
        SafeParcelWriter.m14484s(parcel, 3, safeBrowsingData.m23599y(), i2, false);
        SafeParcelWriter.m14484s(parcel, 4, safeBrowsingData.m23600z(), i2, false);
        SafeParcelWriter.m14481p(parcel, 5, safeBrowsingData.m23596W());
        SafeParcelWriter.m14471f(parcel, 6, safeBrowsingData.m23598e0(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArrM14443g = null;
        long jM14429G = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 3) {
                dataHolder = (DataHolder) SafeParcelReader.m14451o(parcel, iM14425C, DataHolder.CREATOR);
            } else if (iM14458v == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m14451o(parcel, iM14425C, ParcelFileDescriptor.CREATOR);
            } else if (iM14458v == 5) {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v != 6) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                bArrM14443g = SafeParcelReader.m14443g(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new SafeBrowsingData(strM14452p, dataHolder, parcelFileDescriptor, jM14429G, bArrM14443g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData[] newArray(int i2) {
        return new SafeBrowsingData[i2];
    }
}
