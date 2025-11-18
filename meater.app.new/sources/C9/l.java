package C9;

import com.google.protobuf.C2964y;

/* compiled from: SessionVerbosity.java */
/* loaded from: classes2.dex */
public enum l implements C2964y.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* renamed from: E, reason: collision with root package name */
    private static final C2964y.d<l> f3172E = new C2964y.d<l>() { // from class: C9.l.a
        @Override // com.google.protobuf.C2964y.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.j(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f3174B;

    /* compiled from: SessionVerbosity.java */
    private static final class b implements C2964y.e {

        /* renamed from: a, reason: collision with root package name */
        static final C2964y.e f3175a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C2964y.e
        public boolean a(int i10) {
            return l.j(i10) != null;
        }
    }

    l(int i10) {
        this.f3174B = i10;
    }

    public static l j(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static C2964y.e n() {
        return b.f3175a;
    }

    @Override // com.google.protobuf.C2964y.c
    public final int e() {
        return this.f3174B;
    }
}
