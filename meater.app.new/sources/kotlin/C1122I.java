package kotlin;

import U0.h;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LI/I;", "", "<init>", "()V", "LU0/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "LI/J;", "a", "(FFFFLO/l;II)LI/J;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122I {

    /* renamed from: a, reason: collision with root package name */
    public static final C1122I f5850a = new C1122I();

    private C1122I() {
    }

    public final InterfaceC1123J a(float f10, float f11, float f12, float f13, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = h.u(6);
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = h.u(12);
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = h.u(8);
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = h.u(8);
        }
        float f17 = f13;
        if (C1560o.J()) {
            C1560o.S(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:248)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.g(f14)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.g(f15)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.g(f16)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC1554l.g(f17)) || (i10 & 3072) == 2048);
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1155r(f14, f15, f16, f17, null);
            interfaceC1554l.J(objF);
        }
        C1155r c1155r = (C1155r) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1155r;
    }
}
