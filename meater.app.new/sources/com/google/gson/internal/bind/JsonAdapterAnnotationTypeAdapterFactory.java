package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.c;
import com.google.gson.p;
import com.google.gson.u;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements u {

    /* renamed from: B, reason: collision with root package name */
    private final c f38902B;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f38902B = cVar;
    }

    TypeAdapter<?> a(c cVar, Gson gson, P9.a<?> aVar, M9.b bVar) {
        TypeAdapter<?> treeTypeAdapter;
        Object objA = cVar.b(P9.a.a(bVar.value())).a();
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objA;
        } else if (objA instanceof u) {
            treeTypeAdapter = ((u) objA).b(gson, aVar);
        } else {
            boolean z10 = objA instanceof p;
            if (!z10 && !(objA instanceof i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (p) objA : null, objA instanceof i ? (i) objA : null, gson, aVar, null, zNullSafe);
            zNullSafe = false;
        }
        return (treeTypeAdapter == null || !zNullSafe) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    @Override // com.google.gson.u
    public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
        M9.b bVar = (M9.b) aVar.c().getAnnotation(M9.b.class);
        if (bVar == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.f38902B, gson, aVar, bVar);
    }
}
