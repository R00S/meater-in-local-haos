package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10773s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;

/* compiled from: ValueClassRepresentation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10593g1<Type extends InterfaceC10444k> {
    private AbstractC10593g1() {
    }

    public /* synthetic */ AbstractC10593g1(C9789g c9789g) {
        this();
    }

    /* renamed from: a */
    public abstract List<Pair<C10163f, Type>> mo37691a();

    /* renamed from: b */
    public final <Other extends InterfaceC10444k> AbstractC10593g1<Other> m37692b(Function1<? super Type, ? extends Other> function1) {
        C9801m.m32346f(function1, "transform");
        if (this instanceof C10740z) {
            C10740z c10740z = (C10740z) this;
            return new C10740z(c10740z.m38162c(), function1.invoke(c10740z.m38163d()));
        }
        if (!(this instanceof C10595h0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<C10163f, Type>> listMo37691a = mo37691a();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo37691a, 10));
        Iterator<T> it = listMo37691a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(C10773s.m38547a((C10163f) pair.m37646a(), function1.invoke((InterfaceC10444k) pair.m37647b())));
        }
        return new C10595h0(arrayList);
    }
}
