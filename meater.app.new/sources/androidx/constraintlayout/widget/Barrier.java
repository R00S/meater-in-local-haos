package androidx.constraintlayout.widget;

import a1.C1883a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: K, reason: collision with root package name */
    private int f23917K;

    /* renamed from: L, reason: collision with root package name */
    private int f23918L;

    /* renamed from: M, reason: collision with root package name */
    private C1883a f23919M;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(a1.e eVar, int i10, boolean z10) {
        this.f23918L = i10;
        if (z10) {
            int i11 = this.f23917K;
            if (i11 == 5) {
                this.f23918L = 1;
            } else if (i11 == 6) {
                this.f23918L = 0;
            }
        } else {
            int i12 = this.f23917K;
            if (i12 == 5) {
                this.f23918L = 0;
            } else if (i12 == 6) {
                this.f23918L = 1;
            }
        }
        if (eVar instanceof C1883a) {
            ((C1883a) eVar).B1(this.f23918L);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f23919M.v1();
    }

    public int getMargin() {
        return this.f23919M.x1();
    }

    public int getType() {
        return this.f23917K;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f23919M = new C1883a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f24393V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24533l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f24524k1) {
                    this.f23919M.A1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f24542m1) {
                    this.f23919M.C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f24051E = this.f23919M;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(a1.e eVar, boolean z10) {
        t(eVar, this.f23917K, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f23919M.A1(z10);
    }

    public void setDpMargin(int i10) {
        this.f23919M.C1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f23919M.C1(i10);
    }

    public void setType(int i10) {
        this.f23917K = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
