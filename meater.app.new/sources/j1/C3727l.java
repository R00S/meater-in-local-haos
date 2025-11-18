package j1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i1.e;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import o1.k;

/* compiled from: TypefaceCompatApi26Impl.java */
/* renamed from: j1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3727l extends C3726k {

    /* renamed from: g, reason: collision with root package name */
    protected final Class<?> f43467g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f43468h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f43469i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f43470j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f43471k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f43472l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f43473m;

    public C3727l() {
        Class<?> clsU;
        Constructor<?> constructorV;
        Method methodR;
        Method methodS;
        Method methodW;
        Method methodQ;
        Method methodT;
        try {
            clsU = u();
            constructorV = v(clsU);
            methodR = r(clsU);
            methodS = s(clsU);
            methodW = w(clsU);
            methodQ = q(clsU);
            methodT = t(clsU);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsU = null;
            constructorV = null;
            methodR = null;
            methodS = null;
            methodW = null;
            methodQ = null;
            methodT = null;
        }
        this.f43467g = clsU;
        this.f43468h = constructorV;
        this.f43469i = methodR;
        this.f43470j = methodS;
        this.f43471k = methodW;
        this.f43472l = methodQ;
        this.f43473m = methodT;
    }

    private Object k() {
        try {
            return this.f43468h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f43472l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f43469i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f43470j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.f43471k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.f43469i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f43469i != null;
    }

    @Override // j1.C3726k, j1.C3730o
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!p()) {
            return super.a(context, cVar, resources, i10);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!m(context, objK, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(objK);
                return null;
            }
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    @Override // j1.C3730o
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            k.b bVarG = g(bVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapF = p.f(context, bVarArr, cancellationSignal);
        Object objK = k();
        if (objK == null) {
            return null;
        }
        boolean z10 = false;
        for (k.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapF.get(bVar.d());
            if (byteBuffer != null) {
                if (!n(objK, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    l(objK);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            l(objK);
            return null;
        }
        if (o(objK) && (typefaceI = i(objK)) != null) {
            return Typeface.create(typefaceI, i10);
        }
        return null;
    }

    @Override // j1.C3730o
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    @Override // j1.C3730o
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!p()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (!m(context, objK, str, 0, -1, -1, null)) {
            l(objK);
            return null;
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    protected Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f43467g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f43473m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method q(Class<?> cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method r(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> u() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> v(Class<?> cls) {
        return cls.getConstructor(null);
    }

    protected Method w(Class<?> cls) {
        return cls.getMethod("freeze", null);
    }
}
