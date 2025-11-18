package Ob;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArrayMap.kt */
/* loaded from: classes3.dex */
public final class i extends c {

    /* renamed from: B, reason: collision with root package name */
    public static final i f13542B = new i();

    /* compiled from: ArrayMap.kt */
    public static final class a implements Iterator, Ca.a {
        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // Ob.c
    public int c() {
        return 0;
    }

    @Override // Ob.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // Ob.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // Ob.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(int i10, Void value) {
        C3862t.g(value, "value");
        throw new IllegalStateException();
    }
}
