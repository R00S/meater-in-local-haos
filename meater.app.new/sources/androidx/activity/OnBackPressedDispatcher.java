package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f103a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0038b> f104b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements InterfaceC0513i, InterfaceC0037a {

        /* renamed from: a */
        private final AbstractC0511g f105a;

        /* renamed from: b */
        private final AbstractC0038b f106b;

        /* renamed from: c */
        private InterfaceC0037a f107c;

        LifecycleOnBackPressedCancellable(AbstractC0511g abstractC0511g, AbstractC0038b abstractC0038b) {
            this.f105a = abstractC0511g;
            this.f106b = abstractC0038b;
            abstractC0511g.mo3861a(this);
        }

        @Override // androidx.lifecycle.InterfaceC0513i
        /* renamed from: a */
        public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
            if (bVar == AbstractC0511g.b.ON_START) {
                this.f107c = OnBackPressedDispatcher.this.m128b(this.f106b);
                return;
            }
            if (bVar != AbstractC0511g.b.ON_STOP) {
                if (bVar == AbstractC0511g.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0037a interfaceC0037a = this.f107c;
                if (interfaceC0037a != null) {
                    interfaceC0037a.cancel();
                }
            }
        }

        @Override // androidx.activity.InterfaceC0037a
        public void cancel() {
            this.f105a.mo3863c(this);
            this.f106b.m134e(this);
            InterfaceC0037a interfaceC0037a = this.f107c;
            if (interfaceC0037a != null) {
                interfaceC0037a.cancel();
                this.f107c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0036a implements InterfaceC0037a {

        /* renamed from: a */
        private final AbstractC0038b f109a;

        C0036a(AbstractC0038b abstractC0038b) {
            this.f109a = abstractC0038b;
        }

        @Override // androidx.activity.InterfaceC0037a
        public void cancel() {
            OnBackPressedDispatcher.this.f104b.remove(this.f109a);
            this.f109a.m134e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f103a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m127a(InterfaceC0515k interfaceC0515k, AbstractC0038b abstractC0038b) {
        AbstractC0511g lifecycle = interfaceC0515k.getLifecycle();
        if (lifecycle.mo3862b() == AbstractC0511g.c.DESTROYED) {
            return;
        }
        abstractC0038b.m130a(new LifecycleOnBackPressedCancellable(lifecycle, abstractC0038b));
    }

    /* renamed from: b */
    InterfaceC0037a m128b(AbstractC0038b abstractC0038b) {
        this.f104b.add(abstractC0038b);
        C0036a c0036a = new C0036a(abstractC0038b);
        abstractC0038b.m130a(c0036a);
        return c0036a;
    }

    /* renamed from: c */
    public void m129c() {
        Iterator<AbstractC0038b> itDescendingIterator = this.f104b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            AbstractC0038b next = itDescendingIterator.next();
            if (next.m132c()) {
                next.mo131b();
                return;
            }
        }
        Runnable runnable = this.f103a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
