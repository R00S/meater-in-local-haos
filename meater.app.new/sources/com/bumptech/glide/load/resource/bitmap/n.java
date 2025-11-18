package com.bumptech.glide.load.resource.bitmap;

import m6.C3971f;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f33328a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final n f33329b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final n f33330c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final n f33331d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final n f33332e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f33333f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f33334g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3971f<n> f33335h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f33336i;

    /* compiled from: DownsampleStrategy.java */
    private static class a extends n {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class b extends n {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class c extends n {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : n.f33330c.a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, n.f33330c.b(i10, i11, i12, i13));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class d extends n {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class e extends n {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i10, int i11, int i12, int i13) {
            return n.f33336i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i10, int i11, int i12, int i13) {
            if (n.f33336i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class f extends n {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f33332e = dVar;
        f33333f = new f();
        f33334g = dVar;
        f33335h = C3971f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f33336i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
