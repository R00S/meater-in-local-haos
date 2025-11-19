package Ob;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArrayMap.kt */
/* loaded from: classes3.dex */
public final class o<T> extends c<T> {

    /* renamed from: B, reason: collision with root package name */
    private final T f13551B;

    /* renamed from: C, reason: collision with root package name */
    private final int f13552C;

    /* compiled from: ArrayMap.kt */
    public static final class a implements Iterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        private boolean f13553B = true;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ o<T> f13554C;

        a(o<T> oVar) {
            this.f13554C = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13553B;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f13553B) {
                throw new NoSuchElementException();
            }
            this.f13553B = false;
            return this.f13554C.j();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(T value, int i10) {
        super(null);
        C3862t.g(value, "value");
        this.f13551B = value;
        this.f13552C = i10;
    }

    @Override // Ob.c
    public int c() {
        return 1;
    }

    @Override // Ob.c
    public T get(int i10) {
        if (i10 == this.f13552C) {
            return this.f13551B;
        }
        return null;
    }

    @Override // Ob.c
    public void h(int i10, T value) {
        C3862t.g(value, "value");
        throw new IllegalStateException();
    }

    public final int i() {
        return this.f13552C;
    }

    @Override // Ob.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final T j() {
        return this.f13551B;
    }
}
