package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C10801m;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: GraphRequestBatch.kt */
/* renamed from: com.facebook.c0 */
/* loaded from: classes.dex */
public final class C5646c0 extends AbstractList<GraphRequest> {

    /* renamed from: f */
    public static final b f14239f = new b(null);

    /* renamed from: g */
    private static final AtomicInteger f14240g = new AtomicInteger();

    /* renamed from: h */
    private Handler f14241h;

    /* renamed from: i */
    private int f14242i;

    /* renamed from: j */
    private final String f14243j;

    /* renamed from: k */
    private List<GraphRequest> f14244k;

    /* renamed from: l */
    private List<a> f14245l;

    /* renamed from: m */
    private String f14246m;

    /* compiled from: GraphRequestBatch.kt */
    /* renamed from: com.facebook.c0$a */
    public interface a {
        /* renamed from: a */
        void mo11312a(C5646c0 c5646c0);
    }

    /* compiled from: GraphRequestBatch.kt */
    /* renamed from: com.facebook.c0$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: GraphRequestBatch.kt */
    /* renamed from: com.facebook.c0$c */
    public interface c extends a {
        /* renamed from: b */
        void m11336b(C5646c0 c5646c0, long j2, long j3);
    }

    public C5646c0(Collection<GraphRequest> collection) {
        C9801m.m32346f(collection, "requests");
        this.f14243j = String.valueOf(Integer.valueOf(f14240g.incrementAndGet()));
        this.f14245l = new ArrayList();
        this.f14244k = new ArrayList(collection);
    }

    /* renamed from: n */
    private final List<C5653d0> m11313n() {
        return GraphRequest.f14159a.m11229g(this);
    }

    /* renamed from: q */
    private final AsyncTaskC5643b0 m11314q() {
        return GraphRequest.f14159a.m11232j(this);
    }

    /* renamed from: A */
    public /* bridge */ int m11315A(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i2) {
        return m11318E(i2);
    }

    /* renamed from: D */
    public /* bridge */ boolean m11317D(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    /* renamed from: E */
    public GraphRequest m11318E(int i2) {
        return this.f14244k.remove(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i2, GraphRequest graphRequest) {
        C9801m.m32346f(graphRequest, "element");
        return this.f14244k.set(i2, graphRequest);
    }

    /* renamed from: G */
    public final void m11320G(Handler handler) {
        this.f14241h = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i2, GraphRequest graphRequest) {
        C9801m.m32346f(graphRequest, "element");
        this.f14244k.add(i2, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f14244k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m11324h((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest graphRequest) {
        C9801m.m32346f(graphRequest, "element");
        return this.f14244k.add(graphRequest);
    }

    /* renamed from: g */
    public final void m11323g(a aVar) {
        C9801m.m32346f(aVar, "callback");
        if (this.f14245l.contains(aVar)) {
            return;
        }
        this.f14245l.add(aVar);
    }

    /* renamed from: h */
    public /* bridge */ boolean m11324h(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    /* renamed from: i */
    public final List<C5653d0> m11325i() {
        return m11313n();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m11335z((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m11315A((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public final AsyncTaskC5643b0 m11326o() {
        return m11314q();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i2) {
        return this.f14244k.get(i2);
    }

    /* renamed from: s */
    public final String m11328s() {
        return this.f14246m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m11333x();
    }

    /* renamed from: t */
    public final Handler m11329t() {
        return this.f14241h;
    }

    /* renamed from: u */
    public final List<a> m11330u() {
        return this.f14245l;
    }

    /* renamed from: v */
    public final String m11331v() {
        return this.f14243j;
    }

    /* renamed from: w */
    public final List<GraphRequest> m11332w() {
        return this.f14244k;
    }

    /* renamed from: x */
    public int m11333x() {
        return this.f14244k.size();
    }

    /* renamed from: y */
    public final int m11334y() {
        return this.f14242i;
    }

    /* renamed from: z */
    public /* bridge */ int m11335z(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m11317D((GraphRequest) obj);
        }
        return false;
    }

    public C5646c0(GraphRequest... graphRequestArr) {
        C9801m.m32346f(graphRequestArr, "requests");
        this.f14243j = String.valueOf(Integer.valueOf(f14240g.incrementAndGet()));
        this.f14245l = new ArrayList();
        this.f14244k = new ArrayList(C10801m.m38702c(graphRequestArr));
    }
}
