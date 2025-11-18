package q2;

import U1.G;
import U1.H;
import androidx.media3.exoplayer.source.r;
import java.util.List;
import o2.AbstractC4103e;

/* compiled from: ExoTrackSelection.java */
/* loaded from: classes.dex */
public interface x extends InterfaceC4268A {

    /* compiled from: ExoTrackSelection.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final H f47981a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f47982b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47983c;

        public a(H h10, int... iArr) {
            this(h10, iArr, 0);
        }

        public a(H h10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                X1.n.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f47981a = h10;
            this.f47982b = iArr;
            this.f47983c = i10;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    public interface b {
        x[] a(a[] aVarArr, r2.d dVar, r.b bVar, G g10);
    }

    boolean a(int i10, long j10);

    int c();

    void d(long j10, long j11, long j12, List<? extends o2.l> list, o2.m[] mVarArr);

    void g();

    void h();

    int j(long j10, List<? extends o2.l> list);

    default boolean k(long j10, AbstractC4103e abstractC4103e, List<? extends o2.l> list) {
        return false;
    }

    int m();

    U1.s n();

    int o();

    boolean p(int i10, long j10);

    void q(float f10);

    Object r();

    default void s() {
    }

    default void t() {
    }

    default void e(boolean z10) {
    }
}
