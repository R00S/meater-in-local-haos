package androidx.recyclerview.widget;

import s.C4411v;

/* compiled from: StableIdStorage.java */
/* loaded from: classes.dex */
interface w {

    /* compiled from: StableIdStorage.java */
    public static class a implements w {

        /* renamed from: a, reason: collision with root package name */
        long f29024a = 0;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.w$a$a, reason: collision with other inner class name */
        class C0393a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final C4411v<Long> f29025a = new C4411v<>();

            C0393a() {
            }

            @Override // androidx.recyclerview.widget.w.d
            public long a(long j10) {
                Long lF = this.f29025a.f(j10);
                if (lF == null) {
                    lF = Long.valueOf(a.this.b());
                    this.f29025a.k(j10, lF);
                }
                return lF.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.w
        public d a() {
            return new C0393a();
        }

        long b() {
            long j10 = this.f29024a;
            this.f29024a = 1 + j10;
            return j10;
        }
    }

    /* compiled from: StableIdStorage.java */
    public static class b implements w {

        /* renamed from: a, reason: collision with root package name */
        private final d f29027a = new a();

        /* compiled from: StableIdStorage.java */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.w.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.w
        public d a() {
            return this.f29027a;
        }
    }

    /* compiled from: StableIdStorage.java */
    public interface d {
        long a(long j10);
    }

    d a();

    /* compiled from: StableIdStorage.java */
    public static class c implements w {

        /* renamed from: a, reason: collision with root package name */
        private final d f29029a = new a();

        @Override // androidx.recyclerview.widget.w
        public d a() {
            return this.f29029a;
        }

        /* compiled from: StableIdStorage.java */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.w.d
            public long a(long j10) {
                return j10;
            }
        }
    }
}
