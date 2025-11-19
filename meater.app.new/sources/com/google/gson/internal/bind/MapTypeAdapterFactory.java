package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements u {

    /* renamed from: B, reason: collision with root package name */
    private final c f38903B;

    /* renamed from: C, reason: collision with root package name */
    final boolean f38904C;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<K> f38905a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter<V> f38906b;

        /* renamed from: c, reason: collision with root package name */
        private final h<? extends Map<K, V>> f38907c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, h<? extends Map<K, V>> hVar) {
            this.f38905a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f38906b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f38907c = hVar;
        }

        private String a(j jVar) {
            if (!jVar.z()) {
                if (jVar.x()) {
                    return "null";
                }
                throw new AssertionError();
            }
            n nVarR = jVar.r();
            if (nVarR.F()) {
                return String.valueOf(nVarR.B());
            }
            if (nVarR.D()) {
                return Boolean.toString(nVarR.c());
            }
            if (nVarR.G()) {
                return nVarR.v();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> read(Q9.a aVar) throws IOException {
            Q9.b bVarN = aVar.N();
            if (bVarN == Q9.b.NULL) {
                aVar.z();
                return null;
            }
            Map<K, V> mapA = this.f38907c.a();
            if (bVarN == Q9.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.m()) {
                    aVar.a();
                    K k10 = this.f38905a.read(aVar);
                    if (mapA.put(k10, this.f38906b.read(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + k10);
                    }
                    aVar.f();
                }
                aVar.f();
            } else {
                aVar.b();
                while (aVar.m()) {
                    e.f39065a.a(aVar);
                    K k11 = this.f38905a.read(aVar);
                    if (mapA.put(k11, this.f38906b.read(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + k11);
                    }
                }
                aVar.g();
            }
            return mapA;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(Q9.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.p();
                return;
            }
            if (!MapTypeAdapterFactory.this.f38904C) {
                cVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.n(String.valueOf(entry.getKey()));
                    this.f38906b.write(cVar, entry.getValue());
                }
                cVar.g();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                j jsonTree = this.f38905a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.w() || jsonTree.y();
            }
            if (!z10) {
                cVar.d();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.n(a((j) arrayList.get(i10)));
                    this.f38906b.write(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.g();
                return;
            }
            cVar.c();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.c();
                l.b((j) arrayList.get(i10), cVar);
                this.f38906b.write(cVar, arrayList2.get(i10));
                cVar.f();
                i10++;
            }
            cVar.f();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z10) {
        this.f38903B = cVar;
        this.f38904C = z10;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f38989f : gson.m(P9.a.b(type));
    }

    @Override // com.google.gson.u
    public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = com.google.gson.internal.b.j(typeD, clsC);
        return new Adapter(gson, typeArrJ[0], a(gson, typeArrJ[0]), typeArrJ[1], gson.m(P9.a.b(typeArrJ[1])), this.f38903B.b(aVar));
    }
}
