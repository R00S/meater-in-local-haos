package kotlin;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LL0/M;", "LL0/J;", "<init>", "()V", "", "familyName", "LL0/B;", "weight", "LL0/w;", "style", "Landroid/graphics/Typeface;", "d", "(Ljava/lang/String;LL0/B;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "c", "a", "(LL0/B;I)Landroid/graphics/Typeface;", "LL0/E;", "name", "b", "(LL0/E;LL0/B;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1320M implements InterfaceC1317J {
    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (C1352w.f(fontStyle, C1352w.INSTANCE.b()) && C3862t.b(fontWeight, FontWeight.INSTANCE.d()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = C1335f.c(fontWeight, fontStyle);
        return (genericFontFamily == null || genericFontFamily.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(genericFontFamily, iC);
    }

    private final Typeface d(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(familyName, weight, style);
        if (C3862t.b(typefaceC, Typeface.create(Typeface.DEFAULT, C1335f.c(weight, style))) || C3862t.b(typefaceC, c(null, weight, style))) {
            return null;
        }
        return typefaceC;
    }

    @Override // kotlin.InterfaceC1317J
    public Typeface a(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }

    @Override // kotlin.InterfaceC1317J
    public Typeface b(C1312E name, FontWeight fontWeight, int fontStyle) {
        Typeface typefaceD = d(C1321N.b(name.getName(), fontWeight), fontWeight, fontStyle);
        return typefaceD == null ? c(name.getName(), fontWeight, fontStyle) : typefaceD;
    }
}
