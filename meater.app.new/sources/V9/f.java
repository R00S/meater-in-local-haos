package V9;

import S9.b;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: ScaleAnimation.java */
/* loaded from: classes2.dex */
public class f extends c {

    /* renamed from: g, reason: collision with root package name */
    int f18204g;

    /* renamed from: h, reason: collision with root package name */
    float f18205h;

    /* renamed from: i, reason: collision with root package name */
    private U9.d f18206i;

    /* compiled from: ScaleAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.j(valueAnimator);
        }
    }

    public f(b.a aVar) {
        super(aVar);
        this.f18206i = new U9.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.f18206i.c(iIntValue);
        this.f18206i.d(iIntValue2);
        this.f18206i.g(iIntValue3);
        this.f18206i.h(iIntValue4);
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18206i);
        }
    }

    private boolean o(int i10, int i11, int i12, float f10) {
        return (this.f18184e == i10 && this.f18185f == i11 && this.f18204g == i12 && this.f18205h == f10) ? false : true;
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

    protected PropertyValuesHolder n(boolean z10) {
        int i10;
        int i11;
        String str;
        if (z10) {
            i11 = this.f18204g;
            i10 = (int) (i11 * this.f18205h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i10 = this.f18204g;
            i11 = (int) (i10 * this.f18205h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i11, i10);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public f p(int i10, int i11, int i12, float f10) {
        if (this.f18182c != 0 && o(i10, i11, i12, f10)) {
            this.f18184e = i10;
            this.f18185f = i11;
            this.f18204g = i12;
            this.f18205h = f10;
            ((ValueAnimator) this.f18182c).setValues(h(false), h(true), n(false), n(true));
        }
        return this;
    }
}
