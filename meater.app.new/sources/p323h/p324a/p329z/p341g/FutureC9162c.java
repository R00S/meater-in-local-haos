package p323h.p324a.p329z.p341g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p323h.p324a.p327x.InterfaceC9089c;

/* compiled from: DisposeOnCancel.java */
/* renamed from: h.a.z.g.c */
/* loaded from: classes2.dex */
final class FutureC9162c implements Future<Object> {

    /* renamed from: f */
    final InterfaceC9089c f35196f;

    FutureC9162c(InterfaceC9089c interfaceC9089c) {
        this.f35196f = interfaceC9089c;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f35196f.mo29115k();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
