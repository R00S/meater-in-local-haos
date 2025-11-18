package p024c.p052i.p053e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p003d.C0260c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompatApi21Impl.java */
/* renamed from: c.i.e.e */
/* loaded from: classes.dex */
class C0927e extends C0932j {

    /* renamed from: b */
    private static Class<?> f6294b = null;

    /* renamed from: c */
    private static Constructor<?> f6295c = null;

    /* renamed from: d */
    private static Method f6296d = null;

    /* renamed from: e */
    private static Method f6297e = null;

    /* renamed from: f */
    private static boolean f6298f = false;

    C0927e() {
    }

    /* renamed from: k */
    private static boolean m5918k(Object obj, String str, int i2, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m5921n();
        try {
            return ((Boolean) f6296d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: l */
    private static Typeface m5919l(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        m5921n();
        try {
            Object objNewInstance = Array.newInstance(f6294b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f6297e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: m */
    private File m5920m(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m5921n() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f6298f) {
            return;
        }
        f6298f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f6295c = constructor;
        f6294b = cls;
        f6296d = method2;
        f6297e = method;
    }

    /* renamed from: o */
    private static Object m5922o() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m5921n();
        try {
            return f6295c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p024c.p052i.p053e.C0932j
    /* renamed from: b */
    public Typeface mo5923b(Context context, C0260c.b bVar, Resources resources, int i2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objM5922o = m5922o();
        for (C0260c.c cVar : bVar.m1730a()) {
            File fileM5961e = C0933k.m5961e(context);
            if (fileM5961e == null) {
                return null;
            }
            try {
                if (!C0933k.m5959c(fileM5961e, resources, cVar.m1732b())) {
                    return null;
                }
                if (!m5918k(objM5922o, fileM5961e.getPath(), cVar.m1735e(), cVar.m1736f())) {
                    return null;
                }
                fileM5961e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM5961e.delete();
            }
        }
        return m5919l(objM5922o);
    }

    @Override // p024c.p052i.p053e.C0932j
    /* renamed from: c */
    public Typeface mo5924c(Context context, CancellationSignal cancellationSignal, C0943f.b[] bVarArr, int i2) throws IOException {
        if (bVarArr.length < 1) {
            return null;
        }
        C0943f.b bVarMo5945h = mo5945h(bVarArr, i2);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo5945h.m6003d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
                return null;
            }
            try {
                File fileM5920m = m5920m(parcelFileDescriptorOpenFileDescriptor);
                if (fileM5920m != null && fileM5920m.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM5920m);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceMo5944d = super.mo5944d(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceMo5944d;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } finally {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException unused3) {
            return null;
        }
    }
}
