package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder.java */
/* loaded from: classes2.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f43982a;

    public U(int i10) {
        this.f43982a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f43982a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f43982a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f43982a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f43982a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f43982a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f43982a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f43982a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f43982a.toArray(objArr);
    }
}
