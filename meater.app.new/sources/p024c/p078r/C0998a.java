package p024c.p078r;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import okhttp3.HttpUrl;

/* compiled from: MultiDex.java */
/* renamed from: c.r.a */
/* loaded from: classes.dex */
public final class C0998a {

    /* renamed from: a */
    private static final Set<File> f6596a = new HashSet();

    /* renamed from: b */
    private static final boolean f6597b = m6358m(System.getProperty("java.vm.version"));

    /* compiled from: MultiDex.java */
    /* renamed from: c.r.a$a */
    private static final class a {

        /* renamed from: a */
        private static final int f6598a = 4;

        /* renamed from: b */
        private final InterfaceC11448a f6599b;

        /* compiled from: MultiDex.java */
        /* renamed from: c.r.a$a$a, reason: collision with other inner class name */
        private interface InterfaceC11448a {
            /* renamed from: a */
            Object mo6363a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException;
        }

        /* compiled from: MultiDex.java */
        /* renamed from: c.r.a$a$b */
        private static class b implements InterfaceC11448a {

            /* renamed from: a */
            private final Constructor<?> f6600a;

            b(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f6600a = constructor;
                constructor.setAccessible(true);
            }

            @Override // p024c.p078r.C0998a.a.InterfaceC11448a
            /* renamed from: a */
            public Object mo6363a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
                return this.f6600a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* compiled from: MultiDex.java */
        /* renamed from: c.r.a$a$c */
        private static class c implements InterfaceC11448a {

            /* renamed from: a */
            private final Constructor<?> f6601a;

            c(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f6601a = constructor;
                constructor.setAccessible(true);
            }

            @Override // p024c.p078r.C0998a.a.InterfaceC11448a
            /* renamed from: a */
            public Object mo6363a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.f6601a.newInstance(file, file, dexFile);
            }
        }

        /* compiled from: MultiDex.java */
        /* renamed from: c.r.a$a$d */
        private static class d implements InterfaceC11448a {

            /* renamed from: a */
            private final Constructor<?> f6602a;

            d(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f6602a = constructor;
                constructor.setAccessible(true);
            }

            @Override // p024c.p078r.C0998a.a.InterfaceC11448a
            /* renamed from: a */
            public Object mo6363a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.f6602a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            InterfaceC11448a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new d(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new c(cls);
            }
            this.f6599b = dVar;
        }

        /* renamed from: a */
        static void m6360a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Object obj = C0998a.m6352g(classLoader, "pathList").get(classLoader);
            Object[] objArrM6361b = new a().m6361b(list);
            try {
                C0998a.m6351f(obj, "dexElements", objArrM6361b);
            } catch (NoSuchFieldException e2) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e2);
                C0998a.m6351f(obj, "pathElements", objArrM6361b);
            }
        }

        /* renamed from: b */
        private Object[] m6361b(List<? extends File> list) throws IllegalAccessException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                File file = list.get(i2);
                objArr[i2] = this.f6599b.mo6363a(file, DexFile.loadDex(file.getPath(), m6362c(file), 0));
            }
            return objArr;
        }

        /* renamed from: c */
        private static String m6362c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f6598a) + ".dex").getPath();
        }
    }

    /* compiled from: MultiDex.java */
    /* renamed from: c.r.a$b */
    private static final class b {
        /* renamed from: a */
        static void m6364a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = C0998a.m6352g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C0998a.m6351f(obj, "dexElements", m6365b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field fieldM6352g = C0998a.m6352g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldM6352g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldM6352g.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: b */
        private static Object[] m6365b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) C0998a.m6353h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* compiled from: MultiDex.java */
    /* renamed from: c.r.a$c */
    private static final class c {
        /* renamed from: a */
        static void m6366a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
            int size = list.size();
            Field fieldM6352g = C0998a.m6352g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) fieldM6352g.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int iPreviousIndex = listIterator.previousIndex();
                strArr[iPreviousIndex] = absolutePath;
                fileArr[iPreviousIndex] = next;
                zipFileArr[iPreviousIndex] = new ZipFile(next);
                dexFileArr[iPreviousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            fieldM6352g.set(classLoader, sb.toString());
            C0998a.m6351f(classLoader, "mPaths", strArr);
            C0998a.m6351f(classLoader, "mFiles", fileArr);
            C0998a.m6351f(classLoader, "mZips", zipFileArr);
            C0998a.m6351f(classLoader, "mDexs", dexFileArr);
        }
    }

    /* renamed from: d */
    private static void m6349d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    /* renamed from: e */
    private static void m6350e(Context context, File file, File file2, String str, String str2, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = f6596a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 20) {
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i2 + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                    return;
                }
                try {
                    m6349d(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File fileM6355j = m6355j(context, file2, str);
                C0999b c0999b = new C0999b(file, fileM6355j);
                IOException e2 = null;
                try {
                    try {
                        m6357l(classLoader, fileM6355j, c0999b.m6377k(context, str2, false));
                    } catch (IOException e3) {
                        if (!z) {
                            throw e3;
                        }
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e3);
                        m6357l(classLoader, fileM6355j, c0999b.m6377k(context, str2, true));
                    }
                    try {
                    } catch (IOException e4) {
                        e2 = e4;
                    }
                    if (e2 != null) {
                        throw e2;
                    }
                } finally {
                    try {
                        c0999b.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (RuntimeException e5) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static void m6351f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldM6352g = m6352g(obj, str);
        Object[] objArr2 = (Object[]) fieldM6352g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldM6352g.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static Field m6352g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static Method m6353h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: i */
    private static ApplicationInfo m6354i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e2) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
            return null;
        }
    }

    /* renamed from: j */
    private static File m6355j(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m6359n(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m6359n(file2);
        }
        File file3 = new File(file2, str);
        m6359n(file3);
        return file3;
    }

    /* renamed from: k */
    public static void m6356k(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f6597b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 4) {
            throw new RuntimeException("MultiDex installation failed. SDK " + i2 + " is unsupported. Min SDK version is 4.");
        }
        try {
            ApplicationInfo applicationInfoM6354i = m6354i(context);
            if (applicationInfoM6354i == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                m6350e(context, new File(applicationInfoM6354i.sourceDir), new File(applicationInfoM6354i.dataDir), "secondary-dexes", HttpUrl.FRAGMENT_ENCODE_SET, true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e2) {
            Log.e("MultiDex", "MultiDex installation failure", e2);
            throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
        }
    }

    /* renamed from: l */
    private static void m6357l(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list.isEmpty()) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            b.m6364a(classLoader, list, file);
        } else if (i2 >= 14) {
            a.m6360a(classLoader, list);
        } else {
            c.m6366a(classLoader, list);
        }
    }

    /* renamed from: m */
    static boolean m6358m(String str) throws NumberFormatException {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int i2 = Integer.parseInt(matcher.group(1));
                    int i3 = Integer.parseInt(matcher.group(2));
                    if (i2 > 2 || (i2 == 2 && i3 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    /* renamed from: n */
    private static void m6359n(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
