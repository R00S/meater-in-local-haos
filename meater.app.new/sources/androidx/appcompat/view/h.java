package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import s1.C4434g0;
import s1.C4438i0;
import s1.InterfaceC4436h0;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f20908c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC4436h0 f20909d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20910e;

    /* renamed from: b, reason: collision with root package name */
    private long f20907b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final C4438i0 f20911f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<C4434g0> f20906a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    class a extends C4438i0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20912a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f20913b = 0;

        a() {
        }

        @Override // s1.InterfaceC4436h0
        public void b(View view) {
            int i10 = this.f20913b + 1;
            this.f20913b = i10;
            if (i10 == h.this.f20906a.size()) {
                InterfaceC4436h0 interfaceC4436h0 = h.this.f20909d;
                if (interfaceC4436h0 != null) {
                    interfaceC4436h0.b(null);
                }
                d();
            }
        }

        @Override // s1.C4438i0, s1.InterfaceC4436h0
        public void c(View view) {
            if (this.f20912a) {
                return;
            }
            this.f20912a = true;
            InterfaceC4436h0 interfaceC4436h0 = h.this.f20909d;
            if (interfaceC4436h0 != null) {
                interfaceC4436h0.c(null);
            }
        }

        void d() {
            this.f20913b = 0;
            this.f20912a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f20910e) {
            Iterator<C4434g0> it = this.f20906a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f20910e = false;
        }
    }

    void b() {
        this.f20910e = false;
    }

    public h c(C4434g0 c4434g0) {
        if (!this.f20910e) {
            this.f20906a.add(c4434g0);
        }
        return this;
    }

    public h d(C4434g0 c4434g0, C4434g0 c4434g02) {
        this.f20906a.add(c4434g0);
        c4434g02.j(c4434g0.d());
        this.f20906a.add(c4434g02);
        return this;
    }

    public h e(long j10) {
        if (!this.f20910e) {
            this.f20907b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f20910e) {
            this.f20908c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC4436h0 interfaceC4436h0) {
        if (!this.f20910e) {
            this.f20909d = interfaceC4436h0;
        }
        return this;
    }

    public void h() {
        if (this.f20910e) {
            return;
        }
        Iterator<C4434g0> it = this.f20906a.iterator();
        while (it.hasNext()) {
            C4434g0 next = it.next();
            long j10 = this.f20907b;
            if (j10 >= 0) {
                next.f(j10);
            }
            Interpolator interpolator = this.f20908c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f20909d != null) {
                next.h(this.f20911f);
            }
            next.l();
        }
        this.f20910e = true;
    }
}
