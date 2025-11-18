package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdky;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class zzdkx<T_WRAPPER extends zzdky<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    private static final Logger f25629a = Logger.getLogger(zzdkx.class.getName());

    /* renamed from: b */
    private static final List<Provider> f25630b;

    /* renamed from: c */
    public static final zzdkx<zzdkz, Cipher> f25631c;

    /* renamed from: d */
    public static final zzdkx<zzdld, Mac> f25632d;

    /* renamed from: e */
    public static final zzdkx<zzdlf, Signature> f25633e;

    /* renamed from: f */
    public static final zzdkx<zzdle, MessageDigest> f25634f;

    /* renamed from: g */
    public static final zzdkx<zzdla, KeyAgreement> f25635g;

    /* renamed from: h */
    public static final zzdkx<zzdlc, KeyPairGenerator> f25636h;

    /* renamed from: i */
    public static final zzdkx<zzdlb, KeyFactory> f25637i;

    /* renamed from: j */
    private T_WRAPPER f25638j;

    /* renamed from: k */
    private List<Provider> f25639k = f25630b;

    /* renamed from: l */
    private boolean f25640l = true;

    static {
        if (zzdlv.m19576a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f25629a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f25630b = arrayList;
        } else {
            f25630b = new ArrayList();
        }
        f25631c = new zzdkx<>(new zzdkz());
        f25632d = new zzdkx<>(new zzdld());
        f25633e = new zzdkx<>(new zzdlf());
        f25634f = new zzdkx<>(new zzdle());
        f25635g = new zzdkx<>(new zzdla());
        f25636h = new zzdkx<>(new zzdlc());
        f25637i = new zzdkx<>(new zzdlb());
    }

    private zzdkx(T_WRAPPER t_wrapper) {
        this.f25638j = t_wrapper;
    }

    /* renamed from: a */
    private final boolean m19568a(String str, Provider provider) {
        try {
            this.f25638j.mo19570a(str, provider);
            return true;
        } catch (Exception e2) {
            zzdmb.m19582d(e2);
            return false;
        }
    }

    /* renamed from: b */
    public final T_ENGINE m19569b(String str) throws GeneralSecurityException {
        for (Provider provider : this.f25639k) {
            if (m19568a(str, provider)) {
                return (T_ENGINE) this.f25638j.mo19570a(str, provider);
            }
        }
        if (this.f25640l) {
            return (T_ENGINE) this.f25638j.mo19570a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
