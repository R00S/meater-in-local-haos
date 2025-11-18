package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10815t;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;

/* compiled from: InlineClassRepresentation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z */
/* loaded from: classes2.dex */
public final class C10740z<Type extends InterfaceC10444k> extends AbstractC10593g1<Type> {

    /* renamed from: a */
    private final C10163f f41245a;

    /* renamed from: b */
    private final Type f41246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10740z(C10163f c10163f, Type type) {
        super(null);
        C9801m.m32346f(c10163f, "underlyingPropertyName");
        C9801m.m32346f(type, "underlyingType");
        this.f41245a = c10163f;
        this.f41246b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1
    /* renamed from: a */
    public List<Pair<C10163f, Type>> mo37691a() {
        return C10815t.m38883e(C10773s.m38547a(this.f41245a, this.f41246b));
    }

    /* renamed from: c */
    public final C10163f m38162c() {
        return this.f41245a;
    }

    /* renamed from: d */
    public final Type m38163d() {
        return this.f41246b;
    }
}
