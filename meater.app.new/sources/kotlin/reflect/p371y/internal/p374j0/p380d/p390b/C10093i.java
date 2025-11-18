package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10013f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10309s;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.i */
/* loaded from: classes3.dex */
public final class C10093i implements InterfaceC10309s {

    /* renamed from: a */
    public static final C10093i f38455a = new C10093i();

    private C10093i() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10309s
    /* renamed from: a */
    public AbstractC10344e0 mo33979a(C10138q c10138q, String str, AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        C9801m.m32346f(c10138q, "proto");
        C9801m.m32346f(str, "flexibleId");
        C9801m.m32346f(abstractC10368m0, "lowerBound");
        C9801m.m32346f(abstractC10368m02, "upperBound");
        return !C9801m.m32341a(str, "kotlin.jvm.PlatformType") ? C10427k.m37053d(EnumC10426j.f40292M, str, abstractC10368m0.toString(), abstractC10368m02.toString()) : c10138q.m38404x(C10112a.f38497g) ? new C10013f(abstractC10368m0, abstractC10368m02) : C10347f0.m36664d(abstractC10368m0, abstractC10368m02);
    }
}
