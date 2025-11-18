package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes2.dex */
final class C7602v2 implements InterfaceC7585s3 {

    /* renamed from: a */
    private static final InterfaceC7495d3 f27912a = new C7620y2();

    /* renamed from: b */
    private final InterfaceC7495d3 f27913b;

    public C7602v2() {
        this(new C7614x2(C7548m2.m21238c(), m21434b()));
    }

    /* renamed from: b */
    private static InterfaceC7495d3 m21434b() {
        try {
            return (InterfaceC7495d3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f27912a;
        }
    }

    /* renamed from: c */
    private static boolean m21435c(InterfaceC7501e3 interfaceC7501e3) {
        return interfaceC7501e3.mo21047a() == zzfd.zze.f28131i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7585s3
    /* renamed from: a */
    public final <T> InterfaceC7567p3<T> mo21403a(Class<T> cls) {
        C7579r3.m21381p(cls);
        InterfaceC7501e3 interfaceC7501e3Mo21042b = this.f27913b.mo21042b(cls);
        return interfaceC7501e3Mo21042b.mo21048b() ? zzfd.class.isAssignableFrom(cls) ? C7519h3.m21124k(C7579r3.m21337B(), C7500e2.m21044a(), interfaceC7501e3Mo21042b.mo21049c()) : C7519h3.m21124k(C7579r3.m21371f(), C7500e2.m21045b(), interfaceC7501e3Mo21042b.mo21049c()) : zzfd.class.isAssignableFrom(cls) ? m21435c(interfaceC7501e3Mo21042b) ? C7513g3.m21085q(cls, interfaceC7501e3Mo21042b, C7537k3.m21172b(), AbstractC7584s2.m21399d(), C7579r3.m21337B(), C7500e2.m21044a(), C7483b3.m20985b()) : C7513g3.m21085q(cls, interfaceC7501e3Mo21042b, C7537k3.m21172b(), AbstractC7584s2.m21399d(), C7579r3.m21337B(), null, C7483b3.m20985b()) : m21435c(interfaceC7501e3Mo21042b) ? C7513g3.m21085q(cls, interfaceC7501e3Mo21042b, C7537k3.m21171a(), AbstractC7584s2.m21398a(), C7579r3.m21371f(), C7500e2.m21045b(), C7483b3.m20984a()) : C7513g3.m21085q(cls, interfaceC7501e3Mo21042b, C7537k3.m21171a(), AbstractC7584s2.m21398a(), C7579r3.m21387v(), null, C7483b3.m20984a());
    }

    private C7602v2(InterfaceC7495d3 interfaceC7495d3) {
        this.f27913b = (InterfaceC7495d3) zzff.m22291f(interfaceC7495d3, "messageInfoFactory");
    }
}
