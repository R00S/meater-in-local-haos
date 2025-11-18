package p241e.p254e.p256b.p257a.p258i.p266y.p267a;

import com.google.firebase.encoders.p194i.InterfaceC8344f;

/* compiled from: TimeWindow.java */
/* renamed from: e.e.b.a.i.y.a.f */
/* loaded from: classes2.dex */
public final class C8890f {

    /* renamed from: a */
    private static final C8890f f33668a = new a().m28226a();

    /* renamed from: b */
    private final long f33669b;

    /* renamed from: c */
    private final long f33670c;

    /* compiled from: TimeWindow.java */
    /* renamed from: e.e.b.a.i.y.a.f$a */
    public static final class a {

        /* renamed from: a */
        private long f33671a = 0;

        /* renamed from: b */
        private long f33672b = 0;

        a() {
        }

        /* renamed from: a */
        public C8890f m28226a() {
            return new C8890f(this.f33671a, this.f33672b);
        }

        /* renamed from: b */
        public a m28227b(long j2) {
            this.f33672b = j2;
            return this;
        }

        /* renamed from: c */
        public a m28228c(long j2) {
            this.f33671a = j2;
            return this;
        }
    }

    C8890f(long j2, long j3) {
        this.f33669b = j2;
        this.f33670c = j3;
    }

    /* renamed from: c */
    public static a m28223c() {
        return new a();
    }

    @InterfaceC8344f(tag = 2)
    /* renamed from: a */
    public long m28224a() {
        return this.f33670c;
    }

    @InterfaceC8344f(tag = 1)
    /* renamed from: b */
    public long m28225b() {
        return this.f33669b;
    }
}
