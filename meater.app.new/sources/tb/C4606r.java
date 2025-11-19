package tb;

import A.B;
import Ra.InterfaceC1688a;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: overridingUtils.kt */
/* renamed from: tb.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4606r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> b(Collection<? extends H> collection, Ba.l<? super H, ? extends InterfaceC1688a> descriptorByHandle) {
        C3862t.g(collection, "<this>");
        C3862t.g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        Rb.l lVarA = Rb.l.f15221D.a();
        while (!linkedList.isEmpty()) {
            Object objJ0 = kotlin.collections.r.j0(linkedList);
            Rb.l lVarA2 = Rb.l.f15221D.a();
            Collection<B> collectionQ = C4603o.q(objJ0, linkedList, descriptorByHandle, new C4605q(lVarA2));
            C3862t.f(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && lVarA2.isEmpty()) {
                Object objI0 = kotlin.collections.r.I0(collectionQ);
                C3862t.f(objI0, "single(...)");
                lVarA.add(objI0);
            } else {
                B b10 = (Object) C4603o.L(collectionQ, descriptorByHandle);
                InterfaceC1688a interfaceC1688aInvoke = descriptorByHandle.invoke(b10);
                for (B b11 : collectionQ) {
                    C3862t.d(b11);
                    if (!C4603o.B(interfaceC1688aInvoke, descriptorByHandle.invoke(b11))) {
                        lVarA2.add(b11);
                    }
                }
                if (!lVarA2.isEmpty()) {
                    lVarA.addAll(lVarA2);
                }
                lVarA.add(b10);
            }
        }
        return lVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F c(Rb.l lVar, Object obj) {
        C3862t.d(obj);
        lVar.add(obj);
        return C4153F.f46609a;
    }
}
