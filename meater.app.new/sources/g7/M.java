package g7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class M extends AbstractC3492a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: B, reason: collision with root package name */
    final int f41956B;

    /* renamed from: C, reason: collision with root package name */
    private final Account f41957C;

    /* renamed from: D, reason: collision with root package name */
    private final int f41958D;

    /* renamed from: E, reason: collision with root package name */
    private final GoogleSignInAccount f41959E;

    M(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f41956B = i10;
        this.f41957C = account;
        this.f41958D = i11;
        this.f41959E = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f41956B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.p(parcel, 2, this.f41957C, i10, false);
        C3493b.k(parcel, 3, this.f41958D);
        C3493b.p(parcel, 4, this.f41959E, i10, false);
        C3493b.b(parcel, iA);
    }

    public M(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
