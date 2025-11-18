package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public final class zzmx implements zzlx {

    /* renamed from: d */
    private i10 f26597d;

    /* renamed from: g */
    private ByteBuffer f26600g;

    /* renamed from: h */
    private ShortBuffer f26601h;

    /* renamed from: i */
    private ByteBuffer f26602i;

    /* renamed from: j */
    private long f26603j;

    /* renamed from: k */
    private long f26604k;

    /* renamed from: l */
    private boolean f26605l;

    /* renamed from: e */
    private float f26598e = 1.0f;

    /* renamed from: f */
    private float f26599f = 1.0f;

    /* renamed from: b */
    private int f26595b = -1;

    /* renamed from: c */
    private int f26596c = -1;

    public zzmx() {
        ByteBuffer byteBuffer = zzlx.f26522a;
        this.f26600g = byteBuffer;
        this.f26601h = byteBuffer.asShortBuffer();
        this.f26602i = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: C */
    public final boolean mo15087C() {
        if (!this.f26605l) {
            return false;
        }
        i10 i10Var = this.f26597d;
        return i10Var == null || i10Var.m15331l() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: a */
    public final void mo15088a() {
        this.f26597d = null;
        ByteBuffer byteBuffer = zzlx.f26522a;
        this.f26600g = byteBuffer;
        this.f26601h = byteBuffer.asShortBuffer();
        this.f26602i = byteBuffer;
        this.f26595b = -1;
        this.f26596c = -1;
        this.f26603j = 0L;
        this.f26604k = 0L;
        this.f26605l = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: b */
    public final boolean mo15089b() {
        return Math.abs(this.f26598e - 1.0f) >= 0.01f || Math.abs(this.f26599f - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: c */
    public final void mo15090c() {
        this.f26597d.m15330k();
        this.f26605l = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: d */
    public final ByteBuffer mo15091d() {
        ByteBuffer byteBuffer = this.f26602i;
        this.f26602i = zzlx.f26522a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: e */
    public final int mo15092e() {
        return this.f26595b;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: f */
    public final int mo15093f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void flush() {
        i10 i10Var = new i10(this.f26596c, this.f26595b);
        this.f26597d = i10Var;
        i10Var.m15326a(this.f26598e);
        this.f26597d.m15327c(this.f26599f);
        this.f26602i = zzlx.f26522a;
        this.f26603j = 0L;
        this.f26604k = 0L;
        this.f26605l = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: g */
    public final boolean mo15094g(int i2, int i3, int i4) throws zzly {
        if (i4 != 2) {
            throw new zzly(i2, i3, i4);
        }
        if (this.f26596c == i2 && this.f26595b == i3) {
            return false;
        }
        this.f26596c = i2;
        this.f26595b = i3;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: h */
    public final void mo15095h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f26603j += iRemaining;
            this.f26597d.m15328e(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iM15331l = (this.f26597d.m15331l() * this.f26595b) << 1;
        if (iM15331l > 0) {
            if (this.f26600g.capacity() < iM15331l) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM15331l).order(ByteOrder.nativeOrder());
                this.f26600g = byteBufferOrder;
                this.f26601h = byteBufferOrder.asShortBuffer();
            } else {
                this.f26600g.clear();
                this.f26601h.clear();
            }
            this.f26597d.m15329i(this.f26601h);
            this.f26604k += iM15331l;
            this.f26600g.limit(iM15331l);
            this.f26602i = this.f26600g;
        }
    }

    /* renamed from: i */
    public final float m20288i(float f2) {
        float fM20537a = zzsy.m20537a(f2, 0.1f, 8.0f);
        this.f26598e = fM20537a;
        return fM20537a;
    }

    /* renamed from: j */
    public final float m20289j(float f2) {
        this.f26599f = zzsy.m20537a(f2, 0.1f, 8.0f);
        return f2;
    }

    /* renamed from: k */
    public final long m20290k() {
        return this.f26603j;
    }

    /* renamed from: l */
    public final long m20291l() {
        return this.f26604k;
    }
}
