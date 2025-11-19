package Ka;

import Ba.p;
import Db.K;
import Ia.g;
import Ia.h;
import La.C1432i0;
import La.C1435k;
import La.j1;
import Ra.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import lb.C3929i;
import lb.C3940t;
import oa.C4170o;
import oa.InterfaceC4160e;
import pb.e;
import pb.f;
import pb.i;

/* compiled from: reflectLambda.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "Loa/e;", "LIa/h;", "a", "(Loa/e;)LIa/h;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* compiled from: reflectLambda.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends C3859p implements p<K, C3929i, g0> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8871B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g0 invoke(K p02, C3929i p12) {
            C3862t.g(p02, "p0");
            C3862t.g(p12, "p1");
            return p02.s(p12);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final g getOwner() {
            return P.b(K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    public static final <R> h<R> a(InterfaceC4160e<? extends R> interfaceC4160e) {
        C3862t.g(interfaceC4160e, "<this>");
        Metadata metadata = (Metadata) interfaceC4160e.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        C4170o<f, C3929i> c4170oJ = i.j(strArrD1, metadata.d2());
        f fVarA = c4170oJ.a();
        C3929i c3929iB = c4170oJ.b();
        e eVar = new e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC4160e.getClass();
        C3940t c3940tO0 = c3929iB.o0();
        C3862t.f(c3940tO0, "getTypeTable(...)");
        return new C1432i0(C1435k.f11231E, (g0) j1.h(cls, c3929iB, fVarA, new nb.g(c3940tO0), eVar, a.f8871B));
    }
}
