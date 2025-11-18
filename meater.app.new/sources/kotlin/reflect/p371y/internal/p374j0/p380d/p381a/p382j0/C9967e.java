package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Map;
import kotlin.C10773s;
import kotlin.collections.C10808p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10226v;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.e */
/* loaded from: classes2.dex */
public final class C9967e extends C9964b {

    /* renamed from: g */
    static final /* synthetic */ KProperty<Object>[] f37916g = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9967e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: h */
    private final InterfaceC10325i f37917h;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.e$a */
    static final class a extends Lambda implements Function0<Map<C10163f, ? extends C10226v>> {

        /* renamed from: f */
        public static final a f37918f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10163f, C10226v> invoke() {
            return C10808p0.m38794f(C10773s.m38547a(C9965c.f37907a.m33168b(), new C10226v("Deprecated in Java")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9967e(InterfaceC10019a interfaceC10019a, C9990g c9990g) {
        super(c9990g, interfaceC10019a, C9917k.a.f37608y);
        C9801m.m32346f(c9990g, "c");
        this.f37917h = c9990g.m33286e().mo36516d(a.f37918f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9964b, kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: a */
    public Map<C10163f, AbstractC10211g<?>> mo33159a() {
        return (Map) C10329m.m36555a(this.f37917h, this, f37916g[0]);
    }
}
