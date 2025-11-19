package U1;

import android.media.AudioAttributes;

/* compiled from: AudioAttributes.java */
/* renamed from: U1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727c {

    /* renamed from: g, reason: collision with root package name */
    public static final C1727c f17026g = new e().a();

    /* renamed from: h, reason: collision with root package name */
    private static final String f17027h = X1.L.B0(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f17028i = X1.L.B0(1);

    /* renamed from: j, reason: collision with root package name */
    private static final String f17029j = X1.L.B0(2);

    /* renamed from: k, reason: collision with root package name */
    private static final String f17030k = X1.L.B0(3);

    /* renamed from: l, reason: collision with root package name */
    private static final String f17031l = X1.L.B0(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f17032a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17034c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17035d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17036e;

    /* renamed from: f, reason: collision with root package name */
    private d f17037f;

    /* compiled from: AudioAttributes.java */
    /* renamed from: U1.c$b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: U1.c$c, reason: collision with other inner class name */
    private static final class C0257c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: U1.c$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f17038a;

        private d(C1727c c1727c) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1727c.f17032a).setFlags(c1727c.f17033b).setUsage(c1727c.f17034c);
            int i10 = X1.L.f18626a;
            if (i10 >= 29) {
                b.a(usage, c1727c.f17035d);
            }
            if (i10 >= 32) {
                C0257c.a(usage, c1727c.f17036e);
            }
            this.f17038a = usage.build();
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: U1.c$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f17039a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f17040b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f17041c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f17042d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f17043e = 0;

        public C1727c a() {
            return new C1727c(this.f17039a, this.f17040b, this.f17041c, this.f17042d, this.f17043e);
        }
    }

    public d a() {
        if (this.f17037f == null) {
            this.f17037f = new d();
        }
        return this.f17037f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1727c.class != obj.getClass()) {
            return false;
        }
        C1727c c1727c = (C1727c) obj;
        return this.f17032a == c1727c.f17032a && this.f17033b == c1727c.f17033b && this.f17034c == c1727c.f17034c && this.f17035d == c1727c.f17035d && this.f17036e == c1727c.f17036e;
    }

    public int hashCode() {
        return ((((((((527 + this.f17032a) * 31) + this.f17033b) * 31) + this.f17034c) * 31) + this.f17035d) * 31) + this.f17036e;
    }

    private C1727c(int i10, int i11, int i12, int i13, int i14) {
        this.f17032a = i10;
        this.f17033b = i11;
        this.f17034c = i12;
        this.f17035d = i13;
        this.f17036e = i14;
    }
}
