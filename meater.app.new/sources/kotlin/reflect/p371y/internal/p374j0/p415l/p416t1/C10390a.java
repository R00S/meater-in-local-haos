package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10395f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: ClassicTypeCheckerState.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.a */
/* loaded from: classes3.dex */
public final class C10390a {
    /* renamed from: a */
    public static final C10342d1 m36829a(boolean z, boolean z2, InterfaceC10391b interfaceC10391b, AbstractC10395f abstractC10395f, AbstractC10396g abstractC10396g) {
        C9801m.m32346f(interfaceC10391b, "typeSystemContext");
        C9801m.m32346f(abstractC10395f, "kotlinTypePreparator");
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return new C10342d1(z, z2, true, interfaceC10391b, abstractC10395f, abstractC10396g);
    }

    /* renamed from: b */
    public static /* synthetic */ C10342d1 m36830b(boolean z, boolean z2, InterfaceC10391b interfaceC10391b, AbstractC10395f abstractC10395f, AbstractC10396g abstractC10396g, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            interfaceC10391b = C10406q.f40209a;
        }
        if ((i2 & 8) != 0) {
            abstractC10395f = AbstractC10395f.a.f40182a;
        }
        if ((i2 & 16) != 0) {
            abstractC10396g = AbstractC10396g.a.f40183a;
        }
        return m36829a(z, z2, interfaceC10391b, abstractC10395f, abstractC10396g);
    }
}
