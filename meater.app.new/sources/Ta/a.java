package Ta;

import Hb.U;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.g0;
import java.util.Collection;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import qb.f;

/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: Ta.a$a, reason: collision with other inner class name */
    public static final class C0255a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0255a f16659a = new C0255a();

        private C0255a() {
        }

        @Override // Ta.a
        public Collection<U> a(InterfaceC1692e classDescriptor) {
            C3862t.g(classDescriptor, "classDescriptor");
            return r.m();
        }

        @Override // Ta.a
        public Collection<InterfaceC1691d> b(InterfaceC1692e classDescriptor) {
            C3862t.g(classDescriptor, "classDescriptor");
            return r.m();
        }

        @Override // Ta.a
        public Collection<f> c(InterfaceC1692e classDescriptor) {
            C3862t.g(classDescriptor, "classDescriptor");
            return r.m();
        }

        @Override // Ta.a
        public Collection<g0> d(f name, InterfaceC1692e classDescriptor) {
            C3862t.g(name, "name");
            C3862t.g(classDescriptor, "classDescriptor");
            return r.m();
        }
    }

    Collection<U> a(InterfaceC1692e interfaceC1692e);

    Collection<InterfaceC1691d> b(InterfaceC1692e interfaceC1692e);

    Collection<f> c(InterfaceC1692e interfaceC1692e);

    Collection<g0> d(f fVar, InterfaceC1692e interfaceC1692e);
}
