package androidx.media3.exoplayer.mediacodec;

import U1.z;
import X1.L;
import android.content.Context;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.mediacodec.p;

/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes.dex */
public final class g implements h.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27385a;

    /* renamed from: b, reason: collision with root package name */
    private int f27386b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27387c = false;

    public g(Context context) {
        this.f27385a = context;
    }

    private boolean b() {
        int i10 = L.f18626a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f27385a;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.h.b
    public h a(h.a aVar) {
        int i10;
        if (L.f18626a < 23 || !((i10 = this.f27386b) == 1 || (i10 == 0 && b()))) {
            return new p.b().a(aVar);
        }
        int iK = z.k(aVar.f27390c.f17162o);
        X1.n.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + L.s0(iK));
        b.C0379b c0379b = new b.C0379b(iK);
        c0379b.e(this.f27387c);
        return c0379b.a(aVar);
    }
}
