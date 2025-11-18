package com.squareup.moshi;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.p231w.C8735c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Moshi.java */
/* renamed from: com.squareup.moshi.r */
/* loaded from: classes2.dex */
public final class C8728r {

    /* renamed from: a */
    static final List<AbstractC8716f.e> f33186a;

    /* renamed from: b */
    private final List<AbstractC8716f.e> f33187b;

    /* renamed from: c */
    private final int f33188c;

    /* renamed from: d */
    private final ThreadLocal<c> f33189d = new ThreadLocal<>();

    /* renamed from: e */
    private final Map<Object, AbstractC8716f<?>> f33190e = new LinkedHashMap();

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.r$a */
    public static final class a {

        /* renamed from: a */
        final List<AbstractC8716f.e> f33191a = new ArrayList();

        /* renamed from: b */
        int f33192b = 0;

        /* renamed from: a */
        public a m27814a(AbstractC8716f.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<AbstractC8716f.e> list = this.f33191a;
            int i2 = this.f33192b;
            this.f33192b = i2 + 1;
            list.add(i2, eVar);
            return this;
        }

        /* renamed from: b */
        public C8728r m27815b() {
            return new C8728r(this);
        }
    }

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.r$b */
    static final class b<T> extends AbstractC8716f<T> {

        /* renamed from: a */
        final Type f33193a;

        /* renamed from: b */
        final String f33194b;

        /* renamed from: c */
        final Object f33195c;

        /* renamed from: d */
        AbstractC8716f<T> f33196d;

        b(Type type, String str, Object obj) {
            this.f33193a = type;
            this.f33194b = str;
            this.f33195c = obj;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
            AbstractC8716f<T> abstractC8716f = this.f33196d;
            if (abstractC8716f != null) {
                return abstractC8716f.fromJson(abstractC8719i);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
            AbstractC8716f<T> abstractC8716f = this.f33196d;
            if (abstractC8716f == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC8716f.toJson(abstractC8725o, (AbstractC8725o) t);
        }

        public String toString() {
            AbstractC8716f<T> abstractC8716f = this.f33196d;
            return abstractC8716f != null ? abstractC8716f.toString() : super.toString();
        }
    }

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.r$c */
    final class c {

        /* renamed from: a */
        final List<b<?>> f33197a = new ArrayList();

        /* renamed from: b */
        final Deque<b<?>> f33198b = new ArrayDeque();

        /* renamed from: c */
        boolean f33199c;

        c() {
        }

        /* renamed from: a */
        <T> void m27816a(AbstractC8716f<T> abstractC8716f) {
            this.f33198b.getLast().f33196d = abstractC8716f;
        }

        /* renamed from: b */
        IllegalArgumentException m27817b(IllegalArgumentException illegalArgumentException) {
            if (this.f33199c) {
                return illegalArgumentException;
            }
            this.f33199c = true;
            if (this.f33198b.size() == 1 && this.f33198b.getFirst().f33194b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<b<?>> itDescendingIterator = this.f33198b.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                b<?> next = itDescendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f33193a);
                if (next.f33194b != null) {
                    sb.append(' ');
                    sb.append(next.f33194b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: c */
        void m27818c(boolean z) {
            this.f33198b.removeLast();
            if (this.f33198b.isEmpty()) {
                C8728r.this.f33189d.remove();
                if (z) {
                    synchronized (C8728r.this.f33190e) {
                        int size = this.f33197a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            b<?> bVar = this.f33197a.get(i2);
                            AbstractC8716f<T> abstractC8716f = (AbstractC8716f) C8728r.this.f33190e.put(bVar.f33195c, bVar.f33196d);
                            if (abstractC8716f != 0) {
                                bVar.f33196d = abstractC8716f;
                                C8728r.this.f33190e.put(bVar.f33195c, abstractC8716f);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        <T> AbstractC8716f<T> m27819d(Type type, String str, Object obj) {
            int size = this.f33197a.size();
            for (int i2 = 0; i2 < size; i2++) {
                b<?> bVar = this.f33197a.get(i2);
                if (bVar.f33195c.equals(obj)) {
                    this.f33198b.add(bVar);
                    AbstractC8716f<T> abstractC8716f = (AbstractC8716f<T>) bVar.f33196d;
                    return abstractC8716f != null ? abstractC8716f : bVar;
                }
            }
            b<?> bVar2 = new b<>(type, str, obj);
            this.f33197a.add(bVar2);
            this.f33198b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f33186a = arrayList;
        arrayList.add(C8730t.f33202a);
        arrayList.add(AbstractC8714d.f33091a);
        arrayList.add(C8727q.f33183a);
        arrayList.add(C8711a.f33071a);
        arrayList.add(C8729s.f33201a);
        arrayList.add(C8713c.f33084a);
    }

    C8728r(a aVar) {
        int size = aVar.f33191a.size();
        List<AbstractC8716f.e> list = f33186a;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f33191a);
        arrayList.addAll(list);
        this.f33187b = Collections.unmodifiableList(arrayList);
        this.f33188c = aVar.f33192b;
    }

    /* renamed from: g */
    private Object m27809g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    /* renamed from: c */
    public <T> AbstractC8716f<T> m27810c(Class<T> cls) {
        return m27812e(cls, C8735c.f33225a);
    }

    /* renamed from: d */
    public <T> AbstractC8716f<T> m27811d(Type type) {
        return m27812e(type, C8735c.f33225a);
    }

    /* renamed from: e */
    public <T> AbstractC8716f<T> m27812e(Type type, Set<? extends Annotation> set) {
        return m27813f(type, set, null);
    }

    /* renamed from: f */
    public <T> AbstractC8716f<T> m27813f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM27869o = C8735c.m27869o(C8735c.m27855a(type));
        Object objM27809g = m27809g(typeM27869o, set);
        synchronized (this.f33190e) {
            AbstractC8716f<T> abstractC8716f = (AbstractC8716f) this.f33190e.get(objM27809g);
            if (abstractC8716f != null) {
                return abstractC8716f;
            }
            c cVar = this.f33189d.get();
            if (cVar == null) {
                cVar = new c();
                this.f33189d.set(cVar);
            }
            AbstractC8716f<T> abstractC8716fM27819d = cVar.m27819d(typeM27869o, str, objM27809g);
            try {
                if (abstractC8716fM27819d != null) {
                    return abstractC8716fM27819d;
                }
                try {
                    int size = this.f33187b.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AbstractC8716f<T> abstractC8716f2 = (AbstractC8716f<T>) this.f33187b.get(i2).mo27684a(typeM27869o, set, this);
                        if (abstractC8716f2 != null) {
                            cVar.m27816a(abstractC8716f2);
                            cVar.m27818c(true);
                            return abstractC8716f2;
                        }
                    }
                    throw new IllegalArgumentException("No JsonAdapter for " + C8735c.m27874t(typeM27869o, set));
                } catch (IllegalArgumentException e2) {
                    throw cVar.m27817b(e2);
                }
            } finally {
                cVar.m27818c(false);
            }
        }
    }
}
