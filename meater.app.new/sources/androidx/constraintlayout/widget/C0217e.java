package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0217e extends ViewGroup {

    /* renamed from: f */
    C0216d f1634f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public C0216d getConstraintSet() {
        if (this.f1634f == null) {
            this.f1634f = new C0216d();
        }
        this.f1634f.m1370g(this);
        return this.f1634f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0211b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* renamed from: androidx.constraintlayout.widget.e$a */
    public static class a extends ConstraintLayout.C0211b {

        /* renamed from: A0 */
        public float f1635A0;

        /* renamed from: B0 */
        public float f1636B0;

        /* renamed from: p0 */
        public float f1637p0;

        /* renamed from: q0 */
        public boolean f1638q0;

        /* renamed from: r0 */
        public float f1639r0;

        /* renamed from: s0 */
        public float f1640s0;

        /* renamed from: t0 */
        public float f1641t0;

        /* renamed from: u0 */
        public float f1642u0;

        /* renamed from: v0 */
        public float f1643v0;

        /* renamed from: w0 */
        public float f1644w0;

        /* renamed from: x0 */
        public float f1645x0;

        /* renamed from: y0 */
        public float f1646y0;

        /* renamed from: z0 */
        public float f1647z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1637p0 = 1.0f;
            this.f1638q0 = false;
            this.f1639r0 = 0.0f;
            this.f1640s0 = 0.0f;
            this.f1641t0 = 0.0f;
            this.f1642u0 = 0.0f;
            this.f1643v0 = 1.0f;
            this.f1644w0 = 1.0f;
            this.f1645x0 = 0.0f;
            this.f1646y0 = 0.0f;
            this.f1647z0 = 0.0f;
            this.f1635A0 = 0.0f;
            this.f1636B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1637p0 = 1.0f;
            this.f1638q0 = false;
            this.f1639r0 = 0.0f;
            this.f1640s0 = 0.0f;
            this.f1641t0 = 0.0f;
            this.f1642u0 = 0.0f;
            this.f1643v0 = 1.0f;
            this.f1644w0 = 1.0f;
            this.f1645x0 = 0.0f;
            this.f1646y0 = 0.0f;
            this.f1647z0 = 0.0f;
            this.f1635A0 = 0.0f;
            this.f1636B0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1910p2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1916q2) {
                    this.f1637p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1637p0);
                } else if (index == C0221i.f1660B2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f1639r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1639r0);
                        this.f1638q0 = true;
                    }
                } else if (index == C0221i.f1964y2) {
                    this.f1641t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1641t0);
                } else if (index == C0221i.f1970z2) {
                    this.f1642u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1642u0);
                } else if (index == C0221i.f1958x2) {
                    this.f1640s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1640s0);
                } else if (index == C0221i.f1946v2) {
                    this.f1643v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1643v0);
                } else if (index == C0221i.f1952w2) {
                    this.f1644w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1644w0);
                } else if (index == C0221i.f1922r2) {
                    this.f1645x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1645x0);
                } else if (index == C0221i.f1928s2) {
                    this.f1646y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1646y0);
                } else if (index == C0221i.f1934t2) {
                    this.f1647z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1647z0);
                } else if (index == C0221i.f1940u2) {
                    this.f1635A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1635A0);
                } else if (index == C0221i.f1654A2 && Build.VERSION.SDK_INT >= 21) {
                    this.f1636B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1636B0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
