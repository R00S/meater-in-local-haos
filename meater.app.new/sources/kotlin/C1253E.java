package kotlin;

import A.N;
import M.e;
import M.i;
import M.j;
import U0.h;
import androidx.compose.foundation.layout.o;
import i0.C3602t0;
import i0.c1;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u00020\u0004*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"LK/E;", "", "<init>", "()V", "LK/F;", "g", "(LO/l;I)LK/F;", "LU0/h;", "b", "F", "f", "()F", "TonalElevation", "c", "d", "ShadowElevation", "LA/N;", "LA/N;", "()LA/N;", "DropdownMenuItemContentPadding", "Li0/c1;", "e", "(LO/l;I)Li0/c1;", "shape", "Li0/t0;", "a", "(LO/l;I)J", "containerColor", "LK/o;", "(LK/o;)LK/F;", "defaultMenuItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253E {

    /* renamed from: a, reason: collision with root package name */
    public static final C1253E f7862a = new C1253E();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = e.f11437a.a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ShadowElevation = j.f11550a.b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final N DropdownMenuItemContentPadding = o.b(C1255G.f7874c, h.u(0));

    private C1253E() {
    }

    public final long a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1787427929, i10, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:198)");
        }
        long jF = C1295p.f(j.f11550a.a(), interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return jF;
    }

    public final C1254F b(ColorScheme colorScheme) {
        C1254F defaultMenuItemColorsCached = colorScheme.getDefaultMenuItemColorsCached();
        if (defaultMenuItemColorsCached != null) {
            return defaultMenuItemColorsCached;
        }
        i iVar = i.f11519a;
        C1254F c1254f = new C1254F(C1295p.d(colorScheme, iVar.g()), C1295p.d(colorScheme, iVar.h()), C1295p.d(colorScheme, iVar.j()), C3602t0.k(C1295p.d(colorScheme, iVar.a()), iVar.b(), 0.0f, 0.0f, 0.0f, 14, null), C3602t0.k(C1295p.d(colorScheme, iVar.c()), iVar.d(), 0.0f, 0.0f, 0.0f, 14, null), C3602t0.k(C1295p.d(colorScheme, iVar.e()), iVar.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.T(c1254f);
        return c1254f;
    }

    public final N c() {
        return DropdownMenuItemContentPadding;
    }

    public final float d() {
        return ShadowElevation;
    }

    public final c1 e(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(218702739, i10, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:194)");
        }
        c1 c1VarD = C1271X.d(j.f11550a.c(), interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1VarD;
    }

    public final float f() {
        return TonalElevation;
    }

    public final C1254F g(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1326531516, i10, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:204)");
        }
        C1254F c1254fB = b(C1252D.f7860a.a(interfaceC1554l, 6));
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1254fB;
    }
}
