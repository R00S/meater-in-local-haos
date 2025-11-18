package androidx.work.impl.utils.p018p;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.ExecutorC0788g;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor.java */
/* renamed from: androidx.work.impl.utils.p.b */
/* loaded from: classes.dex */
public class C0800b implements InterfaceC0799a {

    /* renamed from: a */
    private final ExecutorC0788g f4955a;

    /* renamed from: b */
    private final Handler f4956b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f4957c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* renamed from: androidx.work.impl.utils.p.b$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0800b.this.m5207d(runnable);
        }
    }

    public C0800b(Executor executor) {
        this.f4955a = new ExecutorC0788g(executor);
    }

    @Override // androidx.work.impl.utils.p018p.InterfaceC0799a
    /* renamed from: a */
    public Executor mo5204a() {
        return this.f4957c;
    }

    @Override // androidx.work.impl.utils.p018p.InterfaceC0799a
    /* renamed from: b */
    public void mo5205b(Runnable runnable) {
        this.f4955a.execute(runnable);
    }

    @Override // androidx.work.impl.utils.p018p.InterfaceC0799a
    /* renamed from: c */
    public ExecutorC0788g mo5206c() {
        return this.f4955a;
    }

    /* renamed from: d */
    public void m5207d(Runnable runnable) {
        this.f4956b.post(runnable);
    }
}
