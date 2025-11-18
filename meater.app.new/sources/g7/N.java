package g7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Account account = null;
        int iT = 0;
        int iT2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                account = (Account) SafeParcelReader.e(parcel, iR, Account.CREATOR);
            } else if (iL == 3) {
                iT2 = SafeParcelReader.t(parcel, iR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, iR, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new M(iT, account, iT2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new M[i10];
    }
}
