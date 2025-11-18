package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8565d;
import com.google.gson.InterfaceC8579r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p214s.InterfaceC8581b;
import com.google.gson.p214s.InterfaceC8582c;
import com.google.gson.p215t.C8589b;
import com.google.gson.p215t.C8590c;
import com.google.gson.p215t.C8591d;
import com.google.gson.p215t.C8598k;
import com.google.gson.p215t.InterfaceC8596i;
import com.google.gson.p215t.p218o.AbstractC8617b;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.i */
/* loaded from: classes2.dex */
public final class C8609i implements InterfaceC8579r {

    /* renamed from: f */
    private final C8590c f32606f;

    /* renamed from: g */
    private final InterfaceC8565d f32607g;

    /* renamed from: h */
    private final C8591d f32608h;

    /* renamed from: i */
    private final C8604d f32609i;

    /* renamed from: j */
    private final AbstractC8617b f32610j = AbstractC8617b.m27218a();

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.i$a */
    class a extends c {

        /* renamed from: d */
        final /* synthetic */ Field f32611d;

        /* renamed from: e */
        final /* synthetic */ boolean f32612e;

        /* renamed from: f */
        final /* synthetic */ AbstractC8578q f32613f;

        /* renamed from: g */
        final /* synthetic */ C8566e f32614g;

        /* renamed from: h */
        final /* synthetic */ C8619a f32615h;

        /* renamed from: i */
        final /* synthetic */ boolean f32616i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Field field, boolean z3, AbstractC8578q abstractC8578q, C8566e c8566e, C8619a c8619a, boolean z4) {
            super(str, z, z2);
            this.f32611d = field;
            this.f32612e = z3;
            this.f32613f = abstractC8578q;
            this.f32614g = c8566e;
            this.f32615h = c8619a;
            this.f32616i = z4;
        }

        @Override // com.google.gson.p215t.p216n.C8609i.c
        /* renamed from: a */
        void mo27140a(C8585a c8585a, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            Object objMo26938b = this.f32613f.mo26938b(c8585a);
            if (objMo26938b == null && this.f32616i) {
                return;
            }
            this.f32611d.set(obj, objMo26938b);
        }

        @Override // com.google.gson.p215t.p216n.C8609i.c
        /* renamed from: b */
        void mo27141b(C8587c c8587c, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            (this.f32612e ? this.f32613f : new C8613m(this.f32614g, this.f32613f, this.f32615h.getType())).mo26939d(c8587c, this.f32611d.get(obj));
        }

        @Override // com.google.gson.p215t.p216n.C8609i.c
        /* renamed from: c */
        public boolean mo27142c(Object obj) throws IllegalAccessException, IOException {
            return this.f32621b && this.f32611d.get(obj) != obj;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.i$b */
    public static final class b<T> extends AbstractC8578q<T> {

        /* renamed from: a */
        private final InterfaceC8596i<T> f32618a;

        /* renamed from: b */
        private final Map<String, c> f32619b;

        b(InterfaceC8596i<T> interfaceC8596i, Map<String, c> map) {
            this.f32618a = interfaceC8596i;
            this.f32619b = map;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: b */
        public T mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            T tMo27071a = this.f32618a.mo27071a();
            try {
                c8585a.mo27004b();
                while (c8585a.mo27009l()) {
                    c cVar = this.f32619b.get(c8585a.mo26998D());
                    if (cVar == null || !cVar.f32622c) {
                        c8585a.mo27011n0();
                    } else {
                        cVar.mo27140a(c8585a, tMo27071a);
                    }
                }
                c8585a.mo27008j();
                return tMo27071a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: d */
        public void mo26939d(C8587c c8587c, T t) throws IOException {
            if (t == null) {
                c8587c.mo27043y();
                return;
            }
            c8587c.mo27036d();
            try {
                for (c cVar : this.f32619b.values()) {
                    if (cVar.mo27142c(t)) {
                        c8587c.mo27042p(cVar.f32620a);
                        cVar.mo27141b(c8587c, t);
                    }
                }
                c8587c.mo27038j();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.i$c */
    static abstract class c {

        /* renamed from: a */
        final String f32620a;

        /* renamed from: b */
        final boolean f32621b;

        /* renamed from: c */
        final boolean f32622c;

        protected c(String str, boolean z, boolean z2) {
            this.f32620a = str;
            this.f32621b = z;
            this.f32622c = z2;
        }

        /* renamed from: a */
        abstract void mo27140a(C8585a c8585a, Object obj) throws IllegalAccessException, IOException;

        /* renamed from: b */
        abstract void mo27141b(C8587c c8587c, Object obj) throws IllegalAccessException, IOException;

        /* renamed from: c */
        abstract boolean mo27142c(Object obj) throws IllegalAccessException, IOException;
    }

    public C8609i(C8590c c8590c, InterfaceC8565d interfaceC8565d, C8591d c8591d, C8604d c8604d) {
        this.f32606f = c8590c;
        this.f32607g = interfaceC8565d;
        this.f32608h = c8591d;
        this.f32609i = c8604d;
    }

    /* renamed from: a */
    private c m27135a(C8566e c8566e, Field field, String str, C8619a<?> c8619a, boolean z, boolean z2) {
        boolean zM27109b = C8598k.m27109b(c8619a.getRawType());
        InterfaceC8581b interfaceC8581b = (InterfaceC8581b) field.getAnnotation(InterfaceC8581b.class);
        AbstractC8578q<?> abstractC8578qM27121a = interfaceC8581b != null ? this.f32609i.m27121a(this.f32606f, c8566e, c8619a, interfaceC8581b) : null;
        boolean z3 = abstractC8578qM27121a != null;
        if (abstractC8578qM27121a == null) {
            abstractC8578qM27121a = c8566e.m26926j(c8619a);
        }
        return new a(str, z, z2, field, z3, abstractC8578qM27121a, c8566e, c8619a, zM27109b);
    }

    /* renamed from: d */
    static boolean m27136d(Field field, boolean z, C8591d c8591d) {
        return (c8591d.m27081e(field.getType(), z) || c8591d.m27082h(field, z)) ? false : true;
    }

    /* renamed from: e */
    private Map<String, c> m27137e(C8566e c8566e, C8619a<?> c8619a, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = c8619a.getType();
        C8619a<?> c8619a2 = c8619a;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zM27139c = m27139c(field, true);
                boolean zM27139c2 = m27139c(field, z);
                if (zM27139c || zM27139c2) {
                    this.f32610j.mo27217b(field);
                    Type typeM27061p = C8589b.m27061p(c8619a2.getType(), rawType, field.getGenericType());
                    List<String> listM27138f = m27138f(field);
                    int size = listM27138f.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = listM27138f.get(i3);
                        boolean z2 = i3 != 0 ? false : zM27139c;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = listM27138f;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, m27135a(c8566e, field, str, C8619a.get(typeM27061p), z2, zM27139c2)) : cVar2;
                        i3 = i4 + 1;
                        zM27139c = z2;
                        listM27138f = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.f32620a);
                    }
                }
                i2++;
                z = false;
            }
            c8619a2 = C8619a.get(C8589b.m27061p(c8619a2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = c8619a2.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m27138f(Field field) {
        InterfaceC8582c interfaceC8582c = (InterfaceC8582c) field.getAnnotation(InterfaceC8582c.class);
        if (interfaceC8582c == null) {
            return Collections.singletonList(this.f32607g.mo26915g(field));
        }
        String strValue = interfaceC8582c.value();
        String[] strArrAlternate = interfaceC8582c.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.InterfaceC8579r
    /* renamed from: b */
    public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
        Class<? super T> rawType = c8619a.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new b(this.f32606f.m27070a(c8619a), m27137e(c8566e, c8619a, rawType));
        }
        return null;
    }

    /* renamed from: c */
    public boolean m27139c(Field field, boolean z) {
        return m27136d(field, z, this.f32608h);
    }
}
