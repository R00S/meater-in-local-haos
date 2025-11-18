package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.z3 */
/* loaded from: classes2.dex */
final class RunnableC7399z3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bitmap f21357f;

    /* renamed from: g */
    private final /* synthetic */ zzauq f21358g;

    RunnableC7399z3(zzauq zzauqVar, Bitmap bitmap) {
        this.f21358g = zzauqVar;
        this.f21357f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f21357f.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f21358g.f22539l) {
            this.f21358g.f22530c.f25904k = new zzdso();
            this.f21358g.f22530c.f25904k.f25925e = byteArrayOutputStream.toByteArray();
            this.f21358g.f22530c.f25904k.f25924d = "image/png";
            this.f21358g.f22530c.f25904k.f25923c = 1;
        }
    }
}
