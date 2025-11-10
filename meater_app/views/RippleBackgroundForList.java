package com.apptionlabs.meater_app.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/meat/meat/classes.dex */
public class RippleBackgroundForList extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    private boolean f10397q;

    /* renamed from: r, reason: collision with root package name */
    private AnimatorSet f10398r;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList<a> f10399s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a extends View {
        public a(RippleBackgroundForList rippleBackgroundForList, Context context) {
            super(context);
            setVisibility(4);
            setBackground(f8.l0.j(context, 2131231512));
        }
    }

    public RippleBackgroundForList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10397q = false;
        this.f10399s = new ArrayList<>();
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (isInEditMode() || attributeSet != null) {
        } else {
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
    }

    public boolean b() {
        return this.f10397q;
    }

    public void c(float f10, int i10, int i11, float f11) {
        int i12 = i10 / i11;
        int i13 = (int) (2.0f * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i13, i13);
        int i14 = -1;
        layoutParams.addRule(13, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10398r = animatorSet;
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        int i15 = 0;
        while (i15 < i11) {
            a aVar = new a(this, getContext());
            addView(aVar, layoutParams);
            this.f10399s.add(aVar);
            float[] fArr = new float[2];
            fArr[c10] = 1.0f;
            fArr[1] = f11;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "ScaleX", fArr);
            ofFloat.setRepeatCount(i14);
            ofFloat.setRepeatMode(1);
            long j10 = i10;
            ofFloat.setDuration(j10);
            long j11 = i15 * i12;
            ofFloat.setCurrentPlayTime(j11);
            arrayList.add(ofFloat);
            float[] fArr2 = new float[2];
            fArr2[c10] = 1.0f;
            fArr2[1] = f11;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, "ScaleY", fArr2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setDuration(j10);
            ofFloat2.setCurrentPlayTime(j11);
            arrayList.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar, "Alpha", 1.0f, 0.0f);
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setDuration(j10);
            ofFloat3.setCurrentPlayTime(j11);
            arrayList.add(ofFloat3);
            i15++;
            i14 = -1;
            c10 = 0;
        }
        for (int i16 = 0; i16 < i11 * 3; i16++) {
            ObjectAnimator objectAnimator = (ObjectAnimator) arrayList.get(i16);
            objectAnimator.start();
            objectAnimator.setCurrentPlayTime((i16 / 3) * i12);
        }
    }

    public void d() {
        if (this.f10398r == null) {
            return;
        }
        if (!b() || !this.f10398r.isRunning()) {
            Iterator<a> it = this.f10399s.iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            this.f10397q = true;
            if (this.f10398r.isRunning()) {
                this.f10398r.resume();
            } else {
                this.f10398r.start();
            }
        }
    }

    public void e() {
        if (this.f10398r != null && this.f10397q) {
            Iterator<a> it = this.f10399s.iterator();
            while (it.hasNext()) {
                it.next().setVisibility(4);
            }
            this.f10398r.pause();
            this.f10397q = false;
        }
    }

    public void f(Probe probe) {
        if (probe.getCookState().getValue() >= DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue() && probe.getCookState().getValue() <= DeviceCookState.COOK_STATE_OVERCOOK.getValue()) {
            d();
        } else {
            e();
        }
    }
}
