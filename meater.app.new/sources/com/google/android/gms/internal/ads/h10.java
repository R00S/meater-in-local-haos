package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class h10 implements zzlx {

    /* renamed from: b */
    private int f19025b = -1;

    /* renamed from: c */
    private int f19026c = -1;

    /* renamed from: d */
    private int f19027d = 0;

    /* renamed from: e */
    private ByteBuffer f19028e;

    /* renamed from: f */
    private ByteBuffer f19029f;

    /* renamed from: g */
    private boolean f19030g;

    public h10() {
        ByteBuffer byteBuffer = zzlx.f26522a;
        this.f19028e = byteBuffer;
        this.f19029f = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: C */
    public final boolean mo15087C() {
        return this.f19030g && this.f19029f == zzlx.f26522a;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: a */
    public final void mo15088a() {
        flush();
        this.f19028e = zzlx.f26522a;
        this.f19025b = -1;
        this.f19026c = -1;
        this.f19027d = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: b */
    public final boolean mo15089b() {
        int i2 = this.f19027d;
        return (i2 == 0 || i2 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: c */
    public final void mo15090c() {
        this.f19030g = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: d */
    public final ByteBuffer mo15091d() {
        ByteBuffer byteBuffer = this.f19029f;
        this.f19029f = zzlx.f26522a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: e */
    public final int mo15092e() {
        return this.f19026c;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: f */
    public final int mo15093f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void flush() {
        this.f19029f = zzlx.f26522a;
        this.f19030g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: g */
    public final boolean mo15094g(int i2, int i3, int i4) throws zzly {
        if (i4 != 3 && i4 != 2 && i4 != Integer.MIN_VALUE && i4 != 1073741824) {
            throw new zzly(i2, i3, i4);
        }
        if (this.f19025b == i2 && this.f19026c == i3 && this.f19027d == i4) {
            return false;
        }
        this.f19025b = i2;
        this.f19026c = i3;
        this.f19027d = i4;
        if (i4 != 2) {
            return true;
        }
        this.f19028e = zzlx.f26522a;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[ADDED_TO_REGION, LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0
      0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzlx
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15095h(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f19027d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 << 1
        L23:
            java.nio.ByteBuffer r3 = r7.f19028e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f19028e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f19028e
            r2.clear()
        L3f:
            int r2 = r7.f19027d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f19028e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f19028e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f19028e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f19028e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f19028e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f19028e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f19028e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f19028e
            r7.f19029f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h10.mo15095h(java.nio.ByteBuffer):void");
    }
}
