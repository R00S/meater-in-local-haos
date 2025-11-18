package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes2.dex */
public final class C8028f {

    /* renamed from: a */
    private final ArrayList<b> f30392a = new ArrayList<>();

    /* renamed from: b */
    private b f30393b = null;

    /* renamed from: c */
    ValueAnimator f30394c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f30395d = new a();

    /* compiled from: StateListAnimator.java */
    /* renamed from: com.google.android.material.internal.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8028f c8028f = C8028f.this;
            if (c8028f.f30394c == animator) {
                c8028f.f30394c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* renamed from: com.google.android.material.internal.f$b */
    static class b {

        /* renamed from: a */
        final int[] f30397a;

        /* renamed from: b */
        final ValueAnimator f30398b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f30397a = iArr;
            this.f30398b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m24663b() {
        ValueAnimator valueAnimator = this.f30394c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30394c = null;
        }
    }

    /* renamed from: e */
    private void m24664e(b bVar) {
        ValueAnimator valueAnimator = bVar.f30398b;
        this.f30394c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void m24665a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f30395d);
        this.f30392a.add(bVar);
    }

    /* renamed from: c */
    public void m24666c() {
        ValueAnimator valueAnimator = this.f30394c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f30394c = null;
        }
    }

    /* renamed from: d */
    public void m24667d(int[] iArr) {
        b bVar;
        int size = this.f30392a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f30392a.get(i2);
            if (StateSet.stateSetMatches(bVar.f30397a, iArr)) {
                break;
            } else {
                i2++;
            }
        }
        b bVar2 = this.f30393b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            m24663b();
        }
        this.f30393b = bVar;
        if (bVar != null) {
            m24664e(bVar);
        }
    }
}
