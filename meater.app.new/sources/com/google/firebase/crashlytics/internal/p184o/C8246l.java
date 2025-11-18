package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.crashlytics.internal.p183n.C8231w;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserMetadata.java */
/* renamed from: com.google.firebase.crashlytics.h.o.l */
/* loaded from: classes2.dex */
public class C8246l {

    /* renamed from: a */
    private final C8241g f31113a;

    /* renamed from: b */
    private final C8231w f31114b;

    /* renamed from: c */
    private String f31115c;

    /* renamed from: d */
    private final a f31116d = new a(false);

    /* renamed from: e */
    private final a f31117e = new a(true);

    /* renamed from: f */
    private final C8245k f31118f = new C8245k(128);

    /* renamed from: g */
    private final AtomicMarkableReference<String> f31119g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserMetadata.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.l$a */
    class a {

        /* renamed from: a */
        final AtomicMarkableReference<C8239e> f31120a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f31121b = new AtomicReference<>(null);

        /* renamed from: c */
        private final boolean f31122c;

        public a(boolean z) {
            this.f31122c = z;
            this.f31120a = new AtomicMarkableReference<>(new C8239e(64, z ? 8192 : 1024), false);
        }

        /* renamed from: b */
        private /* synthetic */ Void m25547b() throws Exception {
            this.f31121b.set(null);
            m25549e();
            return null;
        }

        /* renamed from: d */
        private void m25548d() {
            Callable<Void> callable = new Callable() { // from class: com.google.firebase.crashlytics.h.o.a
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.f31063f.m25551c();
                    return null;
                }
            };
            if (this.f31121b.compareAndSet(null, callable)) {
                C8246l.this.f31114b.m25375g(callable);
            }
        }

        /* renamed from: e */
        private void m25549e() throws Throwable {
            Map<String, String> mapM25470a;
            synchronized (this) {
                if (this.f31120a.isMarked()) {
                    mapM25470a = this.f31120a.getReference().m25470a();
                    AtomicMarkableReference<C8239e> atomicMarkableReference = this.f31120a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    mapM25470a = null;
                }
            }
            if (mapM25470a != null) {
                C8246l.this.f31113a.m25496q(C8246l.this.f31115c, mapM25470a, this.f31122c);
            }
        }

        /* renamed from: a */
        public Map<String, String> m25550a() {
            return this.f31120a.getReference().m25470a();
        }

        /* renamed from: c */
        public /* synthetic */ Void m25551c() throws Exception {
            m25547b();
            return null;
        }

        /* renamed from: f */
        public boolean m25552f(String str, String str2) {
            synchronized (this) {
                if (!this.f31120a.getReference().m25471d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<C8239e> atomicMarkableReference = this.f31120a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                m25548d();
                return true;
            }
        }
    }

    public C8246l(String str, C8298f c8298f, C8231w c8231w) {
        this.f31115c = str;
        this.f31113a = new C8241g(c8298f);
        this.f31114b = c8231w;
    }

    /* renamed from: h */
    public static C8246l m25539h(String str, C8298f c8298f, C8231w c8231w) {
        C8241g c8241g = new C8241g(c8298f);
        C8246l c8246l = new C8246l(str, c8298f, c8231w);
        c8246l.f31116d.f31120a.getReference().m25472e(c8241g.m25492i(str, false));
        c8246l.f31117e.f31120a.getReference().m25472e(c8241g.m25492i(str, true));
        c8246l.f31119g.set(c8241g.m25494k(str), false);
        c8246l.f31118f.m25535c(c8241g.m25493j(str));
        return c8246l;
    }

    /* renamed from: i */
    public static String m25540i(String str, C8298f c8298f) {
        return new C8241g(c8298f).m25494k(str);
    }

    /* renamed from: d */
    public Map<String, String> m25541d() {
        return this.f31116d.m25550a();
    }

    /* renamed from: e */
    public Map<String, String> m25542e() {
        return this.f31117e.m25550a();
    }

    /* renamed from: f */
    public List<AbstractC8258f0.e.d.AbstractC11514e> m25543f() {
        return this.f31118f.m25533a();
    }

    /* renamed from: g */
    public String m25544g() {
        return this.f31119g.getReference();
    }

    /* renamed from: j */
    public boolean m25545j(String str, String str2) {
        return this.f31117e.m25552f(str, str2);
    }

    /* renamed from: k */
    public void m25546k(String str) {
        synchronized (this.f31115c) {
            this.f31115c = str;
            Map<String, String> mapM25550a = this.f31116d.m25550a();
            List<AbstractC8244j> listM25534b = this.f31118f.m25534b();
            if (m25544g() != null) {
                this.f31113a.m25498s(str, m25544g());
            }
            if (!mapM25550a.isEmpty()) {
                this.f31113a.m25495p(str, mapM25550a);
            }
            if (!listM25534b.isEmpty()) {
                this.f31113a.m25497r(str, listM25534b);
            }
        }
    }
}
