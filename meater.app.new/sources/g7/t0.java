package g7;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import r7.C4356a;
import r7.C4359d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class t0 extends C4356a implements InterfaceC3439j {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // g7.InterfaceC3439j
    public final Account b() {
        Parcel parcelC = c(2, g());
        Account account = (Account) C4359d.a(parcelC, Account.CREATOR);
        parcelC.recycle();
        return account;
    }
}
