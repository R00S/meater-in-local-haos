package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;

/* compiled from: EmptyObservableHolder.java */
/* renamed from: rx.n.a.g */
/* loaded from: classes3.dex */
public enum EnumC11279g implements C11234e.a<Object> {
    INSTANCE;


    /* renamed from: g */
    static final C11234e<Object> f42282g = C11234e.m40035b1(INSTANCE);

    /* renamed from: k */
    public static <T> C11234e<T> m40207k() {
        return (C11234e<T>) f42282g;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Object> abstractC11245j) {
        abstractC11245j.onCompleted();
    }
}
