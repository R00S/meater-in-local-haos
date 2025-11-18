package D7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f3501a;

    /* renamed from: b, reason: collision with root package name */
    private long f3502b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f3503c;

    /* renamed from: d, reason: collision with root package name */
    private int f3504d;

    /* renamed from: e, reason: collision with root package name */
    private int f3505e;

    public i(long j10, long j11) {
        this.f3503c = null;
        this.f3504d = 0;
        this.f3505e = 1;
        this.f3501a = j10;
        this.f3502b = j11;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f3504d = valueAnimator.getRepeatCount();
        iVar.f3505e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f3487b : interpolator instanceof AccelerateInterpolator ? a.f3488c : interpolator instanceof DecelerateInterpolator ? a.f3489d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f3501a;
    }

    public long d() {
        return this.f3502b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f3503c;
        return timeInterpolator != null ? timeInterpolator : a.f3487b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f3504d;
    }

    public int h() {
        return this.f3505e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f3504d = 0;
        this.f3505e = 1;
        this.f3501a = j10;
        this.f3502b = j11;
        this.f3503c = timeInterpolator;
    }
}
