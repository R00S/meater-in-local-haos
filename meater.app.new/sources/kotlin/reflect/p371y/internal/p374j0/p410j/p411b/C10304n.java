package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: DeserializedArrayValue.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.n */
/* loaded from: classes3.dex */
public final class C10304n extends C10206b {

    /* renamed from: c */
    private final AbstractC10344e0 f39942c;

    /* compiled from: DeserializedArrayValue.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.n$a */
    static final class a extends Lambda implements Function1<InterfaceC10592g0, AbstractC10344e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10344e0 f39943f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10344e0 abstractC10344e0) {
            super(1);
            this.f39943f = abstractC10344e0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "it");
            return this.f39943f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10304n(List<? extends AbstractC10211g<?>> list, AbstractC10344e0 abstractC10344e0) {
        super(list, new a(abstractC10344e0));
        C9801m.m32346f(list, "value");
        C9801m.m32346f(abstractC10344e0, "type");
        this.f39942c = abstractC10344e0;
    }

    /* renamed from: c */
    public final AbstractC10344e0 m36461c() {
        return this.f39942c;
    }
}
