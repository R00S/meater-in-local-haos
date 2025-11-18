package kotlin.reflect.p371y.internal.p374j0.p415l.p421y1;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;

/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.f0.y.e.j0.l.y1.c */
/* loaded from: classes3.dex */
final class C10462c {

    /* renamed from: a */
    private final InterfaceC10587e1 f40392a;

    /* renamed from: b */
    private final AbstractC10344e0 f40393b;

    /* renamed from: c */
    private final AbstractC10344e0 f40394c;

    public C10462c(InterfaceC10587e1 interfaceC10587e1, AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        C9801m.m32346f(abstractC10344e0, "inProjection");
        C9801m.m32346f(abstractC10344e02, "outProjection");
        this.f40392a = interfaceC10587e1;
        this.f40393b = abstractC10344e0;
        this.f40394c = abstractC10344e02;
    }

    /* renamed from: a */
    public final AbstractC10344e0 m37177a() {
        return this.f40393b;
    }

    /* renamed from: b */
    public final AbstractC10344e0 m37178b() {
        return this.f40394c;
    }

    /* renamed from: c */
    public final InterfaceC10587e1 m37179c() {
        return this.f40392a;
    }

    /* renamed from: d */
    public final boolean m37180d() {
        return InterfaceC10394e.f40181a.mo36920d(this.f40393b, this.f40394c);
    }
}
