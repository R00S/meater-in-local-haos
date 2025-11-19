package kotlin;

import i0.C3602t0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;

/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R1\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR1\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR1\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR1\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b'\u0010\u001cR1\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b,\u0010\u001cR1\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b&\u0010\u001a\"\u0004\b-\u0010\u001cR1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b(\u0010\u001a\"\u0004\b.\u0010\u001cR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b/\u0010\u001cR1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b+\u0010\u001a\"\u0004\b0\u0010\u001cR1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b1\u0010\u001cR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"LI/h;", "", "Li0/t0;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/k;)V", "", "toString", "()Ljava/lang/String;", "<set-?>", "a", "LO/p0;", "h", "()J", "setPrimary-8_81llA$material_release", "(J)V", "b", "i", "setPrimaryVariant-8_81llA$material_release", "c", "j", "setSecondary-8_81llA$material_release", "d", "k", "setSecondaryVariant-8_81llA$material_release", "e", "setBackground-8_81llA$material_release", "f", "l", "setSurface-8_81llA$material_release", "g", "setError-8_81llA$material_release", "setOnPrimary-8_81llA$material_release", "setOnSecondary-8_81llA$material_release", "setOnBackground-8_81llA$material_release", "setOnSurface-8_81llA$material_release", "setOnError-8_81llA$material_release", "m", "()Z", "setLight$material_release", "(Z)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class Colors {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 primary;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 primaryVariant;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 secondary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 secondaryVariant;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 background;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 surface;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 error;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 onPrimary;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 onSecondary;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 onBackground;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 onSurface;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 onError;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isLight;

    public /* synthetic */ Colors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10, C3854k c3854k) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((C3602t0) this.background.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((C3602t0) this.error.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((C3602t0) this.onBackground.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((C3602t0) this.onError.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((C3602t0) this.onPrimary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((C3602t0) this.onSecondary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        return ((C3602t0) this.onSurface.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h() {
        return ((C3602t0) this.primary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i() {
        return ((C3602t0) this.primaryVariant.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long j() {
        return ((C3602t0) this.secondary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k() {
        return ((C3602t0) this.secondaryVariant.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l() {
        return ((C3602t0) this.surface.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m() {
        return ((Boolean) this.isLight.getValue()).booleanValue();
    }

    public String toString() {
        return "Colors(primary=" + ((Object) C3602t0.t(h())) + ", primaryVariant=" + ((Object) C3602t0.t(i())) + ", secondary=" + ((Object) C3602t0.t(j())) + ", secondaryVariant=" + ((Object) C3602t0.t(k())) + ", background=" + ((Object) C3602t0.t(a())) + ", surface=" + ((Object) C3602t0.t(l())) + ", error=" + ((Object) C3602t0.t(b())) + ", onPrimary=" + ((Object) C3602t0.t(e())) + ", onSecondary=" + ((Object) C3602t0.t(f())) + ", onBackground=" + ((Object) C3602t0.t(c())) + ", onSurface=" + ((Object) C3602t0.t(g())) + ", onError=" + ((Object) C3602t0.t(d())) + ", isLight=" + m() + ')';
    }

    private Colors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10) {
        this.primary = m1.g(C3602t0.g(j10), m1.o());
        this.primaryVariant = m1.g(C3602t0.g(j11), m1.o());
        this.secondary = m1.g(C3602t0.g(j12), m1.o());
        this.secondaryVariant = m1.g(C3602t0.g(j13), m1.o());
        this.background = m1.g(C3602t0.g(j14), m1.o());
        this.surface = m1.g(C3602t0.g(j15), m1.o());
        this.error = m1.g(C3602t0.g(j16), m1.o());
        this.onPrimary = m1.g(C3602t0.g(j17), m1.o());
        this.onSecondary = m1.g(C3602t0.g(j18), m1.o());
        this.onBackground = m1.g(C3602t0.g(j19), m1.o());
        this.onSurface = m1.g(C3602t0.g(j20), m1.o());
        this.onError = m1.g(C3602t0.g(j21), m1.o());
        this.isLight = m1.g(Boolean.valueOf(z10), m1.o());
    }
}
