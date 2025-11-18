package p024c.p052i.p053e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
/* renamed from: c.i.e.h */
/* loaded from: classes.dex */
public class C0930h extends C0929g {
    @Override // p024c.p052i.p053e.C0929g
    /* renamed from: l */
    protected Typeface mo5937l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f6303g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f6309m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p024c.p052i.p053e.C0929g
    /* renamed from: x */
    protected Method mo5941x(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
