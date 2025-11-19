package Y8;

/* compiled from: Settings.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f19462a;

    /* renamed from: b, reason: collision with root package name */
    public final a f19463b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19465d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19466e;

    /* renamed from: f, reason: collision with root package name */
    public final double f19467f;

    /* renamed from: g, reason: collision with root package name */
    public final double f19468g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19469h;

    /* compiled from: Settings.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19470a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19471b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19472c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f19470a = z10;
            this.f19471b = z11;
            this.f19472c = z12;
        }
    }

    /* compiled from: Settings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19473a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19474b;

        public b(int i10, int i11) {
            this.f19473a = i10;
            this.f19474b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f19464c = j10;
        this.f19462a = bVar;
        this.f19463b = aVar;
        this.f19465d = i10;
        this.f19466e = i11;
        this.f19467f = d10;
        this.f19468g = d11;
        this.f19469h = i12;
    }

    public boolean a(long j10) {
        return this.f19464c < j10;
    }
}
