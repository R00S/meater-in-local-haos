package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8571j;
import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.C8574m;
import com.google.gson.InterfaceC8579r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p215t.AbstractC8593f;
import com.google.gson.p215t.C8589b;
import com.google.gson.p215t.C8590c;
import com.google.gson.p215t.C8599l;
import com.google.gson.p215t.InterfaceC8596i;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.g */
/* loaded from: classes2.dex */
public final class C8607g implements InterfaceC8579r {

    /* renamed from: f */
    private final C8590c f32597f;

    /* renamed from: g */
    final boolean f32598g;

    /* compiled from: MapTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.g$a */
    private final class a<K, V> extends AbstractC8578q<Map<K, V>> {

        /* renamed from: a */
        private final AbstractC8578q<K> f32599a;

        /* renamed from: b */
        private final AbstractC8578q<V> f32600b;

        /* renamed from: c */
        private final InterfaceC8596i<? extends Map<K, V>> f32601c;

        public a(C8566e c8566e, Type type, AbstractC8578q<K> abstractC8578q, Type type2, AbstractC8578q<V> abstractC8578q2, InterfaceC8596i<? extends Map<K, V>> interfaceC8596i) {
            this.f32599a = new C8613m(c8566e, abstractC8578q, type);
            this.f32600b = new C8613m(c8566e, abstractC8578q2, type2);
            this.f32601c = interfaceC8596i;
        }

        /* renamed from: e */
        private String m27132e(AbstractC8571j abstractC8571j) {
            if (!abstractC8571j.m26960o()) {
                if (abstractC8571j.m26958i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C8574m c8574mM26956g = abstractC8571j.m26956g();
            if (c8574mM26956g.m26975z()) {
                return String.valueOf(c8574mM26956g.m26972v());
            }
            if (c8574mM26956g.m26974x()) {
                return Boolean.toString(c8574mM26956g.m26967q());
            }
            if (c8574mM26956g.m26965C()) {
                return c8574mM26956g.m26973w();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo26938b(C8585a c8585a) throws IOException {
            EnumC8586b enumC8586bMo27001Q = c8585a.mo27001Q();
            if (enumC8586bMo27001Q == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            Map<K, V> mapMo27071a = this.f32601c.mo27071a();
            if (enumC8586bMo27001Q == EnumC8586b.BEGIN_ARRAY) {
                c8585a.mo27002a();
                while (c8585a.mo27009l()) {
                    c8585a.mo27002a();
                    K kMo26938b = this.f32599a.mo26938b(c8585a);
                    if (mapMo27071a.put(kMo26938b, this.f32600b.mo26938b(c8585a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kMo26938b);
                    }
                    c8585a.mo27006f();
                }
                c8585a.mo27006f();
            } else {
                c8585a.mo27004b();
                while (c8585a.mo27009l()) {
                    AbstractC8593f.f32541a.mo27015a(c8585a);
                    K kMo26938b2 = this.f32599a.mo26938b(c8585a);
                    if (mapMo27071a.put(kMo26938b2, this.f32600b.mo26938b(c8585a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kMo26938b2);
                    }
                }
                c8585a.mo27008j();
            }
            return mapMo27071a;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Map<K, V> map) throws IOException {
            if (map == null) {
                c8587c.mo27043y();
                return;
            }
            if (!C8607g.this.f32598g) {
                c8587c.mo27036d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c8587c.mo27042p(String.valueOf(entry.getKey()));
                    this.f32600b.mo26939d(c8587c, entry.getValue());
                }
                c8587c.mo27038j();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC8571j abstractC8571jM26978c = this.f32599a.m26978c(entry2.getKey());
                arrayList.add(abstractC8571jM26978c);
                arrayList2.add(entry2.getValue());
                z |= abstractC8571jM26978c.m26957h() || abstractC8571jM26978c.m26959n();
            }
            if (!z) {
                c8587c.mo27036d();
                int size = arrayList.size();
                while (i2 < size) {
                    c8587c.mo27042p(m27132e((AbstractC8571j) arrayList.get(i2)));
                    this.f32600b.mo26939d(c8587c, arrayList2.get(i2));
                    i2++;
                }
                c8587c.mo27038j();
                return;
            }
            c8587c.mo27035c();
            int size2 = arrayList.size();
            while (i2 < size2) {
                c8587c.mo27035c();
                C8599l.m27111b((AbstractC8571j) arrayList.get(i2), c8587c);
                this.f32600b.mo26939d(c8587c, arrayList2.get(i2));
                c8587c.mo27037f();
                i2++;
            }
            c8587c.mo27037f();
        }
    }

    public C8607g(C8590c c8590c, boolean z) {
        this.f32597f = c8590c;
        this.f32598g = z;
    }

    /* renamed from: a */
    private AbstractC8578q<?> m27131a(C8566e c8566e, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C8614n.f32669f : c8566e.m26926j(C8619a.get(type));
    }

    @Override // com.google.gson.InterfaceC8579r
    /* renamed from: b */
    public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) throws NoSuchMethodException, SecurityException {
        Type type = c8619a.getType();
        if (!Map.class.isAssignableFrom(c8619a.getRawType())) {
            return null;
        }
        Type[] typeArrM27055j = C8589b.m27055j(type, C8589b.m27056k(type));
        return new a(c8566e, typeArrM27055j[0], m27131a(c8566e, typeArrM27055j[0]), typeArrM27055j[1], c8566e.m26926j(C8619a.get(typeArrM27055j[1])), this.f32597f.m27070a(c8619a));
    }
}
