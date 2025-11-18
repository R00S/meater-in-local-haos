package com.squareup.moshi;

import com.squareup.moshi.AbstractC8716f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CollectionJsonAdapter.java */
/* renamed from: com.squareup.moshi.d */
/* loaded from: classes2.dex */
abstract class AbstractC8714d<C extends Collection<T>, T> extends AbstractC8716f<C> {

    /* renamed from: a */
    public static final AbstractC8716f.e f33091a = new a();

    /* renamed from: b */
    private final AbstractC8716f<T> f33092b;

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$a */
    class a implements AbstractC8716f.e {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8716f.e
        /* renamed from: a */
        public AbstractC8716f<?> mo27684a(Type type, Set<? extends Annotation> set, C8728r c8728r) {
            Class<?> clsM27848g = C8731u.m27848g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsM27848g == List.class || clsM27848g == Collection.class) {
                return AbstractC8714d.m27692b(type, c8728r).nullSafe();
            }
            if (clsM27848g == Set.class) {
                return AbstractC8714d.m27693d(type, c8728r).nullSafe();
            }
            return null;
        }
    }

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$b */
    class b extends AbstractC8714d<Collection<T>, T> {
        b(AbstractC8716f abstractC8716f) {
            super(abstractC8716f, null);
        }

        @Override // com.squareup.moshi.AbstractC8714d
        /* renamed from: c */
        Collection<T> mo27695c() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public /* bridge */ /* synthetic */ Object fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return super.m27694a(abstractC8719i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC8716f
        public /* bridge */ /* synthetic */ void toJson(AbstractC8725o abstractC8725o, Object obj) throws IOException {
            super.m27696e(abstractC8725o, (Collection) obj);
        }
    }

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$c */
    class c extends AbstractC8714d<Set<T>, T> {
        c(AbstractC8716f abstractC8716f) {
            super(abstractC8716f, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.AbstractC8714d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> mo27695c() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public /* bridge */ /* synthetic */ Object fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return super.m27694a(abstractC8719i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC8716f
        public /* bridge */ /* synthetic */ void toJson(AbstractC8725o abstractC8725o, Object obj) throws IOException {
            super.m27696e(abstractC8725o, (Collection) obj);
        }
    }

    /* synthetic */ AbstractC8714d(AbstractC8716f abstractC8716f, a aVar) {
        this(abstractC8716f);
    }

    /* renamed from: b */
    static <T> AbstractC8716f<Collection<T>> m27692b(Type type, C8728r c8728r) {
        return new b(c8728r.m27811d(C8731u.m27844c(type, Collection.class)));
    }

    /* renamed from: d */
    static <T> AbstractC8716f<Set<T>> m27693d(Type type, C8728r c8728r) {
        return new c(c8728r.m27811d(C8731u.m27844c(type, Collection.class)));
    }

    /* renamed from: a */
    public C m27694a(AbstractC8719i abstractC8719i) throws IOException {
        C c2 = (C) mo27695c();
        abstractC8719i.mo27710a();
        while (abstractC8719i.mo27715f()) {
            c2.add(this.f33092b.fromJson(abstractC8719i));
        }
        abstractC8719i.mo27712c();
        return c2;
    }

    /* renamed from: c */
    abstract C mo27695c();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m27696e(AbstractC8725o abstractC8725o, C c2) throws IOException {
        abstractC8725o.mo27756a();
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            this.f33092b.toJson(abstractC8725o, (AbstractC8725o) it.next());
        }
        abstractC8725o.mo27758d();
    }

    public String toString() {
        return this.f33092b + ".collection()";
    }

    private AbstractC8714d(AbstractC8716f<T> abstractC8716f) {
        this.f33092b = abstractC8716f;
    }
}
