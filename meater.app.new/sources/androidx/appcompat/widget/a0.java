package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import i1.h;
import j.C3699a;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21613a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f21614b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f21615c;

    private a0(Context context, TypedArray typedArray) {
        this.f21613a = context;
        this.f21614b = typedArray;
    }

    public static a0 t(Context context, int i10, int[] iArr) {
        return new a0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static a0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new a0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f21614b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f21614b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f21614b.hasValue(i10) || (resourceId = this.f21614b.getResourceId(i10, 0)) == 0 || (colorStateListA = C3699a.a(this.f21613a, resourceId)) == null) ? this.f21614b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f21614b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f21614b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f21614b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f21614b.hasValue(i10) || (resourceId = this.f21614b.getResourceId(i10, 0)) == 0) ? this.f21614b.getDrawable(i10) : C3699a.b(this.f21613a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f21614b.hasValue(i10) || (resourceId = this.f21614b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1987i.b().d(this.f21613a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f21614b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f21614b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f21615c == null) {
            this.f21615c = new TypedValue();
        }
        return i1.h.h(this.f21613a, resourceId, this.f21615c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f21614b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f21614b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f21614b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f21614b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f21614b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f21614b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f21614b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f21614b;
    }

    public boolean s(int i10) {
        return this.f21614b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f21614b.peekValue(i10);
    }

    public void x() {
        this.f21614b.recycle();
    }
}
