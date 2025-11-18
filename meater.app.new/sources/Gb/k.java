package Gb;

import oa.C4153F;

/* compiled from: locks.kt */
/* loaded from: classes3.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5023a = a.f5024a;

    /* compiled from: locks.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f5024a = new a();

        private a() {
        }

        public final d a(Runnable runnable, Ba.l<? super InterruptedException, C4153F> lVar) {
            return (runnable == null || lVar == null) ? new d(null, 1, null) : new c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
