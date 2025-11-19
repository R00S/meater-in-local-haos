package Ra;

import Lb.j;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: MultiFieldValueClassRepresentation.kt */
/* loaded from: classes3.dex */
public final class I<Type extends Lb.j> extends r0<Type> {

    /* renamed from: a, reason: collision with root package name */
    private final List<C4170o<qb.f, Type>> f15113a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<qb.f, Type> f15114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(List<? extends C4170o<qb.f, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        C3862t.g(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f15113a = underlyingPropertyNamesToTypes;
        Map<qb.f, Type> mapP = kotlin.collections.M.p(c());
        if (mapP.size() != c().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f15114b = mapP;
    }

    @Override // Ra.r0
    public boolean a(qb.f name) {
        C3862t.g(name, "name");
        return this.f15114b.containsKey(name);
    }

    public List<C4170o<qb.f, Type>> c() {
        return this.f15113a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
