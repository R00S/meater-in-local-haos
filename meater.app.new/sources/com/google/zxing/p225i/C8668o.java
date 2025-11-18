package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.InterfaceC8627e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.Map;

/* compiled from: UPCAWriter.java */
/* renamed from: com.google.zxing.i.o */
/* loaded from: classes2.dex */
public final class C8668o implements InterfaceC8627e {

    /* renamed from: a */
    private final C8663j f32883a = new C8663j();

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        if (enumC8620a == EnumC8620a.UPC_A) {
            return this.f32883a.mo27243a("0".concat(String.valueOf(str)), EnumC8620a.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC8620a)));
    }
}
