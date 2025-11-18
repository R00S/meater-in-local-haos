package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0529y;
import androidx.savedstate.InterfaceC0674c;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory.java */
/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public final class C0526v extends C0529y.c {

    /* renamed from: a */
    private static final Class<?>[] f3501a = {Application.class, C0525u.class};

    /* renamed from: b */
    private static final Class<?>[] f3502b = {C0525u.class};

    /* renamed from: c */
    private final Application f3503c;

    /* renamed from: d */
    private final C0529y.b f3504d;

    /* renamed from: e */
    private final Bundle f3505e;

    /* renamed from: f */
    private final AbstractC0511g f3506f;

    /* renamed from: g */
    private final SavedStateRegistry f3507g;

    @SuppressLint({"LambdaLast"})
    public C0526v(Application application, InterfaceC0674c interfaceC0674c, Bundle bundle) {
        this.f3507g = interfaceC0674c.getSavedStateRegistry();
        this.f3506f = interfaceC0674c.getLifecycle();
        this.f3505e = bundle;
        this.f3503c = application;
        this.f3504d = application != null ? C0529y.a.m3917c(application) : C0529y.d.m3918b();
    }

    /* renamed from: d */
    private static <T> Constructor<T> m3902d(Class<T> cls, Class<?>[] clsArr) throws SecurityException {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.C0529y.c, androidx.lifecycle.C0529y.b
    /* renamed from: a */
    public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo3904c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C0529y.e
    /* renamed from: b */
    void mo3903b(AbstractC0528x abstractC0528x) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController.m3837b(abstractC0528x, this.f3507g, this.f3506f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: InvocationTargetException -> 0x005a, InstantiationException -> 0x0076, IllegalAccessException -> 0x0093, TryCatch #2 {IllegalAccessException -> 0x0093, InstantiationException -> 0x0076, InvocationTargetException -> 0x005a, blocks: (B:13:0x0030, B:15:0x0034, B:17:0x0054, B:16:0x0046), top: B:28:0x0030 }] */
    @Override // androidx.lifecycle.C0529y.c
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends androidx.lifecycle.AbstractC0528x> T mo3904c(java.lang.String r6, java.lang.Class<T> r7) throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<androidx.lifecycle.a> r0 = androidx.lifecycle.C0500a.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L13
            android.app.Application r1 = r5.f3503c
            if (r1 == 0) goto L13
            java.lang.Class<?>[] r1 = androidx.lifecycle.C0526v.f3501a
            java.lang.reflect.Constructor r1 = m3902d(r7, r1)
            goto L19
        L13:
            java.lang.Class<?>[] r1 = androidx.lifecycle.C0526v.f3502b
            java.lang.reflect.Constructor r1 = m3902d(r7, r1)
        L19:
            if (r1 != 0) goto L22
            androidx.lifecycle.y$b r6 = r5.f3504d
            androidx.lifecycle.x r6 = r6.mo3685a(r7)
            return r6
        L22:
            androidx.savedstate.SavedStateRegistry r2 = r5.f3507g
            androidx.lifecycle.g r3 = r5.f3506f
            android.os.Bundle r4 = r5.f3505e
            androidx.lifecycle.SavedStateHandleController r6 = androidx.lifecycle.SavedStateHandleController.m3838d(r2, r3, r6, r4)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L46
            android.app.Application r0 = r5.f3503c     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            if (r0 == 0) goto L46
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            r4[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.u r0 = r6.m3841e()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            r4[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            java.lang.Object r0 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.x r0 = (androidx.lifecycle.AbstractC0528x) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            goto L54
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.u r3 = r6.m3841e()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            r0[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.x r0 = (androidx.lifecycle.AbstractC0528x) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
        L54:
            java.lang.String r1 = "androidx.lifecycle.savedstate.vm.tag"
            r0.m3914e(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            return r0
        L5a:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception happened in constructor of "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r7, r6)
            throw r0
        L76:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " cannot be instantiated."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        L93:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0526v.mo3904c(java.lang.String, java.lang.Class):androidx.lifecycle.x");
    }
}
