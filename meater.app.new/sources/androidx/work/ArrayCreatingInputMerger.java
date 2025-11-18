package androidx.work;

import androidx.work.C0706e;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC0804k {
    /* renamed from: c */
    private Object m4753c(Object obj, Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }

    /* renamed from: d */
    private Object m4754d(Object obj, Object obj2) throws NegativeArraySizeException {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    /* renamed from: e */
    private Object m4755e(Object obj, Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(objNewInstance, 0, obj);
        Array.set(objNewInstance, 1, obj2);
        return objNewInstance;
    }

    /* renamed from: f */
    private Object m4756f(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(objNewInstance, 0, obj);
        return objNewInstance;
    }

    @Override // androidx.work.AbstractC0804k
    /* renamed from: b */
    public C0706e mo4757b(List<C0706e> list) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        C0706e.a aVar = new C0706e.a();
        HashMap map = new HashMap();
        Iterator<C0706e> it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().m4832i().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map.get(key);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? m4754d(obj, value) : m4755e(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = m4753c(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = m4753c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = m4756f(value);
                }
                map.put(key, value);
            }
        }
        aVar.m4838d(map);
        return aVar.m4835a();
    }
}
