package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.l.s0 */
/* loaded from: classes3.dex */
public final class C10386s0 extends AbstractC10354h1 {

    /* renamed from: a */
    private final InterfaceC10587e1 f40175a;

    /* renamed from: b */
    private final Lazy f40176b;

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.s0$a */
    static final class a extends Lambda implements Function0<AbstractC10344e0> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke() {
            return C10389t0.m36828b(C10386s0.this.f40175a);
        }
    }

    public C10386s0(InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        this.f40175a = interfaceC10587e1;
        this.f40176b = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new a());
    }

    /* renamed from: e */
    private final AbstractC10344e0 m36822e() {
        return (AbstractC10344e0) this.f40176b.getValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    /* renamed from: a */
    public EnumC10384r1 mo36708a() {
        return EnumC10384r1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    /* renamed from: b */
    public InterfaceC10351g1 mo36709b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    /* renamed from: c */
    public boolean mo36710c() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1
    public AbstractC10344e0 getType() {
        return m36822e();
    }
}
