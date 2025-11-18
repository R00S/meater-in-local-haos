package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator<AuthAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        IBinder iBinderM14426D = null;
        Scope[] scopeArr = null;
        Integer numM14428F = null;
        Integer numM14428F2 = null;
        Account account = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    iBinderM14426D = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 3:
                    scopeArr = (Scope[]) SafeParcelReader.m14455s(parcel, iM14425C, Scope.CREATOR);
                    break;
                case 4:
                    numM14428F = SafeParcelReader.m14428F(parcel, iM14425C);
                    break;
                case 5:
                    numM14428F2 = SafeParcelReader.m14428F(parcel, iM14425C);
                    break;
                case 6:
                    account = (Account) SafeParcelReader.m14451o(parcel, iM14425C, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new AuthAccountRequest(iM14427E, iBinderM14426D, scopeArr, numM14428F, numM14428F2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest[] newArray(int i2) {
        return new AuthAccountRequest[i2];
    }
}
