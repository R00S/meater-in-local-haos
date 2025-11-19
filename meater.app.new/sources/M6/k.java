package M6;

import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes2.dex */
public final class k implements O6.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f12100a = new k();
    }

    public static k a() {
        return a.f12100a;
    }

    public static Executor b() {
        return (Executor) O6.d.d(j.a());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
