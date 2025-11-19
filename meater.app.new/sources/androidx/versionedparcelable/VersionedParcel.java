package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.C4391a;
import z3.b;

/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a, reason: collision with root package name */
    protected final C4391a<String, Method> f29702a;

    /* renamed from: b, reason: collision with root package name */
    protected final C4391a<String, Method> f29703b;

    /* renamed from: c, reason: collision with root package name */
    protected final C4391a<String, Class> f29704c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C4391a<String, Method> c4391a, C4391a<String, Method> c4391a2, C4391a<String, Class> c4391a3) {
        this.f29702a = c4391a;
        this.f29703b = c4391a2;
        this.f29704c = c4391a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(b bVar) {
        try {
            I(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    private Class c(Class<? extends b> cls) throws ClassNotFoundException {
        Class cls2 = this.f29704c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f29704c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws NoSuchMethodException, SecurityException {
        Method method = this.f29702a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f29702a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f29703b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f29703b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i10) {
        w(i10);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i10) {
        w(i10);
        C(charSequence);
    }

    protected abstract void E(int i10);

    public void F(int i10, int i11) {
        w(i11);
        E(i10);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i10) {
        w(i10);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i10) {
        w(i10);
        I(str);
    }

    protected <T extends b> void K(T t10, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            e(t10.getClass()).invoke(null, t10, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    protected void L(b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bVar == null) {
            I(null);
            return;
        }
        N(bVar);
        VersionedParcel versionedParcelB = b();
        K(bVar, versionedParcelB);
        versionedParcelB.a();
    }

    public void M(b bVar, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        w(i10);
        L(bVar);
    }

    protected abstract void a();

    protected abstract VersionedParcel b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z10, int i10) {
        return !m(i10) ? z10 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i10) {
        return !m(i10) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i10) {
        return !m(i10) ? charSequence : k();
    }

    protected abstract boolean m(int i10);

    protected <T extends b> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    protected abstract int o();

    public int p(int i10, int i11) {
        return !m(i11) ? i10 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t10, int i10) {
        return !m(i10) ? t10 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i10) {
        return !m(i10) ? str : s();
    }

    protected <T extends b> T u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return (T) n(strS, b());
    }

    public <T extends b> T v(T t10, int i10) {
        return !m(i10) ? t10 : (T) u();
    }

    protected abstract void w(int i10);

    protected abstract void y(boolean z10);

    public void z(boolean z10, int i10) {
        w(i10);
        y(z10);
    }

    public void x(boolean z10, boolean z11) {
    }
}
