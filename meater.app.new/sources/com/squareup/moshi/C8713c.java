package com.squareup.moshi;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.p231w.C8735c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: ClassJsonAdapter.java */
/* renamed from: com.squareup.moshi.c */
/* loaded from: classes2.dex */
final class C8713c<T> extends AbstractC8716f<T> {

    /* renamed from: a */
    public static final AbstractC8716f.e f33084a = new a();

    /* renamed from: b */
    private final AbstractC8712b<T> f33085b;

    /* renamed from: c */
    private final b<?>[] f33086c;

    /* renamed from: d */
    private final AbstractC8719i.a f33087d;

    /* compiled from: ClassJsonAdapter.java */
    /* renamed from: com.squareup.moshi.c$a */
    class a implements AbstractC8716f.e {
        a() {
        }

        /* renamed from: b */
        private void m27687b(C8728r c8728r, Type type, Map<String, b<?>> map) {
            InterfaceC8715e interfaceC8715e;
            Class<?> clsM27848g = C8731u.m27848g(type);
            boolean zM27863i = C8735c.m27863i(clsM27848g);
            for (Field field : clsM27848g.getDeclaredFields()) {
                if (m27688c(zM27863i, field.getModifiers()) && ((interfaceC8715e = (InterfaceC8715e) field.getAnnotation(InterfaceC8715e.class)) == null || !interfaceC8715e.ignore())) {
                    Type typeM27870p = C8735c.m27870p(type, clsM27848g, field.getGenericType());
                    Set<? extends Annotation> setM27864j = C8735c.m27864j(field);
                    String name = field.getName();
                    AbstractC8716f<T> abstractC8716fM27813f = c8728r.m27813f(typeM27870p, setM27864j, name);
                    field.setAccessible(true);
                    String strM27866l = C8735c.m27866l(name, interfaceC8715e);
                    b<?> bVar = new b<>(strM27866l, field, abstractC8716fM27813f);
                    b<?> bVarPut = map.put(strM27866l, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f33089b + "\n    " + bVar.f33089b);
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m27688c(boolean z, int i2) {
            if (Modifier.isStatic(i2) || Modifier.isTransient(i2)) {
                return false;
            }
            return Modifier.isPublic(i2) || Modifier.isProtected(i2) || !z;
        }

        /* renamed from: d */
        private void m27689d(Type type, Class<?> cls) {
            Class<?> clsM27848g = C8731u.m27848g(type);
            if (cls.isAssignableFrom(clsM27848g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM27848g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.AbstractC8716f.e
        /* renamed from: a */
        public AbstractC8716f<?> mo27684a(Type type, Set<? extends Annotation> set, C8728r c8728r) throws NoSuchFieldException, NoSuchMethodException, SecurityException, ClassNotFoundException {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsM27848g = C8731u.m27848g(type);
            if (clsM27848g.isInterface() || clsM27848g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C8735c.m27863i(clsM27848g)) {
                m27689d(type, List.class);
                m27689d(type, Set.class);
                m27689d(type, Map.class);
                m27689d(type, Collection.class);
                String str = "Platform " + clsM27848g;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsM27848g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsM27848g.getName());
            }
            if (clsM27848g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsM27848g.getName());
            }
            if (clsM27848g.getEnclosingClass() != null && !Modifier.isStatic(clsM27848g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsM27848g.getName());
            }
            if (Modifier.isAbstract(clsM27848g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsM27848g.getName());
            }
            if (C8735c.m27862h(clsM27848g)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM27848g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            AbstractC8712b abstractC8712bM27685a = AbstractC8712b.m27685a(clsM27848g);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                m27687b(c8728r, type, treeMap);
                type = C8731u.m27847f(type);
            }
            return new C8713c(abstractC8712bM27685a, treeMap).nullSafe();
        }
    }

    /* compiled from: ClassJsonAdapter.java */
    /* renamed from: com.squareup.moshi.c$b */
    static class b<T> {

        /* renamed from: a */
        final String f33088a;

        /* renamed from: b */
        final Field f33089b;

        /* renamed from: c */
        final AbstractC8716f<T> f33090c;

        b(String str, Field field, AbstractC8716f<T> abstractC8716f) {
            this.f33088a = str;
            this.f33089b = field;
            this.f33090c = abstractC8716f;
        }

        /* renamed from: a */
        void m27690a(AbstractC8719i abstractC8719i, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            this.f33089b.set(obj, this.f33090c.fromJson(abstractC8719i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        void m27691b(AbstractC8725o abstractC8725o, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            this.f33090c.toJson(abstractC8725o, (AbstractC8725o) this.f33089b.get(obj));
        }
    }

    C8713c(AbstractC8712b<T> abstractC8712b, Map<String, b<?>> map) {
        this.f33085b = abstractC8712b;
        this.f33086c = (b[]) map.values().toArray(new b[map.size()]);
        this.f33087d = AbstractC8719i.a.m27724a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public T fromJson(AbstractC8719i abstractC8719i) throws IOException, IllegalArgumentException {
        try {
            T tMo27686b = this.f33085b.mo27686b();
            try {
                abstractC8719i.mo27711b();
                while (abstractC8719i.mo27715f()) {
                    int iMo27702H = abstractC8719i.mo27702H(this.f33087d);
                    if (iMo27702H == -1) {
                        abstractC8719i.mo27706N();
                        abstractC8719i.mo27707Q();
                    } else {
                        this.f33086c[iMo27702H].m27690a(abstractC8719i, tMo27686b);
                    }
                }
                abstractC8719i.mo27713d();
                return tMo27686b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw C8735c.m27873s(e3);
        }
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException, IllegalArgumentException {
        try {
            abstractC8725o.mo27757b();
            for (b<?> bVar : this.f33086c) {
                abstractC8725o.mo27760l(bVar.f33088a);
                bVar.m27691b(abstractC8725o, t);
            }
            abstractC8725o.mo27759e();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f33085b + ")";
    }
}
