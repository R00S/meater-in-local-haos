package Xa;

import Xa.AbstractC1824h;
import hb.InterfaceC3512e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes3.dex */
public final class l extends AbstractC1824h implements InterfaceC3512e {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f18966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qb.f fVar, Object[] values) {
        super(fVar, null);
        C3862t.g(values, "values");
        this.f18966c = values;
    }

    @Override // hb.InterfaceC3512e
    public List<AbstractC1824h> e() {
        Object[] objArr = this.f18966c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC1824h.a aVar = AbstractC1824h.f18963b;
            C3862t.d(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
