package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends AbstractC0214b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0214b
    /* renamed from: h */
    protected void mo1311h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo1311h(attributeSet);
        this.f1513j = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0214b
    /* renamed from: j */
    public void mo1338j(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) getLayoutParams();
        c0211b.f1470n0.m5693U0(0);
        c0211b.f1470n0.m5737v0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0214b, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        m1348d();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        m1348d();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        m1348d();
    }
}
