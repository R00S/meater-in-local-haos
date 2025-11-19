package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.e;
import java.util.Iterator;
import m1.C3946a;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
final class j extends f<ObjectAnimator> {

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f36968k = {533, 567, 850, 750};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f36969l = {1267, 1000, 333, 0};

    /* renamed from: m, reason: collision with root package name */
    private static final Property<j, Float> f36970m = new c(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    private ObjectAnimator f36971c;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f36972d;

    /* renamed from: e, reason: collision with root package name */
    private final Interpolator[] f36973e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f36974f;

    /* renamed from: g, reason: collision with root package name */
    private int f36975g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36976h;

    /* renamed from: i, reason: collision with root package name */
    private float f36977i;

    /* renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f36978j;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            j jVar = j.this;
            jVar.f36975g = (jVar.f36975g + 1) % j.this.f36974f.f36917c.length;
            j.this.f36976h = true;
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            j.this.a();
            j jVar = j.this;
            androidx.vectordrawable.graphics.drawable.b bVar = jVar.f36978j;
            if (bVar != null) {
                bVar.b(jVar.f36950a);
            }
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class c extends Property<j, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(j jVar) {
            return Float.valueOf(jVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(j jVar, Float f10) {
            jVar.r(f10.floatValue());
        }
    }

    public j(Context context, k kVar) {
        super(2);
        this.f36975g = 0;
        this.f36978j = null;
        this.f36974f = kVar;
        this.f36973e = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.a(context, C7.a.f2269a), androidx.vectordrawable.graphics.drawable.d.a(context, C7.a.f2270b), androidx.vectordrawable.graphics.drawable.d.a(context, C7.a.f2271c), androidx.vectordrawable.graphics.drawable.d.a(context, C7.a.f2272d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f36977i;
    }

    private void o() {
        if (this.f36971c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f36970m, 0.0f, 1.0f);
            this.f36971c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f36971c.setInterpolator(null);
            this.f36971c.setRepeatCount(-1);
            this.f36971c.addListener(new a());
        }
        if (this.f36972d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f36970m, 1.0f);
            this.f36972d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f36972d.setInterpolator(null);
            this.f36972d.addListener(new b());
        }
    }

    private void p() {
        if (this.f36976h) {
            Iterator<e.a> it = this.f36951b.iterator();
            while (it.hasNext()) {
                it.next().f36948c = this.f36974f.f36917c[this.f36975g];
            }
            this.f36976h = false;
        }
    }

    private void s(int i10) {
        for (int i11 = 0; i11 < this.f36951b.size(); i11++) {
            e.a aVar = this.f36951b.get(i11);
            int[] iArr = f36969l;
            int i12 = i11 * 2;
            int i13 = iArr[i12];
            int[] iArr2 = f36968k;
            aVar.f36946a = C3946a.a(this.f36973e[i12].getInterpolation(b(i10, i13, iArr2[i12])), 0.0f, 1.0f);
            int i14 = i12 + 1;
            aVar.f36947b = C3946a.a(this.f36973e[i14].getInterpolation(b(i10, iArr[i14], iArr2[i14])), 0.0f, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void a() {
        ObjectAnimator objectAnimator = this.f36971c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.f
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f36978j = bVar;
    }

    @Override // com.google.android.material.progressindicator.f
    public void f() {
        ObjectAnimator objectAnimator = this.f36972d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f36950a.isVisible()) {
            this.f36972d.setFloatValues(this.f36977i, 1.0f);
            this.f36972d.setDuration((long) ((1.0f - this.f36977i) * 1800.0f));
            this.f36972d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void g() {
        o();
        q();
        this.f36971c.start();
    }

    @Override // com.google.android.material.progressindicator.f
    public void h() {
        this.f36978j = null;
    }

    void q() {
        this.f36975g = 0;
        Iterator<e.a> it = this.f36951b.iterator();
        while (it.hasNext()) {
            it.next().f36948c = this.f36974f.f36917c[0];
        }
    }

    void r(float f10) {
        this.f36977i = f10;
        s((int) (f10 * 1800.0f));
        p();
        this.f36950a.invalidateSelf();
    }
}
