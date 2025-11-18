package com.squareup.moshi;

import com.squareup.moshi.AbstractC8716f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* compiled from: MapJsonAdapter.java */
/* renamed from: com.squareup.moshi.q */
/* loaded from: classes2.dex */
final class C8727q<K, V> extends AbstractC8716f<Map<K, V>> {

    /* renamed from: a */
    public static final AbstractC8716f.e f33183a = new a();

    /* renamed from: b */
    private final AbstractC8716f<K> f33184b;

    /* renamed from: c */
    private final AbstractC8716f<V> f33185c;

    /* compiled from: MapJsonAdapter.java */
    /* renamed from: com.squareup.moshi.q$a */
    class a implements AbstractC8716f.e {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8716f.e
        /* renamed from: a */
        public AbstractC8716f<?> mo27684a(Type type, Set<? extends Annotation> set, C8728r c8728r) {
            Class<?> clsM27848g;
            if (!set.isEmpty() || (clsM27848g = C8731u.m27848g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrM27850i = C8731u.m27850i(type, clsM27848g);
            return new C8727q(c8728r, typeArrM27850i[0], typeArrM27850i[1]).nullSafe();
        }
    }

    C8727q(C8728r c8728r, Type type, Type type2) {
        this.f33184b = c8728r.m27811d(type);
        this.f33185c = c8728r.m27811d(type2);
    }

    @Override // com.squareup.moshi.AbstractC8716f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(AbstractC8719i abstractC8719i) throws IOException {
        C8726p c8726p = new C8726p();
        abstractC8719i.mo27711b();
        while (abstractC8719i.mo27715f()) {
            abstractC8719i.mo27700B();
            K kFromJson = this.f33184b.fromJson(abstractC8719i);
            V vFromJson = this.f33185c.fromJson(abstractC8719i);
            V vPut = c8726p.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new JsonDataException("Map key '" + kFromJson + "' has multiple values at path " + abstractC8719i.m27716g() + ": " + vPut + " and " + vFromJson);
            }
        }
        abstractC8719i.mo27713d();
        return c8726p;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(AbstractC8725o abstractC8725o, Map<K, V> map) throws IOException {
        abstractC8725o.mo27757b();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + abstractC8725o.m27776g());
            }
            abstractC8725o.m27780y();
            this.f33184b.toJson(abstractC8725o, (AbstractC8725o) entry.getKey());
            this.f33185c.toJson(abstractC8725o, (AbstractC8725o) entry.getValue());
        }
        abstractC8725o.mo27759e();
    }

    public String toString() {
        return "JsonAdapter(" + this.f33184b + "=" + this.f33185c + ")";
    }
}
