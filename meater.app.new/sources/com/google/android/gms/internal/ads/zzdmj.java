package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdmj;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzdmj<MessageType extends zzdmi<MessageType, BuilderType>, BuilderType extends zzdmj<MessageType, BuilderType>> implements zzdpl {
    @Override // com.google.android.gms.internal.ads.zzdpl
    /* renamed from: M0 */
    public final /* synthetic */ zzdpl mo19589M0(zzdpk zzdpkVar) {
        if (mo19727f().getClass().isInstance(zzdpkVar)) {
            return mo19590j((zzdmi) zzdpkVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: j */
    protected abstract BuilderType mo19590j(MessageType messagetype);

    /* renamed from: k */
    public abstract BuilderType mo19591k(zzdnd zzdndVar, zzdno zzdnoVar) throws IOException;

    /* renamed from: l */
    public BuilderType mo19592l(byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
        try {
            zzdnd zzdndVarM19607v = zzdnd.m19607v(bArr, 0, i3, false);
            mo19591k(zzdndVarM19607v, zzdnoVar);
            zzdndVarM19607v.mo15781x(0);
            return this;
        } catch (zzdok e2) {
            throw e2;
        } catch (IOException e3) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e3);
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
