package com.google.android.material.progressindicator;

import C7.l;
import android.content.Context;
import android.util.AttributeSet;
import s1.X;

/* loaded from: classes2.dex */
public class LinearProgressIndicator extends a<k> {

    /* renamed from: Q, reason: collision with root package name */
    public static final int f36895Q = l.f2558A;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2340y);
    }

    private void s() {
        h hVar = new h((k) this.f36897B);
        setIndeterminateDrawable(g.t(getContext(), (k) this.f36897B, hVar));
        setProgressDrawable(c.v(getContext(), (k) this.f36897B, hVar));
    }

    public int getIndeterminateAnimationType() {
        return ((k) this.f36897B).f36981h;
    }

    public int getIndicatorDirection() {
        return ((k) this.f36897B).f36982i;
    }

    public int getTrackStopIndicatorSize() {
        return ((k) this.f36897B).f36984k;
    }

    @Override // com.google.android.material.progressindicator.a
    public void o(int i10, boolean z10) {
        S s10 = this.f36897B;
        if (s10 != 0 && ((k) s10).f36981h == 0 && isIndeterminate()) {
            return;
        }
        super.o(i10, z10);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f36897B;
        k kVar = (k) s10;
        boolean z11 = true;
        if (((k) s10).f36982i != 1 && ((X.z(this) != 1 || ((k) this.f36897B).f36982i != 2) && (X.z(this) != 0 || ((k) this.f36897B).f36982i != 3))) {
            z11 = false;
        }
        kVar.f36983j = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        g<k> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        c<k> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public k i(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((k) this.f36897B).f36981h == i10) {
            return;
        }
        if (q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s10 = this.f36897B;
        ((k) s10).f36981h = i10;
        ((k) s10).e();
        if (i10 == 0) {
            getIndeterminateDrawable().x(new i((k) this.f36897B));
        } else {
            getIndeterminateDrawable().x(new j(getContext(), (k) this.f36897B));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((k) this.f36897B).e();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.f36897B;
        ((k) s10).f36982i = i10;
        k kVar = (k) s10;
        boolean z10 = true;
        if (i10 != 1 && ((X.z(this) != 1 || ((k) this.f36897B).f36982i != 2) && (X.z(this) != 0 || i10 != 3))) {
            z10 = false;
        }
        kVar.f36983j = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((k) this.f36897B).e();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        S s10 = this.f36897B;
        if (((k) s10).f36984k != i10) {
            ((k) s10).f36984k = Math.min(i10, ((k) s10).f36915a);
            ((k) this.f36897B).e();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f36895Q);
        s();
    }
}
