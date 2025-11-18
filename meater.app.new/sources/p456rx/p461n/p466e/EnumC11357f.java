package p456rx.p461n.p466e;

import java.util.List;
import p456rx.C11233d;
import p456rx.C11234e;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p461n.p462a.C11283h0;

/* compiled from: InternalObservableUtils.java */
/* renamed from: rx.n.e.f */
/* loaded from: classes3.dex */
public enum EnumC11357f {
    ;


    /* renamed from: f */
    public static final e f42872f = new InterfaceC11257f<Long, Object, Long>() { // from class: rx.n.e.f.e
        @Override // p456rx.p460m.InterfaceC11257f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo6865a(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    };

    /* renamed from: g */
    public static final c f42873g = new InterfaceC11257f<Object, Object, Boolean>() { // from class: rx.n.e.f.c
        @Override // p456rx.p460m.InterfaceC11257f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo6865a(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    };

    /* renamed from: h */
    public static final h f42874h = new InterfaceC11256e<List<? extends C11234e<?>>, C11234e<?>[]>() { // from class: rx.n.e.f.h
        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11234e<?>[] call(List<? extends C11234e<?>> list) {
            return (C11234e[]) list.toArray(new C11234e[list.size()]);
        }
    };

    /* renamed from: i */
    static final g f42875i = new InterfaceC11256e<Object, Void>() { // from class: rx.n.e.f.g
        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    };

    /* renamed from: j */
    public static final d f42876j = new InterfaceC11257f<Integer, Object, Integer>() { // from class: rx.n.e.f.d
        @Override // p456rx.p460m.InterfaceC11257f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer mo6865a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    };

    /* renamed from: k */
    static final b f42877k = new b();

    /* renamed from: l */
    public static final InterfaceC11253b<Throwable> f42878l = new InterfaceC11253b<Throwable>() { // from class: rx.n.e.f.a
        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };

    /* renamed from: m */
    public static final C11234e.b<Boolean, Object> f42879m = new C11283h0(C11364m.m40466a(), true);

    /* compiled from: InternalObservableUtils.java */
    /* renamed from: rx.n.e.f$b */
    static final class b implements InterfaceC11256e<C11233d<?>, Throwable> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(C11233d<?> c11233d) {
            return c11233d.m40009e();
        }
    }

    /* compiled from: InternalObservableUtils.java */
    /* renamed from: rx.n.e.f$f */
    static final class f implements InterfaceC11256e<C11234e<? extends C11233d<?>>, C11234e<?>> {

        /* renamed from: f */
        final InterfaceC11256e<? super C11234e<? extends Throwable>, ? extends C11234e<?>> f42881f;

        public f(InterfaceC11256e<? super C11234e<? extends Throwable>, ? extends C11234e<?>> interfaceC11256e) {
            this.f42881f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11234e<?> call(C11234e<? extends C11233d<?>> c11234e) {
            return this.f42881f.call(c11234e.m40082X(EnumC11357f.f42877k));
        }
    }

    /* renamed from: g */
    public static InterfaceC11256e<C11234e<? extends C11233d<?>>, C11234e<?>> m40424g(InterfaceC11256e<? super C11234e<? extends Throwable>, ? extends C11234e<?>> interfaceC11256e) {
        return new f(interfaceC11256e);
    }
}
