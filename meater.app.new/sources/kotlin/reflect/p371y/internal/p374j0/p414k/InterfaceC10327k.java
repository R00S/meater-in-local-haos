package kotlin.reflect.p371y.internal.p374j0.p414k;

import kotlin.C10775u;
import kotlin.jvm.functions.Function1;

/* compiled from: locks.kt */
/* renamed from: kotlin.f0.y.e.j0.k.k */
/* loaded from: classes3.dex */
public interface InterfaceC10327k {

    /* renamed from: a */
    public static final a f40033a = a.f40034a;

    /* compiled from: locks.kt */
    /* renamed from: kotlin.f0.y.e.j0.k.k$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f40034a = new a();

        private a() {
        }

        /* renamed from: a */
        public final C10320d m36552a(Runnable runnable, Function1<? super InterruptedException, C10775u> function1) {
            return (runnable == null || function1 == null) ? new C10320d(null, 1, null) : new C10319c(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
