package m8;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
/* renamed from: m8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3999n {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC3999n f45364a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3999n f45365b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3999n f45366c = new b(1);

    /* compiled from: ComparisonChain.java */
    /* renamed from: m8.n$a */
    class a extends AbstractC3999n {
        a() {
            super(null);
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        @Override // m8.AbstractC3999n
        public <T> AbstractC3999n f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        @Override // m8.AbstractC3999n
        public int i() {
            return 0;
        }

        AbstractC3999n k(int i10) {
            return i10 < 0 ? AbstractC3999n.f45365b : i10 > 0 ? AbstractC3999n.f45366c : AbstractC3999n.f45364a;
        }
    }

    /* synthetic */ AbstractC3999n(a aVar) {
        this();
    }

    public static AbstractC3999n j() {
        return f45364a;
    }

    public abstract AbstractC3999n d(int i10, int i11);

    public abstract AbstractC3999n e(long j10, long j11);

    public abstract <T> AbstractC3999n f(T t10, T t11, Comparator<T> comparator);

    public abstract AbstractC3999n g(boolean z10, boolean z11);

    public abstract AbstractC3999n h(boolean z10, boolean z11);

    public abstract int i();

    private AbstractC3999n() {
    }

    /* compiled from: ComparisonChain.java */
    /* renamed from: m8.n$b */
    private static final class b extends AbstractC3999n {

        /* renamed from: d, reason: collision with root package name */
        final int f45367d;

        b(int i10) {
            super(null);
            this.f45367d = i10;
        }

        @Override // m8.AbstractC3999n
        public int i() {
            return this.f45367d;
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n d(int i10, int i11) {
            return this;
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n e(long j10, long j11) {
            return this;
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n g(boolean z10, boolean z11) {
            return this;
        }

        @Override // m8.AbstractC3999n
        public AbstractC3999n h(boolean z10, boolean z11) {
            return this;
        }

        @Override // m8.AbstractC3999n
        public <T> AbstractC3999n f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }
    }
}
