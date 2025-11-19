package kotlin;

import E.a;
import U0.h;
import i0.C3602t0;
import i0.c1;
import kotlin.C1560o;
import kotlin.C4768p0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LI/w;", "", "<init>", "()V", "Lv/p0;", "", "b", "Lv/p0;", "getAnimationSpec", "()Lv/p0;", "AnimationSpec", "LU0/h;", "c", "F", "()F", "Elevation", "Li0/t0;", "a", "(LO/l;I)J", "backgroundColor", "Li0/c1;", "d", "(LO/l;I)Li0/c1;", "shape", "scrimColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160w {

    /* renamed from: a, reason: collision with root package name */
    public static final C1160w f6474a = new C1160w();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C4768p0<Float> AnimationSpec = new C4768p0<>(256, 0, null, 6, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = h.u(16);

    private C1160w() {
    }

    public final long a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-788676020, i10, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:758)");
        }
        long jL = C1129P.f5916a.a(interfaceC1554l, 6).l();
        if (C1560o.J()) {
            C1560o.R();
        }
        return jL;
    }

    public final float b() {
        return Elevation;
    }

    public final long c(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(617225966, i10, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:777)");
        }
        long jK = C3602t0.k(C1129P.f5916a.a(interfaceC1554l, 6).g(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return jK;
    }

    public final c1 d(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(2041803618, i10, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:770)");
        }
        a large = C1129P.f5916a.b(interfaceC1554l, 6).getLarge();
        if (C1560o.J()) {
            C1560o.R();
        }
        return large;
    }
}
