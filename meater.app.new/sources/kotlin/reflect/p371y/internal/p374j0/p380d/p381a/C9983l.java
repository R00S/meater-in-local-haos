package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9979e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10012e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10013f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;

/* compiled from: ErasedOverridabilityCondition.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l */
/* loaded from: classes2.dex */
public final class C9983l implements InterfaceC10188e {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37956a;

        static {
            int[] iArr = new int[C10193j.i.a.values().length];
            iArr[C10193j.i.a.OVERRIDABLE.ordinal()] = 1;
            f37956a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l$b */
    static final class b extends Lambda implements Function1<InterfaceC10599i1, AbstractC10344e0> {

        /* renamed from: f */
        public static final b f37957f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10599i1 interfaceC10599i1) {
            return interfaceC10599i1.getType();
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e
    /* renamed from: a */
    public InterfaceC10188e.a mo33227a() {
        return InterfaceC10188e.a.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e
    /* renamed from: b */
    public InterfaceC10188e.b mo33228b(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e) {
        boolean z;
        InterfaceC10573a interfaceC10573aMo36396c;
        C9801m.m32346f(interfaceC10573a, "superDescriptor");
        C9801m.m32346f(interfaceC10573a2, "subDescriptor");
        if (interfaceC10573a2 instanceof C9979e) {
            C9979e c9979e = (C9979e) interfaceC10573a2;
            C9801m.m32345e(c9979e.getTypeParameters(), "subDescriptor.typeParameters");
            if (!(!r0.isEmpty())) {
                C10193j.i iVarM35879w = C10193j.m35879w(interfaceC10573a, interfaceC10573a2);
                if ((iVarM35879w != null ? iVarM35879w.m35898c() : null) != null) {
                    return InterfaceC10188e.b.UNKNOWN;
                }
                List<InterfaceC10599i1> listMo37028f = c9979e.mo37028f();
                C9801m.m32345e(listMo37028f, "subDescriptor.valueParameters");
                Sequence sequenceM37391u = C10522n.m37391u(C10782c0.m38575J(listMo37028f), b.f37957f);
                AbstractC10344e0 returnType = c9979e.getReturnType();
                C9801m.m32343c(returnType);
                Sequence sequenceM37394x = C10522n.m37394x(sequenceM37391u, returnType);
                InterfaceC10735w0 interfaceC10735w0Mo37032m0 = c9979e.mo37032m0();
                Iterator it = C10522n.m37393w(sequenceM37394x, C10817u.m38892n(interfaceC10735w0Mo37032m0 != null ? interfaceC10735w0Mo37032m0.getType() : null)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) it.next();
                    if ((abstractC10344e0.mo35991M0().isEmpty() ^ true) && !(abstractC10344e0.mo36635R0() instanceof C10013f)) {
                        z = true;
                        break;
                    }
                }
                if (!z && (interfaceC10573aMo36396c = interfaceC10573a.mo36396c(new C10012e(null, 1, null).m36726c())) != null) {
                    if (interfaceC10573aMo36396c instanceof InterfaceC10739y0) {
                        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) interfaceC10573aMo36396c;
                        C9801m.m32345e(interfaceC10739y0.getTypeParameters(), "erasedSuper.typeParameters");
                        if (!r0.isEmpty()) {
                            interfaceC10573aMo36396c = interfaceC10739y0.mo36992u().mo37006m(C10817u.m38888j()).mo36996c();
                            C9801m.m32343c(interfaceC10573aMo36396c);
                        }
                    }
                    C10193j.i.a aVarM35898c = C10193j.f39520b.m35885F(interfaceC10573aMo36396c, interfaceC10573a2, false).m35898c();
                    C9801m.m32345e(aVarM35898c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    return a.f37956a[aVarM35898c.ordinal()] == 1 ? InterfaceC10188e.b.OVERRIDABLE : InterfaceC10188e.b.UNKNOWN;
                }
                return InterfaceC10188e.b.UNKNOWN;
            }
        }
        return InterfaceC10188e.b.UNKNOWN;
    }
}
