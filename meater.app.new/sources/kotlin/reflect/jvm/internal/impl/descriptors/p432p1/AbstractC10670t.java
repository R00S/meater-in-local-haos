package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: ModuleAwareClassDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.t */
/* loaded from: classes2.dex */
public abstract class AbstractC10670t implements InterfaceC10585e {

    /* renamed from: f */
    public static final a f41103f = new a(null);

    /* compiled from: ModuleAwareClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10251h m37975a(InterfaceC10585e interfaceC10585e, AbstractC10360j1 abstractC10360j1, AbstractC10396g abstractC10396g) {
            InterfaceC10251h interfaceC10251hMo36986v;
            C9801m.m32346f(interfaceC10585e, "<this>");
            C9801m.m32346f(abstractC10360j1, "typeSubstitution");
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            AbstractC10670t abstractC10670t = interfaceC10585e instanceof AbstractC10670t ? (AbstractC10670t) interfaceC10585e : null;
            if (abstractC10670t != null && (interfaceC10251hMo36986v = abstractC10670t.mo36986v(abstractC10360j1, abstractC10396g)) != null) {
                return interfaceC10251hMo36986v;
            }
            InterfaceC10251h interfaceC10251hMo37678a0 = interfaceC10585e.mo37678a0(abstractC10360j1);
            C9801m.m32345e(interfaceC10251hMo37678a0, "this.getMemberScope(\n   …ubstitution\n            )");
            return interfaceC10251hMo37678a0;
        }

        /* renamed from: b */
        public final InterfaceC10251h m37976b(InterfaceC10585e interfaceC10585e, AbstractC10396g abstractC10396g) {
            InterfaceC10251h interfaceC10251hMo32860H;
            C9801m.m32346f(interfaceC10585e, "<this>");
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            AbstractC10670t abstractC10670t = interfaceC10585e instanceof AbstractC10670t ? (AbstractC10670t) interfaceC10585e : null;
            if (abstractC10670t != null && (interfaceC10251hMo32860H = abstractC10670t.mo32860H(abstractC10396g)) != null) {
                return interfaceC10251hMo32860H;
            }
            InterfaceC10251h interfaceC10251hMo33340D0 = interfaceC10585e.mo33340D0();
            C9801m.m32345e(interfaceC10251hMo33340D0, "this.unsubstitutedMemberScope");
            return interfaceC10251hMo33340D0;
        }
    }

    /* renamed from: H */
    protected abstract InterfaceC10251h mo32860H(AbstractC10396g abstractC10396g);

    /* renamed from: v */
    protected abstract InterfaceC10251h mo36986v(AbstractC10360j1 abstractC10360j1, AbstractC10396g abstractC10396g);
}
