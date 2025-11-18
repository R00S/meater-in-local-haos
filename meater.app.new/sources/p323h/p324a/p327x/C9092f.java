package p323h.p324a.p327x;

/* compiled from: RunnableDisposable.java */
/* renamed from: h.a.x.f */
/* loaded from: classes2.dex */
final class C9092f extends AbstractC9091e<Runnable> {
    C9092f(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p323h.p324a.p327x.AbstractC9091e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo29236a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + mo29116q() + ", " + get() + ")";
    }
}
