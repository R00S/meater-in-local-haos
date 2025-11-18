package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9801m;

/* compiled from: ProgressNoopOutputStream.kt */
/* renamed from: com.facebook.j0 */
/* loaded from: classes.dex */
public final class C5742j0 extends OutputStream implements InterfaceC5746l0 {

    /* renamed from: f */
    private final Handler f14653f;

    /* renamed from: g */
    private final Map<GraphRequest, C5808m0> f14654g = new HashMap();

    /* renamed from: h */
    private GraphRequest f14655h;

    /* renamed from: i */
    private C5808m0 f14656i;

    /* renamed from: j */
    private int f14657j;

    public C5742j0(Handler handler) {
        this.f14653f = handler;
    }

    @Override // com.facebook.InterfaceC5746l0
    /* renamed from: a */
    public void mo11832a(GraphRequest graphRequest) {
        this.f14655h = graphRequest;
        this.f14656i = graphRequest != null ? this.f14654g.get(graphRequest) : null;
    }

    /* renamed from: b */
    public final void m11833b(long j2) {
        GraphRequest graphRequest = this.f14655h;
        if (graphRequest == null) {
            return;
        }
        if (this.f14656i == null) {
            C5808m0 c5808m0 = new C5808m0(this.f14653f, graphRequest);
            this.f14656i = c5808m0;
            this.f14654g.put(graphRequest, c5808m0);
        }
        C5808m0 c5808m02 = this.f14656i;
        if (c5808m02 != null) {
            c5808m02.m12136b(j2);
        }
        this.f14657j += (int) j2;
    }

    /* renamed from: c */
    public final int m11834c() {
        return this.f14657j;
    }

    /* renamed from: d */
    public final Map<GraphRequest, C5808m0> m11835d() {
        return this.f14654g;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        C9801m.m32346f(bArr, "buffer");
        m11833b(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        C9801m.m32346f(bArr, "buffer");
        m11833b(i3);
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        m11833b(1L);
    }
}
