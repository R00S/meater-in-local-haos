package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.InterfaceC4363a;
import r8.InterfaceC4367e;
import r8.l;
import r8.m;
import r8.n;
import s.C4392b;
import s8.C4502a;
import x8.C5077b;
import y8.C5136a;

/* compiled from: EncryptedSharedPreferences.java */
/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f29283a;

    /* renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f29284b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final String f29285c;

    /* renamed from: d, reason: collision with root package name */
    final String f29286d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC4363a f29287e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC4367e f29288f;

    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: androidx.security.crypto.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0403a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29289a;

        static {
            int[] iArr = new int[c.values().length];
            f29289a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29289a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29289a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29289a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29289a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29289a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private final a f29290a;

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f29291b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f29293d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final List<String> f29292c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f29290a = aVar;
            this.f29291b = editor;
        }

        private void a() {
            if (this.f29293d.getAndSet(false)) {
                for (String str : this.f29290a.getAll().keySet()) {
                    if (!this.f29292c.contains(str) && !this.f29290a.g(str)) {
                        this.f29291b.remove(this.f29290a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f29290a.f29284b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.f29292c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.f29290a, it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f29290a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f29292c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> pairE = this.f29290a.e(str, bArr);
                this.f29291b.putString((String) pairE.first, (String) pairE.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f29291b.apply();
            b();
            this.f29292c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f29293d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f29291b.commit();
            } finally {
                b();
                this.f29292c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.n());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.n());
            byteBufferAllocate.putFloat(f10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.n());
            byteBufferAllocate.putInt(i10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.n());
            byteBufferAllocate.putLong(j10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.n());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C4392b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.n());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f29290a.g(str)) {
                this.f29291b.remove(this.f29290a.d(str));
                this.f29292c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    private enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: B, reason: collision with root package name */
        private final int f29301B;

        c(int i10) {
            this.f29301B = i10;
        }

        public static c j(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int n() {
            return this.f29301B;
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    public enum d {
        AES256_SIV("AES256_SIV");


        /* renamed from: B, reason: collision with root package name */
        private final String f29304B;

        d(String str) {
            this.f29304B = str;
        }

        l j() {
            return m.a(this.f29304B);
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    public enum e {
        AES256_GCM("AES256_GCM");


        /* renamed from: B, reason: collision with root package name */
        private final String f29307B;

        e(String str) {
            this.f29307B = str;
        }

        l j() {
            return m.a(this.f29307B);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, InterfaceC4363a interfaceC4363a, InterfaceC4367e interfaceC4367e) {
        this.f29285c = str;
        this.f29283a = sharedPreferences;
        this.f29286d = str2;
        this.f29287e = interfaceC4363a;
        this.f29288f = interfaceC4367e;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        C5077b.a();
        C4502a.b();
        Context applicationContext = context.getApplicationContext();
        n nVarD = new C5136a.b().l(dVar.j()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n nVarD2 = new C5136a.b().l(eVar.j()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC4363a) nVarD2.k(InterfaceC4363a.class), (InterfaceC4367e) nVarD.k(InterfaceC4367e.class));
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strD = d(str);
            String string = this.f29283a.getString(strD, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = E8.e.a(string, 0);
            InterfaceC4363a interfaceC4363a = this.f29287e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC4363a.b(bArrA, strD.getBytes(charset)));
            byteBufferWrap.position(0);
            int i10 = byteBufferWrap.getInt();
            c cVarJ = c.j(i10);
            if (cVarJ == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            switch (C0403a.f29289a[cVarJ.ordinal()]) {
                case 1:
                    int i11 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i11);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
                case 2:
                    return Integer.valueOf(byteBufferWrap.getInt());
                case 3:
                    return Long.valueOf(byteBufferWrap.getLong());
                case 4:
                    return Float.valueOf(byteBufferWrap.getFloat());
                case 5:
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                case 6:
                    C4392b c4392b = new C4392b();
                    while (byteBufferWrap.hasRemaining()) {
                        int i12 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i12);
                        byteBufferWrap.position(byteBufferWrap.position() + i12);
                        c4392b.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c4392b.size() == 1 && "__NULL__".equals(c4392b.B(0))) {
                        return null;
                    }
                    return c4392b;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + cVarJ);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f29288f.b(E8.e.a(str, 0), this.f29285c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f29283a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return E8.e.d(this.f29288f.a(str.getBytes(StandardCharsets.UTF_8), this.f29285c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    Pair<String, String> e(String str, byte[] bArr) {
        String strD = d(str);
        return new Pair<>(strD, E8.e.d(this.f29287e.a(bArr, strD.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f29283a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f29283a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String strC = c(entry.getKey());
                map.put(strC, f(strC));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object objF = f(str);
        return objF instanceof Boolean ? ((Boolean) objF).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object objF = f(str);
        return objF instanceof Float ? ((Float) objF).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object objF = f(str);
        return objF instanceof Integer ? ((Integer) objF).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object objF = f(str);
        return objF instanceof Long ? ((Long) objF).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objF = f(str);
        return objF instanceof String ? (String) objF : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object objF = f(str);
        Set<String> c4392b = objF instanceof Set ? (Set) objF : new C4392b<>();
        return c4392b.size() > 0 ? c4392b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29284b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29284b.remove(onSharedPreferenceChangeListener);
    }
}
