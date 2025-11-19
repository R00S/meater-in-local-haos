package Ib;

import Hb.AbstractC1106s;
import Hb.U;
import Hb.y0;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes3.dex */
public abstract class g extends AbstractC1106s {

    /* compiled from: KotlinTypeRefiner.kt */
    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6982a = new a();

        private a() {
        }

        @Override // Ib.g
        public InterfaceC1692e b(qb.b classId) {
            C3862t.g(classId, "classId");
            return null;
        }

        @Override // Ib.g
        public <S extends Ab.k> S c(InterfaceC1692e classDescriptor, Ba.a<? extends S> compute) {
            C3862t.g(classDescriptor, "classDescriptor");
            C3862t.g(compute, "compute");
            return compute.invoke();
        }

        @Override // Ib.g
        public boolean d(H moduleDescriptor) {
            C3862t.g(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // Ib.g
        public boolean e(y0 typeConstructor) {
            C3862t.g(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // Ib.g
        public Collection<U> g(InterfaceC1692e classDescriptor) {
            C3862t.g(classDescriptor, "classDescriptor");
            Collection<U> collectionS = classDescriptor.l().s();
            C3862t.f(collectionS, "getSupertypes(...)");
            return collectionS;
        }

        @Override // Hb.AbstractC1106s
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public U a(Lb.i type) {
            C3862t.g(type, "type");
            return (U) type;
        }

        @Override // Ib.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC1692e f(InterfaceC1700m descriptor) {
            C3862t.g(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC1692e b(qb.b bVar);

    public abstract <S extends Ab.k> S c(InterfaceC1692e interfaceC1692e, Ba.a<? extends S> aVar);

    public abstract boolean d(H h10);

    public abstract boolean e(y0 y0Var);

    public abstract InterfaceC1695h f(InterfaceC1700m interfaceC1700m);

    public abstract Collection<U> g(InterfaceC1692e interfaceC1692e);

    /* renamed from: h */
    public abstract U a(Lb.i iVar);
}
