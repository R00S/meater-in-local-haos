package com.google.gson.internal;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements u, Cloneable {

    /* renamed from: H, reason: collision with root package name */
    public static final Excluder f38870H = new Excluder();

    /* renamed from: E, reason: collision with root package name */
    private boolean f38874E;

    /* renamed from: B, reason: collision with root package name */
    private double f38871B = -1.0d;

    /* renamed from: C, reason: collision with root package name */
    private int f38872C = ModuleDescriptor.MODULE_VERSION;

    /* renamed from: D, reason: collision with root package name */
    private boolean f38873D = true;

    /* renamed from: F, reason: collision with root package name */
    private List<com.google.gson.a> f38875F = Collections.emptyList();

    /* renamed from: G, reason: collision with root package name */
    private List<com.google.gson.a> f38876G = Collections.emptyList();

    private boolean f(Class<?> cls) {
        if (this.f38871B != -1.0d && !p((M9.d) cls.getAnnotation(M9.d.class), (M9.e) cls.getAnnotation(M9.e.class))) {
            return true;
        }
        if (this.f38873D || !l(cls)) {
            return k(cls);
        }
        return true;
    }

    private boolean g(Class<?> cls, boolean z10) {
        Iterator<com.google.gson.a> it = (z10 ? this.f38875F : this.f38876G).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean k(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || m(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean l(Class<?> cls) {
        return cls.isMemberClass() && !m(cls);
    }

    private boolean m(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean n(M9.d dVar) {
        if (dVar != null) {
            return this.f38871B >= dVar.value();
        }
        return true;
    }

    private boolean o(M9.e eVar) {
        if (eVar != null) {
            return this.f38871B < eVar.value();
        }
        return true;
    }

    private boolean p(M9.d dVar, M9.e eVar) {
        return n(dVar) && o(eVar);
    }

    @Override // com.google.gson.u
    public <T> TypeAdapter<T> b(final Gson gson, final P9.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zF = f(clsC);
        final boolean z10 = zF || g(clsC, true);
        final boolean z11 = zF || g(clsC, false);
        if (z10 || z11) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                private TypeAdapter<T> f38877a;

                private TypeAdapter<T> a() {
                    TypeAdapter<T> typeAdapter = this.f38877a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> typeAdapterO = gson.o(Excluder.this, aVar);
                    this.f38877a = typeAdapterO;
                    return typeAdapterO;
                }

                @Override // com.google.gson.TypeAdapter
                public T read(Q9.a aVar2) throws IOException {
                    if (!z11) {
                        return a().read(aVar2);
                    }
                    aVar2.o0();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(Q9.c cVar, T t10) throws IOException {
                    if (z10) {
                        cVar.p();
                    } else {
                        a().write(cVar, t10);
                    }
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Class<?> cls, boolean z10) {
        return f(cls) || g(cls, z10);
    }

    public boolean h(Field field, boolean z10) {
        M9.a aVar;
        if ((this.f38872C & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f38871B != -1.0d && !p((M9.d) field.getAnnotation(M9.d.class), (M9.e) field.getAnnotation(M9.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f38874E && ((aVar = (M9.a) field.getAnnotation(M9.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f38873D && l(field.getType())) || k(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z10 ? this.f38875F : this.f38876G;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder i() {
        Excluder excluderClone = clone();
        excluderClone.f38874E = true;
        return excluderClone;
    }
}
