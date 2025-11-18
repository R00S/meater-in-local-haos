package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.i */
/* loaded from: classes2.dex */
abstract class AbstractBinderC6416i extends AbstractBinderC6414g {

    /* renamed from: g */
    private static final WeakReference f17677g = new WeakReference(null);

    /* renamed from: h */
    private WeakReference f17678h;

    AbstractBinderC6416i(byte[] bArr) {
        super(bArr);
        this.f17678h = f17677g;
    }

    @Override // com.google.android.gms.common.AbstractBinderC6414g
    /* renamed from: E0 */
    final byte[] mo14275E0() {
        byte[] bArrMo14257E3;
        synchronized (this) {
            bArrMo14257E3 = (byte[]) this.f17678h.get();
            if (bArrMo14257E3 == null) {
                bArrMo14257E3 = mo14257E3();
                this.f17678h = new WeakReference(bArrMo14257E3);
            }
        }
        return bArrMo14257E3;
    }

    /* renamed from: E3 */
    protected abstract byte[] mo14257E3();
}
