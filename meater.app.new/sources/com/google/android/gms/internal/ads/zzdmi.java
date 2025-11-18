package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdmj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzdmi<MessageType extends zzdmi<MessageType, BuilderType>, BuilderType extends zzdmj<MessageType, BuilderType>> implements zzdpk {
    private static boolean zzhcg = false;
    protected int zzhcf = 0;

    /* renamed from: a */
    protected static <T> void m19584a(Iterable<T> iterable, List<? super T> list) {
        zzdod.m19740a(iterable);
        if (iterable instanceof zzdot) {
            List<?> listMo19768m = ((zzdot) iterable).mo19768m();
            zzdot zzdotVar = (zzdot) list;
            int size = list.size();
            for (Object obj : listMo19768m) {
                if (obj == null) {
                    int size2 = zzdotVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = zzdotVar.size() - 1; size3 >= size; size3--) {
                        zzdotVar.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof zzdmr) {
                    zzdotVar.mo19769q0((zzdmr) obj);
                } else {
                    zzdotVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC6688fw) {
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

    /* renamed from: c */
    int mo19585c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    /* renamed from: e */
    public final zzdmr mo19586e() {
        try {
            C6834ju c6834juM19600x = zzdmr.m19600x(mo19729i());
            mo19728h(c6834juM19600x.m15373b());
            return c6834juM19600x.m15372a();
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

    @Override // com.google.android.gms.internal.ads.zzdpk
    /* renamed from: g */
    public final byte[] mo19587g() {
        try {
            byte[] bArr = new byte[mo19729i()];
            zzdni zzdniVarM19642n = zzdni.m19642n(bArr);
            mo19728h(zzdniVarM19642n);
            zzdniVarM19642n.m19693v();
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

    /* renamed from: j */
    void mo19588j(int i2) {
        throw new UnsupportedOperationException();
    }
}
