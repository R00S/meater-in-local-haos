package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzdl<MessageType extends zzdl<MessageType, BuilderType>, BuilderType extends zzdn<MessageType, BuilderType>> implements zzgo {
    protected int zza = 0;

    /* renamed from: c */
    protected static <T> void m22134c(Iterable<T> iterable, List<? super T> list) {
        zzff.m22289d(iterable);
        if (iterable instanceof zzfv) {
            List<?> listMo22310b = ((zzfv) iterable).mo22310b();
            zzfv zzfvVar = (zzfv) list;
            int size = list.size();
            for (Object obj : listMo22310b) {
                if (obj == null) {
                    int size2 = zzfvVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = zzfvVar.size() - 1; size3 >= size; size3--) {
                        zzfvVar.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof zzdu) {
                    zzfvVar.mo22312n1((zzdu) obj);
                } else {
                    zzfvVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC7549m3) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(t);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    /* renamed from: h */
    public final zzdu mo22135h() {
        try {
            C7589t1 c7589t1M22155x = zzdu.m22155x(mo22272i());
            mo22271g(c7589t1M22155x.m21405b());
            return c7589t1M22155x.m21404a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: j */
    public final byte[] m22136j() {
        try {
            byte[] bArr = new byte[mo22272i()];
            zzen zzenVarM22190f = zzen.m22190f(bArr);
            mo22271g(zzenVarM22190f);
            zzenVarM22190f.m22211N();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: k */
    int mo22137k() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    void mo22138l(int i2) {
        throw new UnsupportedOperationException();
    }
}
