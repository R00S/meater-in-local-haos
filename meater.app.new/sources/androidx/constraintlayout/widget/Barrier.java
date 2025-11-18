package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import p024c.p044g.p048b.p049k.C0888a;
import p024c.p044g.p048b.p049k.C0892e;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0214b {

    /* renamed from: o */
    private int f1390o;

    /* renamed from: p */
    private int f1391p;

    /* renamed from: q */
    private C0888a f1392q;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: p */
    private void m1310p(C0892e c0892e, int i2, boolean z) {
        this.f1391p = i2;
        if (Build.VERSION.SDK_INT < 17) {
            int i3 = this.f1390o;
            if (i3 == 5) {
                this.f1391p = 0;
            } else if (i3 == 6) {
                this.f1391p = 1;
            }
        } else if (z) {
            int i4 = this.f1390o;
            if (i4 == 5) {
                this.f1391p = 1;
            } else if (i4 == 6) {
                this.f1391p = 0;
            }
        } else {
            int i5 = this.f1390o;
            if (i5 == 5) {
                this.f1391p = 0;
            } else if (i5 == 6) {
                this.f1391p = 1;
            }
        }
        if (c0892e instanceof C0888a) {
            ((C0888a) c0892e).m5623j1(this.f1391p);
        }
    }

    public int getMargin() {
        return this.f1392q.m5617f1();
    }

    public int getType() {
        return this.f1390o;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0214b
    /* renamed from: h */
    protected void mo1311h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo1311h(attributeSet);
        this.f1392q = new C0888a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0221i.f1809a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1872j1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0221i.f1865i1) {
                    this.f1392q.m5622i1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0221i.f1879k1) {
                    this.f1392q.m5624k1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1512i = this.f1392q;
        m1353n();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0214b
    /* renamed from: i */
    public void mo1312i(C0892e c0892e, boolean z) {
        m1310p(c0892e, this.f1390o, z);
    }

    /* renamed from: o */
    public boolean m1313o() {
        return this.f1392q.m5613d1();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1392q.m5622i1(z);
    }

    public void setDpMargin(int i2) {
        this.f1392q.m5624k1((int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i2) {
        this.f1392q.m5624k1(i2);
    }

    public void setType(int i2) {
        this.f1390o = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
