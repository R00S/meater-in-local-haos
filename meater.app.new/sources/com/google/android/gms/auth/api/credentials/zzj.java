package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator<HintRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArrM14453q = null;
        String strM14452p = null;
        String strM14452p2 = null;
        int iM14427E = 0;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v != 1000) {
                switch (iM14458v) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m14451o(parcel, iM14425C, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                        break;
                    case 3:
                        zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                        break;
                    case 4:
                        strArrM14453q = SafeParcelReader.m14453q(parcel, iM14425C);
                        break;
                    case 5:
                        zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                        break;
                    case 6:
                        strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                        break;
                    case 7:
                        strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                        break;
                    default:
                        SafeParcelReader.m14433K(parcel, iM14425C);
                        break;
                }
            } else {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new HintRequest(iM14427E, credentialPickerConfig, zM14459w, zM14459w2, strArrM14453q, zM14459w3, strM14452p, strM14452p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest[] newArray(int i2) {
        return new HintRequest[i2];
    }
}
