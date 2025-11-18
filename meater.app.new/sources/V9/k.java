package V9;

import S9.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* compiled from: WormAnimation.java */
/* loaded from: classes2.dex */
public class k extends V9.b<AnimatorSet> {

    /* renamed from: d, reason: collision with root package name */
    int f18218d;

    /* renamed from: e, reason: collision with root package name */
    int f18219e;

    /* renamed from: f, reason: collision with root package name */
    int f18220f;

    /* renamed from: g, reason: collision with root package name */
    boolean f18221g;

    /* renamed from: h, reason: collision with root package name */
    int f18222h;

    /* renamed from: i, reason: collision with root package name */
    int f18223i;

    /* renamed from: j, reason: collision with root package name */
    private U9.h f18224j;

    /* compiled from: WormAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U9.h f18225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18226b;

        a(U9.h hVar, boolean z10) {
            this.f18225a = hVar;
            this.f18226b = z10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            k.this.l(this.f18225a, valueAnimator, this.f18226b);
        }
    }

    /* compiled from: WormAnimation.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        final int f18228a;

        /* renamed from: b, reason: collision with root package name */
        final int f18229b;

        /* renamed from: c, reason: collision with root package name */
        final int f18230c;

        /* renamed from: d, reason: collision with root package name */
        final int f18231d;

        b(int i10, int i11, int i12, int i13) {
            this.f18228a = i10;
            this.f18229b = i11;
            this.f18230c = i12;
            this.f18231d = i13;
        }
    }

    public k(b.a aVar) {
        super(aVar);
        this.f18224j = new U9.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(U9.h hVar, ValueAnimator valueAnimator, boolean z10) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.f18221g) {
            if (z10) {
                hVar.d(iIntValue);
            } else {
                hVar.c(iIntValue);
            }
        } else if (z10) {
            hVar.c(iIntValue);
        } else {
            hVar.d(iIntValue);
        }
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    @Override // V9.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    b h(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f18218d;
            int i15 = this.f18220f;
            i10 = i14 + i15;
            int i16 = this.f18219e;
            i11 = i16 + i15;
            i12 = i14 - i15;
            i13 = i16 - i15;
        } else {
            int i17 = this.f18218d;
            int i18 = this.f18220f;
            i10 = i17 - i18;
            int i19 = this.f18219e;
            i11 = i19 - i18;
            i12 = i17 + i18;
            i13 = i19 + i18;
        }
        return new b(i10, i11, i12, i13);
    }

    ValueAnimator i(int i10, int i11, long j10, boolean z10, U9.h hVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.addUpdateListener(new a(hVar, z10));
        return valueAnimatorOfInt;
    }

    public k j(long j10) {
        super.b(j10);
        return this;
    }

    boolean k(int i10, int i11, int i12, boolean z10) {
        return (this.f18218d == i10 && this.f18219e == i11 && this.f18220f == i12 && this.f18221g == z10) ? false : true;
    }

    @Override // V9.b
    public k m(float f10) {
        T t10 = this.f18182c;
        if (t10 == 0) {
            return this;
        }
        long j10 = (long) (f10 * this.f18180a);
        Iterator<Animator> it = ((AnimatorSet) t10).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j10 <= duration) {
                duration = j10;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j10 -= duration;
        }
        return this;
    }

    public k n(int i10, int i11, int i12, boolean z10) {
        if (k(i10, i11, i12, z10)) {
            this.f18182c = a();
            this.f18218d = i10;
            this.f18219e = i11;
            this.f18220f = i12;
            this.f18221g = z10;
            int i13 = i10 - i12;
            this.f18222h = i13;
            this.f18223i = i10 + i12;
            this.f18224j.d(i13);
            this.f18224j.c(this.f18223i);
            b bVarH = h(z10);
            long j10 = this.f18180a / 2;
            ((AnimatorSet) this.f18182c).playSequentially(i(bVarH.f18228a, bVarH.f18229b, j10, false, this.f18224j), i(bVarH.f18230c, bVarH.f18231d, j10, true, this.f18224j));
        }
        return this;
    }
}
