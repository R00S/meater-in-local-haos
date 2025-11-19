package kotlin;

import M.g;
import i0.C3602t0;
import i0.C3606v0;
import i0.c1;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u00020\u000e*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"LK/l;", "", "<init>", "()V", "LU0/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "LK/m;", "b", "(FFFFFFLO/l;II)LK/m;", "LK/k;", "a", "(LO/l;I)LK/k;", "Li0/c1;", "d", "(LO/l;I)Li0/c1;", "shape", "LK/o;", "c", "(LK/o;)LK/k;", "defaultCardColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1291l {

    /* renamed from: a, reason: collision with root package name */
    public static final C1291l f8472a = new C1291l();

    /* renamed from: b, reason: collision with root package name */
    public static final int f8473b = 0;

    private C1291l() {
    }

    public final C1290k a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1876034303, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        C1290k c1290kC = c(C1252D.f7860a.a(interfaceC1554l, 6));
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1290kC;
    }

    public final C1292m b(float f10, float f11, float f12, float f13, float f14, float f15, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = g.f11466a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = g.f11466a.j();
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = g.f11466a.h();
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = g.f11466a.i();
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = g.f11466a.g();
        }
        float f19 = f14;
        if ((i11 & 32) != 0) {
            f15 = g.f11466a.e();
        }
        float f20 = f15;
        if (C1560o.J()) {
            C1560o.S(-574898487, i10, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        C1292m c1292m = new C1292m(f10, f16, f17, f18, f19, f20, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1292m;
    }

    public final C1290k c(ColorScheme colorScheme) {
        C1290k defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        g gVar = g.f11466a;
        C1290k c1290k = new C1290k(C1295p.d(colorScheme, gVar.a()), C1295p.b(colorScheme, C1295p.d(colorScheme, gVar.a())), C3606v0.g(C3602t0.k(C1295p.d(colorScheme, gVar.d()), gVar.f(), 0.0f, 0.0f, 0.0f, 14, null), C1295p.d(colorScheme, gVar.a())), C3602t0.k(C1295p.b(colorScheme, C1295p.d(colorScheme, gVar.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.R(c1290k);
        return c1290k;
    }

    public final c1 d(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1266660211, i10, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        c1 c1VarD = C1271X.d(g.f11466a.c(), interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1VarD;
    }
}
