package Ra;

import Lb.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: ValueClassRepresentation.kt */
/* loaded from: classes3.dex */
public abstract class r0<Type extends Lb.j> {
    public /* synthetic */ r0(C3854k c3854k) {
        this();
    }

    public abstract boolean a(qb.f fVar);

    public final <Other extends Lb.j> r0<Other> b(Ba.l<? super Type, ? extends Other> transform) {
        C3862t.g(transform, "transform");
        if (this instanceof A) {
            A a10 = (A) this;
            return new A(a10.c(), transform.invoke(a10.d()));
        }
        if (!(this instanceof I)) {
            throw new NoWhenBranchMatchedException();
        }
        List<C4170o<qb.f, Type>> listC = ((I) this).c();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            C4170o c4170o = (C4170o) it.next();
            arrayList.add(oa.v.a((qb.f) c4170o.a(), transform.invoke((Lb.j) c4170o.b())));
        }
        return new I(arrayList);
    }

    private r0() {
    }
}
