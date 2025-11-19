package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.e;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes2.dex */
final class i extends f<ObjectAnimator> {

    /* renamed from: i, reason: collision with root package name */
    private static final Property<i, Float> f36960i = new b(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    private ObjectAnimator f36961c;

    /* renamed from: d, reason: collision with root package name */
    private M1.b f36962d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f36963e;

    /* renamed from: f, reason: collision with root package name */
    private int f36964f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36965g;

    /* renamed from: h, reason: collision with root package name */
    private float f36966h;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            i iVar = i.this;
            iVar.f36964f = (iVar.f36964f + 1) % i.this.f36963e.f36917c.length;
            i.this.f36965g = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class b extends Property<i, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(i iVar) {
            return Float.valueOf(iVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, Float f10) {
            iVar.r(f10.floatValue());
        }
    }

    public i(k kVar) {
        super(3);
        this.f36964f = 1;
        this.f36963e = kVar;
        this.f36962d = new M1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f36966h;
    }

    private void o() {
        if (this.f36961c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f36960i, 0.0f, 1.0f);
            this.f36961c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f36961c.setInterpolator(null);
            this.f36961c.setRepeatCount(-1);
            this.f36961c.addListener(new a());
        }
    }

    private void p() {
        if (!this.f36965g || this.f36951b.get(1).f36947b >= 1.0f) {
            return;
        }
        this.f36951b.get(2).f36948c = this.f36951b.get(1).f36948c;
        this.f36951b.get(1).f36948c = this.f36951b.get(0).f36948c;
        this.f36951b.get(0).f36948c = this.f36963e.f36917c[this.f36964f];
        this.f36965g = false;
    }

    private void s(int i10) {
        this.f36951b.get(0).f36946a = 0.0f;
        float fB = b(i10, 0, 667);
        e.a aVar = this.f36951b.get(0);
        e.a aVar2 = this.f36951b.get(1);
        float interpolation = this.f36962d.getInterpolation(fB);
        aVar2.f36946a = interpolation;
        aVar.f36947b = interpolation;
        e.a aVar3 = this.f36951b.get(1);
        e.a aVar4 = this.f36951b.get(2);
        float interpolation2 = this.f36962d.getInterpolation(fB + 0.49925038f);
        aVar4.f36946a = interpolation2;
        aVar3.f36947b = interpolation2;
        this.f36951b.get(2).f36947b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.f
    public void a() {
        ObjectAnimator objectAnimator = this.f36961c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.f
    public void g() {
        o();
        q();
        this.f36961c.start();
    }

    void q() {
        this.f36965g = true;
        this.f36964f = 1;
        for (e.a aVar : this.f36951b) {
            com.google.android.material.progressindicator.b bVar = this.f36963e;
            aVar.f36948c = bVar.f36917c[0];
            aVar.f36949d = bVar.f36921g / 2;
        }
    }

    void r(float f10) {
        this.f36966h = f10;
        s((int) (f10 * 333.0f));
        p();
        this.f36950a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.f
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.f
    public void h() {
    }

    @Override // com.google.android.material.progressindicator.f
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
    }
}
