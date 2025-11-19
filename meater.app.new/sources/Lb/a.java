package Lb;

import java.util.ArrayList;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes3.dex */
public final class a extends ArrayList<l> implements k {
    public a(int i10) {
        super(i10);
    }

    public /* bridge */ boolean c(l lVar) {
        return super.contains(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return c((l) obj);
        }
        return false;
    }

    public /* bridge */ int f() {
        return super.size();
    }

    public /* bridge */ int h(l lVar) {
        return super.indexOf(lVar);
    }

    public /* bridge */ int i(l lVar) {
        return super.lastIndexOf(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return h((l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return i((l) obj);
        }
        return -1;
    }

    public /* bridge */ boolean r(l lVar) {
        return super.remove(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof l) {
            return r((l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return f();
    }
}
