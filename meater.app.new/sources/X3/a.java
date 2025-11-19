package X3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator.java */
/* loaded from: classes.dex */
public abstract class a extends ValueAnimator {

    /* renamed from: B, reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f18714B = new CopyOnWriteArraySet();

    /* renamed from: C, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f18715C = new CopyOnWriteArraySet();

    /* renamed from: D, reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f18716D = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f18715C.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f18716D.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18714B.add(animatorUpdateListener);
    }

    void b() {
        Iterator<Animator.AnimatorListener> it = this.f18715C.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void c(boolean z10) {
        Iterator<Animator.AnimatorListener> it = this.f18715C.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z10);
        }
    }

    void d() {
        Iterator<Animator.AnimatorPauseListener> it = this.f18716D.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void f() {
        Iterator<Animator.AnimatorListener> it = this.f18715C.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void g() {
        Iterator<Animator.AnimatorPauseListener> it = this.f18716D.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void h(boolean z10) {
        Iterator<Animator.AnimatorListener> it = this.f18715C.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z10);
        }
    }

    void i() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f18714B.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f18715C.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f18714B.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f18715C.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f18716D.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18714B.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
