package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.j */
/* loaded from: classes2.dex */
public final class C10623j implements InterfaceC10616c {

    /* renamed from: a */
    private final AbstractC9914h f40812a;

    /* renamed from: b */
    private final C10160c f40813b;

    /* renamed from: c */
    private final Map<C10163f, AbstractC10211g<?>> f40814c;

    /* renamed from: d */
    private final Lazy f40815d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.j$a */
    static final class a extends Lambda implements Function0<AbstractC10368m0> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke() {
            return C10623j.this.f40812a.m32797o(C10623j.this.mo33162d()).mo36400s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10623j(AbstractC9914h abstractC9914h, C10160c c10160c, Map<C10163f, ? extends AbstractC10211g<?>> map) {
        C9801m.m32346f(abstractC9914h, "builtIns");
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(map, "allValueArguments");
        this.f40812a = abstractC9914h;
        this.f40813b = c10160c;
        this.f40814c = map;
        this.f40815d = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: a */
    public Map<C10163f, AbstractC10211g<?>> mo33159a() {
        return this.f40814c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: d */
    public C10160c mo33162d() {
        return this.f40813b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    public AbstractC10344e0 getType() {
        Object value = this.f40815d.getValue();
        C9801m.m32345e(value, "<get-type>(...)");
        return (AbstractC10344e0) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: t */
    public InterfaceC10741z0 mo33164t() {
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
        return interfaceC10741z0;
    }
}
