package i0;

import h0.C3476g;
import h0.C3478i;
import h0.C3480k;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u00192\u00020\u0001:\u0002\u00192J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ!\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H&¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00101J\u001a\u00104\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020!H&¢\u0006\u0004\b6\u00107J*\u0010=\u001a\u00020<2\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>R\"\u0010D\u001a\u00020?8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010Fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0003"}, d2 = {"Li0/R0;", "", "", "x", "y", "Loa/F;", "p", "(FF)V", "dx", "dy", "g", "w", "u", "x1", "y1", "x2", "y2", "i", "(FFFF)V", "m", "dx1", "dy1", "dx2", "dy2", "j", "a", "x3", "y3", "q", "(FFFFFF)V", "dx3", "dy3", "h", "Lh0/i;", "rect", "Li0/R0$b;", "direction", "s", "(Lh0/i;Li0/R0$b;)V", "Lh0/k;", "roundRect", "e", "(Lh0/k;Li0/R0$b;)V", "path", "Lh0/g;", "offset", "d", "(Li0/R0;J)V", "close", "()V", "b", "r", "t", "(J)V", "getBounds", "()Lh0/i;", "path1", "path2", "Li0/V0;", "operation", "", "o", "(Li0/R0;Li0/R0;I)Z", "Li0/T0;", "n", "()I", "l", "(I)V", "fillType", "f", "()Z", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface R0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f42872a;

    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li0/R0$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.R0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42872a = new Companion();

        private Companion() {
        }
    }

    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Li0/R0$b;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        CounterClockwise,
        Clockwise
    }

    static /* synthetic */ void c(R0 r02, C3480k c3480k, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        r02.e(c3480k, bVar);
    }

    static /* synthetic */ void k(R0 r02, R0 r03, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = C3476g.INSTANCE.c();
        }
        r02.d(r03, j10);
    }

    static /* synthetic */ void v(R0 r02, C3478i c3478i, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        r02.s(c3478i, bVar);
    }

    default void a(float dx1, float dy1, float dx2, float dy2) {
        j(dx1, dy1, dx2, dy2);
    }

    void b();

    void close();

    void d(R0 path, long offset);

    void e(C3480k roundRect, b direction);

    boolean f();

    void g(float dx, float dy);

    C3478i getBounds();

    void h(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    @InterfaceC4156a
    void i(float x12, float y12, float x22, float y22);

    boolean isEmpty();

    @InterfaceC4156a
    void j(float dx1, float dy1, float dx2, float dy2);

    void l(int i10);

    default void m(float x12, float y12, float x22, float y22) {
        i(x12, y12, x22, y22);
    }

    int n();

    boolean o(R0 path1, R0 path2, int operation);

    void p(float x10, float y10);

    void q(float x12, float y12, float x22, float y22, float x32, float y32);

    default void r() {
        b();
    }

    void s(C3478i rect, b direction);

    void t(long offset);

    void u(float dx, float dy);

    void w(float x10, float y10);
}
