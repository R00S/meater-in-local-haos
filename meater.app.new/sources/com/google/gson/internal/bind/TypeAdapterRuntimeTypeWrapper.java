package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f38957a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f38958b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f38959c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f38957a = gson;
        this.f38958b = typeAdapter;
        this.f38959c = type;
    }

    private static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean b(TypeAdapter<?> typeAdapter) {
        TypeAdapter<?> typeAdapterA;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (typeAdapterA = ((SerializationDelegatingTypeAdapter) typeAdapter).a()) != typeAdapter) {
            typeAdapter = typeAdapterA;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(Q9.a aVar) {
        return this.f38958b.read(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, T t10) {
        TypeAdapter<T> typeAdapterM = this.f38958b;
        Type typeA = a(this.f38959c, t10);
        if (typeA != this.f38959c) {
            typeAdapterM = this.f38957a.m(P9.a.b(typeA));
            if ((typeAdapterM instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f38958b)) {
                typeAdapterM = this.f38958b;
            }
        }
        typeAdapterM.write(cVar, t10);
    }
}
