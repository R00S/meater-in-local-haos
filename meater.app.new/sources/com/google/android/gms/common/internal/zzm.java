package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    /* renamed from: a */
    static void m14506a(GetServiceRequest getServiceRequest, Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, getServiceRequest.f17733h);
        SafeParcelWriter.m14477l(parcel, 2, getServiceRequest.f17734i);
        SafeParcelWriter.m14477l(parcel, 3, getServiceRequest.f17735j);
        SafeParcelWriter.m14486u(parcel, 4, getServiceRequest.f17736k, false);
        SafeParcelWriter.m14476k(parcel, 5, getServiceRequest.f17737l, false);
        SafeParcelWriter.m14489x(parcel, 6, getServiceRequest.f17738m, i2, false);
        SafeParcelWriter.m14470e(parcel, 7, getServiceRequest.f17739n, false);
        SafeParcelWriter.m14484s(parcel, 8, getServiceRequest.f17740o, i2, false);
        SafeParcelWriter.m14489x(parcel, 10, getServiceRequest.f17741p, i2, false);
        SafeParcelWriter.m14489x(parcel, 11, getServiceRequest.f17742q, i2, false);
        SafeParcelWriter.m14468c(parcel, 12, getServiceRequest.f17743r);
        SafeParcelWriter.m14477l(parcel, 13, getServiceRequest.f17744s);
        SafeParcelWriter.m14468c(parcel, 14, getServiceRequest.f17745t);
        SafeParcelWriter.m14486u(parcel, 15, getServiceRequest.m14325y(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Scope[] scopeArr = GetServiceRequest.f17731f;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f17732g;
        Feature[] featureArr2 = featureArr;
        String strM14452p = null;
        IBinder iBinderM14426D = null;
        Account account = null;
        String strM14452p2 = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        int iM14427E3 = 0;
        boolean zM14459w = false;
        int iM14427E4 = 0;
        boolean zM14459w2 = false;
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
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 4:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    iBinderM14426D = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m14455s(parcel, iM14425C, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m14451o(parcel, iM14425C, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m14455s(parcel, iM14425C, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m14455s(parcel, iM14425C, Feature.CREATOR);
                    break;
                case 12:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 13:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 14:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 15:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new GetServiceRequest(iM14427E, iM14427E2, iM14427E3, strM14452p, iBinderM14426D, scopeArr, bundle, account, featureArr, featureArr2, zM14459w, iM14427E4, zM14459w2, strM14452p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
