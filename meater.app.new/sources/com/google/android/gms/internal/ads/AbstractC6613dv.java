package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdno;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.dv */
/* loaded from: classes2.dex */
abstract class AbstractC6613dv<T extends zzdno> {

    /* renamed from: a */
    private static final Logger f18704a = Logger.getLogger(zzdni.class.getName());

    /* renamed from: b */
    private static String f18705b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC6613dv() {
    }

    /* renamed from: b */
    static <T extends zzdno> T m15080b(Class<T> cls) {
        String str;
        ClassLoader classLoader = AbstractC6613dv.class.getClassLoader();
        if (cls.equals(zzdno.class)) {
            str = f18705b;
        } else {
            if (!cls.getPackage().equals(AbstractC6613dv.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC6613dv) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m15081a());
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    } catch (NoSuchMethodException e3) {
                        throw new IllegalStateException(e3);
                    }
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(e4);
                }
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC6613dv.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC6613dv) it.next()).m15081a()));
                } catch (ServiceConfigurationError e6) {
                    Logger logger = f18704a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    /* renamed from: a */
    protected abstract T m15081a();
}
