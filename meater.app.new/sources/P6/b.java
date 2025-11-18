package P6;

import f9.InterfaceC3350d;

/* compiled from: GlobalMetrics.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f14100b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f14101a;

    /* compiled from: GlobalMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f14102a = null;

        a() {
        }

        public b a() {
            return new b(this.f14102a);
        }

        public a b(e eVar) {
            this.f14102a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f14101a = eVar;
    }

    public static a b() {
        return new a();
    }

    @InterfaceC3350d(tag = 1)
    public e a() {
        return this.f14101a;
    }
}
