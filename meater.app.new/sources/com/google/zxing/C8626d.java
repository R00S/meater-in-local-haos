package com.google.zxing;

import com.google.zxing.p220f.C8628a;
import com.google.zxing.p222g.C8637b;
import com.google.zxing.p223h.C8639a;
import com.google.zxing.p225i.C8655b;
import com.google.zxing.p225i.C8657d;
import com.google.zxing.p225i.C8659f;
import com.google.zxing.p225i.C8661h;
import com.google.zxing.p225i.C8663j;
import com.google.zxing.p225i.C8664k;
import com.google.zxing.p225i.C8665l;
import com.google.zxing.p225i.C8668o;
import com.google.zxing.p225i.C8672s;
import com.google.zxing.p226j.C8673a;
import com.google.zxing.p228k.C8681a;
import java.util.Map;

/* compiled from: MultiFormatWriter.java */
/* renamed from: com.google.zxing.d */
/* loaded from: classes2.dex */
public final class C8626d implements InterfaceC8627e {

    /* compiled from: MultiFormatWriter.java */
    /* renamed from: com.google.zxing.d$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32769a;

        static {
            int[] iArr = new int[EnumC8620a.values().length];
            f32769a = iArr;
            try {
                iArr[EnumC8620a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32769a[EnumC8620a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32769a[EnumC8620a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32769a[EnumC8620a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32769a[EnumC8620a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32769a[EnumC8620a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32769a[EnumC8620a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32769a[EnumC8620a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32769a[EnumC8620a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32769a[EnumC8620a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32769a[EnumC8620a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32769a[EnumC8620a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32769a[EnumC8620a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        InterfaceC8627e c8664k;
        switch (a.f32769a[enumC8620a.ordinal()]) {
            case 1:
                c8664k = new C8664k();
                break;
            case 2:
                c8664k = new C8672s();
                break;
            case 3:
                c8664k = new C8663j();
                break;
            case 4:
                c8664k = new C8668o();
                break;
            case 5:
                c8664k = new C8681a();
                break;
            case 6:
                c8664k = new C8659f();
                break;
            case 7:
                c8664k = new C8661h();
                break;
            case 8:
                c8664k = new C8657d();
                break;
            case 9:
                c8664k = new C8665l();
                break;
            case 10:
                c8664k = new C8673a();
                break;
            case 11:
                c8664k = new C8655b();
                break;
            case 12:
                c8664k = new C8639a();
                break;
            case 13:
                c8664k = new C8628a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC8620a)));
        }
        return c8664k.mo27243a(str, enumC8620a, i2, i3, map);
    }
}
