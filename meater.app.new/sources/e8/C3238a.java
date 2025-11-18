package e8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3238a implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f40758B;

    /* renamed from: C, reason: collision with root package name */
    private final String f40759C = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected C3238a(IBinder iBinder, String str) {
        this.f40758B = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f40758B;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f40759C);
        return parcelObtain;
    }

    protected final void g(int i10, Parcel parcel) {
        try {
            this.f40758B.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
