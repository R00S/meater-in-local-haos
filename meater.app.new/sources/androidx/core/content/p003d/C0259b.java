package androidx.core.content.p003d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat.java */
/* renamed from: androidx.core.content.d.b */
/* loaded from: classes.dex */
public final class C0259b {

    /* renamed from: a */
    private final Shader f2194a;

    /* renamed from: b */
    private final ColorStateList f2195b;

    /* renamed from: c */
    private int f2196c;

    private C0259b(Shader shader, ColorStateList colorStateList, int i2) {
        this.f2194a = shader;
        this.f2195b = colorStateList;
        this.f2196c = i2;
    }

    /* renamed from: a */
    private static C0259b m1710a(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m1713d(C0261d.m1742b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m1712c(C0258a.m1703b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: b */
    static C0259b m1711b(int i2) {
        return new C0259b(null, null, i2);
    }

    /* renamed from: c */
    static C0259b m1712c(ColorStateList colorStateList) {
        return new C0259b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0259b m1713d(Shader shader) {
        return new C0259b(shader, null, 0);
    }

    /* renamed from: g */
    public static C0259b m1714g(Resources resources, int i2, Resources.Theme theme) {
        try {
            return m1710a(resources, i2, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    /* renamed from: e */
    public int m1715e() {
        return this.f2196c;
    }

    /* renamed from: f */
    public Shader m1716f() {
        return this.f2194a;
    }

    /* renamed from: h */
    public boolean m1717h() {
        return this.f2194a != null;
    }

    /* renamed from: i */
    public boolean m1718i() {
        ColorStateList colorStateList;
        return this.f2194a == null && (colorStateList = this.f2195b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m1719j(int[] iArr) {
        if (m1718i()) {
            ColorStateList colorStateList = this.f2195b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2196c) {
                this.f2196c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m1720k(int i2) {
        this.f2196c = i2;
    }

    /* renamed from: l */
    public boolean m1721l() {
        return m1717h() || this.f2196c != 0;
    }
}
