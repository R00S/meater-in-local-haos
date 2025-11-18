package p456rx.p471q;

import p456rx.exceptions.C11240a;

/* compiled from: RxJavaErrorHandler.java */
/* renamed from: rx.q.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11408b {
    @Deprecated
    /* renamed from: a */
    public void m40566a(Throwable th) {
    }

    /* renamed from: b */
    public final String m40567b(Object obj) {
        try {
            return m40568c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            C11240a.m40140e(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    /* renamed from: c */
    protected String m40568c(Object obj) throws InterruptedException {
        return null;
    }
}
