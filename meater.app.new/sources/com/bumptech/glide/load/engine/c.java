package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;
import m6.EnumC3966a;
import m6.InterfaceC3970e;
import s6.o;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes2.dex */
class c implements f, d.a<Object> {

    /* renamed from: B, reason: collision with root package name */
    private final List<InterfaceC3970e> f33081B;

    /* renamed from: C, reason: collision with root package name */
    private final g<?> f33082C;

    /* renamed from: D, reason: collision with root package name */
    private final f.a f33083D;

    /* renamed from: E, reason: collision with root package name */
    private int f33084E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC3970e f33085F;

    /* renamed from: G, reason: collision with root package name */
    private List<s6.o<File, ?>> f33086G;

    /* renamed from: H, reason: collision with root package name */
    private int f33087H;

    /* renamed from: I, reason: collision with root package name */
    private volatile o.a<?> f33088I;

    /* renamed from: J, reason: collision with root package name */
    private File f33089J;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f33087H < this.f33086G.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (b() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f33086G;
        r3 = r7.f33087H;
        r7.f33087H = r3 + 1;
        r7.f33088I = r0.get(r3).b(r7.f33089J, r7.f33082C.t(), r7.f33082C.f(), r7.f33082C.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f33088I == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f33082C.u(r7.f33088I.f49349c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f33088I.f49349c.e(r7.f33082C.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f33088I = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            I6.b.a(r0)
        L5:
            java.util.List<s6.o<java.io.File, ?>> r0 = r7.f33086G     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f33088I = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<s6.o<java.io.File, ?>> r0 = r7.f33086G     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f33087H     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f33087H = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            s6.o r0 = (s6.o) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f33089J     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r4 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r5 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r6 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            m6.g r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            s6.o$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f33088I = r0     // Catch: java.lang.Throwable -> L68
            s6.o$a<?> r0 = r7.f33088I     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.g<?> r0 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            s6.o$a<?> r3 = r7.f33088I     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r3 = r3.f49349c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            s6.o$a<?> r0 = r7.f33088I     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r0 = r0.f49349c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r2 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            I6.b.e()
            return r2
        L6e:
            int r0 = r7.f33084E     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f33084E = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<m6.e> r1 = r7.f33081B     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            I6.b.e()
            return r2
        L7f:
            java.util.List<m6.e> r0 = r7.f33081B     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f33084E     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            m6.e r0 = (m6.InterfaceC3970e) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            m6.e r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            q6.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f33089J = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f33085F = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r0 = r7.f33082C     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f33086G = r0     // Catch: java.lang.Throwable -> L68
            r7.f33087H = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            I6.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.c.a():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f33083D.n(this.f33085F, exc, this.f33088I.f49349c, EnumC3966a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f33088I;
        if (aVar != null) {
            aVar.f49349c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f33083D.c(this.f33085F, obj, this.f33088I.f49349c, EnumC3966a.DATA_DISK_CACHE, this.f33085F);
    }

    c(List<InterfaceC3970e> list, g<?> gVar, f.a aVar) {
        this.f33084E = -1;
        this.f33081B = list;
        this.f33082C = gVar;
        this.f33083D = aVar;
    }
}
