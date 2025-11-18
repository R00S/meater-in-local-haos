package p456rx.p470p;

import p456rx.AbstractC11245j;
import p456rx.InterfaceC11241f;

/* compiled from: Subscribers.java */
/* renamed from: rx.p.f */
/* loaded from: classes3.dex */
public final class C11406f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Subscribers.java */
    /* renamed from: rx.p.f$a */
    static class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11241f f42999f;

        a(InterfaceC11241f interfaceC11241f) {
            this.f42999f = interfaceC11241f;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42999f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42999f.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42999f.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Subscribers.java */
    /* renamed from: rx.p.f$b */
    static class b<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f43000f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC11245j abstractC11245j, AbstractC11245j abstractC11245j2) {
            super(abstractC11245j);
            this.f43000f = abstractC11245j2;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f43000f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f43000f.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f43000f.onNext(t);
        }
    }

    /* renamed from: a */
    public static <T> AbstractC11245j<T> m40559a() {
        return m40560b(C11401a.m40556a());
    }

    /* renamed from: b */
    public static <T> AbstractC11245j<T> m40560b(InterfaceC11241f<? super T> interfaceC11241f) {
        return new a(interfaceC11241f);
    }

    /* renamed from: c */
    public static <T> AbstractC11245j<T> m40561c(AbstractC11245j<? super T> abstractC11245j) {
        return new b(abstractC11245j, abstractC11245j);
    }
}
