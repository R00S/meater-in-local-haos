package m8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes2.dex */
public abstract class N<K0, V0> {

    /* compiled from: MultimapBuilder.java */
    class a extends e<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45239a;

        a(int i10) {
            this.f45239a = i10;
        }

        @Override // m8.N.e
        <K, V> Map<K, Collection<V>> c() {
            return V.c(this.f45239a);
        }
    }

    /* compiled from: MultimapBuilder.java */
    class b extends e<K0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f45240a;

        b(Comparator comparator) {
            this.f45240a = comparator;
        }

        @Override // m8.N.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f45240a);
        }
    }

    /* compiled from: MultimapBuilder.java */
    private static final class c<V> implements l8.s<List<V>>, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private final int f45241B;

        c(int i10) {
            this.f45241B = C3994i.b(i10, "expectedValuesPerKey");
        }

        @Override // l8.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f45241B);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class d<K0, V0> extends N<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> InterfaceC3984G<K, V> e();
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class e<K0> {

        /* compiled from: MultimapBuilder.java */
        class a extends d<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f45242a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f45243b;

            a(e eVar, int i10) {
                this.f45242a = i10;
                this.f45243b = eVar;
            }

            @Override // m8.N.d
            public <K extends K0, V> InterfaceC3984G<K, V> e() {
                return O.b(this.f45243b.c(), new c(this.f45242a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i10) {
            C3994i.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ N(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        C3994i.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(U.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        l8.m.l(comparator);
        return new b(comparator);
    }

    private N() {
    }
}
