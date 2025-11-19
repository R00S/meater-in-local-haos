package Ua;

import Hb.H0;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ModuleAwareClassDescriptor.kt */
/* loaded from: classes3.dex */
public abstract class z implements InterfaceC1692e {

    /* renamed from: B, reason: collision with root package name */
    public static final a f17926B = new a(null);

    /* compiled from: ModuleAwareClassDescriptor.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final Ab.k a(InterfaceC1692e interfaceC1692e, H0 typeSubstitution, Ib.g kotlinTypeRefiner) {
            Ab.k kVarH;
            C3862t.g(interfaceC1692e, "<this>");
            C3862t.g(typeSubstitution, "typeSubstitution");
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC1692e instanceof z ? (z) interfaceC1692e : null;
            if (zVar != null && (kVarH = zVar.H(typeSubstitution, kotlinTypeRefiner)) != null) {
                return kVarH;
            }
            Ab.k kVarH0 = interfaceC1692e.H0(typeSubstitution);
            C3862t.f(kVarH0, "getMemberScope(...)");
            return kVarH0;
        }

        public final Ab.k b(InterfaceC1692e interfaceC1692e, Ib.g kotlinTypeRefiner) {
            Ab.k kVarZ0;
            C3862t.g(interfaceC1692e, "<this>");
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC1692e instanceof z ? (z) interfaceC1692e : null;
            if (zVar != null && (kVarZ0 = zVar.z0(kotlinTypeRefiner)) != null) {
                return kVarZ0;
            }
            Ab.k kVarC0 = interfaceC1692e.C0();
            C3862t.f(kVarC0, "getUnsubstitutedMemberScope(...)");
            return kVarC0;
        }

        private a() {
        }
    }

    protected abstract Ab.k H(H0 h02, Ib.g gVar);

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1700m
    public /* bridge */ /* synthetic */ InterfaceC1695h b() {
        return b();
    }

    protected abstract Ab.k z0(Ib.g gVar);

    @Override // Ra.InterfaceC1700m
    public /* bridge */ /* synthetic */ InterfaceC1700m b() {
        return b();
    }
}
