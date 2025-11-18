package C9;

import com.google.protobuf.C2964y;

/* compiled from: ApplicationProcessState.java */
/* loaded from: classes2.dex */
public enum d implements C2964y.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* renamed from: G, reason: collision with root package name */
    private static final C2964y.d<d> f3139G = new C2964y.d<d>() { // from class: C9.d.a
        @Override // com.google.protobuf.C2964y.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(int i10) {
            return d.j(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f3141B;

    /* compiled from: ApplicationProcessState.java */
    private static final class b implements C2964y.e {

        /* renamed from: a, reason: collision with root package name */
        static final C2964y.e f3142a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C2964y.e
        public boolean a(int i10) {
            return d.j(i10) != null;
        }
    }

    d(int i10) {
        this.f3141B = i10;
    }

    public static d j(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static C2964y.e n() {
        return b.f3142a;
    }

    @Override // com.google.protobuf.C2964y.c
    public final int e() {
        return this.f3141B;
    }
}
