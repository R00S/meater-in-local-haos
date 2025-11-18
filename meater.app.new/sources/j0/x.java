package j0;

import i0.C3606v0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Rgb.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 c2\u00020\u0001:\u0001.B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010N\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bL\u0010MR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\b)\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bS\u0010MR\u001a\u0010W\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010RR\u001a\u0010\\\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR\u001a\u0010_\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bC\u0010`\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Lj0/x;", "Lj0/c;", "", "name", "", "primaries", "Lj0/z;", "whitePoint", "transform", "Lj0/j;", "oetf", "eotf", "", "min", "max", "Lj0/y;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLj0/z;[FLj0/j;Lj0/j;FFLj0/y;I)V", "function", "(Ljava/lang/String;[FLj0/z;Lj0/y;I)V", "", "gamma", "(Ljava/lang/String;[FLj0/z;DFFI)V", "colorSpace", "(Lj0/x;[FLj0/z;)V", "component", "f", "(I)F", "e", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "Li0/t0;", "n", "(FFFFLj0/c;)J", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lj0/z;", "R", "()Lj0/z;", "F", "g", "h", "Lj0/y;", "P", "()Lj0/y;", "i", "[F", "O", "()[F", "Q", "k", "K", "inverseTransform", "Lj0/j;", "N", "()Lj0/j;", "oetfOrig", "Lkotlin/Function1;", "LBa/l;", "L", "()LBa/l;", "M", "oetfFunc", "o", "J", "eotfOrig", "p", "H", "q", "I", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "t", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x extends AbstractC3703c {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    private static final InterfaceC3710j f43390u = new InterfaceC3710j() { // from class: j0.q
        @Override // j0.InterfaceC3710j
        public final double a(double d10) {
            return x.x(d10);
        }
    };

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WhitePoint whitePoint;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float max;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TransferParameters transferParameters;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float[] primaries;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float[] inverseTransform;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3710j oetfOrig;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Double, Double> oetf;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3710j oetfFunc;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3710j eotfOrig;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Double, Double> eotf;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3710j eotfFunc;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lj0/x$a;", "", "<init>", "()V", "", "primaries", "Lj0/z;", "whitePoint", "Lj0/j;", "OETF", "EOTF", "", "min", "max", "", "id", "", "j", "([FLj0/z;Lj0/j;Lj0/j;FFI)Z", "", "point", "a", "b", "f", "(DLj0/j;Lj0/j;)Z", "k", "([FFF)Z", "e", "([F)F", "ax", "ay", "bx", "by", "i", "(FFFF)F", "p1", "p2", "h", "([F[F)Z", "l", "([F)[F", "g", "([FLj0/z;)[F", "DoubleIdentity", "Lj0/j;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j0.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final float e(float[] primaries) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean f(double point, InterfaceC3710j a10, InterfaceC3710j b10) {
            return Math.abs(a10.a(point) - b10.a(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] primaries, WhitePoint whitePoint) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float x10 = whitePoint.getX();
            float y10 = whitePoint.getY();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - x10) / y10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (x10 / y10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] p12, float[] p22) {
            float f10 = p12[0];
            float f11 = p22[0];
            float f12 = p12[1];
            float f13 = p22[1];
            float f14 = p12[2] - p22[2];
            float f15 = p12[3] - p22[3];
            float f16 = p12[4];
            float f17 = p22[4];
            float f18 = p12[5];
            float f19 = p22[5];
            float[] fArr = {f10 - f11, f12 - f13, f14, f15, f16 - f17, f18 - f19};
            return i(fArr[0], fArr[1], f11 - f17, f13 - f19) >= 0.0f && i(p22[0] - p22[2], p22[1] - p22[3], fArr[0], fArr[1]) >= 0.0f && i(fArr[2], fArr[3], p22[2] - p22[0], p22[3] - p22[1]) >= 0.0f && i(p22[2] - p22[4], p22[3] - p22[5], fArr[2], fArr[3]) >= 0.0f && i(fArr[4], fArr[5], p22[4] - p22[2], p22[5] - p22[3]) >= 0.0f && i(p22[4] - p22[0], p22[5] - p22[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float i(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] primaries, WhitePoint whitePoint, InterfaceC3710j OETF, InterfaceC3710j EOTF, float min, float max, int id2) {
            if (id2 == 0) {
                return true;
            }
            C3707g c3707g = C3707g.f43324a;
            if (!C3704d.g(primaries, c3707g.x()) || !C3704d.f(whitePoint, C3711k.f43359a.e()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            x xVarW = c3707g.w();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, OETF, xVarW.getOetfOrig()) || !f(d10, EOTF, xVarW.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] primaries, float min, float max) {
            float fE = e(primaries);
            C3707g c3707g = C3707g.f43324a;
            return (fE / e(c3707g.s()) > 0.9f && h(primaries, c3707g.x())) || (min < 0.0f && max > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f10 = primaries[0];
                float f11 = primaries[1];
                float f12 = f10 + f11 + primaries[2];
                fArr[0] = f10 / f12;
                fArr[1] = f11 / f12;
                float f13 = primaries[3];
                float f14 = primaries[4];
                float f15 = f13 + f14 + primaries[5];
                fArr[2] = f13 / f15;
                fArr[3] = f14 / f15;
                float f16 = primaries[6];
                float f17 = primaries[7];
                float f18 = f16 + f17 + primaries[8];
                fArr[4] = f16 / f18;
                fArr[5] = f17 / f18;
            } else {
                C3831l.n(primaries, fArr, 0, 0, 6, 6, null);
            }
            return fArr;
        }

        private Companion() {
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Double, Double> {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(x.this.getEotfOrig().a(Ha.g.i(d10, x.this.min, x.this.max)));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<Double, Double> {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(Ha.g.i(x.this.getOetfOrig().a(d10), x.this.min, x.this.max));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    public x(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, InterfaceC3710j interfaceC3710j, InterfaceC3710j interfaceC3710j2, float f10, float f11, TransferParameters transferParameters, int i10) {
        super(str, C3702b.INSTANCE.b(), i10, null);
        this.whitePoint = whitePoint;
        this.min = f10;
        this.max = f11;
        this.transferParameters = transferParameters;
        this.oetfOrig = interfaceC3710j;
        this.oetf = new c();
        this.oetfFunc = new InterfaceC3710j() { // from class: j0.o
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return x.S(this.f43381a, d10);
            }
        };
        this.eotfOrig = interfaceC3710j2;
        this.eotf = new b();
        this.eotfFunc = new InterfaceC3710j() { // from class: j0.p
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return x.G(this.f43382a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrL = companion.l(fArr);
        this.primaries = fArrL;
        if (fArr2 == null) {
            this.transform = companion.g(fArrL, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = C3704d.k(this.transform);
        this.isWideGamut = companion.k(fArrL, f10, f11);
        this.isSrgb = companion.j(fArrL, whitePoint, interfaceC3710j, interfaceC3710j2, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double A(TransferParameters transferParameters, double d10) {
        return C3704d.o(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double B(TransferParameters transferParameters, double d10) {
        return C3704d.p(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(TransferParameters transferParameters, double d10) {
        return C3704d.q(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(TransferParameters transferParameters, double d10) {
        return C3704d.r(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double G(x xVar, double d10) {
        return xVar.eotfOrig.a(Ha.g.i(d10, xVar.min, xVar.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double S(x xVar, double d10) {
        return Ha.g.i(xVar.oetfOrig.a(d10), xVar.min, xVar.max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public final Ba.l<Double, Double> H() {
        return this.eotf;
    }

    /* renamed from: I, reason: from getter */
    public final InterfaceC3710j getEotfFunc() {
        return this.eotfFunc;
    }

    /* renamed from: J, reason: from getter */
    public final InterfaceC3710j getEotfOrig() {
        return this.eotfOrig;
    }

    /* renamed from: K, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    public final Ba.l<Double, Double> L() {
        return this.oetf;
    }

    /* renamed from: M, reason: from getter */
    public final InterfaceC3710j getOetfFunc() {
        return this.oetfFunc;
    }

    /* renamed from: N, reason: from getter */
    public final InterfaceC3710j getOetfOrig() {
        return this.oetfOrig;
    }

    /* renamed from: O, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* renamed from: P, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    /* renamed from: Q, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* renamed from: R, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // j0.AbstractC3703c
    public float[] b(float[] v10) {
        C3704d.n(this.inverseTransform, v10);
        v10[0] = (float) this.oetfFunc.a(v10[0]);
        v10[1] = (float) this.oetfFunc.a(v10[1]);
        v10[2] = (float) this.oetfFunc.a(v10[2]);
        return v10;
    }

    @Override // j0.AbstractC3703c
    public float e(int component) {
        return this.max;
    }

    @Override // j0.AbstractC3703c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || x.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        x xVar = (x) other;
        if (Float.compare(xVar.min, this.min) != 0 || Float.compare(xVar.max, this.max) != 0 || !C3862t.b(this.whitePoint, xVar.whitePoint) || !Arrays.equals(this.primaries, xVar.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return C3862t.b(transferParameters, xVar.transferParameters);
        }
        if (xVar.transferParameters == null) {
            return true;
        }
        if (C3862t.b(this.oetfOrig, xVar.oetfOrig)) {
            return C3862t.b(this.eotfOrig, xVar.eotfOrig);
        }
        return false;
    }

    @Override // j0.AbstractC3703c
    public float f(int component) {
        return this.min;
    }

    @Override // j0.AbstractC3703c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.min;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // j0.AbstractC3703c
    /* renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // j0.AbstractC3703c
    public long j(float v02, float v12, float v22) {
        float fA = (float) this.eotfFunc.a(v02);
        float fA2 = (float) this.eotfFunc.a(v12);
        float fA3 = (float) this.eotfFunc.a(v22);
        float[] fArr = this.transform;
        float f10 = (fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3);
        float f11 = (fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3);
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    @Override // j0.AbstractC3703c
    public float[] l(float[] v10) {
        v10[0] = (float) this.eotfFunc.a(v10[0]);
        v10[1] = (float) this.eotfFunc.a(v10[1]);
        v10[2] = (float) this.eotfFunc.a(v10[2]);
        return C3704d.n(this.transform, v10);
    }

    @Override // j0.AbstractC3703c
    public float m(float v02, float v12, float v22) {
        float fA = (float) this.eotfFunc.a(v02);
        float fA2 = (float) this.eotfFunc.a(v12);
        float fA3 = (float) this.eotfFunc.a(v22);
        float[] fArr = this.transform;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // j0.AbstractC3703c
    public long n(float x10, float y10, float z10, float a10, AbstractC3703c colorSpace) {
        float[] fArr = this.inverseTransform;
        return C3606v0.a((float) this.oetfFunc.a((fArr[0] * x10) + (fArr[3] * y10) + (fArr[6] * z10)), (float) this.oetfFunc.a((fArr[1] * x10) + (fArr[4] * y10) + (fArr[7] * z10)), (float) this.oetfFunc.a((fArr[2] * x10) + (fArr[5] * y10) + (fArr[8] * z10)), a10, colorSpace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(double d10) {
        return d10;
    }

    public x(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i10) {
        this(str, fArr, whitePoint, null, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new InterfaceC3710j() { // from class: j0.t
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return x.A(transferParameters, d10);
            }
        } : new InterfaceC3710j() { // from class: j0.u
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return x.B(transferParameters, d10);
            }
        }, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new InterfaceC3710j() { // from class: j0.v
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return x.C(transferParameters, d10);
            }
        } : new InterfaceC3710j() { // from class: j0.w
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return x.D(transferParameters, d10);
            }
        }, 0.0f, 1.0f, transferParameters, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String str, float[] fArr, WhitePoint whitePoint, final double d10, float f10, float f11, int i10) {
        InterfaceC3710j interfaceC3710j;
        InterfaceC3710j interfaceC3710j2;
        if (d10 == 1.0d) {
            interfaceC3710j = f43390u;
        } else {
            interfaceC3710j = new InterfaceC3710j() { // from class: j0.r
                @Override // j0.InterfaceC3710j
                public final double a(double d11) {
                    return x.y(d10, d11);
                }
            };
        }
        InterfaceC3710j interfaceC3710j3 = interfaceC3710j;
        if (d10 == 1.0d) {
            interfaceC3710j2 = f43390u;
        } else {
            interfaceC3710j2 = new InterfaceC3710j() { // from class: j0.s
                @Override // j0.InterfaceC3710j
                public final double a(double d11) {
                    return x.z(d10, d11);
                }
            };
        }
        this(str, fArr, whitePoint, null, interfaceC3710j3, interfaceC3710j2, f10, f11, new TransferParameters(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    public x(x xVar, float[] fArr, WhitePoint whitePoint) {
        this(xVar.getName(), xVar.primaries, whitePoint, fArr, xVar.oetfOrig, xVar.eotfOrig, xVar.min, xVar.max, xVar.transferParameters, -1);
    }
}
