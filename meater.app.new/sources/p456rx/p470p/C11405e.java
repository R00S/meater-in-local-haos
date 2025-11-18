package p456rx.p470p;

import p456rx.AbstractC11245j;
import p456rx.InterfaceC11241f;

/* compiled from: SerializedSubscriber.java */
/* renamed from: rx.p.e */
/* loaded from: classes3.dex */
public class C11405e<T> extends AbstractC11245j<T> {

    /* renamed from: f */
    private final InterfaceC11241f<T> f42998f;

    public C11405e(AbstractC11245j<? super T> abstractC11245j) {
        this(abstractC11245j, true);
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        this.f42998f.onCompleted();
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        this.f42998f.onError(th);
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        this.f42998f.onNext(t);
    }

    public C11405e(AbstractC11245j<? super T> abstractC11245j, boolean z) {
        super(abstractC11245j, z);
        this.f42998f = new C11404d(abstractC11245j);
    }
}
