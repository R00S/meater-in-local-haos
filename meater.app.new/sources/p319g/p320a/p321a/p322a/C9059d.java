package p319g.p320a.p321a.p322a;

import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.EnumC9062a;
import p323h.p324a.InterfaceC9069f;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p329z.p331b.C9108b;
import p355k.p356a.InterfaceC9728a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;

/* compiled from: RxJavaInterop.java */
/* renamed from: g.a.a.a.d */
/* loaded from: classes2.dex */
public final class C9059d {
    /* renamed from: a */
    public static C11231b m29123a(InterfaceC9069f interfaceC9069f) {
        C9108b.m29271c(interfaceC9069f, "source is null");
        return C11231b.m39948h(new C9057b(interfaceC9069f));
    }

    /* renamed from: b */
    public static <T> C11234e<T> m29124b(InterfaceC9079p<T> interfaceC9079p, EnumC9062a enumC9062a) {
        C9108b.m29271c(interfaceC9079p, "source is null");
        C9108b.m29271c(enumC9062a, "strategy is null");
        return m29125c(AbstractC9076m.m29187D(interfaceC9079p).m29216z(enumC9062a));
    }

    /* renamed from: c */
    public static <T> C11234e<T> m29125c(InterfaceC9728a<T> interfaceC9728a) {
        C9108b.m29271c(interfaceC9728a, "source is null");
        return C11234e.m40035b1(new C9058c(interfaceC9728a));
    }

    /* renamed from: d */
    public static <T> Single<T> m29126d(InterfaceC9086w<T> interfaceC9086w) {
        C9108b.m29271c(interfaceC9086w, "source is null");
        return Single.m39909b(new C9061f(interfaceC9086w));
    }

    /* renamed from: e */
    public static AbstractC9064b m29127e(C11231b c11231b) {
        C9108b.m29271c(c11231b, "source is null");
        return new C9056a(c11231b);
    }

    /* renamed from: f */
    public static <T> AbstractC9082s<T> m29128f(Single<T> single) {
        C9108b.m29271c(single, "source is null");
        return new C9060e(single);
    }
}
