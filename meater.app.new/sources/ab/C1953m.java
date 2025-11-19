package ab;

import Ra.InterfaceC1689b;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
/* renamed from: ab.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1953m {

    /* renamed from: a, reason: collision with root package name */
    public static final C1953m f20263a = new C1953m();

    private C1953m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC1689b it) {
        C3862t.g(it, "it");
        return f20263a.d(it);
    }

    private final boolean e(InterfaceC1689b interfaceC1689b) {
        if (kotlin.collections.r.a0(C1950j.f20256a.c(), C5087e.k(interfaceC1689b)) && interfaceC1689b.k().isEmpty()) {
            return true;
        }
        if (!Oa.j.g0(interfaceC1689b)) {
            return false;
        }
        Collection<? extends InterfaceC1689b> collectionG = interfaceC1689b.g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1689b> collection = collectionG;
        if (!collection.isEmpty()) {
            for (InterfaceC1689b interfaceC1689b2 : collection) {
                C1953m c1953m = f20263a;
                C3862t.d(interfaceC1689b2);
                if (c1953m.d(interfaceC1689b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b(InterfaceC1689b interfaceC1689b) {
        qb.f fVar;
        C3862t.g(interfaceC1689b, "<this>");
        Oa.j.g0(interfaceC1689b);
        InterfaceC1689b interfaceC1689bI = C5087e.i(C5087e.w(interfaceC1689b), false, C1952l.f20262B, 1, null);
        if (interfaceC1689bI == null || (fVar = C1950j.f20256a.a().get(C5087e.o(interfaceC1689bI))) == null) {
            return null;
        }
        return fVar.j();
    }

    public final boolean d(InterfaceC1689b callableMemberDescriptor) {
        C3862t.g(callableMemberDescriptor, "callableMemberDescriptor");
        if (C1950j.f20256a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }
}
