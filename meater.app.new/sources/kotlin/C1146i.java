package kotlin;

import i0.C3602t0;
import i0.C3606v0;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0088\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\" \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Li0/t0;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "LI/h;", "d", "(JJJJJJJJJJJJ)LI/h;", "backgroundColor", "a", "(LI/h;J)J", "b", "(JLO/l;I)J", "LO/G0;", "LO/G0;", "c", "()LO/G0;", "LocalColors", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146i {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<Colors> f6293a = C1576w.f(a.f6294B);

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI/h;", "a", "()LI/h;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.i$a */
    static final class a extends AbstractC3864v implements Ba.a<Colors> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6294B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Colors invoke() {
            return C1146i.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(Colors colors, long j10) {
        return C3602t0.m(j10, colors.h()) ? colors.e() : C3602t0.m(j10, colors.i()) ? colors.e() : C3602t0.m(j10, colors.j()) ? colors.f() : C3602t0.m(j10, colors.k()) ? colors.f() : C3602t0.m(j10, colors.a()) ? colors.c() : C3602t0.m(j10, colors.l()) ? colors.g() : C3602t0.m(j10, colors.b()) ? colors.d() : C3602t0.INSTANCE.e();
    }

    public static final long b(long j10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(441849991, i10, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        interfaceC1554l.S(-702395103);
        long jA = a(C1129P.f5916a.a(interfaceC1554l, 6), j10);
        if (jA == 16) {
            jA = ((C3602t0) interfaceC1554l.o(C1151n.a())).getValue();
        }
        interfaceC1554l.I();
        if (C1560o.J()) {
            C1560o.R();
        }
        return jA;
    }

    public static final AbstractC1501G0<Colors> c() {
        return f6293a;
    }

    public static final Colors d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    public static /* synthetic */ Colors e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        return d((i10 & 1) != 0 ? C3606v0.d(4284612846L) : j10, (i10 & 2) != 0 ? C3606v0.d(4281794739L) : j11, (i10 & 4) != 0 ? C3606v0.d(4278442694L) : j12, (i10 & 8) != 0 ? C3606v0.d(4278290310L) : j13, (i10 & 16) != 0 ? C3602t0.INSTANCE.f() : j14, (i10 & 32) != 0 ? C3602t0.INSTANCE.f() : j15, (i10 & 64) != 0 ? C3606v0.d(4289724448L) : j16, (i10 & 128) != 0 ? C3602t0.INSTANCE.f() : j17, (i10 & 256) != 0 ? C3602t0.INSTANCE.a() : j18, (i10 & 512) != 0 ? C3602t0.INSTANCE.a() : j19, (i10 & 1024) != 0 ? C3602t0.INSTANCE.a() : j20, (i10 & 2048) != 0 ? C3602t0.INSTANCE.f() : j21);
    }
}
