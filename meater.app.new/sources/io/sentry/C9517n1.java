package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Hint.java */
/* renamed from: io.sentry.n1 */
/* loaded from: classes2.dex */
public final class C9517n1 {

    /* renamed from: a */
    private static final Map<String, Class<?>> f36504a;

    /* renamed from: b */
    private final Map<String, Object> f36505b = new HashMap();

    /* renamed from: c */
    private final List<C9583s0> f36506c = new ArrayList();

    /* renamed from: d */
    private C9583s0 f36507d = null;

    /* renamed from: e */
    private C9583s0 f36508e = null;

    /* renamed from: f */
    private C9583s0 f36509f = null;

    static {
        HashMap map = new HashMap();
        f36504a = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    /* renamed from: i */
    private boolean m31070i(Object obj, Class<?> cls) {
        Class<?> cls2 = f36504a.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    /* renamed from: a */
    public void m31071a(List<C9583s0> list) {
        if (list != null) {
            this.f36506c.addAll(list);
        }
    }

    @ApiStatus.Internal
    /* renamed from: b */
    public synchronized void m31072b() {
        Iterator<Map.Entry<String, Object>> it = this.f36505b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public synchronized Object m31073c(String str) {
        return this.f36505b.get(str);
    }

    /* renamed from: d */
    public synchronized <T> T m31074d(String str, Class<T> cls) {
        T t = (T) this.f36505b.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        if (m31070i(t, cls)) {
            return t;
        }
        return null;
    }

    /* renamed from: e */
    public List<C9583s0> m31075e() {
        return new ArrayList(this.f36506c);
    }

    /* renamed from: f */
    public C9583s0 m31076f() {
        return this.f36507d;
    }

    /* renamed from: g */
    public C9583s0 m31077g() {
        return this.f36509f;
    }

    /* renamed from: h */
    public C9583s0 m31078h() {
        return this.f36508e;
    }

    /* renamed from: j */
    public synchronized void m31079j(String str, Object obj) {
        this.f36505b.put(str, obj);
    }

    /* renamed from: k */
    public void m31080k(C9583s0 c9583s0) {
        this.f36507d = c9583s0;
    }

    /* renamed from: l */
    public void m31081l(C9583s0 c9583s0) {
        this.f36509f = c9583s0;
    }

    /* renamed from: m */
    public void m31082m(C9583s0 c9583s0) {
        this.f36508e = c9583s0;
    }
}
