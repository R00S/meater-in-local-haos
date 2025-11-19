package p0;

import U0.h;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import i0.AbstractC3582j0;
import i0.C3566b0;
import i0.C3584k0;
import i0.C3602t0;
import i0.C3606v0;
import i0.SolidColor;
import i0.T0;
import i0.e1;
import i0.f1;
import i1.d;
import i1.k;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o0.AbstractC4086g;
import o0.C4083d;
import o0.C4088i;
import o0.C4093n;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlVectorParser.android.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "id", "Li0/e1;", "defValue", "b", "(II)I", "Li0/f1;", "c", "Lorg/xmlpull/v1/XmlPullParser;", "", "d", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lp0/a;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lo0/d$a;", "builder", "nestedGroups", "g", "(Lp0/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lo0/d$a;I)I", "j", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Lp0/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lo0/d$a;", "Loa/F;", "i", "(Lp0/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lo0/d$a;)V", "Li1/d;", "complexColor", "Li0/j0;", "e", "(Li1/d;)Li0/j0;", "f", "h", "I", "FILL_TYPE_WINDING", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4192c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f47370a = 0;

    public static final C4083d.a a(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jE;
        int iZ;
        ColorStateList colorStateListE;
        C4191b c4191b = C4191b.f47344a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c4191b.F());
        boolean zD = androidVectorParser.d(typedArrayK, "autoMirrored", c4191b.a(), false);
        float fG = androidVectorParser.g(typedArrayK, "viewportWidth", c4191b.H(), 0.0f);
        float fG2 = androidVectorParser.g(typedArrayK, "viewportHeight", c4191b.G(), 0.0f);
        if (fG <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fG2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fA = androidVectorParser.a(typedArrayK, c4191b.I(), 0.0f);
        float fA2 = androidVectorParser.a(typedArrayK, c4191b.n(), 0.0f);
        if (typedArrayK.hasValue(c4191b.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayK.getValue(c4191b.D(), typedValue);
            jE = (typedValue.type == 2 || (colorStateListE = androidVectorParser.e(typedArrayK, theme, "tint", c4191b.D())) == null) ? C3602t0.INSTANCE.e() : C3606v0.b(colorStateListE.getDefaultColor());
        } else {
            jE = C3602t0.INSTANCE.e();
        }
        long j10 = jE;
        int iC = androidVectorParser.c(typedArrayK, c4191b.E(), -1);
        if (iC == -1) {
            iZ = C3566b0.INSTANCE.z();
        } else if (iC == 3) {
            iZ = C3566b0.INSTANCE.B();
        } else if (iC == 5) {
            iZ = C3566b0.INSTANCE.z();
        } else if (iC != 9) {
            switch (iC) {
                case 14:
                    iZ = C3566b0.INSTANCE.q();
                    break;
                case 15:
                    iZ = C3566b0.INSTANCE.v();
                    break;
                case 16:
                    iZ = C3566b0.INSTANCE.t();
                    break;
                default:
                    iZ = C3566b0.INSTANCE.z();
                    break;
            }
        } else {
            iZ = C3566b0.INSTANCE.y();
        }
        int i10 = iZ;
        float fU = h.u(fA / resources.getDisplayMetrics().density);
        float fU2 = h.u(fA2 / resources.getDisplayMetrics().density);
        typedArrayK.recycle();
        return new C4083d.a(null, fU, fU2, fG, fG2, j10, i10, zD, 1, null);
    }

    private static final int b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : e1.INSTANCE.c() : e1.INSTANCE.b() : e1.INSTANCE.a();
    }

    private static final int c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : f1.INSTANCE.a() : f1.INSTANCE.c() : f1.INSTANCE.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final AbstractC3582j0 e(d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? C3584k0.a(shaderF) : new SolidColor(C3606v0.b(dVar.e()), null);
    }

    public static final void f(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C4083d.a aVar) {
        C4191b c4191b = C4191b.f47344a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c4191b.b());
        String strI = androidVectorParser.i(typedArrayK, c4191b.c());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = androidVectorParser.i(typedArrayK, c4191b.d());
        List listD = strI2 == null ? C4093n.d() : C4088i.b(androidVectorParser.pathParser, strI2, null, 2, null);
        typedArrayK.recycle();
        aVar.a((254 & 1) != 0 ? "" : str, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & 256) != 0 ? C4093n.d() : listD);
    }

    public static final int g(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C4083d.a aVar, int i10) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !C3862t.b("group", androidVectorParser.getXmlParser().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar.f();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            f(androidVectorParser, resources, theme, attributeSet, aVar);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            i(androidVectorParser, resources, theme, attributeSet, aVar);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        h(androidVectorParser, resources, theme, attributeSet, aVar);
        return i10;
    }

    public static final void h(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C4083d.a aVar) {
        C4191b c4191b = C4191b.f47344a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c4191b.e());
        float fG = androidVectorParser.g(typedArrayK, "rotation", c4191b.i(), 0.0f);
        float fB = androidVectorParser.b(typedArrayK, c4191b.g(), 0.0f);
        float fB2 = androidVectorParser.b(typedArrayK, c4191b.h(), 0.0f);
        float fG2 = androidVectorParser.g(typedArrayK, "scaleX", c4191b.j(), 1.0f);
        float fG3 = androidVectorParser.g(typedArrayK, "scaleY", c4191b.k(), 1.0f);
        float fG4 = androidVectorParser.g(typedArrayK, "translateX", c4191b.l(), 0.0f);
        float fG5 = androidVectorParser.g(typedArrayK, "translateY", c4191b.m(), 0.0f);
        String strI = androidVectorParser.i(typedArrayK, c4191b.f());
        if (strI == null) {
            strI = "";
        }
        typedArrayK.recycle();
        aVar.a(strI, fG, fB, fB2, fG2, fG3, fG4, fG5, C4093n.d());
    }

    public static final void i(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C4083d.a aVar) {
        C4191b c4191b = C4191b.f47344a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, c4191b.o());
        if (!k.h(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strI = androidVectorParser.i(typedArrayK, c4191b.r());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = androidVectorParser.i(typedArrayK, c4191b.s());
        List<? extends AbstractC4086g> listD = strI2 == null ? C4093n.d() : C4088i.b(androidVectorParser.pathParser, strI2, null, 2, null);
        d dVarF = androidVectorParser.f(typedArrayK, theme, "fillColor", c4191b.q(), 0);
        float fG = androidVectorParser.g(typedArrayK, "fillAlpha", c4191b.p(), 1.0f);
        int iB = b(androidVectorParser.h(typedArrayK, "strokeLineCap", c4191b.v(), -1), e1.INSTANCE.a());
        int iC = c(androidVectorParser.h(typedArrayK, "strokeLineJoin", c4191b.w(), -1), f1.INSTANCE.a());
        float fG2 = androidVectorParser.g(typedArrayK, "strokeMiterLimit", c4191b.x(), 1.0f);
        d dVarF2 = androidVectorParser.f(typedArrayK, theme, "strokeColor", c4191b.u(), 0);
        float fG3 = androidVectorParser.g(typedArrayK, "strokeAlpha", c4191b.t(), 1.0f);
        float fG4 = androidVectorParser.g(typedArrayK, "strokeWidth", c4191b.y(), 1.0f);
        float fG5 = androidVectorParser.g(typedArrayK, "trimPathEnd", c4191b.z(), 1.0f);
        float fG6 = androidVectorParser.g(typedArrayK, "trimPathOffset", c4191b.B(), 0.0f);
        float fG7 = androidVectorParser.g(typedArrayK, "trimPathStart", c4191b.C(), 0.0f);
        int iH = androidVectorParser.h(typedArrayK, "fillType", c4191b.A(), f47370a);
        typedArrayK.recycle();
        AbstractC3582j0 abstractC3582j0E = e(dVarF);
        AbstractC3582j0 abstractC3582j0E2 = e(dVarF2);
        T0.Companion companion = T0.INSTANCE;
        aVar.c(listD, iH == 0 ? companion.b() : companion.a(), str, abstractC3582j0E, fG, abstractC3582j0E2, fG3, fG4, iB, iC, fG2, fG7, fG5, fG6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
