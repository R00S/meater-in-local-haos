package S2;

import X1.InterfaceC1811h;
import java.util.Objects;
import m8.AbstractC4009y;

/* compiled from: SubtitleParser.java */
/* loaded from: classes.dex */
public interface r {

    /* compiled from: SubtitleParser.java */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15292a = new C0224a();

        /* compiled from: SubtitleParser.java */
        /* renamed from: S2.r$a$a, reason: collision with other inner class name */
        class C0224a implements a {
            C0224a() {
            }

            @Override // S2.r.a
            public boolean a(U1.s sVar) {
                return false;
            }

            @Override // S2.r.a
            public r b(U1.s sVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // S2.r.a
            public int c(U1.s sVar) {
                return 1;
            }
        }

        boolean a(U1.s sVar);

        r b(U1.s sVar);

        int c(U1.s sVar);
    }

    /* compiled from: SubtitleParser.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final b f15293c = new b(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f15294a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15295b;

        private b(long j10, boolean z10) {
            this.f15294a = j10;
            this.f15295b = z10;
        }

        public static b b() {
            return f15293c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    default k a(byte[] bArr, int i10, int i11) {
        final AbstractC4009y.a aVarY = AbstractC4009y.y();
        b bVar = b.f15293c;
        Objects.requireNonNull(aVarY);
        c(bArr, i10, i11, bVar, new InterfaceC1811h() { // from class: S2.q
            @Override // X1.InterfaceC1811h
            public final void accept(Object obj) {
                aVarY.a((e) obj);
            }
        });
        return new g(aVarY.k());
    }

    void c(byte[] bArr, int i10, int i11, b bVar, InterfaceC1811h<e> interfaceC1811h);

    int d();

    default void b() {
    }
}
