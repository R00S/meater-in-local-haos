package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10365l0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.text.C10547v;

/* compiled from: RawType.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.f */
/* loaded from: classes2.dex */
public final class C10013f extends AbstractC10458y implements InterfaceC10365l0 {

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.f$a */
    static final class a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: f */
        public static final a f38181f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            C9801m.m32346f(str, "it");
            return "(raw) " + str;
        }
    }

    private C10013f(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02, boolean z) {
        super(abstractC10368m0, abstractC10368m02);
        if (z) {
            return;
        }
        InterfaceC10394e.f40181a.mo36920d(abstractC10368m0, abstractC10368m02);
    }

    /* renamed from: b1 */
    private static final boolean m33541b1(String str, String str2) {
        return C9801m.m32341a(str, C10547v.m37573m0(str2, "out ")) || C9801m.m32341a(str2, "*");
    }

    /* renamed from: c1 */
    private static final List<String> m33542c1(AbstractC10172c abstractC10172c, AbstractC10344e0 abstractC10344e0) {
        List<InterfaceC10351g1> listMo35991M0 = abstractC10344e0.mo35991M0();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo35991M0, 10));
        Iterator<T> it = listMo35991M0.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC10172c.mo35506x((InterfaceC10351g1) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d1 */
    private static final String m33543d1(String str, String str2) {
        if (!C10547v.m37536I(str, '<', false, 2, null)) {
            return str;
        }
        return C10547v.m37543L0(str, '<', null, 2, null) + '<' + str2 + '>' + C10547v.m37537I0(str, '>', null, 2, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: V0 */
    public AbstractC10368m0 mo33548V0() {
        return m37161W0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10172c abstractC10172c, InterfaceC10175f interfaceC10175f) {
        C9801m.m32346f(abstractC10172c, "renderer");
        C9801m.m32346f(interfaceC10175f, "options");
        String strMo35505w = abstractC10172c.mo35505w(m37161W0());
        String strMo35505w2 = abstractC10172c.mo35505w(m37162X0());
        if (interfaceC10175f.mo35655n()) {
            return "raw (" + strMo35505w + ".." + strMo35505w2 + ')';
        }
        if (m37162X0().mo35991M0().isEmpty()) {
            return abstractC10172c.mo35502t(strMo35505w, strMo35505w2, C10457a.m37142h(this));
        }
        List<String> listM33542c1 = m33542c1(abstractC10172c, m37161W0());
        List<String> listM33542c12 = m33542c1(abstractC10172c, m37162X0());
        String strM38599e0 = C10782c0.m38599e0(listM33542c1, ", ", null, null, 0, null, a.f38181f, 30, null);
        List listM38580L0 = C10782c0.m38580L0(listM33542c1, listM33542c12);
        boolean z = true;
        if (!(listM38580L0 instanceof Collection) || !listM38580L0.isEmpty()) {
            Iterator it = listM38580L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!m33541b1((String) pair.m37648c(), (String) pair.m37649d())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            strMo35505w2 = m33543d1(strMo35505w2, strM38599e0);
        }
        String strM33543d1 = m33543d1(strMo35505w, strM38599e0);
        return C9801m.m32341a(strM33543d1, strMo35505w2) ? strM33543d1 : abstractC10172c.mo35502t(strM33543d1, strMo35505w2, C10457a.m37142h(this));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10013f mo33545S0(boolean z) {
        return new C10013f(m37161W0().mo33545S0(z), m37162X0().mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public AbstractC10458y mo36558Y0(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        AbstractC10344e0 abstractC10344e0Mo36717a = abstractC10396g.mo36717a(m37161W0());
        C9801m.m32344d(abstractC10344e0Mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC10344e0 abstractC10344e0Mo36717a2 = abstractC10396g.mo36717a(m37162X0());
        C9801m.m32344d(abstractC10344e0Mo36717a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10013f((AbstractC10368m0) abstractC10344e0Mo36717a, (AbstractC10368m0) abstractC10344e0Mo36717a2, true);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C10013f mo33547U0(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "newAttributes");
        return new C10013f(m37161W0().mo33547U0(c10333a1), m37162X0().mo33547U0(c10333a1));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        InterfaceC10594h interfaceC10594hMo32891w = mo35993O0().mo32891w();
        C10014g c10014g = null;
        byte b2 = 0;
        InterfaceC10585e interfaceC10585e = interfaceC10594hMo32891w instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32891w : null;
        if (interfaceC10585e != null) {
            InterfaceC10251h interfaceC10251hMo37678a0 = interfaceC10585e.mo37678a0(new C10012e(c10014g, 1, b2 == true ? 1 : 0));
            C9801m.m32345e(interfaceC10251hMo37678a0, "classDescriptor.getMemberScope(RawSubstitution())");
            return interfaceC10251hMo37678a0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo35993O0().mo32891w()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10013f(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        this(abstractC10368m0, abstractC10368m02, false);
        C9801m.m32346f(abstractC10368m0, "lowerBound");
        C9801m.m32346f(abstractC10368m02, "upperBound");
    }
}
