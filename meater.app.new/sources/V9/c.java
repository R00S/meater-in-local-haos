package V9;

import S9.b;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: ColorAnimation.java */
/* loaded from: classes2.dex */
public class c extends b<ValueAnimator> {

    /* renamed from: d, reason: collision with root package name */
    private U9.a f18183d;

    /* renamed from: e, reason: collision with root package name */
    int f18184e;

    /* renamed from: f, reason: collision with root package name */
    int f18185f;

    /* compiled from: ColorAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.j(valueAnimator);
        }
    }

    public c(b.a aVar) {
        super(aVar);
        this.f18183d = new U9.a();
    }

    private boolean i(int i10, int i11) {
        return (this.f18184e == i10 && this.f18185f == i11) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.f18183d.c(iIntValue);
        this.f18183d.d(iIntValue2);
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18183d);
        }
    }

    @Override // V9.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    PropertyValuesHolder h(boolean z10) {
        int i10;
        int i11;
        String str;
        if (z10) {
            i10 = this.f18185f;
            i11 = this.f18184e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i10 = this.f18184e;
            i11 = this.f18185f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
        return propertyValuesHolderOfInt;
    }

    @Override // V9.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c m(float f10) {
        T t10 = this.f18182c;
        if (t10 != 0) {
            long j10 = (long) (f10 * this.f18180a);
            if (((ValueAnimator) t10).getValues() != null && ((ValueAnimator) this.f18182c).getValues().length > 0) {
                ((ValueAnimator) this.f18182c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }

    public c l(int i10, int i11) {
        if (this.f18182c != 0 && i(i10, i11)) {
            this.f18184e = i10;
            this.f18185f = i11;
            ((ValueAnimator) this.f18182c).setValues(h(false), h(true));
        }
        return this;
    }
}
