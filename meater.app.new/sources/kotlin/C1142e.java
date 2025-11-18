package kotlin;

import A.N;
import U0.h;
import androidx.compose.foundation.layout.o;
import i0.C3602t0;
import i0.C3606v0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u001c\u0010!R\u001d\u0010&\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b%\u0010!R\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010!R\u001d\u0010,\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010!R\u001a\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0017\u00100\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b#\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"LI/e;", "", "<init>", "()V", "LU0/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "LI/f;", "b", "(FFFFFLO/l;II)LI/f;", "Li0/t0;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "LI/d;", "a", "(JJJJLO/l;II)LI/d;", "g", "(JJJLO/l;II)LI/d;", "F", "ButtonHorizontalPadding", "c", "ButtonVerticalPadding", "LA/N;", "d", "LA/N;", "()LA/N;", "ContentPadding", "e", "()F", "MinWidth", "f", "MinHeight", "getIconSize-D9Ej5fM", "IconSize", "h", "getIconSpacing-D9Ej5fM", "IconSpacing", "i", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "j", "TextButtonHorizontalPadding", "k", "TextButtonContentPadding", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1142e f6147a = new C1142e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final N ContentPadding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedBorderSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final N TextButtonContentPadding;

    static {
        float fU = h.u(16);
        ButtonHorizontalPadding = fU;
        float f10 = 8;
        float fU2 = h.u(f10);
        ButtonVerticalPadding = fU2;
        N nD = o.d(fU, fU2, fU, fU2);
        ContentPadding = nD;
        MinWidth = h.u(64);
        MinHeight = h.u(36);
        IconSize = h.u(18);
        IconSpacing = h.u(f10);
        OutlinedBorderSize = h.u(1);
        float fU3 = h.u(f10);
        TextButtonHorizontalPadding = fU3;
        TextButtonContentPadding = o.d(fU3, nD.getTop(), fU3, nD.getBottom());
    }

    private C1142e() {
    }

    public final InterfaceC1141d a(long j10, long j11, long j12, long j13, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        long jG;
        long jH = (i11 & 1) != 0 ? C1129P.f5916a.a(interfaceC1554l, 6).h() : j10;
        long jB = (i11 & 2) != 0 ? C1146i.b(jH, interfaceC1554l, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            C1129P c1129p = C1129P.f5916a;
            jG = C3606v0.g(C3602t0.k(c1129p.a(interfaceC1554l, 6).g(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), c1129p.a(interfaceC1554l, 6).l());
        } else {
            jG = j12;
        }
        long jK = (i11 & 8) != 0 ? C3602t0.k(C1129P.f5916a.a(interfaceC1554l, 6).g(), C1149l.f6359a.b(interfaceC1554l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (C1560o.J()) {
            C1560o.S(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:413)");
        }
        C1152o c1152o = new C1152o(jH, jB, jG, jK, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1152o;
    }

    public final InterfaceC1143f b(float f10, float f11, float f12, float f13, float f14, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = h.u(2);
        }
        float f15 = f10;
        if ((i11 & 2) != 0) {
            f11 = h.u(8);
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = h.u(0);
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = h.u(4);
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = h.u(4);
        }
        float f19 = f14;
        if (C1560o.J()) {
            C1560o.S(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:378)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.g(f15)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.g(f16)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.g(f17)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC1554l.g(f18)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC1554l.g(f19)) || (i10 & 24576) == 16384);
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1153p(f15, f16, f17, f18, f19, null);
            interfaceC1554l.J(objF);
        }
        C1153p c1153p = (C1153p) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1153p;
    }

    public final N c() {
        return ContentPadding;
    }

    public final float d() {
        return MinHeight;
    }

    public final float e() {
        return MinWidth;
    }

    public final N f() {
        return TextButtonContentPadding;
    }

    public final InterfaceC1141d g(long j10, long j11, long j12, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        long jD = (i11 & 1) != 0 ? C3602t0.INSTANCE.d() : j10;
        long jH = (i11 & 2) != 0 ? C1129P.f5916a.a(interfaceC1554l, 6).h() : j11;
        long jK = (i11 & 4) != 0 ? C3602t0.k(C1129P.f5916a.a(interfaceC1554l, 6).g(), C1149l.f6359a.b(interfaceC1554l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (C1560o.J()) {
            C1560o.S(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:455)");
        }
        C1152o c1152o = new C1152o(jD, jH, jD, jK, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1152o;
    }
}
