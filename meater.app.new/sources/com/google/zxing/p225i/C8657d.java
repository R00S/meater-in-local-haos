package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Code128Writer.java */
/* renamed from: com.google.zxing.i.d */
/* loaded from: classes2.dex */
public final class C8657d extends AbstractC8667n {

    /* compiled from: Code128Writer.java */
    /* renamed from: com.google.zxing.i.d$a */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: f */
    private static int m27381f(CharSequence charSequence, int i2, int i3) {
        a aVarM27382g;
        a aVarM27382g2;
        char cCharAt;
        a aVarM27382g3 = m27382g(charSequence, i2);
        a aVar = a.ONE_DIGIT;
        if (aVarM27382g3 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (aVarM27382g3 == aVar2) {
            return (i2 >= charSequence.length() || ((cCharAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i3 == 99) {
            return 99;
        }
        if (i3 != 100) {
            if (aVarM27382g3 == a.FNC_1) {
                aVarM27382g3 = m27382g(charSequence, i2 + 1);
            }
            return aVarM27382g3 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (aVarM27382g3 == aVar3 || (aVarM27382g = m27382g(charSequence, i2 + 2)) == aVar2 || aVarM27382g == aVar) {
            return 100;
        }
        if (aVarM27382g == aVar3) {
            return m27382g(charSequence, i2 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i4 = i2 + 4;
        while (true) {
            aVarM27382g2 = m27382g(charSequence, i4);
            if (aVarM27382g2 != a.TWO_DIGITS) {
                break;
            }
            i4 += 2;
        }
        return aVarM27382g2 == a.ONE_DIGIT ? 100 : 99;
    }

    /* renamed from: g */
    private static a m27382g(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i3 = i2 + 1;
        if (i3 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i3);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.google.zxing.p225i.AbstractC8667n, com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        if (enumC8620a == EnumC8620a.CODE_128) {
            return super.mo27243a(str, enumC8620a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(enumC8620a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8667n
    /* renamed from: c */
    public boolean[] mo27380c(String str) throws NumberFormatException {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iM27388b = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 >= length) {
                int[][] iArr = C8656c.f32869a;
                arrayList.add(iArr[i4 % 103]);
                arrayList.add(iArr[106]);
                int i8 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i9 : iArr2) {
                        i8 += i9;
                    }
                }
                boolean[] zArr = new boolean[i8];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iM27388b += AbstractC8667n.m27388b(zArr, iM27388b, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iM27381f = m27381f(str, i3, i5);
            int iCharAt = 100;
            if (iM27381f == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        if (i5 == 101) {
                            iCharAt = 101;
                            break;
                        }
                        break;
                    default:
                        if (i5 != 100) {
                            if (i5 != 101) {
                                iCharAt = Integer.parseInt(str.substring(i3, i3 + 2));
                                i3++;
                                break;
                            } else {
                                iCharAt = str.charAt(i3) - ' ';
                                if (iCharAt < 0) {
                                    iCharAt += 96;
                                    break;
                                }
                            }
                        } else {
                            iCharAt = str.charAt(i3) - ' ';
                            break;
                        }
                        break;
                }
                i3++;
            } else {
                if (i5 != 0) {
                    i7 = iM27381f;
                } else if (iM27381f == 100) {
                    i7 = 104;
                } else if (iM27381f != 101) {
                    i7 = 105;
                }
                iCharAt = i7;
                i5 = iM27381f;
            }
            arrayList.add(C8656c.f32869a[iCharAt]);
            i4 += iCharAt * i6;
            if (i3 != 0) {
                i6++;
            }
        }
    }
}
