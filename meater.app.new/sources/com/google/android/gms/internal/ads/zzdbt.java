package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdpk;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzdbt<P, KeyProto extends zzdpk, KeyFormatProto extends zzdpk> implements zzdbs<P> {

    /* renamed from: a */
    private final Class<P> f25459a;

    /* renamed from: b */
    private final Class<KeyProto> f25460b;

    /* renamed from: c */
    private final Class<KeyFormatProto> f25461c;

    /* renamed from: d */
    private final String f25462d;

    protected zzdbt(Class<P> cls, Class<KeyProto> cls2, Class<KeyFormatProto> cls3, String str) {
        this.f25459a = cls;
        this.f25460b = cls2;
        this.f25461c = cls3;
        this.f25462d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private static <Casted> Casted m19185h(Object obj, String str, Class<Casted> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: m */
    private final P m19186m(KeyProto keyproto) throws GeneralSecurityException {
        mo15144j(keyproto);
        return mo15146l(keyproto);
    }

    /* renamed from: o */
    private final KeyProto m19187o(KeyFormatProto keyformatproto) throws GeneralSecurityException {
        mo15145k(keyformatproto);
        KeyProto keyproto = (KeyProto) mo15147n(keyformatproto);
        mo15144j(keyproto);
        return keyproto;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: a */
    public final Class<P> mo19178a() {
        return this.f25459a;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: b */
    public final String mo19179b() {
        return this.f25462d;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: c */
    public final zzdpk mo19180c(zzdpk zzdpkVar) throws GeneralSecurityException {
        String name = this.f25461c.getName();
        return m19187o((zzdpk) m19185h(zzdpkVar, name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type "), this.f25461c));
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: d */
    public final P mo19181d(zzdpk zzdpkVar) throws GeneralSecurityException {
        String name = this.f25460b.getName();
        return m19186m((zzdpk) m19185h(zzdpkVar, name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type "), this.f25460b));
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: e */
    public final zzdgr mo19182e(zzdmr zzdmrVar) throws GeneralSecurityException {
        try {
            return (zzdgr) ((zzdob) zzdgr.m19408E().m19421w(this.f25462d).m19420v(m19187o(mo15149q(zzdmrVar)).mo19586e()).m19419u(mo15143i()).mo19736p0());
        } catch (zzdok e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: f */
    public final zzdpk mo19183f(zzdmr zzdmrVar) throws GeneralSecurityException {
        try {
            return m19187o(mo15149q(zzdmrVar));
        } catch (zzdok e2) {
            String name = this.f25461c.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: g */
    public final P mo19184g(zzdmr zzdmrVar) throws GeneralSecurityException {
        try {
            return m19186m(mo15148p(zzdmrVar));
        } catch (zzdok e2) {
            String name = this.f25460b.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    /* renamed from: i */
    protected abstract zzdgr.zzb mo15143i();

    /* renamed from: j */
    protected abstract void mo15144j(KeyProto keyproto) throws GeneralSecurityException;

    /* renamed from: k */
    protected abstract void mo15145k(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    /* renamed from: l */
    protected abstract P mo15146l(KeyProto keyproto) throws GeneralSecurityException;

    /* renamed from: n */
    protected abstract KeyProto mo15147n(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    /* renamed from: p */
    protected abstract KeyProto mo15148p(zzdmr zzdmrVar) throws zzdok;

    /* renamed from: q */
    protected abstract KeyFormatProto mo15149q(zzdmr zzdmrVar) throws zzdok;
}
