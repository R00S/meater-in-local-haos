package R8;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.ExecutorC4121m;
import z7.AbstractC5208j;
import z7.C5200b;
import z7.C5209k;
import z7.C5211m;
import z7.InterfaceC5201c;

/* compiled from: CrashlyticsTasks.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f15086a = new ExecutorC4121m();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC5208j b(C5209k c5209k, AtomicBoolean atomicBoolean, C5200b c5200b, AbstractC5208j abstractC5208j) {
        if (abstractC5208j.o()) {
            c5209k.e(abstractC5208j.k());
        } else if (abstractC5208j.j() != null) {
            c5209k.d(abstractC5208j.j());
        } else if (atomicBoolean.getAndSet(true)) {
            c5200b.a();
        }
        return C5211m.e(null);
    }

    public static <T> AbstractC5208j<T> c(AbstractC5208j<T> abstractC5208j, AbstractC5208j<T> abstractC5208j2) {
        final C5200b c5200b = new C5200b();
        final C5209k c5209k = new C5209k(c5200b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC5201c<T, AbstractC5208j<TContinuationResult>> interfaceC5201c = new InterfaceC5201c() { // from class: R8.a
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j3) {
                return b.b(c5209k, atomicBoolean, c5200b, abstractC5208j3);
            }
        };
        Executor executor = f15086a;
        abstractC5208j.i(executor, interfaceC5201c);
        abstractC5208j2.i(executor, interfaceC5201c);
        return c5209k.a();
    }
}
