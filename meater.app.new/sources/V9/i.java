package V9;

import S9.b;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: SwapAnimation.java */
/* loaded from: classes2.dex */
public class i extends b<ValueAnimator> {

    /* renamed from: d, reason: collision with root package name */
    private int f18212d;

    /* renamed from: e, reason: collision with root package name */
    private int f18213e;

    /* renamed from: f, reason: collision with root package name */
    private U9.f f18214f;

    /* compiled from: SwapAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i.this.j(valueAnimator);
        }
    }

    public i(b.a aVar) {
        super(aVar);
        this.f18212d = -1;
        this.f18213e = -1;
        this.f18214f = new U9.f();
    }

    private PropertyValuesHolder h(String str, int i10, int i11) {
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    private boolean i(int i10, int i11) {
        return (this.f18212d == i10 && this.f18213e == i11) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.f18214f.c(iIntValue);
        this.f18214f.d(iIntValue2);
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18214f);
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

    @Override // V9.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public i m(float f10) {
        T t10 = this.f18182c;
        if (t10 != 0) {
            long j10 = (long) (f10 * this.f18180a);
            if (((ValueAnimator) t10).getValues() != null && ((ValueAnimator) this.f18182c).getValues().length > 0) {
                ((ValueAnimator) this.f18182c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }

    public i l(int i10, int i11) {
        if (this.f18182c != 0 && i(i10, i11)) {
            this.f18212d = i10;
            this.f18213e = i11;
            ((ValueAnimator) this.f18182c).setValues(h("ANIMATION_COORDINATE", i10, i11), h("ANIMATION_COORDINATE_REVERSE", i11, i10));
        }
        return this;
    }
}
