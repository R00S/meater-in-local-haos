package com.facebook;

import android.os.Handler;
import com.facebook.C5646c0;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9801m;

/* compiled from: ProgressOutputStream.kt */
/* renamed from: com.facebook.k0 */
/* loaded from: classes.dex */
public final class C5744k0 extends FilterOutputStream implements InterfaceC5746l0 {

    /* renamed from: f */
    private final C5646c0 f14660f;

    /* renamed from: g */
    private final Map<GraphRequest, C5808m0> f14661g;

    /* renamed from: h */
    private final long f14662h;

    /* renamed from: i */
    private final long f14663i;

    /* renamed from: j */
    private long f14664j;

    /* renamed from: k */
    private long f14665k;

    /* renamed from: l */
    private C5808m0 f14666l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5744k0(OutputStream outputStream, C5646c0 c5646c0, Map<GraphRequest, C5808m0> map, long j2) {
        super(outputStream);
        C9801m.m32346f(outputStream, "out");
        C9801m.m32346f(c5646c0, "requests");
        C9801m.m32346f(map, "progressMap");
        this.f14660f = c5646c0;
        this.f14661g = map;
        this.f14662h = j2;
        C5641a0 c5641a0 = C5641a0.f14199a;
        this.f14663i = C5641a0.m11299r();
    }

    /* renamed from: b */
    private final void m11836b(long j2) {
        C5808m0 c5808m0 = this.f14666l;
        if (c5808m0 != null) {
            c5808m0.m12135a(j2);
        }
        long j3 = this.f14664j + j2;
        this.f14664j = j3;
        if (j3 >= this.f14665k + this.f14663i || j3 >= this.f14662h) {
            m11838f();
        }
    }

    /* renamed from: f */
    private final void m11838f() {
        if (this.f14664j > this.f14665k) {
            for (final C5646c0.a aVar : this.f14660f.m11330u()) {
                if (aVar instanceof C5646c0.c) {
                    Handler handlerM11329t = this.f14660f.m11329t();
                    if ((handlerM11329t == null ? null : Boolean.valueOf(handlerM11329t.post(new Runnable() { // from class: com.facebook.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5744k0.m11839j(aVar, this);
                        }
                    }))) == null) {
                        ((C5646c0.c) aVar).m11336b(this.f14660f, this.f14664j, this.f14662h);
                    }
                }
            }
            this.f14665k = this.f14664j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m11839j(C5646c0.a aVar, C5744k0 c5744k0) {
        C9801m.m32346f(aVar, "$callback");
        C9801m.m32346f(c5744k0, "this$0");
        ((C5646c0.c) aVar).m11336b(c5744k0.f14660f, c5744k0.m11840c(), c5744k0.m11841d());
    }

    @Override // com.facebook.InterfaceC5746l0
    /* renamed from: a */
    public void mo11832a(GraphRequest graphRequest) {
        this.f14666l = graphRequest != null ? this.f14661g.get(graphRequest) : null;
    }

    /* renamed from: c */
    public final long m11840c() {
        return this.f14664j;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<C5808m0> it = this.f14661g.values().iterator();
        while (it.hasNext()) {
            it.next().m12137d();
        }
        m11838f();
    }

    /* renamed from: d */
    public final long m11841d() {
        return this.f14662h;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        C9801m.m32346f(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        m11836b(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        C9801m.m32346f(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
        m11836b(i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        m11836b(1L);
    }
}
