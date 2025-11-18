package kotlin;

import i0.C3602t0;
import i0.C3606v0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"LI/d0;", "", "<init>", "()V", "Li0/t0;", "a", "(LO/l;I)J", "backgroundColor", "b", "primaryActionColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f6146a = new d0();

    private d0() {
    }

    public final long a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1630911716, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:204)");
        }
        C1129P c1129p = C1129P.f5916a;
        long jG = C3606v0.g(C3602t0.k(c1129p.a(interfaceC1554l, 6).g(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), c1129p.a(interfaceC1554l, 6).l());
        if (C1560o.J()) {
            C1560o.R();
        }
        return jG;
    }

    public final long b(InterfaceC1554l interfaceC1554l, int i10) {
        long jI;
        if (C1560o.J()) {
            C1560o.S(-810329402, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:224)");
        }
        Colors colorsA = C1129P.f5916a.a(interfaceC1554l, 6);
        if (colorsA.m()) {
            jI = C3606v0.g(C3602t0.k(colorsA.l(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colorsA.h());
        } else {
            jI = colorsA.i();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return jI;
    }
}
