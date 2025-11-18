package g7;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2335d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class k0 implements Parcelable.Creator {
    static void a(C3436g c3436g, Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, c3436g.f42038B);
        C3493b.k(parcel, 2, c3436g.f42039C);
        C3493b.k(parcel, 3, c3436g.f42040D);
        C3493b.q(parcel, 4, c3436g.f42041E, false);
        C3493b.j(parcel, 5, c3436g.f42042F, false);
        C3493b.t(parcel, 6, c3436g.f42043G, i10, false);
        C3493b.e(parcel, 7, c3436g.f42044H, false);
        C3493b.p(parcel, 8, c3436g.f42045I, i10, false);
        C3493b.t(parcel, 10, c3436g.f42046J, i10, false);
        C3493b.t(parcel, 11, c3436g.f42047K, i10, false);
        C3493b.c(parcel, 12, c3436g.f42048L);
        C3493b.k(parcel, 13, c3436g.f42049M);
        C3493b.c(parcel, 14, c3436g.f42050N);
        C3493b.q(parcel, 15, c3436g.f0(), false);
        C3493b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Scope[] scopeArr = C3436g.f42036P;
        Bundle bundle = new Bundle();
        C2335d[] c2335dArr = C3436g.f42037Q;
        C2335d[] c2335dArr2 = c2335dArr;
        String strF = null;
        IBinder iBinderS = null;
        Account account = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        boolean zM = false;
        int iT4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 2:
                    iT2 = SafeParcelReader.t(parcel, iR);
                    break;
                case 3:
                    iT3 = SafeParcelReader.t(parcel, iR);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    iBinderS = SafeParcelReader.s(parcel, iR);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, iR, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, iR);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.e(parcel, iR, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    c2335dArr = (C2335d[]) SafeParcelReader.i(parcel, iR, C2335d.CREATOR);
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    c2335dArr2 = (C2335d[]) SafeParcelReader.i(parcel, iR, C2335d.CREATOR);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    iT4 = SafeParcelReader.t(parcel, iR);
                    break;
                case 14:
                    zM2 = SafeParcelReader.m(parcel, iR);
                    break;
                case 15:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C3436g(iT, iT2, iT3, strF, iBinderS, scopeArr, bundle, account, c2335dArr, c2335dArr2, zM, iT4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3436g[i10];
    }
}
