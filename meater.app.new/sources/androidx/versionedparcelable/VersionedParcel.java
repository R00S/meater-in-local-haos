package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p024c.p041e.C0867a;

/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a */
    protected final C0867a<String, Method> f4402a;

    /* renamed from: b */
    protected final C0867a<String, Method> f4403b;

    /* renamed from: c */
    protected final C0867a<String, Class> f4404c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C0867a<String, Method> c0867a, C0867a<String, Method> c0867a2, C0867a<String, Class> c0867a3) {
        this.f4402a = c0867a;
        this.f4403b = c0867a2;
        this.f4404c = c0867a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m4705N(InterfaceC0678b interfaceC0678b) {
        try {
            mo4717I(m4706c(interfaceC0678b.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(interfaceC0678b.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    /* renamed from: c */
    private Class m4706c(Class<? extends InterfaceC0678b> cls) throws ClassNotFoundException {
        Class cls2 = this.f4404c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f4404c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m4707d(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = this.f4402a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f4402a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private Method m4708e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f4403b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM4706c = m4706c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM4706c.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f4403b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: A */
    protected abstract void mo4709A(byte[] bArr);

    /* renamed from: B */
    public void m4710B(byte[] bArr, int i2) {
        mo4741w(i2);
        mo4709A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo4711C(CharSequence charSequence);

    /* renamed from: D */
    public void m4712D(CharSequence charSequence, int i2) {
        mo4741w(i2);
        mo4711C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo4713E(int i2);

    /* renamed from: F */
    public void m4714F(int i2, int i3) {
        mo4741w(i3);
        mo4713E(i2);
    }

    /* renamed from: G */
    protected abstract void mo4715G(Parcelable parcelable);

    /* renamed from: H */
    public void m4716H(Parcelable parcelable, int i2) {
        mo4741w(i2);
        mo4715G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo4717I(String str);

    /* renamed from: J */
    public void m4718J(String str, int i2) {
        mo4741w(i2);
        mo4717I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC0678b> void m4719K(T t, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            m4708e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (!(e5.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
            throw ((RuntimeException) e5.getCause());
        }
    }

    /* renamed from: L */
    protected void m4720L(InterfaceC0678b interfaceC0678b) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC0678b == null) {
            mo4717I(null);
            return;
        }
        m4705N(interfaceC0678b);
        VersionedParcel versionedParcelMo4723b = mo4723b();
        m4719K(interfaceC0678b, versionedParcelMo4723b);
        versionedParcelMo4723b.mo4722a();
    }

    /* renamed from: M */
    public void m4721M(InterfaceC0678b interfaceC0678b, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mo4741w(i2);
        m4720L(interfaceC0678b);
    }

    /* renamed from: a */
    protected abstract void mo4722a();

    /* renamed from: b */
    protected abstract VersionedParcel mo4723b();

    /* renamed from: f */
    public boolean m4724f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo4725g();

    /* renamed from: h */
    public boolean m4726h(boolean z, int i2) {
        return !mo4731m(i2) ? z : mo4725g();
    }

    /* renamed from: i */
    protected abstract byte[] mo4727i();

    /* renamed from: j */
    public byte[] m4728j(byte[] bArr, int i2) {
        return !mo4731m(i2) ? bArr : mo4727i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo4729k();

    /* renamed from: l */
    public CharSequence m4730l(CharSequence charSequence, int i2) {
        return !mo4731m(i2) ? charSequence : mo4729k();
    }

    /* renamed from: m */
    protected abstract boolean mo4731m(int i2);

    /* renamed from: n */
    protected <T extends InterfaceC0678b> T m4732n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) m4707d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: o */
    protected abstract int mo4733o();

    /* renamed from: p */
    public int m4734p(int i2, int i3) {
        return !mo4731m(i3) ? i2 : mo4733o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo4735q();

    /* renamed from: r */
    public <T extends Parcelable> T m4736r(T t, int i2) {
        return !mo4731m(i2) ? t : (T) mo4735q();
    }

    /* renamed from: s */
    protected abstract String mo4737s();

    /* renamed from: t */
    public String m4738t(String str, int i2) {
        return !mo4731m(i2) ? str : mo4737s();
    }

    /* renamed from: u */
    protected <T extends InterfaceC0678b> T m4739u() {
        String strMo4737s = mo4737s();
        if (strMo4737s == null) {
            return null;
        }
        return (T) m4732n(strMo4737s, mo4723b());
    }

    /* renamed from: v */
    public <T extends InterfaceC0678b> T m4740v(T t, int i2) {
        return !mo4731m(i2) ? t : (T) m4739u();
    }

    /* renamed from: w */
    protected abstract void mo4741w(int i2);

    /* renamed from: x */
    public void m4742x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    protected abstract void mo4743y(boolean z);

    /* renamed from: z */
    public void m4744z(boolean z, int i2) {
        mo4741w(i2);
        mo4743y(z);
    }
}
