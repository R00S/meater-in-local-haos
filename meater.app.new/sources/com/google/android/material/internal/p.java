package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC2190k;
import androidx.transition.x;
import java.util.Map;

/* compiled from: TextScale.java */
/* loaded from: classes2.dex */
public class p extends AbstractC2190k {

    /* compiled from: TextScale.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f36792a;

        a(TextView textView) {
            this.f36792a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f36792a.setScaleX(fFloatValue);
            this.f36792a.setScaleY(fFloatValue);
        }
    }

    private void y0(x xVar) {
        View view = xVar.f29592b;
        if (view instanceof TextView) {
            xVar.f29591a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void k(x xVar) {
        y0(xVar);
    }

    @Override // androidx.transition.AbstractC2190k
    public void n(x xVar) {
        y0(xVar);
    }

    @Override // androidx.transition.AbstractC2190k
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.f29592b instanceof TextView)) {
            return null;
        }
        View view = xVar2.f29592b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = xVar.f29591a;
        Map<String, Object> map2 = xVar2.f29591a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
