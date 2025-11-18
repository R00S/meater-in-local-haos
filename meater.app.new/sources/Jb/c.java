package Jb;

import Hb.H0;
import Hb.U;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.E;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.g0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import Ua.AbstractC1779s;
import Ua.O;
import java.util.Collection;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: ErrorFunctionDescriptor.kt */
/* loaded from: classes3.dex */
public final class c extends O {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC1692e containingDeclaration) {
        super(containingDeclaration, null, Sa.h.f15630e.b(), qb.f.w(b.f7660D.j()), InterfaceC1689b.a.DECLARATION, h0.f15158a);
        C3862t.g(containingDeclaration, "containingDeclaration");
        S0(null, null, r.m(), r.m(), r.m(), l.d(k.f7722L, new String[0]), E.f15108E, C1706t.f15170e);
    }

    @Override // Ua.O, Ua.AbstractC1779s
    /* renamed from: M0 */
    protected AbstractC1779s p1(InterfaceC1700m newOwner, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a kind, qb.f fVar, Sa.h annotations, h0 source) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(kind, "kind");
        C3862t.g(annotations, "annotations");
        C3862t.g(source, "source");
        return this;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1688a
    public <V> V g0(InterfaceC1688a.InterfaceC0222a<V> key) {
        C3862t.g(key, "key");
        return null;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z
    public boolean isSuspend() {
        return false;
    }

    @Override // Ua.O, Ua.AbstractC1779s, Ra.InterfaceC1689b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public g0 a0(InterfaceC1700m newOwner, E modality, AbstractC1707u visibility, InterfaceC1689b.a kind, boolean z10) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(modality, "modality");
        C3862t.g(visibility, "visibility");
        C3862t.g(kind, "kind");
        return this;
    }

    @Override // Ua.O, Ua.AbstractC1779s, Ra.InterfaceC1712z, Ra.g0
    public InterfaceC1712z.a<g0> v() {
        return new a();
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1689b
    public void w0(Collection<? extends InterfaceC1689b> overriddenDescriptors) {
        C3862t.g(overriddenDescriptors, "overriddenDescriptors");
    }

    /* compiled from: ErrorFunctionDescriptor.kt */
    public static final class a implements InterfaceC1712z.a<g0> {
        a() {
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> b(qb.f name) {
            C3862t.g(name, "name");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> c(List<? extends t0> parameters) {
            C3862t.g(parameters, "parameters");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> h(AbstractC1707u visibility) {
            C3862t.g(visibility, "visibility");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public <V> InterfaceC1712z.a<g0> i(InterfaceC1688a.InterfaceC0222a<V> userDataKey, V v10) {
            C3862t.g(userDataKey, "userDataKey");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> k(List<? extends m0> parameters) {
            C3862t.g(parameters, "parameters");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> m(E modality) {
            C3862t.g(modality, "modality");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> n(InterfaceC1689b.a kind) {
            C3862t.g(kind, "kind");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> o(InterfaceC1700m owner) {
            C3862t.g(owner, "owner");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> q(Sa.h additionalAnnotations) {
            C3862t.g(additionalAnnotations, "additionalAnnotations");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> r(H0 substitution) {
            C3862t.g(substitution, "substitution");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> s(U type) {
            C3862t.g(type, "type");
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public g0 e() {
            return c.this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> a() {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> d() {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> f() {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> l() {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> t() {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> g(boolean z10) {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> j(InterfaceC1689b interfaceC1689b) {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> p(c0 c0Var) {
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z.a<g0> u(c0 c0Var) {
            return this;
        }
    }
}
