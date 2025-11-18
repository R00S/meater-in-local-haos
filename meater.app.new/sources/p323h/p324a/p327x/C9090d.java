package p323h.p324a.p327x;

import p323h.p324a.p328y.InterfaceC9093a;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p331b.C9107a;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: Disposables.java */
/* renamed from: h.a.x.d */
/* loaded from: classes2.dex */
public final class C9090d {
    /* renamed from: a */
    public static InterfaceC9089c m29242a() {
        return EnumC9104d.INSTANCE;
    }

    /* renamed from: b */
    public static InterfaceC9089c m29243b() {
        return m29245d(C9107a.f34947b);
    }

    /* renamed from: c */
    public static InterfaceC9089c m29244c(InterfaceC9093a interfaceC9093a) {
        C9108b.m29271c(interfaceC9093a, "run is null");
        return new C9087a(interfaceC9093a);
    }

    /* renamed from: d */
    public static InterfaceC9089c m29245d(Runnable runnable) {
        C9108b.m29271c(runnable, "run is null");
        return new C9092f(runnable);
    }
}
