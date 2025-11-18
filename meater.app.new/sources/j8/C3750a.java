package j8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* renamed from: j8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3750a implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f43537B;

    /* renamed from: C, reason: collision with root package name */
    private final String f43538C = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected C3750a(IBinder iBinder, String str) {
        this.f43537B = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f43537B;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f43538C);
        return parcelObtain;
    }

    protected final void g(int i10, Parcel parcel) {
        try {
            this.f43537B.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
