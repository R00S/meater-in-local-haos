package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder.java */
/* renamed from: kotlin.a0.d.j0 */
/* loaded from: classes2.dex */
public class C9796j0 {

    /* renamed from: a */
    private final ArrayList<Object> f37184a;

    public C9796j0(int i2) {
        this.f37184a = new ArrayList<>(i2);
    }

    /* renamed from: a */
    public void m32319a(Object obj) {
        this.f37184a.add(obj);
    }

    /* renamed from: b */
    public void m32320b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f37184a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f37184a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f37184a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f37184a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f37184a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m32321c() {
        return this.f37184a.size();
    }

    /* renamed from: d */
    public Object[] m32322d(Object[] objArr) {
        return this.f37184a.toArray(objArr);
    }
}
