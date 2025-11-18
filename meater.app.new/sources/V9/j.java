package V9;

import S9.b;
import V9.k;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: ThinWormAnimation.java */
/* loaded from: classes2.dex */
public class j extends k {

    /* renamed from: k, reason: collision with root package name */
    private U9.g f18216k;

    /* compiled from: ThinWormAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.this.r(valueAnimator);
        }
    }

    public j(b.a aVar) {
        super(aVar);
        this.f18216k = new U9.g();
    }

    private ValueAnimator p(int i10, int i11, long j10) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.addUpdateListener(new a());
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(ValueAnimator valueAnimator) {
        this.f18216k.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18216k);
        }
    }

    @Override // V9.k
    public k n(int i10, int i11, int i12, boolean z10) {
        if (k(i10, i11, i12, z10)) {
            this.f18182c = a();
            this.f18218d = i10;
            this.f18219e = i11;
            this.f18220f = i12;
            this.f18221g = z10;
            int i13 = i12 * 2;
            int i14 = i10 - i12;
            this.f18222h = i14;
            this.f18223i = i10 + i12;
            this.f18216k.d(i14);
            this.f18216k.c(this.f18223i);
            this.f18216k.f(i13);
            k.b bVarH = h(z10);
            long j10 = this.f18180a;
            long j11 = (long) (j10 * 0.8d);
            long j12 = (long) (j10 * 0.2d);
            long j13 = (long) (j10 * 0.5d);
            long j14 = (long) (j10 * 0.5d);
            ValueAnimator valueAnimatorI = i(bVarH.f18228a, bVarH.f18229b, j11, false, this.f18216k);
            ValueAnimator valueAnimatorI2 = i(bVarH.f18230c, bVarH.f18231d, j11, true, this.f18216k);
            valueAnimatorI2.setStartDelay(j12);
            ValueAnimator valueAnimatorP = p(i13, i12, j13);
            ValueAnimator valueAnimatorP2 = p(i12, i13, j13);
            valueAnimatorP2.setStartDelay(j14);
            ((AnimatorSet) this.f18182c).playTogether(valueAnimatorI, valueAnimatorI2, valueAnimatorP, valueAnimatorP2);
        }
        return this;
    }

    @Override // V9.k
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public j j(long j10) {
        super.j(j10);
        return this;
    }

    @Override // V9.k
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j m(float f10) {
        T t10 = this.f18182c;
        if (t10 != 0) {
            long j10 = (long) (f10 * this.f18180a);
            int size = ((AnimatorSet) t10).getChildAnimations().size();
            for (int i10 = 0; i10 < size; i10++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f18182c).getChildAnimations().get(i10);
                long startDelay = j10 - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i10 != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
