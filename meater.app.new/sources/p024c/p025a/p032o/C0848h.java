package p024c.p025a.p032o;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0281a0;
import androidx.core.view.C0315y;
import androidx.core.view.InterfaceC0316z;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* renamed from: c.a.o.h */
/* loaded from: classes.dex */
public class C0848h {

    /* renamed from: c */
    private Interpolator f5619c;

    /* renamed from: d */
    InterfaceC0316z f5620d;

    /* renamed from: e */
    private boolean f5621e;

    /* renamed from: b */
    private long f5618b = -1;

    /* renamed from: f */
    private final C0281a0 f5622f = new a();

    /* renamed from: a */
    final ArrayList<C0315y> f5617a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* renamed from: c.a.o.h$a */
    class a extends C0281a0 {

        /* renamed from: a */
        private boolean f5623a = false;

        /* renamed from: b */
        private int f5624b = 0;

        a() {
        }

        /* renamed from: a */
        void m5369a() {
            this.f5624b = 0;
            this.f5623a = false;
            C0848h.this.m5362b();
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationEnd(View view) {
            int i2 = this.f5624b + 1;
            this.f5624b = i2;
            if (i2 == C0848h.this.f5617a.size()) {
                InterfaceC0316z interfaceC0316z = C0848h.this.f5620d;
                if (interfaceC0316z != null) {
                    interfaceC0316z.onAnimationEnd(null);
                }
                m5369a();
            }
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationStart(View view) {
            if (this.f5623a) {
                return;
            }
            this.f5623a = true;
            InterfaceC0316z interfaceC0316z = C0848h.this.f5620d;
            if (interfaceC0316z != null) {
                interfaceC0316z.onAnimationStart(null);
            }
        }
    }

    /* renamed from: a */
    public void m5361a() {
        if (this.f5621e) {
            Iterator<C0315y> it = this.f5617a.iterator();
            while (it.hasNext()) {
                it.next().m2218b();
            }
            this.f5621e = false;
        }
    }

    /* renamed from: b */
    void m5362b() {
        this.f5621e = false;
    }

    /* renamed from: c */
    public C0848h m5363c(C0315y c0315y) {
        if (!this.f5621e) {
            this.f5617a.add(c0315y);
        }
        return this;
    }

    /* renamed from: d */
    public C0848h m5364d(C0315y c0315y, C0315y c0315y2) {
        this.f5617a.add(c0315y);
        c0315y2.m2223h(c0315y.m2219c());
        this.f5617a.add(c0315y2);
        return this;
    }

    /* renamed from: e */
    public C0848h m5365e(long j2) {
        if (!this.f5621e) {
            this.f5618b = j2;
        }
        return this;
    }

    /* renamed from: f */
    public C0848h m5366f(Interpolator interpolator) {
        if (!this.f5621e) {
            this.f5619c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0848h m5367g(InterfaceC0316z interfaceC0316z) {
        if (!this.f5621e) {
            this.f5620d = interfaceC0316z;
        }
        return this;
    }

    /* renamed from: h */
    public void m5368h() {
        if (this.f5621e) {
            return;
        }
        Iterator<C0315y> it = this.f5617a.iterator();
        while (it.hasNext()) {
            C0315y next = it.next();
            long j2 = this.f5618b;
            if (j2 >= 0) {
                next.m2220d(j2);
            }
            Interpolator interpolator = this.f5619c;
            if (interpolator != null) {
                next.m2221e(interpolator);
            }
            if (this.f5620d != null) {
                next.m2222f(this.f5622f);
            }
            next.m2225j();
        }
        this.f5621e = true;
    }
}
