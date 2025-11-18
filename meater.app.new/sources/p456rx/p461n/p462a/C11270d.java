package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.C11231b;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;
import p456rx.p461n.p465d.C11350a;

/* compiled from: CompletableOnSubscribeConcatArray.java */
/* renamed from: rx.n.a.d */
/* loaded from: classes3.dex */
public final class C11270d implements C11231b.w {

    /* renamed from: f */
    final C11231b[] f42223f;

    /* compiled from: CompletableOnSubscribeConcatArray.java */
    /* renamed from: rx.n.a.d$a */
    static final class a extends AtomicInteger implements InterfaceC11232c {

        /* renamed from: f */
        final InterfaceC11232c f42224f;

        /* renamed from: g */
        final C11231b[] f42225g;

        /* renamed from: h */
        int f42226h;

        /* renamed from: i */
        final C11350a f42227i = new C11350a();

        public a(InterfaceC11232c interfaceC11232c, C11231b[] c11231bArr) {
            this.f42224f = interfaceC11232c;
            this.f42225g = c11231bArr;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            this.f42227i.m40415b(interfaceC11246k);
        }

        /* renamed from: b */
        void m40193b() {
            if (!this.f42227i.isUnsubscribed() && getAndIncrement() == 0) {
                C11231b[] c11231bArr = this.f42225g;
                while (!this.f42227i.isUnsubscribed()) {
                    int i2 = this.f42226h;
                    this.f42226h = i2 + 1;
                    if (i2 == c11231bArr.length) {
                        this.f42224f.onCompleted();
                        return;
                    } else {
                        c11231bArr[i2].m39971P(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            m40193b();
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            this.f42224f.onError(th);
        }
    }

    public C11270d(C11231b[] c11231bArr) {
        this.f42223f = c11231bArr;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11232c interfaceC11232c) {
        a aVar = new a(interfaceC11232c, this.f42223f);
        interfaceC11232c.mo29114a(aVar.f42227i);
        aVar.m40193b();
    }
}
