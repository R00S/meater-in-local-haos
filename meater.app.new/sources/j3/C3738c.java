package j3;

import Ba.q;
import ic.InterfaceC3693a;
import ic.g;
import java.util.List;
import java.util.Map;
import kc.f;
import kc.k;
import kotlin.AbstractC3386C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;

/* compiled from: RouteSerializer.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ac\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u00032&\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "T", "route", "", "", "Lg3/C;", "typeMap", "c", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lic/a;", "", "b", "(Lic/a;)I", "Lkotlin/Function3;", "Loa/F;", "operation", "a", "(Lic/a;Ljava/util/Map;LBa/q;)V", "Lkc/f;", "", "d", "(Lkc/f;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3738c {

    /* compiled from: RouteSerializer.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "", "index", "", "argName", "Lg3/C;", "navType", "Loa/F;", "a", "(ILjava/lang/String;Lg3/C;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: j3.c$a */
    static final class a extends AbstractC3864v implements q<Integer, String, AbstractC3386C<Object>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Map<String, List<String>> f43519B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3736a<? extends T> f43520C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Map<String, ? extends List<String>> map, C3736a<? extends T> c3736a) {
            super(3);
            this.f43519B = map;
            this.f43520C = c3736a;
        }

        public final void a(int i10, String argName, AbstractC3386C<Object> navType) {
            C3862t.g(argName, "argName");
            C3862t.g(navType, "navType");
            List<String> list = this.f43519B.get(argName);
            C3862t.d(list);
            this.f43520C.c(i10, argName, navType, list);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(Integer num, String str, AbstractC3386C<Object> abstractC3386C) {
            a(num.intValue(), str, abstractC3386C);
            return C4153F.f46609a;
        }
    }

    private static final <T> void a(InterfaceC3693a<T> interfaceC3693a, Map<String, ? extends AbstractC3386C<Object>> map, q<? super Integer, ? super String, ? super AbstractC3386C<Object>, C4153F> qVar) {
        int iC = interfaceC3693a.getDescriptor().getElementsCount();
        for (int i10 = 0; i10 < iC; i10++) {
            String strD = interfaceC3693a.getDescriptor().d(i10);
            AbstractC3386C<Object> abstractC3386C = map.get(strD);
            if (abstractC3386C == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strD + ']').toString());
            }
            qVar.g(Integer.valueOf(i10), strD, abstractC3386C);
        }
    }

    public static final <T> int b(InterfaceC3693a<T> interfaceC3693a) {
        C3862t.g(interfaceC3693a, "<this>");
        int iHashCode = interfaceC3693a.getDescriptor().getSerialName().hashCode();
        int iC = interfaceC3693a.getDescriptor().getElementsCount();
        for (int i10 = 0; i10 < iC; i10++) {
            iHashCode = (iHashCode * 31) + interfaceC3693a.getDescriptor().d(i10).hashCode();
        }
        return iHashCode;
    }

    public static final <T> String c(T route, Map<String, ? extends AbstractC3386C<Object>> typeMap) {
        C3862t.g(route, "route");
        C3862t.g(typeMap, "typeMap");
        InterfaceC3693a interfaceC3693aA = g.a(P.b(route.getClass()));
        Map<String, List<String>> mapD = new C3737b(interfaceC3693aA, typeMap).D(route);
        C3736a c3736a = new C3736a(interfaceC3693aA);
        a(interfaceC3693aA, typeMap, new a(mapD, c3736a));
        return c3736a.d();
    }

    public static final boolean d(f fVar) {
        C3862t.g(fVar, "<this>");
        return C3862t.b(fVar.getKind(), k.a.f43919a) && fVar.getIsInline() && fVar.getElementsCount() == 1;
    }
}
