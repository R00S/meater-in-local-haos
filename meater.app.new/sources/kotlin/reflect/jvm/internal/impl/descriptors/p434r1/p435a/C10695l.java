package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10575a1;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10715p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10016a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10017b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10035l;

/* compiled from: RuntimeSourceElementFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.l */
/* loaded from: classes2.dex */
public final class C10695l implements InterfaceC10017b {

    /* renamed from: a */
    public static final C10695l f41153a = new C10695l();

    /* compiled from: RuntimeSourceElementFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.l$a */
    public static final class a implements InterfaceC10016a {

        /* renamed from: b */
        private final AbstractC10715p f41154b;

        public a(AbstractC10715p abstractC10715p) {
            C9801m.m32346f(abstractC10715p, "javaElement");
            this.f41154b = abstractC10715p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0
        /* renamed from: a */
        public InterfaceC10575a1 mo33980a() {
            InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
            C9801m.m32345e(interfaceC10575a1, "NO_SOURCE_FILE");
            return interfaceC10575a1;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10016a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC10715p mo33568b() {
            return this.f41154b;
        }

        public String toString() {
            return a.class.getName() + ": " + mo33568b();
        }
    }

    private C10695l() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10017b
    /* renamed from: a */
    public InterfaceC10016a mo33569a(InterfaceC10035l interfaceC10035l) {
        C9801m.m32346f(interfaceC10035l, "javaElement");
        return new a((AbstractC10715p) interfaceC10035l);
    }
}
