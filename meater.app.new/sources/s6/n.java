package s6;

import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes2.dex */
public class n<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final H6.h<b<A>, B> f49341a;

    /* compiled from: ModelCache.java */
    class a extends H6.h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // H6.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    /* compiled from: ModelCache.java */
    static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f49343d = H6.l.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f49344a;

        /* renamed from: b, reason: collision with root package name */
        private int f49345b;

        /* renamed from: c, reason: collision with root package name */
        private A f49346c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f49343d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        private void b(A a10, int i10, int i11) {
            this.f49346c = a10;
            this.f49345b = i10;
            this.f49344a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f49343d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f49345b == bVar.f49345b && this.f49344a == bVar.f49344a && this.f49346c.equals(bVar.f49346c);
        }

        public int hashCode() {
            return (((this.f49344a * 31) + this.f49345b) * 31) + this.f49346c.hashCode();
        }
    }

    public n(long j10) {
        this.f49341a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bG = this.f49341a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f49341a.k(b.a(a10, i10, i11), b10);
    }
}
