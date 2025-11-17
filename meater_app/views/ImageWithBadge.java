package com.apptionlabs.meater_app.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import b6.i5;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ImageWithBadge extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    i5 f10313q;

    /* renamed from: r, reason: collision with root package name */
    int f10314r;

    /* renamed from: s, reason: collision with root package name */
    boolean f10315s;

    /* renamed from: t, reason: collision with root package name */
    int f10316t;

    public ImageWithBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15905a, 0, 0);
        this.f10313q = (i5) androidx.databinding.g.h(LayoutInflater.from(context), 2131558562, this, true);
        setColor(obtainStyledAttributes.getColor(1, -16777216));
        setTag(obtainStyledAttributes.getInt(3, -1));
        e(obtainStyledAttributes.getBoolean(0, false));
        setIcon(obtainStyledAttributes.getResourceId(2, -1));
        if (f8.l0.w(getContext())) {
            f8.q0.i(this.f10313q.R, 2131099784, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ValueAnimator valueAnimator) {
        this.f10313q.S.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f10313q.S.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void d(int i10) {
        if (i10 == 0) {
            this.f10313q.Q.setVisibility(4);
        } else {
            this.f10313q.Q.setVisibility(0);
            this.f10313q.Q.setText(String.valueOf(i10));
        }
    }

    public void e(boolean z10) {
        int i10;
        AppCompatTextView appCompatTextView = this.f10313q.Q;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatTextView.setVisibility(i10);
    }

    public void f(int i10, int i11) {
        if (this.f10315s) {
            return;
        }
        if (i10 == this.f10316t) {
            f8.q0.d(this.f10313q.R.getBackground(), this.f10314r, false);
            this.f10313q.T.setVisibility(0);
            TypedValue typedValue = new TypedValue();
            getResources().getValue(2131165268, typedValue, true);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, typedValue.getFloat());
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.c0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ImageWithBadge.this.c(valueAnimator);
                }
            });
            ofFloat.setRepeatCount(1);
            ofFloat.setRepeatMode(2);
            ofFloat.start();
        } else {
            f8.q0.d(this.f10313q.R.getBackground(), f8.l0.i(getContext(), 2131100532), false);
            this.f10313q.T.setVisibility(8);
        }
        d(i11);
    }

    public void setColor(int i10) {
        if (this.f10315s) {
            return;
        }
        this.f10314r = i10;
        if (f8.l0.w(getContext())) {
            f8.q0.i(this.f10313q.S, 2131099784, true);
        }
        f8.q0.d(this.f10313q.S.getBackground(), i10, false);
        this.f10313q.T.setBackgroundColor(i10);
    }

    public void setDisabled(boolean z10) {
        this.f10315s = z10;
        if (z10) {
            f8.q0.d(this.f10313q.S.getBackground(), f8.l0.h(2131099781), false);
        }
    }

    public void setIcon(int i10) {
        f8.q0.e(this.f10313q.S, i10);
    }

    public void setIconColor(int i10) {
        this.f10313q.S.setColorFilter(i10);
    }

    public void setTag(int i10) {
        this.f10316t = i10;
    }
}
