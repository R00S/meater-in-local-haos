package V9;

import S9.b;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: SlideAnimation.java */
/* loaded from: classes2.dex */
public class h extends b<ValueAnimator> {

    /* renamed from: d, reason: collision with root package name */
    private U9.e f18208d;

    /* renamed from: e, reason: collision with root package name */
    private int f18209e;

    /* renamed from: f, reason: collision with root package name */
    private int f18210f;

    /* compiled from: SlideAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.this.j(valueAnimator);
        }
    }

    public h(b.a aVar) {
        super(aVar);
        this.f18209e = -1;
        this.f18210f = -1;
        this.f18208d = new U9.e();
    }

    private PropertyValuesHolder h() {
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", this.f18209e, this.f18210f);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    private boolean i(int i10, int i11) {
        return (this.f18209e == i10 && this.f18210f == i11) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        this.f18208d.b(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18208d);
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
    public h m(float f10) {
        T t10 = this.f18182c;
        if (t10 != 0) {
            long j10 = (long) (f10 * this.f18180a);
            if (((ValueAnimator) t10).getValues() != null && ((ValueAnimator) this.f18182c).getValues().length > 0) {
                ((ValueAnimator) this.f18182c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }

    public h l(int i10, int i11) {
        if (this.f18182c != 0 && i(i10, i11)) {
            this.f18209e = i10;
            this.f18210f = i11;
            ((ValueAnimator) this.f18182c).setValues(h());
        }
        return this;
    }
}
