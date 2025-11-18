package kotlin;

import i0.C3602t0;
import i0.C3606v0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: ContentAlpha.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"LI/l;", "", "<init>", "()V", "", "highContrastAlpha", "lowContrastAlpha", "a", "(FFLO/l;I)F", "c", "(LO/l;I)F", "high", "b", "disabled", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149l {

    /* renamed from: a, reason: collision with root package name */
    public static final C1149l f6359a = new C1149l();

    private C1149l() {
    }

    private final float a(float f10, float f11, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long value = ((C3602t0) interfaceC1554l.o(C1151n.a())).getValue();
        if (!C1129P.f5916a.a(interfaceC1554l, 6).m() ? C3606v0.i(value) >= 0.5d : C3606v0.i(value) <= 0.5d) {
            f10 = f11;
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return f10;
    }

    public final float b(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float fA = a(0.38f, 0.38f, interfaceC1554l, ((i10 << 6) & 896) | 54);
        if (C1560o.J()) {
            C1560o.R();
        }
        return fA;
    }

    public final float c(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float fA = a(1.0f, 0.87f, interfaceC1554l, ((i10 << 6) & 896) | 54);
        if (C1560o.J()) {
            C1560o.R();
        }
        return fA;
    }
}
