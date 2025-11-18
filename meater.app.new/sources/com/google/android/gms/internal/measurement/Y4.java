package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class Y4 implements E5 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2525l5 f33951b = new C2442b5();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2525l5 f33952a;

    public Y4() {
        this(new C2460d5(D4.c(), f33951b));
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final <T> C5<T> a(Class<T> cls) {
        D5.o(cls);
        InterfaceC2501i5 interfaceC2501i5A = this.f33952a.a(cls);
        if (interfaceC2501i5A.d()) {
            return C2565q5.j(D5.f(), C2603v4.a(), interfaceC2501i5A.a());
        }
        return C2549o5.n(cls, interfaceC2501i5A, C2588t5.a(), V4.a(), D5.f(), C2433a5.f34045a[interfaceC2501i5A.b().ordinal()] != 1 ? C2603v4.a() : null, C2509j5.a());
    }

    private Y4(InterfaceC2525l5 interfaceC2525l5) {
        this.f33952a = (InterfaceC2525l5) I4.f(interfaceC2525l5, "messageInfoFactory");
    }
}
