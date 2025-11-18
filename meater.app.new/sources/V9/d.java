package V9;

import S9.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* compiled from: DropAnimation.java */
/* loaded from: classes2.dex */
public class d extends V9.b<AnimatorSet> {

    /* renamed from: d, reason: collision with root package name */
    private int f18187d;

    /* renamed from: e, reason: collision with root package name */
    private int f18188e;

    /* renamed from: f, reason: collision with root package name */
    private int f18189f;

    /* renamed from: g, reason: collision with root package name */
    private int f18190g;

    /* renamed from: h, reason: collision with root package name */
    private int f18191h;

    /* renamed from: i, reason: collision with root package name */
    private U9.b f18192i;

    /* compiled from: DropAnimation.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f18193a;

        a(c cVar) {
            this.f18193a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.k(valueAnimator, this.f18193a);
        }
    }

    /* compiled from: DropAnimation.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18195a;

        static {
            int[] iArr = new int[c.values().length];
            f18195a = iArr;
            try {
                iArr[c.Width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18195a[c.Height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18195a[c.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: DropAnimation.java */
    private enum c {
        Width,
        Height,
        Radius
    }

    public d(b.a aVar) {
        super(aVar);
        this.f18192i = new U9.b();
    }

    private ValueAnimator h(int i10, int i11, long j10, c cVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.addUpdateListener(new a(cVar));
        return valueAnimatorOfInt;
    }

    private boolean j(int i10, int i11, int i12, int i13, int i14) {
        return (this.f18187d == i10 && this.f18188e == i11 && this.f18189f == i12 && this.f18190g == i13 && this.f18191h == i14) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(ValueAnimator valueAnimator, c cVar) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i10 = b.f18195a[cVar.ordinal()];
        if (i10 == 1) {
            this.f18192i.f(iIntValue);
        } else if (i10 == 2) {
            this.f18192i.d(iIntValue);
        } else if (i10 == 3) {
            this.f18192i.e(iIntValue);
        }
        b.a aVar = this.f18181b;
        if (aVar != null) {
            aVar.a(this.f18192i);
        }
    }

    @Override // V9.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public d i(long j10) {
        super.b(j10);
        return this;
    }

    @Override // V9.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d m(float f10) {
        T t10 = this.f18182c;
        if (t10 != 0) {
            long j10 = (long) (f10 * this.f18180a);
            Iterator<Animator> it = ((AnimatorSet) t10).getChildAnimations().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j11 = z10 ? j10 - duration : j10;
                if (j11 >= 0) {
                    if (j11 >= duration) {
                        j11 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j11);
                    }
                    if (!z10 && duration >= this.f18180a) {
                        z10 = true;
                    }
                }
            }
        }
        return this;
    }

    public d m(int i10, int i11, int i12, int i13, int i14) {
        if (j(i10, i11, i12, i13, i14)) {
            this.f18182c = a();
            this.f18187d = i10;
            this.f18188e = i11;
            this.f18189f = i12;
            this.f18190g = i13;
            this.f18191h = i14;
            int i15 = (int) (i14 / 1.5d);
            long j10 = this.f18180a;
            long j11 = j10 / 2;
            ValueAnimator valueAnimatorH = h(i10, i11, j10, c.Width);
            c cVar = c.Height;
            ValueAnimator valueAnimatorH2 = h(i12, i13, j11, cVar);
            c cVar2 = c.Radius;
            ValueAnimator valueAnimatorH3 = h(i14, i15, j11, cVar2);
            ((AnimatorSet) this.f18182c).play(valueAnimatorH2).with(valueAnimatorH3).with(valueAnimatorH).before(h(i13, i12, j11, cVar)).before(h(i15, i14, j11, cVar2));
        }
        return this;
    }
}
