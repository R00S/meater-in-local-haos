package c7;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
abstract class w extends u {

    /* renamed from: D, reason: collision with root package name */
    private static final WeakReference f31104D = new WeakReference(null);

    /* renamed from: C, reason: collision with root package name */
    private WeakReference f31105C;

    w(byte[] bArr) {
        super(bArr);
        this.f31105C = f31104D;
    }

    @Override // c7.u
    final byte[] u1() {
        byte[] bArrV1;
        synchronized (this) {
            try {
                bArrV1 = (byte[]) this.f31105C.get();
                if (bArrV1 == null) {
                    bArrV1 = v1();
                    this.f31105C = new WeakReference(bArrV1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrV1;
    }

    protected abstract byte[] v1();
}
