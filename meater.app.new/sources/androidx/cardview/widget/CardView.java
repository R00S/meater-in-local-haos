package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import r.C4327a;
import r.C4328b;
import r.C4329c;
import r.C4330d;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: I, reason: collision with root package name */
    private static final int[] f21809I = {R.attr.colorBackground};

    /* renamed from: J, reason: collision with root package name */
    private static final c f21810J;

    /* renamed from: B, reason: collision with root package name */
    private boolean f21811B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21812C;

    /* renamed from: D, reason: collision with root package name */
    int f21813D;

    /* renamed from: E, reason: collision with root package name */
    int f21814E;

    /* renamed from: F, reason: collision with root package name */
    final Rect f21815F;

    /* renamed from: G, reason: collision with root package name */
    final Rect f21816G;

    /* renamed from: H, reason: collision with root package name */
    private final b f21817H;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f21818a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f21816G.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f21815F;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void b(Drawable drawable) {
            this.f21818a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable e() {
            return this.f21818a;
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f21810J = aVar;
        aVar.j();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4327a.f48313a);
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f21815F.set(i10, i11, i12, i13);
        f21810J.i(this.f21817H);
    }

    public ColorStateList getCardBackgroundColor() {
        return f21810J.h(this.f21817H);
    }

    public float getCardElevation() {
        return f21810J.c(this.f21817H);
    }

    public int getContentPaddingBottom() {
        return this.f21815F.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f21815F.left;
    }

    public int getContentPaddingRight() {
        return this.f21815F.right;
    }

    public int getContentPaddingTop() {
        return this.f21815F.top;
    }

    public float getMaxCardElevation() {
        return f21810J.g(this.f21817H);
    }

    public boolean getPreventCornerOverlap() {
        return this.f21812C;
    }

    public float getRadius() {
        return f21810J.d(this.f21817H);
    }

    public boolean getUseCompatPadding() {
        return this.f21811B;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (f21810J instanceof androidx.cardview.widget.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.f21817H)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f21817H)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f21810J.n(this.f21817H, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f21810J.f(this.f21817H, f10);
    }

    public void setMaxCardElevation(float f10) {
        f21810J.o(this.f21817H, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f21814E = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f21813D = i10;
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f21812C) {
            this.f21812C = z10;
            f21810J.m(this.f21817H);
        }
    }

    public void setRadius(float f10) {
        f21810J.b(this.f21817H, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f21811B != z10) {
            this.f21811B = z10;
            f21810J.e(this.f21817H);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f21815F = rect;
        this.f21816G = new Rect();
        a aVar = new a();
        this.f21817H = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4330d.f48317a, i10, C4329c.f48316a);
        int i11 = C4330d.f48320d;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f21809I);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C4328b.f48315b) : getResources().getColor(C4328b.f48314a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C4330d.f48321e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C4330d.f48322f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C4330d.f48323g, 0.0f);
        this.f21811B = typedArrayObtainStyledAttributes.getBoolean(C4330d.f48325i, false);
        this.f21812C = typedArrayObtainStyledAttributes.getBoolean(C4330d.f48324h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48326j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48328l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48330n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48329m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48327k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f21813D = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48318b, 0);
        this.f21814E = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4330d.f48319c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f21810J.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f21810J.n(this.f21817H, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
