package kotlin;

import U0.h;
import i0.C3606v0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: ElevationOverlay.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"LI/q;", "LI/C;", "<init>", "()V", "Li0/t0;", "color", "LU0/h;", "elevation", "a", "(JFLO/l;I)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1154q implements InterfaceC1116C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1154q f6446a = new C1154q();

    private C1154q() {
    }

    @Override // kotlin.InterfaceC1116C
    public long a(long j10, float f10, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-1687113661);
        if (C1560o.J()) {
            C1560o.S(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colorsA = C1129P.f5916a.a(interfaceC1554l, 6);
        if (h.t(f10, h.u(0)) <= 0 || colorsA.m()) {
            interfaceC1554l.S(1169152471);
            interfaceC1554l.I();
        } else {
            interfaceC1554l.S(1169013963);
            j10 = C3606v0.g(C1117D.b(j10, f10, interfaceC1554l, i10 & 126), j10);
            interfaceC1554l.I();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return j10;
    }
}
