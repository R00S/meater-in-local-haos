package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10346f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10395f;

/* compiled from: NewKotlinTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.m */
/* loaded from: classes3.dex */
public final class C10402m implements InterfaceC10401l {

    /* renamed from: c */
    private final AbstractC10396g f40204c;

    /* renamed from: d */
    private final AbstractC10395f f40205d;

    /* renamed from: e */
    private final C10193j f40206e;

    public C10402m(AbstractC10396g abstractC10396g, AbstractC10395f abstractC10395f) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        C9801m.m32346f(abstractC10395f, "kotlinTypePreparator");
        this.f40204c = abstractC10396g;
        this.f40205d = abstractC10395f;
        C10193j c10193jM35870m = C10193j.m35870m(mo36949c());
        C9801m.m32345e(c10193jM35870m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f40206e = c10193jM35870m;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10401l
    /* renamed from: a */
    public C10193j mo36948a() {
        return this.f40206e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e
    /* renamed from: b */
    public boolean mo36919b(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        C9801m.m32346f(abstractC10344e0, "a");
        C9801m.m32346f(abstractC10344e02, "b");
        return m36951e(C10390a.m36830b(false, false, null, m36952f(), mo36949c(), 6, null), abstractC10344e0.mo36635R0(), abstractC10344e02.mo36635R0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10401l
    /* renamed from: c */
    public AbstractC10396g mo36949c() {
        return this.f40204c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e
    /* renamed from: d */
    public boolean mo36920d(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        C9801m.m32346f(abstractC10344e0, "subtype");
        C9801m.m32346f(abstractC10344e02, "supertype");
        return m36953g(C10390a.m36830b(true, false, null, m36952f(), mo36949c(), 6, null), abstractC10344e0.mo36635R0(), abstractC10344e02.mo36635R0());
    }

    /* renamed from: e */
    public final boolean m36951e(C10342d1 c10342d1, AbstractC10381q1 abstractC10381q1, AbstractC10381q1 abstractC10381q12) {
        C9801m.m32346f(c10342d1, "<this>");
        C9801m.m32346f(abstractC10381q1, "a");
        C9801m.m32346f(abstractC10381q12, "b");
        return C10346f.f40078a.m36654k(c10342d1, abstractC10381q1, abstractC10381q12);
    }

    /* renamed from: f */
    public AbstractC10395f m36952f() {
        return this.f40205d;
    }

    /* renamed from: g */
    public final boolean m36953g(C10342d1 c10342d1, AbstractC10381q1 abstractC10381q1, AbstractC10381q1 abstractC10381q12) {
        C9801m.m32346f(c10342d1, "<this>");
        C9801m.m32346f(abstractC10381q1, "subType");
        C9801m.m32346f(abstractC10381q12, "superType");
        return C10346f.m36649t(C10346f.f40078a, c10342d1, abstractC10381q1, abstractC10381q12, false, 8, null);
    }

    public /* synthetic */ C10402m(AbstractC10396g abstractC10396g, AbstractC10395f abstractC10395f, int i2, C9789g c9789g) {
        this(abstractC10396g, (i2 & 2) != 0 ? AbstractC10395f.a.f40182a : abstractC10395f);
    }
}
