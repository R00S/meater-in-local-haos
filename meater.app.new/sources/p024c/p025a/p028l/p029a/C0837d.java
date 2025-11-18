package p024c.p025a.p028l.p029a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p024c.p025a.p028l.p029a.C0835b;

/* compiled from: StateListDrawable.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: c.a.l.a.d */
/* loaded from: classes.dex */
class C0837d extends C0835b {

    /* renamed from: r */
    private a f5528r;

    /* renamed from: s */
    private boolean f5529s;

    /* compiled from: StateListDrawable.java */
    /* renamed from: c.a.l.a.d$a */
    static class a extends C0835b.c {

        /* renamed from: J */
        int[][] f5530J;

        a(a aVar, C0837d c0837d, Resources resources) {
            super(aVar, c0837d, resources);
            if (aVar != null) {
                this.f5530J = aVar.f5530J;
            } else {
                this.f5530J = new int[m5308f()][];
            }
        }

        /* renamed from: A */
        int m5329A(int[] iArr) {
            int[][] iArr2 = this.f5530J;
            int iM5310h = m5310h();
            for (int i2 = 0; i2 < iM5310h; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0837d(this, null);
        }

        @Override // p024c.p025a.p028l.p029a.C0835b.c
        /* renamed from: o */
        public void mo5317o(int i2, int i3) {
            super.mo5317o(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f5530J, 0, iArr, 0, i2);
            this.f5530J = iArr;
        }

        @Override // p024c.p025a.p028l.p029a.C0835b.c
        /* renamed from: r */
        void mo5288r() {
            int[][] iArr = this.f5530J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f5530J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f5530J = iArr2;
        }

        /* renamed from: z */
        int m5330z(int[] iArr, Drawable drawable) {
            int iM5304a = m5304a(drawable);
            this.f5530J[iM5304a] = iArr;
            return iM5304a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0837d(this, resources);
        }
    }

    C0837d(a aVar, Resources resources) {
        mo5274h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p024c.p025a.p028l.p029a.C0835b
    /* renamed from: h */
    void mo5274h(C0835b.c cVar) {
        super.mo5274h(cVar);
        if (cVar instanceof a) {
            this.f5528r = (a) cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p024c.p025a.p028l.p029a.C0835b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo5273b() {
        return new a(this.f5528r, this, null);
    }

    /* renamed from: k */
    int[] m5328k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i4 = i2 + 1;
                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i2] = attributeNameResource;
                i2 = i4;
            }
        }
        return StateSet.trimStateSet(iArr, i2);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5529s && super.mutate() == this) {
            this.f5528r.mo5288r();
            this.f5529s = true;
        }
        return this;
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM5329A = this.f5528r.m5329A(iArr);
        if (iM5329A < 0) {
            iM5329A = this.f5528r.m5329A(StateSet.WILD_CARD);
        }
        return m5298g(iM5329A) || zOnStateChange;
    }

    C0837d(a aVar) {
        if (aVar != null) {
            mo5274h(aVar);
        }
    }
}
