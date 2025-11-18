package X1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset.java */
/* renamed from: X1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812i<E> implements Iterable<E> {

    /* renamed from: B, reason: collision with root package name */
    private final Object f18657B = new Object();

    /* renamed from: C, reason: collision with root package name */
    private final Map<E, Integer> f18658C = new HashMap();

    /* renamed from: D, reason: collision with root package name */
    private Set<E> f18659D = Collections.emptySet();

    /* renamed from: E, reason: collision with root package name */
    private List<E> f18660E = Collections.emptyList();

    public Set<E> N() {
        Set<E> set;
        synchronized (this.f18657B) {
            set = this.f18659D;
        }
        return set;
    }

    public void c(E e10) {
        synchronized (this.f18657B) {
            try {
                ArrayList arrayList = new ArrayList(this.f18660E);
                arrayList.add(e10);
                this.f18660E = Collections.unmodifiableList(arrayList);
                Integer num = this.f18658C.get(e10);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f18659D);
                    hashSet.add(e10);
                    this.f18659D = Collections.unmodifiableSet(hashSet);
                }
                this.f18658C.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int f(E e10) {
        int iIntValue;
        synchronized (this.f18657B) {
            try {
                iIntValue = this.f18658C.containsKey(e10) ? this.f18658C.get(e10).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void h(E e10) {
        synchronized (this.f18657B) {
            try {
                Integer num = this.f18658C.get(e10);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f18660E);
                arrayList.remove(e10);
                this.f18660E = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f18658C.remove(e10);
                    HashSet hashSet = new HashSet(this.f18659D);
                    hashSet.remove(e10);
                    this.f18659D = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f18658C.put(e10, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f18657B) {
            it = this.f18660E.iterator();
        }
        return it;
    }
}
