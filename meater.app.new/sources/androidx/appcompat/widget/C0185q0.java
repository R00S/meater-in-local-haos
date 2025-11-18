package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p003d.C0263f;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: TintTypedArray.java */
/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public class C0185q0 {

    /* renamed from: a */
    private final Context f1239a;

    /* renamed from: b */
    private final TypedArray f1240b;

    /* renamed from: c */
    private TypedValue f1241c;

    private C0185q0(Context context, TypedArray typedArray) {
        this.f1239a = context;
        this.f1240b = typedArray;
    }

    /* renamed from: t */
    public static C0185q0 m1089t(Context context, int i2, int[] iArr) {
        return new C0185q0(context, context.obtainStyledAttributes(i2, iArr));
    }

    /* renamed from: u */
    public static C0185q0 m1090u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0185q0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0185q0 m1091v(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new C0185q0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    /* renamed from: a */
    public boolean m1092a(int i2, boolean z) {
        return this.f1240b.getBoolean(i2, z);
    }

    /* renamed from: b */
    public int m1093b(int i2, int i3) {
        return this.f1240b.getColor(i2, i3);
    }

    /* renamed from: c */
    public ColorStateList m1094c(int i2) {
        int resourceId;
        ColorStateList colorStateListM5261c;
        return (!this.f1240b.hasValue(i2) || (resourceId = this.f1240b.getResourceId(i2, 0)) == 0 || (colorStateListM5261c = C0833a.m5261c(this.f1239a, resourceId)) == null) ? this.f1240b.getColorStateList(i2) : colorStateListM5261c;
    }

    /* renamed from: d */
    public float m1095d(int i2, float f2) {
        return this.f1240b.getDimension(i2, f2);
    }

    /* renamed from: e */
    public int m1096e(int i2, int i3) {
        return this.f1240b.getDimensionPixelOffset(i2, i3);
    }

    /* renamed from: f */
    public int m1097f(int i2, int i3) {
        return this.f1240b.getDimensionPixelSize(i2, i3);
    }

    /* renamed from: g */
    public Drawable m1098g(int i2) {
        int resourceId;
        return (!this.f1240b.hasValue(i2) || (resourceId = this.f1240b.getResourceId(i2, 0)) == 0) ? this.f1240b.getDrawable(i2) : C0833a.m5262d(this.f1239a, resourceId);
    }

    /* renamed from: h */
    public Drawable m1099h(int i2) {
        int resourceId;
        if (!this.f1240b.hasValue(i2) || (resourceId = this.f1240b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return C0166h.m1008b().m1013d(this.f1239a, resourceId, true);
    }

    /* renamed from: i */
    public float m1100i(int i2, float f2) {
        return this.f1240b.getFloat(i2, f2);
    }

    /* renamed from: j */
    public Typeface m1101j(int i2, int i3, C0263f.c cVar) {
        int resourceId = this.f1240b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1241c == null) {
            this.f1241c = new TypedValue();
        }
        return C0263f.m1753f(this.f1239a, resourceId, this.f1241c, i3, cVar);
    }

    /* renamed from: k */
    public int m1102k(int i2, int i3) {
        return this.f1240b.getInt(i2, i3);
    }

    /* renamed from: l */
    public int m1103l(int i2, int i3) {
        return this.f1240b.getInteger(i2, i3);
    }

    /* renamed from: m */
    public int m1104m(int i2, int i3) {
        return this.f1240b.getLayoutDimension(i2, i3);
    }

    /* renamed from: n */
    public int m1105n(int i2, int i3) {
        return this.f1240b.getResourceId(i2, i3);
    }

    /* renamed from: o */
    public String m1106o(int i2) {
        return this.f1240b.getString(i2);
    }

    /* renamed from: p */
    public CharSequence m1107p(int i2) {
        return this.f1240b.getText(i2);
    }

    /* renamed from: q */
    public CharSequence[] m1108q(int i2) {
        return this.f1240b.getTextArray(i2);
    }

    /* renamed from: r */
    public TypedArray m1109r() {
        return this.f1240b;
    }

    /* renamed from: s */
    public boolean m1110s(int i2) {
        return this.f1240b.hasValue(i2);
    }

    /* renamed from: w */
    public void m1111w() {
        this.f1240b.recycle();
    }
}
