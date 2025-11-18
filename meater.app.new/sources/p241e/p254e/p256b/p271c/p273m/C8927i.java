package p241e.p254e.p256b.p271c.p273m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* renamed from: e.e.b.c.m.i */
/* loaded from: classes2.dex */
public class C8927i {

    /* renamed from: a */
    private long f34385a;

    /* renamed from: b */
    private long f34386b;

    /* renamed from: c */
    private TimeInterpolator f34387c;

    /* renamed from: d */
    private int f34388d;

    /* renamed from: e */
    private int f34389e;

    public C8927i(long j2, long j3) {
        this.f34385a = 0L;
        this.f34386b = 300L;
        this.f34387c = null;
        this.f34388d = 0;
        this.f34389e = 1;
        this.f34385a = j2;
        this.f34386b = j3;
    }

    /* renamed from: b */
    static C8927i m28449b(ValueAnimator valueAnimator) {
        C8927i c8927i = new C8927i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m28450f(valueAnimator));
        c8927i.f34388d = valueAnimator.getRepeatCount();
        c8927i.f34389e = valueAnimator.getRepeatMode();
        return c8927i;
    }

    /* renamed from: f */
    private static TimeInterpolator m28450f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C8919a.f34371b : interpolator instanceof AccelerateInterpolator ? C8919a.f34372c : interpolator instanceof DecelerateInterpolator ? C8919a.f34373d : interpolator;
    }

    /* renamed from: a */
    public void m28451a(Animator animator) {
        animator.setStartDelay(m28452c());
        animator.setDuration(m28453d());
        animator.setInterpolator(m28454e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m28455g());
            valueAnimator.setRepeatMode(m28456h());
        }
    }

    /* renamed from: c */
    public long m28452c() {
        return this.f34385a;
    }

    /* renamed from: d */
    public long m28453d() {
        return this.f34386b;
    }

    /* renamed from: e */
    public TimeInterpolator m28454e() {
        TimeInterpolator timeInterpolator = this.f34387c;
        return timeInterpolator != null ? timeInterpolator : C8919a.f34371b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8927i)) {
            return false;
        }
        C8927i c8927i = (C8927i) obj;
        if (m28452c() == c8927i.m28452c() && m28453d() == c8927i.m28453d() && m28455g() == c8927i.m28455g() && m28456h() == c8927i.m28456h()) {
            return m28454e().getClass().equals(c8927i.m28454e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int m28455g() {
        return this.f34388d;
    }

    /* renamed from: h */
    public int m28456h() {
        return this.f34389e;
    }

    public int hashCode() {
        return (((((((((int) (m28452c() ^ (m28452c() >>> 32))) * 31) + ((int) (m28453d() ^ (m28453d() >>> 32)))) * 31) + m28454e().getClass().hashCode()) * 31) + m28455g()) * 31) + m28456h();
    }

    public String toString() {
        return '\n' + C8927i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m28452c() + " duration: " + m28453d() + " interpolator: " + m28454e().getClass() + " repeatCount: " + m28455g() + " repeatMode: " + m28456h() + "}\n";
    }

    public C8927i(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.f34385a = 0L;
        this.f34386b = 300L;
        this.f34387c = null;
        this.f34388d = 0;
        this.f34389e = 1;
        this.f34385a = j2;
        this.f34386b = j3;
        this.f34387c = timeInterpolator;
    }
}
