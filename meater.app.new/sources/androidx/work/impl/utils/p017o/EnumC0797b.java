package androidx.work.impl.utils.p017o;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
/* renamed from: androidx.work.impl.utils.o.b */
/* loaded from: classes.dex */
enum EnumC0797b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
