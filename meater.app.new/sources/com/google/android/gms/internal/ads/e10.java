package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class e10 implements zzlx {

    /* renamed from: b */
    private int f18712b;

    /* renamed from: c */
    private int f18713c;

    /* renamed from: d */
    private int[] f18714d;

    /* renamed from: e */
    private boolean f18715e;

    /* renamed from: f */
    private int[] f18716f;

    /* renamed from: g */
    private ByteBuffer f18717g;

    /* renamed from: h */
    private ByteBuffer f18718h;

    /* renamed from: i */
    private boolean f18719i;

    public e10() {
        ByteBuffer byteBuffer = zzlx.f26522a;
        this.f18717g = byteBuffer;
        this.f18718h = byteBuffer;
        this.f18712b = -1;
        this.f18713c = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: C */
    public final boolean mo15087C() {
        return this.f18719i && this.f18718h == zzlx.f26522a;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: a */
    public final void mo15088a() {
        flush();
        this.f18717g = zzlx.f26522a;
        this.f18712b = -1;
        this.f18713c = -1;
        this.f18716f = null;
        this.f18715e = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: b */
    public final boolean mo15089b() {
        return this.f18715e;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: c */
    public final void mo15090c() {
        this.f18719i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: d */
    public final ByteBuffer mo15091d() {
        ByteBuffer byteBuffer = this.f18718h;
        this.f18718h = zzlx.f26522a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: e */
    public final int mo15092e() {
        int[] iArr = this.f18716f;
        return iArr == null ? this.f18712b : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: f */
    public final int mo15093f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void flush() {
        this.f18718h = zzlx.f26522a;
        this.f18719i = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: g */
    public final boolean mo15094g(int i2, int i3, int i4) throws zzly {
        boolean z = !Arrays.equals(this.f18714d, this.f18716f);
        int[] iArr = this.f18714d;
        this.f18716f = iArr;
        if (iArr == null) {
            this.f18715e = false;
            return z;
        }
        if (i4 != 2) {
            throw new zzly(i2, i3, i4);
        }
        if (!z && this.f18713c == i2 && this.f18712b == i3) {
            return false;
        }
        this.f18713c = i2;
        this.f18712b = i3;
        this.f18715e = i3 != iArr.length;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f18716f;
            if (i5 >= iArr2.length) {
                return true;
            }
            int i6 = iArr2[i5];
            if (i6 >= i3) {
                throw new zzly(i2, i3, i4);
            }
            this.f18715e = (i6 != i5) | this.f18715e;
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: h */
    public final void mo15095h(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = (((iLimit - iPosition) / (this.f18712b * 2)) * this.f18716f.length) << 1;
        if (this.f18717g.capacity() < length) {
            this.f18717g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f18717g.clear();
        }
        while (iPosition < iLimit) {
            for (int i2 : this.f18716f) {
                this.f18717g.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f18712b << 1;
        }
        byteBuffer.position(iLimit);
        this.f18717g.flip();
        this.f18718h = this.f18717g;
    }

    /* renamed from: i */
    public final void m15096i(int[] iArr) {
        this.f18714d = iArr;
    }
}
