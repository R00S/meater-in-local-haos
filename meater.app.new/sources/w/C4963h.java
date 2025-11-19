package w;

import b0.i;
import f0.C3303d;
import h0.C3478i;
import h0.C3482m;
import i0.N0;
import i0.c1;
import kotlin.EnumC5037q;
import kotlin.Metadata;

/* compiled from: ClipScrollableContainer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lb0/i;", "Lx/q;", "orientation", "a", "(Lb0/i;Lx/q;)Lb0/i;", "LU0/h;", "F", "b", "()F", "MaxSupportedElevation", "Lb0/i;", "HorizontalScrollableClipModifier", "c", "VerticalScrollableClipModifier", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4963h {

    /* renamed from: a, reason: collision with root package name */
    private static final float f51714a = U0.h.u(30);

    /* renamed from: b, reason: collision with root package name */
    private static final b0.i f51715b;

    /* renamed from: c, reason: collision with root package name */
    private static final b0.i f51716c;

    /* compiled from: ClipScrollableContainer.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"w/h$a", "Li0/c1;", "Lh0/m;", "size", "LU0/t;", "layoutDirection", "LU0/d;", "density", "Li0/N0;", "a", "(JLU0/t;LU0/d;)Li0/N0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.h$a */
    public static final class a implements c1 {
        a() {
        }

        @Override // i0.c1
        public N0 a(long size, U0.t layoutDirection, U0.d density) {
            float fI1 = density.i1(C4963h.b());
            return new N0.b(new C3478i(0.0f, -fI1, C3482m.i(size), C3482m.g(size) + fI1));
        }
    }

    /* compiled from: ClipScrollableContainer.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"w/h$b", "Li0/c1;", "Lh0/m;", "size", "LU0/t;", "layoutDirection", "LU0/d;", "density", "Li0/N0;", "a", "(JLU0/t;LU0/d;)Li0/N0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.h$b */
    public static final class b implements c1 {
        b() {
        }

        @Override // i0.c1
        public N0 a(long size, U0.t layoutDirection, U0.d density) {
            float fI1 = density.i1(C4963h.b());
            return new N0.b(new C3478i(-fI1, 0.0f, C3482m.i(size) + fI1, C3482m.g(size)));
        }
    }

    static {
        i.Companion companion = b0.i.INSTANCE;
        f51715b = C3303d.a(companion, new a());
        f51716c = C3303d.a(companion, new b());
    }

    public static final b0.i a(b0.i iVar, EnumC5037q enumC5037q) {
        return iVar.e(enumC5037q == EnumC5037q.Vertical ? f51716c : f51715b);
    }

    public static final float b() {
        return f51714a;
    }
}
