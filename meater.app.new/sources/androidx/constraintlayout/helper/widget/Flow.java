package androidx.constraintlayout.helper.widget;

import a1.e;
import a1.g;
import a1.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.k;

/* loaded from: classes.dex */
public class Flow extends k {

    /* renamed from: M, reason: collision with root package name */
    private g f23797M;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.k, androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f23797M = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f24393V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24401W0) {
                    this.f23797M.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24409X0) {
                    this.f23797M.J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24497h1) {
                    this.f23797M.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24506i1) {
                    this.f23797M.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24417Y0) {
                    this.f23797M.M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24425Z0) {
                    this.f23797M.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24434a1) {
                    this.f23797M.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24443b1) {
                    this.f23797M.K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24282H1) {
                    this.f23797M.J2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24634x1) {
                    this.f23797M.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24274G1) {
                    this.f23797M.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24586r1) {
                    this.f23797M.s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24650z1) {
                    this.f23797M.A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24602t1) {
                    this.f23797M.u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24234B1) {
                    this.f23797M.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24618v1) {
                    this.f23797M.w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f24578q1) {
                    this.f23797M.r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f24642y1) {
                    this.f23797M.z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f24594s1) {
                    this.f23797M.t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f24226A1) {
                    this.f23797M.B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f24258E1) {
                    this.f23797M.G2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f24610u1) {
                    this.f23797M.v2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f24250D1) {
                    this.f23797M.F2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f24626w1) {
                    this.f23797M.x2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24266F1) {
                    this.f23797M.H2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f24242C1) {
                    this.f23797M.D2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f24051E = this.f23797M;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(e eVar, boolean z10) {
        this.f23797M.u1(z10);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        t(this.f23797M, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f23797M.r2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f23797M.s2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f23797M.t2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f23797M.u2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f23797M.v2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f23797M.w2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f23797M.x2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f23797M.y2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f23797M.z2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f23797M.A2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f23797M.B2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f23797M.C2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f23797M.D2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f23797M.E2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f23797M.J1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f23797M.K1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f23797M.M1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f23797M.N1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f23797M.P1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f23797M.F2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f23797M.G2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f23797M.H2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f23797M.I2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f23797M.J2(i10);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.k
    public void t(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.D1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.y1(), lVar.x1());
        }
    }
}
