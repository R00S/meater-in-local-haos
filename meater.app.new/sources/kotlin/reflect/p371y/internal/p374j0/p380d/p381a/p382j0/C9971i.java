package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Map;
import kotlin.C10773s;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10815t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10027e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10036m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.i */
/* loaded from: classes2.dex */
public final class C9971i extends C9964b {

    /* renamed from: g */
    static final /* synthetic */ KProperty<Object>[] f37924g = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9971i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: h */
    private final InterfaceC10325i f37925h;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.i$a */
    static final class a extends Lambda implements Function0<Map<C10163f, ? extends AbstractC10211g<? extends Object>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10163f, AbstractC10211g<Object>> invoke() {
            InterfaceC10021b interfaceC10021bM33160b = C9971i.this.m33160b();
            AbstractC10211g<?> abstractC10211gM33174c = interfaceC10021bM33160b instanceof InterfaceC10027e ? C9966d.f37912a.m33174c(((InterfaceC10027e) C9971i.this.m33160b()).mo33585e()) : interfaceC10021bM33160b instanceof InterfaceC10036m ? C9966d.f37912a.m33174c(C10815t.m38883e(C9971i.this.m33160b())) : null;
            Map<C10163f, AbstractC10211g<Object>> mapM38794f = abstractC10211gM33174c != null ? C10808p0.m38794f(C10773s.m38547a(C9965c.f37907a.m33170d(), abstractC10211gM33174c)) : null;
            return mapM38794f == null ? C10810q0.m38797i() : mapM38794f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9971i(InterfaceC10019a interfaceC10019a, C9990g c9990g) {
        super(c9990g, interfaceC10019a, C9917k.a.f37538H);
        C9801m.m32346f(interfaceC10019a, "annotation");
        C9801m.m32346f(c9990g, "c");
        this.f37925h = c9990g.m33286e().mo36516d(new a());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9964b, kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: a */
    public Map<C10163f, AbstractC10211g<Object>> mo33159a() {
        return (Map) C10329m.m36555a(this.f37925h, this, f37924g[0]);
    }
}
