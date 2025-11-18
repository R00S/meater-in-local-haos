package p024c.p033b.p034a.p035a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* renamed from: c.b.a.a.a */
/* loaded from: classes.dex */
public class C0850a extends AbstractC0852c {

    /* renamed from: a */
    private static volatile C0850a f5627a;

    /* renamed from: b */
    private static final Executor f5628b = new a();

    /* renamed from: c */
    private static final Executor f5629c = new b();

    /* renamed from: d */
    private AbstractC0852c f5630d;

    /* renamed from: e */
    private AbstractC0852c f5631e;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: c.b.a.a.a$a */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0850a.m5372e().mo5375c(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: c.b.a.a.a$b */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0850a.m5372e().mo5373a(runnable);
        }
    }

    private C0850a() {
        C0851b c0851b = new C0851b();
        this.f5631e = c0851b;
        this.f5630d = c0851b;
    }

    /* renamed from: d */
    public static Executor m5371d() {
        return f5629c;
    }

    /* renamed from: e */
    public static C0850a m5372e() {
        if (f5627a != null) {
            return f5627a;
        }
        synchronized (C0850a.class) {
            if (f5627a == null) {
                f5627a = new C0850a();
            }
        }
        return f5627a;
    }

    @Override // p024c.p033b.p034a.p035a.AbstractC0852c
    /* renamed from: a */
    public void mo5373a(Runnable runnable) {
        this.f5630d.mo5373a(runnable);
    }

    @Override // p024c.p033b.p034a.p035a.AbstractC0852c
    /* renamed from: b */
    public boolean mo5374b() {
        return this.f5630d.mo5374b();
    }

    @Override // p024c.p033b.p034a.p035a.AbstractC0852c
    /* renamed from: c */
    public void mo5375c(Runnable runnable) {
        this.f5630d.mo5375c(runnable);
    }
}
