package s2;

import X1.InterfaceC1811h;
import java.util.concurrent.Executor;

/* compiled from: ReleasableExecutor.java */
/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceExecutorC4472a extends Executor {

    /* compiled from: ReleasableExecutor.java */
    /* renamed from: s2.a$a, reason: collision with other inner class name */
    class C0692a implements InterfaceExecutorC4472a {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Executor f49230B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1811h f49231C;

        C0692a(Executor executor, InterfaceC1811h interfaceC1811h) {
            this.f49230B = executor;
            this.f49231C = interfaceC1811h;
        }

        @Override // s2.InterfaceExecutorC4472a
        public void c() {
            this.f49231C.accept(this.f49230B);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f49230B.execute(runnable);
        }
    }

    static <T extends Executor> InterfaceExecutorC4472a t(T t10, InterfaceC1811h<T> interfaceC1811h) {
        return new C0692a(t10, interfaceC1811h);
    }

    void c();
}
