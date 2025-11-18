package com.bumptech.glide.load.p129n;

import com.bumptech.glide.p145r.C5593g;
import com.bumptech.glide.p145r.C5597k;
import java.util.Queue;

/* compiled from: ModelCache.java */
/* renamed from: com.bumptech.glide.load.n.m */
/* loaded from: classes.dex */
public class C5461m<A, B> {

    /* renamed from: a */
    private final C5593g<b<A>, B> f13648a;

    /* compiled from: ModelCache.java */
    /* renamed from: com.bumptech.glide.load.n.m$a */
    class a extends C5593g<b<A>, B> {
        a(long j2) {
            super(j2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.p145r.C5593g
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo10195j(b<A> bVar, B b2) {
            bVar.m10557c();
        }
    }

    /* compiled from: ModelCache.java */
    /* renamed from: com.bumptech.glide.load.n.m$b */
    static final class b<A> {

        /* renamed from: a */
        private static final Queue<b<?>> f13650a = C5597k.m11049f(0);

        /* renamed from: b */
        private int f13651b;

        /* renamed from: c */
        private int f13652c;

        /* renamed from: d */
        private A f13653d;

        private b() {
        }

        /* renamed from: a */
        static <A> b<A> m10555a(A a, int i2, int i3) {
            b<A> bVar;
            Queue<b<?>> queue = f13650a;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.m10556b(a, i2, i3);
            return bVar;
        }

        /* renamed from: b */
        private void m10556b(A a, int i2, int i3) {
            this.f13653d = a;
            this.f13652c = i2;
            this.f13651b = i3;
        }

        /* renamed from: c */
        public void m10557c() {
            Queue<b<?>> queue = f13650a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f13652c == bVar.f13652c && this.f13651b == bVar.f13651b && this.f13653d.equals(bVar.f13653d);
        }

        public int hashCode() {
            return (((this.f13651b * 31) + this.f13652c) * 31) + this.f13653d.hashCode();
        }
    }

    public C5461m(long j2) {
        this.f13648a = new a(j2);
    }

    /* renamed from: a */
    public B m10552a(A a2, int i2, int i3) {
        b<A> bVarM10555a = b.m10555a(a2, i2, i3);
        B bM11031g = this.f13648a.m11031g(bVarM10555a);
        bVarM10555a.m10557c();
        return bM11031g;
    }

    /* renamed from: b */
    public void m10553b(A a2, int i2, int i3, B b2) {
        this.f13648a.m11033k(b.m10555a(a2, i2, i3), b2);
    }
}
