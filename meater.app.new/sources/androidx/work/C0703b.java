package androidx.work;

import android.os.Build;
import androidx.work.impl.C0714a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* renamed from: androidx.work.b */
/* loaded from: classes.dex */
public final class C0703b {

    /* renamed from: a */
    final Executor f4464a;

    /* renamed from: b */
    final Executor f4465b;

    /* renamed from: c */
    final AbstractC0702a0 f4466c;

    /* renamed from: d */
    final AbstractC0805l f4467d;

    /* renamed from: e */
    final InterfaceC0815v f4468e;

    /* renamed from: f */
    final InterfaceC0803j f4469f;

    /* renamed from: g */
    final String f4470g;

    /* renamed from: h */
    final int f4471h;

    /* renamed from: i */
    final int f4472i;

    /* renamed from: j */
    final int f4473j;

    /* renamed from: k */
    final int f4474k;

    /* renamed from: l */
    private final boolean f4475l;

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$a */
    class a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f4476f = new AtomicInteger(0);

        /* renamed from: g */
        final /* synthetic */ boolean f4477g;

        a(boolean z) {
            this.f4477g = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f4477g ? "WM.task-" : "androidx.work-") + this.f4476f.incrementAndGet());
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b */
    public static final class b {

        /* renamed from: a */
        Executor f4479a;

        /* renamed from: b */
        AbstractC0702a0 f4480b;

        /* renamed from: c */
        AbstractC0805l f4481c;

        /* renamed from: d */
        Executor f4482d;

        /* renamed from: e */
        InterfaceC0815v f4483e;

        /* renamed from: f */
        InterfaceC0803j f4484f;

        /* renamed from: g */
        String f4485g;

        /* renamed from: h */
        int f4486h = 4;

        /* renamed from: i */
        int f4487i = 0;

        /* renamed from: j */
        int f4488j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f4489k = 20;

        /* renamed from: a */
        public C0703b m4795a() {
            return new C0703b(this);
        }

        /* renamed from: b */
        public b m4796b(int i2) {
            this.f4486h = i2;
            return this;
        }

        /* renamed from: c */
        public b m4797c(AbstractC0702a0 abstractC0702a0) {
            this.f4480b = abstractC0702a0;
            return this;
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$c */
    public interface c {
        /* renamed from: a */
        C0703b m4798a();
    }

    C0703b(b bVar) {
        Executor executor = bVar.f4479a;
        if (executor == null) {
            this.f4464a = m4782a(false);
        } else {
            this.f4464a = executor;
        }
        Executor executor2 = bVar.f4482d;
        if (executor2 == null) {
            this.f4475l = true;
            this.f4465b = m4782a(true);
        } else {
            this.f4475l = false;
            this.f4465b = executor2;
        }
        AbstractC0702a0 abstractC0702a0 = bVar.f4480b;
        if (abstractC0702a0 == null) {
            this.f4466c = AbstractC0702a0.getDefaultWorkerFactory();
        } else {
            this.f4466c = abstractC0702a0;
        }
        AbstractC0805l abstractC0805l = bVar.f4481c;
        if (abstractC0805l == null) {
            this.f4467d = AbstractC0805l.m5216c();
        } else {
            this.f4467d = abstractC0805l;
        }
        InterfaceC0815v interfaceC0815v = bVar.f4483e;
        if (interfaceC0815v == null) {
            this.f4468e = new C0714a();
        } else {
            this.f4468e = interfaceC0815v;
        }
        this.f4471h = bVar.f4486h;
        this.f4472i = bVar.f4487i;
        this.f4473j = bVar.f4488j;
        this.f4474k = bVar.f4489k;
        this.f4469f = bVar.f4484f;
        this.f4470g = bVar.f4485g;
    }

    /* renamed from: a */
    private Executor m4782a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m4783b(z));
    }

    /* renamed from: b */
    private ThreadFactory m4783b(boolean z) {
        return new a(z);
    }

    /* renamed from: c */
    public String m4784c() {
        return this.f4470g;
    }

    /* renamed from: d */
    public InterfaceC0803j m4785d() {
        return this.f4469f;
    }

    /* renamed from: e */
    public Executor m4786e() {
        return this.f4464a;
    }

    /* renamed from: f */
    public AbstractC0805l m4787f() {
        return this.f4467d;
    }

    /* renamed from: g */
    public int m4788g() {
        return this.f4473j;
    }

    /* renamed from: h */
    public int m4789h() {
        return Build.VERSION.SDK_INT == 23 ? this.f4474k / 2 : this.f4474k;
    }

    /* renamed from: i */
    public int m4790i() {
        return this.f4472i;
    }

    /* renamed from: j */
    public int m4791j() {
        return this.f4471h;
    }

    /* renamed from: k */
    public InterfaceC0815v m4792k() {
        return this.f4468e;
    }

    /* renamed from: l */
    public Executor m4793l() {
        return this.f4465b;
    }

    /* renamed from: m */
    public AbstractC0702a0 m4794m() {
        return this.f4466c;
    }
}
