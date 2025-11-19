package V9;

import S9.b;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: FillAnimation.java */
/* loaded from: classes2.dex */
public class e extends c {

    /* renamed from: g, reason: collision with root package name */
    private U9.c f18200g;

    /* renamed from: h, reason: collision with root package name */
    private int f18201h;

    /* renamed from: i, reason: collision with root package name */
    private int f18202i;

    /* compiled from: FillAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.j(valueAnimator);
        }
    }

    public e(b.a aVar) {
        super(aVar);
        this.f18200g = new U9.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int iIntValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int iIntValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.f18200g.c(iIntValue);
        this.f18200g.d(iIntValue2);
        this.f18200g.i(iIntValue3);
        this.f18200g.j(iIntValue4);
        this.f18200g.k(iIntValue5);
        this.f18200g.l(iIntValue6);
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18200g);
        }
    }

    private PropertyValuesHolder n(boolean z10) {
        int i10;
        int i11;
        String str;
        if (z10) {
            i11 = this.f18201h;
            i10 = i11 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i10 = this.f18201h;
            i11 = i10 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    private PropertyValuesHolder o(boolean z10) {
        int i10;
        String str;
        int i11 = 0;
        if (z10) {
            str = "ANIMATION_STROKE_REVERSE";
            i11 = this.f18201h;
            i10 = 0;
        } else {
            i10 = this.f18201h;
            str = "ANIMATION_STROKE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i11, i10);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    private boolean p(int i10, int i11, int i12, int i13) {
        return (this.f18184e == i10 && this.f18185f == i11 && this.f18201h == i12 && this.f18202i == i13) ? false : true;
    }

    @Override // V9.c, V9.b
    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public e q(int i10, int i11, int i12, int i13) {
        if (this.f18182c != 0 && p(i10, i11, i12, i13)) {
            this.f18184e = i10;
            this.f18185f = i11;
            this.f18201h = i12;
            this.f18202i = i13;
            ((ValueAnimator) this.f18182c).setValues(h(false), h(true), n(false), n(true), o(false), o(true));
        }
        return this;
    }
}
