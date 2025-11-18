package p456rx.p471q;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxJavaPlugins.java */
/* renamed from: rx.q.f */
/* loaded from: classes3.dex */
public class C11412f {

    /* renamed from: a */
    private static final C11412f f43022a = new C11412f();

    /* renamed from: b */
    static final AbstractC11408b f43023b = new a();

    /* renamed from: c */
    private final AtomicReference<AbstractC11408b> f43024c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<AbstractC11410d> f43025d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<AbstractC11414h> f43026e = new AtomicReference<>();

    /* renamed from: f */
    private final AtomicReference<AbstractC11407a> f43027f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<C11413g> f43028g = new AtomicReference<>();

    /* compiled from: RxJavaPlugins.java */
    /* renamed from: rx.q.f$a */
    static class a extends AbstractC11408b {
        a() {
        }
    }

    /* compiled from: RxJavaPlugins.java */
    /* renamed from: rx.q.f$b */
    class b extends AbstractC11407a {
        b() {
        }
    }

    C11412f() {
    }

    @Deprecated
    /* renamed from: c */
    public static C11412f m40607c() {
        return f43022a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        r2 = "rxjava.plugin." + r7.substring(0, r7.length() - 6).substring(14) + ".impl";
        r1 = r10.getProperty(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        throw new java.lang.IllegalStateException("Implementing class declaration for " + r0 + " missing: " + r2);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object m40608e(java.lang.Class<?> r9, java.util.Properties r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456rx.p471q.C11412f.m40608e(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    /* renamed from: h */
    static Properties m40609h() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    /* renamed from: a */
    public AbstractC11407a m40610a() {
        if (this.f43027f.get() == null) {
            Object objM40608e = m40608e(AbstractC11407a.class, m40609h());
            if (objM40608e == null) {
                this.f43027f.compareAndSet(null, new b());
            } else {
                this.f43027f.compareAndSet(null, (AbstractC11407a) objM40608e);
            }
        }
        return this.f43027f.get();
    }

    /* renamed from: b */
    public AbstractC11408b m40611b() {
        if (this.f43024c.get() == null) {
            Object objM40608e = m40608e(AbstractC11408b.class, m40609h());
            if (objM40608e == null) {
                this.f43024c.compareAndSet(null, f43023b);
            } else {
                this.f43024c.compareAndSet(null, (AbstractC11408b) objM40608e);
            }
        }
        return this.f43024c.get();
    }

    /* renamed from: d */
    public AbstractC11410d m40612d() {
        if (this.f43025d.get() == null) {
            Object objM40608e = m40608e(AbstractC11410d.class, m40609h());
            if (objM40608e == null) {
                this.f43025d.compareAndSet(null, C11411e.m40606a());
            } else {
                this.f43025d.compareAndSet(null, (AbstractC11410d) objM40608e);
            }
        }
        return this.f43025d.get();
    }

    /* renamed from: f */
    public C11413g m40613f() {
        if (this.f43028g.get() == null) {
            Object objM40608e = m40608e(C11413g.class, m40609h());
            if (objM40608e == null) {
                this.f43028g.compareAndSet(null, C11413g.m40621h());
            } else {
                this.f43028g.compareAndSet(null, (C11413g) objM40608e);
            }
        }
        return this.f43028g.get();
    }

    /* renamed from: g */
    public AbstractC11414h m40614g() {
        if (this.f43026e.get() == null) {
            Object objM40608e = m40608e(AbstractC11414h.class, m40609h());
            if (objM40608e == null) {
                this.f43026e.compareAndSet(null, C11415i.m40631f());
            } else {
                this.f43026e.compareAndSet(null, (AbstractC11414h) objM40608e);
            }
        }
        return this.f43026e.get();
    }
}
