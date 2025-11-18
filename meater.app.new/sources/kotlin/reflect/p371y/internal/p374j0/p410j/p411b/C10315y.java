package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10808p0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10134m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;

/* compiled from: ProtoBasedClassDataFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.y */
/* loaded from: classes3.dex */
public final class C10315y implements InterfaceC10298h {

    /* renamed from: a */
    private final InterfaceC10151c f39990a;

    /* renamed from: b */
    private final AbstractC10149a f39991b;

    /* renamed from: c */
    private final Function1<C10159b, InterfaceC10741z0> f39992c;

    /* renamed from: d */
    private final Map<C10159b, C10124c> f39993d;

    /* JADX WARN: Multi-variable type inference failed */
    public C10315y(C10134m c10134m, InterfaceC10151c interfaceC10151c, AbstractC10149a abstractC10149a, Function1<? super C10159b, ? extends InterfaceC10741z0> function1) {
        C9801m.m32346f(c10134m, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C9801m.m32346f(function1, "classSource");
        this.f39990a = interfaceC10151c;
        this.f39991b = abstractC10149a;
        this.f39992c = function1;
        List<C10124c> listM34831J = c10134m.m34831J();
        C9801m.m32345e(listM34831J, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(listM34831J, 10)), 16));
        for (Object obj : listM34831J) {
            linkedHashMap.put(C10314x.m36494a(this.f39990a, ((C10124c) obj).m34439F0()), obj);
        }
        this.f39993d = linkedHashMap;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10298h
    /* renamed from: a */
    public C10283g mo33978a(C10159b c10159b) {
        C9801m.m32346f(c10159b, "classId");
        C10124c c10124c = this.f39993d.get(c10159b);
        if (c10124c == null) {
            return null;
        }
        return new C10283g(this.f39990a, c10124c, this.f39991b, this.f39992c.invoke(c10159b));
    }

    /* renamed from: b */
    public final Collection<C10159b> m36496b() {
        return this.f39993d.keySet();
    }
}
