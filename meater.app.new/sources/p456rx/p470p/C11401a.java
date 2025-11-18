package p456rx.p470p;

import p456rx.InterfaceC11241f;
import p456rx.exceptions.OnErrorNotImplementedException;

/* compiled from: Observers.java */
/* renamed from: rx.p.a */
/* loaded from: classes3.dex */
public final class C11401a {

    /* renamed from: a */
    private static final InterfaceC11241f<Object> f42986a = new a();

    /* compiled from: Observers.java */
    /* renamed from: rx.p.a$a */
    static class a implements InterfaceC11241f<Object> {
        a() {
        }

        @Override // p456rx.InterfaceC11241f
        public final void onCompleted() {
        }

        @Override // p456rx.InterfaceC11241f
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // p456rx.InterfaceC11241f
        public final void onNext(Object obj) {
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC11241f<T> m40556a() {
        return (InterfaceC11241f<T>) f42986a;
    }
}
