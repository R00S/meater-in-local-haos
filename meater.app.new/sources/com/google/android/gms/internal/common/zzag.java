package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes.dex */
public abstract class zzag extends zzac implements List, RandomAccess {

    /* renamed from: g */
    private static final zzak f27609g = new C7450b(C7452d.f27601h, 0);

    zzag() {
    }

    /* renamed from: r */
    static zzag m20914r(Object[] objArr, int i2) {
        return i2 == 0 ? C7452d.f27601h : new C7452d(objArr, i2);
    }

    /* renamed from: s */
    public static zzag m20915s(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzah.m20920a(array, length);
            return m20914r(array, length);
        }
        zzag zzagVarMo20912h = ((zzac) collection).mo20912h();
        if (!zzagVarMo20912h.mo20905n()) {
            return zzagVarMo20912h;
        }
        Object[] array2 = zzagVarMo20912h.toArray();
        return m20914r(array2, array2.length);
    }

    /* renamed from: t */
    public static zzag m20916t() {
        return C7452d.f27601h;
    }

    /* renamed from: u */
    public static zzag m20917u(Object obj) {
        Object[] objArr = {obj};
        zzah.m20920a(objArr, 1);
        return m20914r(objArr, 1);
    }

    /* renamed from: v */
    public static zzag m20918v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.m20920a(objArr, 2);
        return m20914r(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: c */
    int mo20908c(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (zzr.m20929a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzr.m20929a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    /* renamed from: h */
    public final zzag mo20912h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: i */
    public final zzaj iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public zzag subList(int i2, int i3) {
        zzs.m20932c(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? C7452d.f27601h : new C7451c(this, i2, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final zzak listIterator(int i2) {
        zzs.m20931b(i2, size(), "index");
        return isEmpty() ? f27609g : new C7450b(this, i2);
    }
}
