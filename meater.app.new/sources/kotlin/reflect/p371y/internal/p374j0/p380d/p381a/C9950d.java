package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10827z;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.d */
/* loaded from: classes2.dex */
public final class C9950d extends AbstractC9944a<InterfaceC10616c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9950d(C10077w c10077w) {
        super(c10077w);
        C9801m.m32346f(c10077w, "javaTypeEnhancementState");
    }

    /* renamed from: y */
    private final List<String> m33068y(AbstractC10211g<?> abstractC10211g) {
        if (!(abstractC10211g instanceof C10206b)) {
            return abstractC10211g instanceof C10214j ? C10815t.m38883e(((C10214j) abstractC10211g).m36030c().m35457u()) : C10817u.m38888j();
        }
        List<? extends AbstractC10211g<?>> listMo36023b = ((C10206b) abstractC10211g).mo36023b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo36023b.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList, m33068y((AbstractC10211g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9944a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable<String> mo33034b(InterfaceC10616c interfaceC10616c, boolean z) {
        C9801m.m32346f(interfaceC10616c, "<this>");
        Map<C10163f, AbstractC10211g<?>> mapMo33159a = interfaceC10616c.mo33159a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C10163f, AbstractC10211g<?>> entry : mapMo33159a.entrySet()) {
            C10827z.m38933z(arrayList, (!z || C9801m.m32341a(entry.getKey(), C9945a0.f37788c)) ? m33068y(entry.getValue()) : C10817u.m38888j());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9944a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C10160c mo33038i(InterfaceC10616c interfaceC10616c) {
        C9801m.m32346f(interfaceC10616c, "<this>");
        return interfaceC10616c.mo33162d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9944a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object mo33039j(InterfaceC10616c interfaceC10616c) {
        C9801m.m32346f(interfaceC10616c, "<this>");
        InterfaceC10585e interfaceC10585eM36071e = C10235a.m36071e(interfaceC10616c);
        C9801m.m32343c(interfaceC10585eM36071e);
        return interfaceC10585eM36071e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9944a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<InterfaceC10616c> mo33040k(InterfaceC10616c interfaceC10616c) {
        InterfaceC10620g annotations;
        C9801m.m32346f(interfaceC10616c, "<this>");
        InterfaceC10585e interfaceC10585eM36071e = C10235a.m36071e(interfaceC10616c);
        return (interfaceC10585eM36071e == null || (annotations = interfaceC10585eM36071e.getAnnotations()) == null) ? C10817u.m38888j() : annotations;
    }
}
