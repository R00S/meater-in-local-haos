package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes.dex */
public abstract class zzac extends AbstractCollection implements Serializable {

    /* renamed from: f */
    private static final Object[] f27608f = new Object[0];

    zzac() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    int mo20908c(Object[] objArr, int i2) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    int mo20903f() {
        throw null;
    }

    /* renamed from: g */
    int mo20904g() {
        throw null;
    }

    /* renamed from: h */
    public zzag mo20912h() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract zzaj iterator();

    /* renamed from: n */
    abstract boolean mo20905n();

    /* renamed from: o */
    Object[] mo20906o() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f27608f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo20906o = mo20906o();
            if (objArrMo20906o != null) {
                return Arrays.copyOfRange(objArrMo20906o, mo20904g(), mo20903f(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo20908c(objArr, 0);
        return objArr;
    }
}
