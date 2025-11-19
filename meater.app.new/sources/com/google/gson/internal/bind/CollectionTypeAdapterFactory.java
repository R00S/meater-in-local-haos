package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements u {

    /* renamed from: B, reason: collision with root package name */
    private final c f38893B;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<E> f38894a;

        /* renamed from: b, reason: collision with root package name */
        private final h<? extends Collection<E>> f38895b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, h<? extends Collection<E>> hVar) {
            this.f38894a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f38895b = hVar;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> read(Q9.a aVar) throws IOException {
            if (aVar.N() == Q9.b.NULL) {
                aVar.z();
                return null;
            }
            Collection<E> collectionA = this.f38895b.a();
            aVar.a();
            while (aVar.m()) {
                collectionA.add(this.f38894a.read(aVar));
            }
            aVar.f();
            return collectionA;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(Q9.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.p();
                return;
            }
            cVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f38894a.write(cVar, it.next());
            }
            cVar.f();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f38893B = cVar;
    }

    @Override // com.google.gson.u
    public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = com.google.gson.internal.b.h(typeD, clsC);
        return new Adapter(gson, typeH, gson.m(P9.a.b(typeH)), this.f38893B.b(aVar));
    }
}
