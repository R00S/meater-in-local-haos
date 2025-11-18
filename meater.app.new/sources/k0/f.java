package k0;

import U0.n;
import U0.s;
import U0.t;
import h0.C3476g;
import h0.C3482m;
import h0.C3483n;
import i0.AbstractC3582j0;
import i0.C0;
import i0.C3566b0;
import i0.C3604u0;
import i0.H0;
import i0.R0;
import kotlin.Metadata;

/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 G2\u00020\u0001:\u0001HJ\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JX\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jv\u0010$\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%Jb\u0010(\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b(\u0010)Jb\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+JX\u0010.\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/Jp\u00104\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00103\u001a\u0002022\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b4\u00105JL\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u0002062\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b8\u00109JL\u0010:\u001a\u00020\u00132\u0006\u00107\u001a\u0002062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010-\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010\n\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bB\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010Eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0003"}, d2 = {"Lk0/f;", "LU0/d;", "Lh0/m;", "Lh0/g;", "offset", "I0", "(JJ)J", "Li0/j0;", "brush", "topLeft", "size", "", "alpha", "Lk0/g;", "style", "Li0/u0;", "colorFilter", "Li0/b0;", "blendMode", "Loa/F;", "g1", "(Li0/j0;JJFLk0/g;Li0/u0;I)V", "Li0/t0;", "color", "x0", "(JJJFLk0/g;Li0/u0;I)V", "Li0/H0;", "image", "LU0/n;", "srcOffset", "LU0/r;", "srcSize", "dstOffset", "dstSize", "Li0/C0;", "filterQuality", "x1", "(Li0/H0;JJJJFLk0/g;Li0/u0;II)V", "Lh0/a;", "cornerRadius", "d1", "(Li0/j0;JJJFLk0/g;Li0/u0;I)V", "h1", "(JJJJLk0/g;FLi0/u0;I)V", "radius", "center", "N", "(JFJFLk0/g;Li0/u0;I)V", "startAngle", "sweepAngle", "", "useCenter", "q0", "(JFFZJJFLk0/g;Li0/u0;I)V", "Li0/R0;", "path", "O", "(Li0/R0;JFLk0/g;Li0/u0;I)V", "O0", "(Li0/R0;Li0/j0;FLk0/g;Li0/u0;I)V", "Lk0/d;", "a1", "()Lk0/d;", "drawContext", "p1", "()J", "C", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "y", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface f extends U0.d {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f43722a;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lk0/f$a;", "", "<init>", "()V", "Li0/b0;", "b", "I", "a", "()I", "DefaultBlendMode", "Li0/C0;", "c", "DefaultFilterQuality", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k0.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f43722a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultBlendMode = C3566b0.INSTANCE.B();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultFilterQuality = C0.INSTANCE.a();

        private Companion() {
        }

        public final int a() {
            return DefaultBlendMode;
        }

        public final int b() {
            return DefaultFilterQuality;
        }
    }

    static /* synthetic */ void H0(f fVar, R0 r02, AbstractC3582j0 abstractC3582j0, float f10, g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            gVar = j.f43725a;
        }
        g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            c3604u0 = null;
        }
        C3604u0 c3604u02 = c3604u0;
        if ((i11 & 32) != 0) {
            i10 = INSTANCE.a();
        }
        fVar.O0(r02, abstractC3582j0, f11, gVar2, c3604u02, i10);
    }

    private default long I0(long j10, long j11) {
        return C3483n.a(C3482m.i(j10) - C3476g.m(j11), C3482m.g(j10) - C3476g.n(j11));
    }

    static /* synthetic */ void J0(f fVar, R0 r02, long j10, float f10, g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        fVar.O(r02, j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? j.f43725a : gVar, (i11 & 16) != 0 ? null : c3604u0, (i11 & 32) != 0 ? INSTANCE.a() : i10);
    }

    static /* synthetic */ void T0(f fVar, long j10, long j11, long j12, float f10, g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i11 & 2) != 0 ? C3476g.INSTANCE.c() : j11;
        fVar.x0(j10, jC, (i11 & 4) != 0 ? fVar.I0(fVar.C(), jC) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f43725a : gVar, (i11 & 32) != 0 ? null : c3604u0, (i11 & 64) != 0 ? INSTANCE.a() : i10);
    }

    static /* synthetic */ void W(f fVar, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i11 & 16) != 0 ? C3476g.INSTANCE.c() : j11;
        fVar.q0(j10, f10, f11, z10, jC, (i11 & 32) != 0 ? fVar.I0(fVar.C(), jC) : j12, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? j.f43725a : gVar, (i11 & 256) != 0 ? null : c3604u0, (i11 & 512) != 0 ? INSTANCE.a() : i10);
    }

    static /* synthetic */ void e0(f fVar, H0 h02, long j10, long j11, long j12, long j13, float f10, g gVar, C3604u0 c3604u0, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i12 & 2) != 0 ? n.INSTANCE.a() : j10;
        long jA2 = (i12 & 4) != 0 ? s.a(h02.b(), h02.a()) : j11;
        fVar.x1(h02, jA, jA2, (i12 & 8) != 0 ? n.INSTANCE.a() : j12, (i12 & 16) != 0 ? jA2 : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? j.f43725a : gVar, (i12 & 128) != 0 ? null : c3604u0, (i12 & 256) != 0 ? INSTANCE.a() : i10, (i12 & 512) != 0 ? INSTANCE.b() : i11);
    }

    static /* synthetic */ void o0(f fVar, AbstractC3582j0 abstractC3582j0, long j10, long j11, float f10, g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i11 & 2) != 0 ? C3476g.INSTANCE.c() : j10;
        fVar.g1(abstractC3582j0, jC, (i11 & 4) != 0 ? fVar.I0(fVar.C(), jC) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f43725a : gVar, (i11 & 32) != 0 ? null : c3604u0, (i11 & 64) != 0 ? INSTANCE.a() : i10);
    }

    static /* synthetic */ void r1(f fVar, long j10, float f10, long j11, float f11, g gVar, C3604u0 c3604u0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        fVar.N(j10, (i11 & 2) != 0 ? C3482m.h(fVar.C()) / 2.0f : f10, (i11 & 4) != 0 ? fVar.p1() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? j.f43725a : gVar, (i11 & 32) != 0 ? null : c3604u0, (i11 & 64) != 0 ? INSTANCE.a() : i10);
    }

    default long C() {
        return getDrawContext().C();
    }

    void N(long color, float radius, long center, float alpha, g style, C3604u0 colorFilter, int blendMode);

    void O(R0 path, long color, float alpha, g style, C3604u0 colorFilter, int blendMode);

    void O0(R0 path, AbstractC3582j0 brush, float alpha, g style, C3604u0 colorFilter, int blendMode);

    /* renamed from: a1 */
    d getDrawContext();

    void d1(AbstractC3582j0 brush, long topLeft, long size, long cornerRadius, float alpha, g style, C3604u0 colorFilter, int blendMode);

    void g1(AbstractC3582j0 brush, long topLeft, long size, float alpha, g style, C3604u0 colorFilter, int blendMode);

    t getLayoutDirection();

    void h1(long color, long topLeft, long size, long cornerRadius, g style, float alpha, C3604u0 colorFilter, int blendMode);

    default long p1() {
        return C3483n.b(getDrawContext().C());
    }

    void q0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, C3604u0 colorFilter, int blendMode);

    void x0(long color, long topLeft, long size, float alpha, g style, C3604u0 colorFilter, int blendMode);

    default void x1(H0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, C3604u0 colorFilter, int blendMode, int filterQuality) {
        e0(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }
}
