package y8;

import E8.k;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import r8.C4364b;
import r8.C4365c;
import r8.InterfaceC4363a;
import r8.l;
import r8.n;
import r8.o;
import r8.q;

/* compiled from: AndroidKeysetManager.java */
/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5136a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f53217d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String f53218e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final q f53219a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4363a f53220b;

    /* renamed from: c, reason: collision with root package name */
    private o f53221c;

    /* compiled from: AndroidKeysetManager.java */
    /* renamed from: y8.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f53222a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f53223b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f53224c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f53225d = null;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC4363a f53226e = null;

        /* renamed from: f, reason: collision with root package name */
        private boolean f53227f = true;

        /* renamed from: g, reason: collision with root package name */
        private l f53228g = null;

        /* renamed from: h, reason: collision with root package name */
        private o f53229h;

        private o g() throws GeneralSecurityException {
            if (this.f53228g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o oVarA = o.i().a(this.f53228g);
            o oVarH = oVarA.h(oVarA.d().i().c0(0).c0());
            C5139d c5139d = new C5139d(this.f53222a, this.f53223b, this.f53224c);
            if (this.f53226e != null) {
                oVarH.d().r(c5139d, this.f53226e);
            } else {
                C4365c.b(oVarH.d(), c5139d);
            }
            return oVarH;
        }

        private static byte[] h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private o i(byte[] bArr) {
            return o.j(C4365c.a(C4364b.b(bArr)));
        }

        private o j(byte[] bArr) {
            try {
                this.f53226e = new C5138c().b(this.f53225d);
                try {
                    return o.j(n.n(C4364b.b(bArr), this.f53226e));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    o oVarI = i(bArr);
                    Log.w(C5136a.f53218e, "cannot use Android Keystore, it'll be disabled", e11);
                    return oVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private InterfaceC4363a k() throws KeyStoreException {
            if (!C5136a.e()) {
                Log.w(C5136a.f53218e, "Android Keystore requires at least Android M");
                return null;
            }
            C5138c c5138c = new C5138c();
            try {
                boolean zD = C5138c.d(this.f53225d);
                try {
                    return c5138c.b(this.f53225d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f53225d), e10);
                    }
                    Log.w(C5136a.f53218e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(C5136a.f53218e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public synchronized C5136a f() {
            C5136a c5136a;
            try {
                if (this.f53223b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (C5136a.f53217d) {
                    try {
                        byte[] bArrH = h(this.f53222a, this.f53223b, this.f53224c);
                        if (bArrH == null) {
                            if (this.f53225d != null) {
                                this.f53226e = k();
                            }
                            this.f53229h = g();
                        } else if (this.f53225d == null || !C5136a.e()) {
                            this.f53229h = i(bArrH);
                        } else {
                            this.f53229h = j(bArrH);
                        }
                        c5136a = new C5136a(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return c5136a;
        }

        public b l(l lVar) {
            this.f53228g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f53227f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f53225d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f53222a = context;
            this.f53223b = str;
            this.f53224c = str2;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e() {
        return true;
    }

    public synchronized n d() {
        return this.f53221c.d();
    }

    private C5136a(b bVar) {
        this.f53219a = new C5139d(bVar.f53222a, bVar.f53223b, bVar.f53224c);
        this.f53220b = bVar.f53226e;
        this.f53221c = bVar.f53229h;
    }
}
