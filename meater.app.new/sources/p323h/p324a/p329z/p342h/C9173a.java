package p323h.p324a.p329z.p342h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9072i;
import p323h.p324a.p329z.p343i.EnumC9175b;
import p323h.p324a.p329z.p344j.C9176a;
import p323h.p324a.p329z.p344j.C9179d;
import p355k.p356a.InterfaceC9729b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: StrictSubscriber.java */
/* renamed from: h.a.z.h.a */
/* loaded from: classes2.dex */
public class C9173a<T> extends AtomicInteger implements InterfaceC9072i<T>, InterfaceC9730c {

    /* renamed from: f */
    final InterfaceC9729b<? super T> f35273f;

    /* renamed from: g */
    final C9176a f35274g = new C9176a();

    /* renamed from: h */
    final AtomicLong f35275h = new AtomicLong();

    /* renamed from: i */
    final AtomicReference<InterfaceC9730c> f35276i = new AtomicReference<>();

    /* renamed from: j */
    final AtomicBoolean f35277j = new AtomicBoolean();

    /* renamed from: k */
    volatile boolean f35278k;

    public C9173a(InterfaceC9729b<? super T> interfaceC9729b) {
        this.f35273f = interfaceC9729b;
    }

    @Override // p355k.p356a.InterfaceC9729b
    /* renamed from: a */
    public void mo29121a() {
        this.f35278k = true;
        C9179d.m29392a(this.f35273f, this, this.f35274g);
    }

    @Override // p355k.p356a.InterfaceC9729b
    /* renamed from: b */
    public void mo29122b(InterfaceC9730c interfaceC9730c) {
        if (this.f35277j.compareAndSet(false, true)) {
            this.f35273f.mo29122b(this);
            EnumC9175b.m29379q(this.f35276i, this.f35275h, interfaceC9730c);
        } else {
            interfaceC9730c.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p355k.p356a.InterfaceC9730c
    public void cancel() {
        if (this.f35278k) {
            return;
        }
        EnumC9175b.m29377g(this.f35276i);
    }

    @Override // p355k.p356a.InterfaceC9729b
    public void onError(Throwable th) {
        this.f35278k = true;
        C9179d.m29393b(this.f35273f, th, this, this.f35274g);
    }

    @Override // p355k.p356a.InterfaceC9729b
    public void onNext(T t) {
        C9179d.m29394c(this.f35273f, t, this, this.f35274g);
    }

    @Override // p355k.p356a.InterfaceC9730c
    public void request(long j2) {
        if (j2 > 0) {
            EnumC9175b.m29378k(this.f35276i, this.f35275h, j2);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j2));
    }
}
