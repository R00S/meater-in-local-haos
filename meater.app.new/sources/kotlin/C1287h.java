package kotlin;

import A.N;
import M.f;
import U0.h;
import androidx.compose.foundation.layout.o;
import i0.C3602t0;
import i0.c1;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006JD\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010!\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0017\u0010$\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001eR\u001a\u0010&\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0017\u0010)\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001eR\u001a\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u0017\u0010-\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b,\u0010\u001eR\u001d\u00100\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b'\u0010/R\u001d\u00101\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b%\u0010/R\u001d\u00104\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010/R\u001d\u00107\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010/R\u0011\u0010:\u001a\u0002088G¢\u0006\u0006\u001a\u0004\b*\u00109R\u0011\u0010;\u001a\u0002088G¢\u0006\u0006\u001a\u0004\b.\u00109R\u0018\u0010>\u001a\u00020\u0004*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010=R\u0018\u0010?\u001a\u00020\u0004*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"LK/h;", "", "<init>", "()V", "LK/g;", "a", "(LO/l;I)LK/g;", "Li0/t0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLO/l;II)LK/g;", "l", "LU0/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "LK/i;", "c", "(FFFFFLO/l;II)LK/i;", "F", "ButtonHorizontalPadding", "ButtonVerticalPadding", "LA/N;", "d", "LA/N;", "()LA/N;", "ContentPadding", "e", "ButtonWithIconHorizontalStartPadding", "f", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "g", "TextButtonHorizontalPadding", "h", "j", "TextButtonContentPadding", "i", "TextButtonWithIconHorizontalEndPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "k", "()F", "MinWidth", "MinHeight", "m", "getIconSize-D9Ej5fM", "IconSize", "n", "getIconSpacing-D9Ej5fM", "IconSpacing", "Li0/c1;", "(LO/l;I)Li0/c1;", "shape", "textShape", "LK/o;", "(LK/o;)LK/g;", "defaultButtonColors", "defaultTextButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1287h f8410a = new C1287h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final N ContentPadding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonWithIconHorizontalStartPadding;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final N ButtonWithIconContentPadding;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final N TextButtonContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonWithIconHorizontalEndPadding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final N TextButtonWithIconContentPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8424o = 0;

    static {
        float fU = h.u(24);
        ButtonHorizontalPadding = fU;
        float f10 = 8;
        float fU2 = h.u(f10);
        ButtonVerticalPadding = fU2;
        N nD = o.d(fU, fU2, fU, fU2);
        ContentPadding = nD;
        float f11 = 16;
        float fU3 = h.u(f11);
        ButtonWithIconHorizontalStartPadding = fU3;
        ButtonWithIconContentPadding = o.d(fU3, fU2, fU, fU2);
        float fU4 = h.u(12);
        TextButtonHorizontalPadding = fU4;
        TextButtonContentPadding = o.d(fU4, nD.getTop(), fU4, nD.getBottom());
        float fU5 = h.u(f11);
        TextButtonWithIconHorizontalEndPadding = fU5;
        TextButtonWithIconContentPadding = o.d(fU4, nD.getTop(), fU5, nD.getBottom());
        MinWidth = h.u(58);
        MinHeight = h.u(40);
        IconSize = f.f11444a.i();
        IconSpacing = h.u(f10);
    }

    private C1287h() {
    }

    public final C1286g a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1449248637, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        C1286g c1286gE = e(C1252D.f7860a.a(interfaceC1554l, 6));
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1286gE;
    }

    public final C1286g b(long j10, long j11, long j12, long j13, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        long jE = (i11 & 1) != 0 ? C3602t0.INSTANCE.e() : j10;
        long jE2 = (i11 & 2) != 0 ? C3602t0.INSTANCE.e() : j11;
        long jE3 = (i11 & 4) != 0 ? C3602t0.INSTANCE.e() : j12;
        long jE4 = (i11 & 8) != 0 ? C3602t0.INSTANCE.e() : j13;
        if (C1560o.J()) {
            C1560o.S(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        C1286g c1286gC = e(C1252D.f7860a.a(interfaceC1554l, 6)).c(jE, jE2, jE3, jE4);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1286gC;
    }

    public final C1288i c(float f10, float f11, float f12, float f13, float f14, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = f.f11444a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = f.f11444a.k();
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = f.f11444a.g();
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = f.f11444a.h();
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            f14 = f.f11444a.e();
        }
        float f18 = f14;
        if (C1560o.J()) {
            C1560o.S(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        C1288i c1288i = new C1288i(f10, f15, f16, f17, f18, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1288i;
    }

    public final N d() {
        return ContentPadding;
    }

    public final C1286g e(ColorScheme colorScheme) {
        C1286g defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        f fVar = f.f11444a;
        C1286g c1286g = new C1286g(C1295p.d(colorScheme, fVar.a()), C1295p.d(colorScheme, fVar.j()), C3602t0.k(C1295p.d(colorScheme, fVar.d()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), C3602t0.k(C1295p.d(colorScheme, fVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.Q(c1286g);
        return c1286g;
    }

    public final C1286g f(ColorScheme colorScheme) {
        C1286g defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        C3602t0.Companion companion = C3602t0.INSTANCE;
        long jD = companion.d();
        M.o oVar = M.o.f11687a;
        C1286g c1286g = new C1286g(jD, C1295p.d(colorScheme, oVar.c()), companion.d(), C3602t0.k(C1295p.d(colorScheme, oVar.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.U(c1286g);
        return c1286g;
    }

    public final float g() {
        return MinHeight;
    }

    public final float h() {
        return MinWidth;
    }

    public final c1 i(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        c1 c1VarD = C1271X.d(f.f11444a.c(), interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1VarD;
    }

    public final N j() {
        return TextButtonContentPadding;
    }

    public final c1 k(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        c1 c1VarD = C1271X.d(M.o.f11687a.a(), interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1VarD;
    }

    public final C1286g l(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1880341584, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        C1286g c1286gF = f(C1252D.f7860a.a(interfaceC1554l, 6));
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1286gF;
    }
}
