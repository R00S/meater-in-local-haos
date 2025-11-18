package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: ObservableError.java */
/* renamed from: h.a.z.e.d.e */
/* loaded from: classes2.dex */
public final class C9135e<T> extends AbstractC9076m<T> {

    /* renamed from: f */
    final Callable<? extends Throwable> f35024f;

    public C9135e(Callable<? extends Throwable> callable) {
        this.f35024f = callable;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        try {
            th = (Throwable) C9108b.m29271c(this.f35024f.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C9240a.m30000a(th);
        }
        EnumC9104d.m29257x(th, interfaceC9080q);
    }
}
