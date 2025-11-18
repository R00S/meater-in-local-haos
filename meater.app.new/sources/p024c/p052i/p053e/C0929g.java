package p024c.p052i.p053e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p003d.C0260c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompatApi26Impl.java */
/* renamed from: c.i.e.g */
/* loaded from: classes.dex */
public class C0929g extends C0927e {

    /* renamed from: g */
    protected final Class<?> f6303g;

    /* renamed from: h */
    protected final Constructor<?> f6304h;

    /* renamed from: i */
    protected final Method f6305i;

    /* renamed from: j */
    protected final Method f6306j;

    /* renamed from: k */
    protected final Method f6307k;

    /* renamed from: l */
    protected final Method f6308l;

    /* renamed from: m */
    protected final Method f6309m;

    public C0929g() throws NoSuchMethodException, SecurityException {
        Method methodMo5941x;
        Constructor<?> constructorM5943z;
        Method methodM5939v;
        Method methodM5940w;
        Method methodM5935A;
        Method methodM5938u;
        Class<?> cls = null;
        try {
            Class<?> clsM5942y = m5942y();
            constructorM5943z = m5943z(clsM5942y);
            methodM5939v = m5939v(clsM5942y);
            methodM5940w = m5940w(clsM5942y);
            methodM5935A = m5935A(clsM5942y);
            methodM5938u = m5938u(clsM5942y);
            methodMo5941x = mo5941x(clsM5942y);
            cls = clsM5942y;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            methodMo5941x = null;
            constructorM5943z = null;
            methodM5939v = null;
            methodM5940w = null;
            methodM5935A = null;
            methodM5938u = null;
        }
        this.f6303g = cls;
        this.f6304h = constructorM5943z;
        this.f6305i = methodM5939v;
        this.f6306j = methodM5940w;
        this.f6307k = methodM5935A;
        this.f6308l = methodM5938u;
        this.f6309m = methodMo5941x;
    }

    /* renamed from: o */
    private Object m5929o() {
        try {
            return this.f6304h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m5930p(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f6308l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m5931q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f6305i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m5932r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f6306j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m5933s(Object obj) {
        try {
            return ((Boolean) this.f6307k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m5934t() {
        if (this.f6305i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f6305i != null;
    }

    /* renamed from: A */
    protected Method m5935A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p024c.p052i.p053e.C0927e, p024c.p052i.p053e.C0932j
    /* renamed from: b */
    public Typeface mo5923b(Context context, C0260c.b bVar, Resources resources, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m5934t()) {
            return super.mo5923b(context, bVar, resources, i2);
        }
        Object objM5929o = m5929o();
        if (objM5929o == null) {
            return null;
        }
        for (C0260c.c cVar : bVar.m1730a()) {
            if (!m5931q(context, objM5929o, cVar.m1731a(), cVar.m1733c(), cVar.m1735e(), cVar.m1736f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m1734d()))) {
                m5930p(objM5929o);
                return null;
            }
        }
        if (m5933s(objM5929o)) {
            return mo5937l(objM5929o);
        }
        return null;
    }

    @Override // p024c.p052i.p053e.C0927e, p024c.p052i.p053e.C0932j
    /* renamed from: c */
    public Typeface mo5924c(Context context, CancellationSignal cancellationSignal, C0943f.b[] bVarArr, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo5937l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m5934t()) {
            C0943f.b bVarMo5945h = mo5945h(bVarArr, i2);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo5945h.m6003d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarMo5945h.m6004e()).setItalic(bVarMo5945h.m6005f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (IOException unused2) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapM5964h = C0933k.m5964h(context, bVarArr, cancellationSignal);
        Object objM5929o = m5929o();
        if (objM5929o == null) {
            return null;
        }
        boolean z = false;
        for (C0943f.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapM5964h.get(bVar.m6003d());
            if (byteBuffer != null) {
                if (!m5932r(objM5929o, byteBuffer, bVar.m6002c(), bVar.m6004e(), bVar.m6005f() ? 1 : 0)) {
                    m5930p(objM5929o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m5930p(objM5929o);
            return null;
        }
        if (m5933s(objM5929o) && (typefaceMo5937l = mo5937l(objM5929o)) != null) {
            return Typeface.create(typefaceMo5937l, i2);
        }
        return null;
    }

    @Override // p024c.p052i.p053e.C0932j
    /* renamed from: e */
    public Typeface mo5936e(Context context, Resources resources, int i2, String str, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m5934t()) {
            return super.mo5936e(context, resources, i2, str, i3);
        }
        Object objM5929o = m5929o();
        if (objM5929o == null) {
            return null;
        }
        if (!m5931q(context, objM5929o, str, 0, -1, -1, null)) {
            m5930p(objM5929o);
            return null;
        }
        if (m5933s(objM5929o)) {
            return mo5937l(objM5929o);
        }
        return null;
    }

    /* renamed from: l */
    protected Typeface mo5937l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f6303g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f6309m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u */
    protected Method m5938u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    protected Method m5939v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    protected Method m5940w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    protected Method mo5941x(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    protected Class<?> m5942y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    protected Constructor<?> m5943z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
