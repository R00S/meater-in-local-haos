package p024c.p052i.p053e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p003d.C0260c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p024c.p041e.C0873g;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompatApi24Impl.java */
/* renamed from: c.i.e.f */
/* loaded from: classes.dex */
class C0928f extends C0932j {

    /* renamed from: b */
    private static final Class<?> f6299b;

    /* renamed from: c */
    private static final Constructor<?> f6300c;

    /* renamed from: d */
    private static final Method f6301d;

    /* renamed from: e */
    private static final Method f6302e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f6300c = constructor;
        f6299b = cls;
        f6301d = method2;
        f6302e = method;
    }

    C0928f() {
    }

    /* renamed from: k */
    private static boolean m5925k(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f6301d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m5926l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f6299b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f6302e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m5927m() {
        Method method = f6301d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m5928n() {
        try {
            return f6300c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p024c.p052i.p053e.C0932j
    /* renamed from: b */
    public Typeface mo5923b(Context context, C0260c.b bVar, Resources resources, int i2) {
        Object objM5928n = m5928n();
        if (objM5928n == null) {
            return null;
        }
        for (C0260c.c cVar : bVar.m1730a()) {
            ByteBuffer byteBufferM5958b = C0933k.m5958b(context, resources, cVar.m1732b());
            if (byteBufferM5958b == null || !m5925k(objM5928n, byteBufferM5958b, cVar.m1733c(), cVar.m1735e(), cVar.m1736f())) {
                return null;
            }
        }
        return m5926l(objM5928n);
    }

    @Override // p024c.p052i.p053e.C0932j
    /* renamed from: c */
    public Typeface mo5924c(Context context, CancellationSignal cancellationSignal, C0943f.b[] bVarArr, int i2) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objM5928n = m5928n();
        if (objM5928n == null) {
            return null;
        }
        C0873g c0873g = new C0873g();
        for (C0943f.b bVar : bVarArr) {
            Uri uriM6003d = bVar.m6003d();
            ByteBuffer byteBufferM5962f = (ByteBuffer) c0873g.get(uriM6003d);
            if (byteBufferM5962f == null) {
                byteBufferM5962f = C0933k.m5962f(context, cancellationSignal, uriM6003d);
                c0873g.put(uriM6003d, byteBufferM5962f);
            }
            if (byteBufferM5962f == null || !m5925k(objM5928n, byteBufferM5962f, bVar.m6002c(), bVar.m6004e(), bVar.m6005f())) {
                return null;
            }
        }
        Typeface typefaceM5926l = m5926l(objM5928n);
        if (typefaceM5926l == null) {
            return null;
        }
        return Typeface.create(typefaceM5926l, i2);
    }
}
