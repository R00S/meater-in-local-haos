package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.f0.y.e.j0.m.o */
/* loaded from: classes3.dex */
public final class C10479o<T> extends AbstractC10467c<T> {

    /* renamed from: f */
    private final T f40427f;

    /* renamed from: g */
    private final int f40428g;

    /* compiled from: ArrayMap.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.o$a */
    public static final class a implements Iterator<T>, KMappedMarker {

        /* renamed from: f */
        private boolean f40429f = true;

        /* renamed from: g */
        final /* synthetic */ C10479o<T> f40430g;

        a(C10479o<T> c10479o) {
            this.f40430g = c10479o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40429f;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f40429f) {
                throw new NoSuchElementException();
            }
            this.f40429f = false;
            return this.f40430g.m37209i();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10479o(T t, int i2) {
        super(null);
        C9801m.m32346f(t, "value");
        this.f40427f = t;
        this.f40428g = i2;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10467c
    /* renamed from: c */
    public int mo37188c() {
        return 1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10467c
    /* renamed from: f */
    public void mo37189f(int i2, T t) {
        C9801m.m32346f(t, "value");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10467c
    public T get(int i2) {
        if (i2 == this.f40428g) {
            return this.f40427f;
        }
        return null;
    }

    /* renamed from: h */
    public final int m37208h() {
        return this.f40428g;
    }

    /* renamed from: i */
    public final T m37209i() {
        return this.f40427f;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10467c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }
}
