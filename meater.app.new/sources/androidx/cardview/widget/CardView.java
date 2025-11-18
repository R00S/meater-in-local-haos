package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p024c.p040d.C0862a;
import p024c.p040d.C0863b;
import p024c.p040d.C0865d;
import p024c.p040d.C0866e;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    private static final int[] f1347f = {R.attr.colorBackground};

    /* renamed from: g */
    private static final InterfaceC0207e f1348g;

    /* renamed from: h */
    private boolean f1349h;

    /* renamed from: i */
    private boolean f1350i;

    /* renamed from: j */
    int f1351j;

    /* renamed from: k */
    int f1352k;

    /* renamed from: l */
    final Rect f1353l;

    /* renamed from: m */
    final Rect f1354m;

    /* renamed from: n */
    private final InterfaceC0206d f1355n;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0202a implements InterfaceC0206d {

        /* renamed from: a */
        private Drawable f1356a;

        C0202a() {
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: a */
        public void mo1255a(int i2, int i3, int i4, int i5) {
            CardView.this.f1354m.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1353l;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: b */
        public void mo1256b(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.f1351j) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.f1352k) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: c */
        public void mo1257c(Drawable drawable) {
            this.f1356a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: d */
        public boolean mo1258d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: e */
        public boolean mo1259e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: f */
        public Drawable mo1260f() {
            return this.f1356a;
        }

        @Override // androidx.cardview.widget.InterfaceC0206d
        /* renamed from: g */
        public View mo1261g() {
            return CardView.this;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            f1348g = new C0204b();
        } else if (i2 >= 17) {
            f1348g = new C0203a();
        } else {
            f1348g = new C0205c();
        }
        f1348g.mo1262j();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0862a.f5687a);
    }

    /* renamed from: f */
    public void m1254f(int i2, int i3, int i4, int i5) {
        this.f1353l.set(i2, i3, i4, i5);
        f1348g.mo1273i(this.f1355n);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1348g.mo1272h(this.f1355n);
    }

    public float getCardElevation() {
        return f1348g.mo1267c(this.f1355n);
    }

    public int getContentPaddingBottom() {
        return this.f1353l.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1353l.left;
    }

    public int getContentPaddingRight() {
        return this.f1353l.right;
    }

    public int getContentPaddingTop() {
        return this.f1353l.top;
    }

    public float getMaxCardElevation() {
        return f1348g.mo1271g(this.f1355n);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1350i;
    }

    public float getRadius() {
        return f1348g.mo1268d(this.f1355n);
    }

    public boolean getUseCompatPadding() {
        return this.f1349h;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (f1348g instanceof C0204b) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1275l(this.f1355n)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1274k(this.f1355n)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f1348g.mo1277n(this.f1355n, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        f1348g.mo1270f(this.f1355n, f2);
    }

    public void setMaxCardElevation(float f2) {
        f1348g.mo1278o(this.f1355n, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f1352k = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f1351j = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1350i) {
            this.f1350i = z;
            f1348g.mo1276m(this.f1355n);
        }
    }

    public void setRadius(float f2) {
        f1348g.mo1266b(this.f1355n, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1349h != z) {
            this.f1349h = z;
            f1348g.mo1269e(this.f1355n);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.f1353l = rect;
        this.f1354m = new Rect();
        C0202a c0202a = new C0202a();
        this.f1355n = c0202a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0866e.f5694a, i2, C0865d.f5693a);
        int i3 = C0866e.f5697d;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1347f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C0863b.f5689b) : getResources().getColor(C0863b.f5688a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C0866e.f5698e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C0866e.f5699f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C0866e.f5700g, 0.0f);
        this.f1349h = typedArrayObtainStyledAttributes.getBoolean(C0866e.f5702i, false);
        this.f1350i = typedArrayObtainStyledAttributes.getBoolean(C0866e.f5701h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5703j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5705l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5707n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5706m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5704k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1351j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5695b, 0);
        this.f1352k = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0866e.f5696c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1348g.mo1265a(c0202a, context, colorStateList, dimension, dimension2, f2);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1348g.mo1277n(this.f1355n, colorStateList);
    }
}
