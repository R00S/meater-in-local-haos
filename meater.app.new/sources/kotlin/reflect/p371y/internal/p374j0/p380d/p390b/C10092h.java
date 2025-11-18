package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10283g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10298h;

/* compiled from: JavaClassDataFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.h */
/* loaded from: classes3.dex */
public final class C10092h implements InterfaceC10298h {

    /* renamed from: a */
    private final InterfaceC10099o f38453a;

    /* renamed from: b */
    private final C10091g f38454b;

    public C10092h(InterfaceC10099o interfaceC10099o, C10091g c10091g) {
        C9801m.m32346f(interfaceC10099o, "kotlinClassFinder");
        C9801m.m32346f(c10091g, "deserializedDescriptorResolver");
        this.f38453a = interfaceC10099o;
        this.f38454b = c10091g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10298h
    /* renamed from: a */
    public C10283g mo33978a(C10159b c10159b) {
        C9801m.m32346f(c10159b, "classId");
        InterfaceC10101q interfaceC10101qM34024b = C10100p.m34024b(this.f38453a, c10159b);
        if (interfaceC10101qM34024b == null) {
            return null;
        }
        C9801m.m32341a(interfaceC10101qM34024b.mo34028e(), c10159b);
        return this.f38454b.m33972i(interfaceC10101qM34024b);
    }
}
