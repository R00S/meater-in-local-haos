package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;

/* compiled from: TypeAliasExpansionReportStrategy.kt */
/* renamed from: kotlin.f0.y.e.j0.l.x0 */
/* loaded from: classes3.dex */
public interface InterfaceC10456x0 {

    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.x0$a */
    public static final class a implements InterfaceC10456x0 {

        /* renamed from: a */
        public static final a f40383a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10456x0
        /* renamed from: a */
        public void mo37131a(InterfaceC10616c interfaceC10616c) {
            C9801m.m32346f(interfaceC10616c, "annotation");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10456x0
        /* renamed from: b */
        public void mo37132b(InterfaceC10584d1 interfaceC10584d1, InterfaceC10587e1 interfaceC10587e1, AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(interfaceC10584d1, "typeAlias");
            C9801m.m32346f(abstractC10344e0, "substitutedArgument");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10456x0
        /* renamed from: c */
        public void mo37133c(C10366l1 c10366l1, AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, InterfaceC10587e1 interfaceC10587e1) {
            C9801m.m32346f(c10366l1, "substitutor");
            C9801m.m32346f(abstractC10344e0, "unsubstitutedArgument");
            C9801m.m32346f(abstractC10344e02, "argument");
            C9801m.m32346f(interfaceC10587e1, "typeParameter");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10456x0
        /* renamed from: d */
        public void mo37134d(InterfaceC10584d1 interfaceC10584d1) {
            C9801m.m32346f(interfaceC10584d1, "typeAlias");
        }
    }

    /* renamed from: a */
    void mo37131a(InterfaceC10616c interfaceC10616c);

    /* renamed from: b */
    void mo37132b(InterfaceC10584d1 interfaceC10584d1, InterfaceC10587e1 interfaceC10587e1, AbstractC10344e0 abstractC10344e0);

    /* renamed from: c */
    void mo37133c(C10366l1 c10366l1, AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, InterfaceC10587e1 interfaceC10587e1);

    /* renamed from: d */
    void mo37134d(InterfaceC10584d1 interfaceC10584d1);
}
