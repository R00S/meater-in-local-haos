package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;

/* compiled from: MultiFieldValueClassRepresentation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h0 */
/* loaded from: classes2.dex */
public final class C10595h0<Type extends InterfaceC10444k> extends AbstractC10593g1<Type> {

    /* renamed from: a */
    private final List<Pair<C10163f, Type>> f40756a;

    /* renamed from: b */
    private final Map<C10163f, Type> f40757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10595h0(List<? extends Pair<C10163f, ? extends Type>> list) {
        super(null);
        C9801m.m32346f(list, "underlyingPropertyNamesToTypes");
        this.f40756a = list;
        Map<C10163f, Type> mapM38805q = C10810q0.m38805q(mo37691a());
        if (!(mapM38805q.size() == mo37691a().size())) {
            throw new IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f40757b = mapM38805q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1
    /* renamed from: a */
    public List<Pair<C10163f, Type>> mo37691a() {
        return this.f40756a;
    }
}
