package p024c.p088x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0311u;

/* compiled from: Fade.java */
/* renamed from: c.x.d */
/* loaded from: classes.dex */
public class C1029d extends AbstractC1042j0 {

    /* compiled from: Fade.java */
    /* renamed from: c.x.d$a */
    class a extends C1049n {

        /* renamed from: a */
        final /* synthetic */ View f6811a;

        a(View view) {
            this.f6811a = view;
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            C1028c0.m6567g(this.f6811a, 1.0f);
            C1028c0.m6561a(this.f6811a);
            abstractC1047m.mo6628T(this);
        }
    }

    /* compiled from: Fade.java */
    /* renamed from: c.x.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f6813a;

        /* renamed from: b */
        private boolean f6814b = false;

        b(View view) {
            this.f6813a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1028c0.m6567g(this.f6813a, 1.0f);
            if (this.f6814b) {
                this.f6813a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0311u.m2098K(this.f6813a) && this.f6813a.getLayerType() == 0) {
                this.f6814b = true;
                this.f6813a.setLayerType(2, null);
            }
        }
    }

    public C1029d(int i2) {
        m6600r0(i2);
    }

    /* renamed from: s0 */
    private Animator m6575s0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        C1028c0.m6567g(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C1028c0.f6809b, f3);
        objectAnimatorOfFloat.addListener(new b(view));
        mo6633b(new a(view));
        return objectAnimatorOfFloat;
    }

    /* renamed from: t0 */
    private static float m6576t0(C1054s c1054s, float f2) {
        Float f3;
        return (c1054s == null || (f3 = (Float) c1054s.f6933a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    @Override // p024c.p088x.AbstractC1042j0, p024c.p088x.AbstractC1047m
    /* renamed from: k */
    public void mo6540k(C1054s c1054s) {
        super.mo6540k(c1054s);
        c1054s.f6933a.put("android:fade:transitionAlpha", Float.valueOf(C1028c0.m6563c(c1054s.f6934b)));
    }

    @Override // p024c.p088x.AbstractC1042j0
    /* renamed from: m0 */
    public Animator mo6577m0(ViewGroup viewGroup, View view, C1054s c1054s, C1054s c1054s2) {
        float fM6576t0 = m6576t0(c1054s, 0.0f);
        return m6575s0(view, fM6576t0 != 1.0f ? fM6576t0 : 0.0f, 1.0f);
    }

    @Override // p024c.p088x.AbstractC1042j0
    /* renamed from: o0 */
    public Animator mo6578o0(ViewGroup viewGroup, View view, C1054s c1054s, C1054s c1054s2) {
        C1028c0.m6565e(view);
        return m6575s0(view, m6576t0(c1054s, 1.0f), 0.0f);
    }
}
