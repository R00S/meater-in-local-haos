package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdn;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzdn<MessageType extends zzdl<MessageType, BuilderType>, BuilderType extends zzdn<MessageType, BuilderType>> implements zzgn {
    /* renamed from: n */
    private final String m22140n(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    /* renamed from: X0 */
    public final /* synthetic */ zzgn mo22141X0(zzgo zzgoVar) {
        if (mo22268d().getClass().isInstance(zzgoVar)) {
            return mo22144j((zzdl) zzgoVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    /* renamed from: Y */
    public final /* synthetic */ zzgn mo22142Y(byte[] bArr, zzeq zzeqVar) throws zzfo {
        return mo22147m(bArr, 0, bArr.length, zzeqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    /* renamed from: i0 */
    public final /* synthetic */ zzgn mo22143i0(byte[] bArr) throws zzfo {
        return mo22146l(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    protected abstract BuilderType mo22144j(MessageType messagetype);

    /* renamed from: k */
    public abstract BuilderType mo22145k(zzeg zzegVar, zzeq zzeqVar) throws IOException;

    /* renamed from: l */
    public BuilderType mo22146l(byte[] bArr, int i2, int i3) throws zzfo {
        try {
            zzeg zzegVarM22160c = zzeg.m22160c(bArr, 0, i3, false);
            mo22145k(zzegVarM22160c, zzeq.m22245a());
            zzegVarM22160c.mo21453d(0);
            return this;
        } catch (zzfo e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(m22140n("byte array"), e3);
        }
    }

    /* renamed from: m */
    public BuilderType mo22147m(byte[] bArr, int i2, int i3, zzeq zzeqVar) throws zzfo {
        try {
            zzeg zzegVarM22160c = zzeg.m22160c(bArr, 0, i3, false);
            mo22145k(zzegVarM22160c, zzeqVar);
            zzegVarM22160c.mo21453d(0);
            return this;
        } catch (zzfo e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(m22140n("byte array"), e3);
        }
    }

    @Override // 
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
