package com.bumptech.glide.load.p131o.p132c;

import com.bumptech.glide.load.C5425h;

/* compiled from: DownsampleStrategy.java */
/* renamed from: com.bumptech.glide.load.o.c.k */
/* loaded from: classes.dex */
public abstract class AbstractC5490k {

    /* renamed from: a */
    public static final AbstractC5490k f13727a = new e();

    /* renamed from: b */
    public static final AbstractC5490k f13728b;

    /* renamed from: c */
    public static final AbstractC5490k f13729c;

    /* renamed from: d */
    public static final AbstractC5490k f13730d;

    /* renamed from: e */
    public static final AbstractC5490k f13731e;

    /* renamed from: f */
    public static final AbstractC5490k f13732f;

    /* renamed from: g */
    public static final AbstractC5490k f13733g;

    /* renamed from: h */
    public static final C5425h<AbstractC5490k> f13734h;

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$a */
    private static class a extends AbstractC5490k {
        a() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: a */
        public g mo10628a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: b */
        public float mo10629b(int i2, int i3, int i4, int i5) {
            if (Math.min(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$b */
    private static class b extends AbstractC5490k {
        b() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: a */
        public g mo10628a(int i2, int i3, int i4, int i5) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: b */
        public float mo10629b(int i2, int i3, int i4, int i5) {
            int iCeil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$c */
    private static class c extends AbstractC5490k {
        c() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: a */
        public g mo10628a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: b */
        public float mo10629b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, AbstractC5490k.f13727a.mo10629b(i2, i3, i4, i5));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$d */
    private static class d extends AbstractC5490k {
        d() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: a */
        public g mo10628a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: b */
        public float mo10629b(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$e */
    private static class e extends AbstractC5490k {
        e() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: a */
        public g mo10628a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: b */
        public float mo10629b(int i2, int i3, int i4, int i5) {
            return Math.min(i4 / i2, i5 / i3);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$f */
    private static class f extends AbstractC5490k {
        f() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: a */
        public g mo10628a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5490k
        /* renamed from: b */
        public float mo10629b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.o.c.k$g */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f13728b = dVar;
        f13729c = new a();
        f13730d = new b();
        f13731e = new c();
        f13732f = new f();
        f13733g = dVar;
        f13734h = C5425h.m10444f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract g mo10628a(int i2, int i3, int i4, int i5);

    /* renamed from: b */
    public abstract float mo10629b(int i2, int i3, int i4, int i5);
}
