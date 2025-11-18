package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* renamed from: com.google.android.gms.internal.common.g */
/* loaded from: classes.dex */
abstract class AbstractC7455g extends zzak {

    /* renamed from: f */
    private final int f27604f;

    /* renamed from: g */
    private int f27605g;

    protected AbstractC7455g(int i2, int i3) {
        zzs.m20931b(i3, i2, "index");
        this.f27604f = i2;
        this.f27605g = i3;
    }

    /* renamed from: b */
    protected abstract Object mo20902b(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27605g < this.f27604f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27605g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f27605g;
        this.f27605g = i2 + 1;
        return mo20902b(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27605g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f27605g - 1;
        this.f27605g = i2;
        return mo20902b(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27605g - 1;
    }
}
