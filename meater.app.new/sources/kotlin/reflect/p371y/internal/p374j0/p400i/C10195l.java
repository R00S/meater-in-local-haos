package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.C10775u;
import kotlin.collections.C10813s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.utils.C10772f;
import p000.C0000a;

/* compiled from: overridingUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.i.l */
/* loaded from: classes3.dex */
public final class C10195l {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.l$a */
    static final class a<H> extends Lambda implements Function1<H, C10775u> {

        /* renamed from: f */
        final /* synthetic */ C10772f<H> f39546f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10772f<H> c10772f) {
            super(1);
            this.f39546f = c10772f;
        }

        /* renamed from: b */
        public final void m35987b(H h2) {
            C10772f<H> c10772f = this.f39546f;
            C9801m.m32345e(h2, "it");
            c10772f.add(h2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Object obj) {
            m35987b(obj);
            return C10775u.f41439a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <H> Collection<H> m35986a(Collection<? extends H> collection, Function1<? super H, ? extends InterfaceC10573a> function1) {
        C9801m.m32346f(collection, "<this>");
        C9801m.m32346f(function1, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C10772f c10772fM38544a = C10772f.f41432f.m38544a();
        while (!linkedList.isEmpty()) {
            Object objM38830U = C10813s.m38830U(linkedList);
            C10772f c10772fM38544a2 = C10772f.f41432f.m38544a();
            Collection<C0000a> collectionM35873p = C10193j.m35873p(objM38830U, linkedList, function1, new a(c10772fM38544a2));
            C9801m.m32345e(collectionM35873p, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (collectionM35873p.size() == 1 && c10772fM38544a2.isEmpty()) {
                Object objM38864r0 = C10813s.m38864r0(collectionM35873p);
                C9801m.m32345e(objM38864r0, "overridableGroup.single()");
                c10772fM38544a.add(objM38864r0);
            } else {
                C0000a c0000a = (Object) C10193j.m35857L(collectionM35873p, function1);
                C9801m.m32345e(c0000a, "selectMostSpecificMember…roup, descriptorByHandle)");
                InterfaceC10573a interfaceC10573aInvoke = function1.invoke(c0000a);
                for (C0000a c0000a2 : collectionM35873p) {
                    C9801m.m32345e(c0000a2, "it");
                    if (!C10193j.m35850B(interfaceC10573aInvoke, function1.invoke(c0000a2))) {
                        c10772fM38544a2.add(c0000a2);
                    }
                }
                if (!c10772fM38544a2.isEmpty()) {
                    c10772fM38544a.addAll(c10772fM38544a2);
                }
                c10772fM38544a.add(c0000a);
            }
        }
        return c10772fM38544a;
    }
}
