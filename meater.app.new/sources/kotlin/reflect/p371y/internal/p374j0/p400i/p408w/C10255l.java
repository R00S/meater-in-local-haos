package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.l */
/* loaded from: classes3.dex */
public final class C10255l extends AbstractC10252i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f39672b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10255l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: c */
    private final InterfaceC10585e f39673c;

    /* renamed from: d */
    private final InterfaceC10325i f39674d;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.l$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10739y0>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10739y0> invoke() {
            return C10817u.m38891m(C10186c.m35788f(C10255l.this.f39673c), C10186c.m35789g(C10255l.this.f39673c));
        }
    }

    public C10255l(InterfaceC10330n interfaceC10330n, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10585e, "containingClass");
        this.f39673c = interfaceC10585e;
        interfaceC10585e.mo32878i();
        EnumC10588f enumC10588f = EnumC10588f.ENUM_CLASS;
        this.f39674d = interfaceC10330n.mo36516d(new a());
    }

    /* renamed from: l */
    private final List<InterfaceC10739y0> m36164l() {
        return (List) C10329m.m36555a(this.f39674d, this, f39672b[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        return (InterfaceC10594h) m36165i(c10163f, interfaceC9939b);
    }

    /* renamed from: i */
    public Void m36165i(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10739y0> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return m36164l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C10771e<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        List<InterfaceC10739y0> listM36164l = m36164l();
        C10771e<InterfaceC10739y0> c10771e = new C10771e<>();
        for (Object obj : listM36164l) {
            if (C9801m.m32341a(((InterfaceC10739y0) obj).getName(), c10163f)) {
                c10771e.add(obj);
            }
        }
        return c10771e;
    }
}
