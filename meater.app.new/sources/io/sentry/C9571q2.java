package io.sentry;

import io.sentry.util.C9643n;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonReflectionObjectSerializer.java */
@ApiStatus.Internal
/* renamed from: io.sentry.q2 */
/* loaded from: classes2.dex */
public final class C9571q2 {

    /* renamed from: a */
    private final Set<Object> f36793a = new HashSet();

    /* renamed from: b */
    private final int f36794b;

    C9571q2(int i2) {
        this.f36794b = i2;
    }

    /* renamed from: a */
    private List<Object> m31549a(Collection<?> collection, InterfaceC9670w1 interfaceC9670w1) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m31552d(it.next(), interfaceC9670w1));
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<Object> m31550b(Object[] objArr, InterfaceC9670w1 interfaceC9670w1) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(m31552d(obj, interfaceC9670w1));
        }
        return arrayList;
    }

    /* renamed from: c */
    private Map<String, Object> m31551c(Map<?, ?> map, InterfaceC9670w1 interfaceC9670w1) throws Exception {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), m31552d(obj2, interfaceC9670w1));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* renamed from: d */
    public Object m31552d(Object obj, InterfaceC9670w1 interfaceC9670w1) throws Exception {
        Object string;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return C9643n.m31795a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return C9643n.m31797c((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (this.f36793a.contains(obj)) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        this.f36793a.add(obj);
        try {
            if (this.f36793a.size() > this.f36794b) {
                this.f36793a.remove(obj);
                interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
            } catch (Exception e2) {
                interfaceC9670w1.mo30213b(EnumC9587s4.INFO, "Not serializing object due to throwing sub-path.", e2);
            }
            if (obj.getClass().isArray()) {
                string = m31550b((Object[]) obj, interfaceC9670w1);
            } else if (obj instanceof Collection) {
                string = m31549a((Collection) obj, interfaceC9670w1);
            } else if (obj instanceof Map) {
                string = m31551c((Map) obj, interfaceC9670w1);
            } else {
                Map<String, Object> mapM31553e = m31553e(obj, interfaceC9670w1);
                if (!mapM31553e.isEmpty()) {
                    obj2 = mapM31553e;
                    return obj2;
                }
                string = obj.toString();
            }
            obj2 = string;
            return obj2;
        } finally {
            this.f36793a.remove(obj);
        }
    }

    /* renamed from: e */
    public Map<String, Object> m31553e(Object obj, InterfaceC9670w1 interfaceC9670w1) throws Exception {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, m31552d(field.get(obj), interfaceC9670w1));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return map;
    }
}
