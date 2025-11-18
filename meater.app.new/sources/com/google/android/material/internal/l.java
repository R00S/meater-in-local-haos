package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f36763a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private b f36764b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f36765c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f36766d = new a();

    /* compiled from: StateListAnimator.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l lVar = l.this;
            if (lVar.f36765c == animator) {
                lVar.f36765c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f36768a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f36769b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f36768a = iArr;
            this.f36769b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f36766d);
        this.f36763a.add(bVar);
    }
}
