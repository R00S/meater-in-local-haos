package Ic;

import java.util.Objects;
import java.util.prefs.AbstractPreferences;

/* compiled from: Base64.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7012a;

    /* renamed from: b, reason: collision with root package name */
    private static final C0144a f7013b;

    static {
        a aVar = new a();
        f7012a = aVar;
        Objects.requireNonNull(aVar);
        f7013b = new C0144a(aVar);
    }

    public static String a(String str) {
        C0144a c0144a = f7013b;
        c0144a.putByteArray("akey", str.getBytes());
        return c0144a.a();
    }

    public static String b(byte[] bArr) {
        C0144a c0144a = f7013b;
        c0144a.putByteArray("aKey", bArr);
        return c0144a.a();
    }

    /* compiled from: Base64.java */
    /* renamed from: Ic.a$a, reason: collision with other inner class name */
    public class C0144a extends AbstractPreferences {

        /* renamed from: a, reason: collision with root package name */
        private String f7014a;

        public C0144a(a aVar) {
            super(null, "");
            this.f7014a = null;
        }

        public String a() {
            return this.f7014a;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected AbstractPreferences childSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String[] childrenNamesSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String getSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String[] keysSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void putSpi(String str, String str2) {
            this.f7014a = str2;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void flushSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void removeNodeSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void syncSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void removeSpi(String str) {
        }
    }
}
