package com.facebook.p157o0.p166r0;

import android.text.TextUtils;
import com.facebook.C5641a0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C10801m;
import kotlin.jvm.internal.C9801m;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils.kt */
/* renamed from: com.facebook.o0.r0.j */
/* loaded from: classes2.dex */
public final class C5921j {

    /* renamed from: a */
    public static final C5921j f15450a = new C5921j();

    private C5921j() {
    }

    /* renamed from: a */
    public static final File m12736a() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        File file = new File(C5641a0.m11284c().getFilesDir(), "facebook_ml/");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: c */
    public static final Map<String, C5917f> m12737c(File file) throws JSONException, IOException {
        C9801m.m32346f(file, "file");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable < 4) {
                return null;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = byteBufferWrap.getInt();
            int i3 = i2 + 4;
            if (iAvailable < i3) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, Charsets.f40651b));
            JSONArray jSONArrayNames = jSONObject.names();
            int length = jSONArrayNames.length();
            String[] strArr = new String[length];
            int i4 = length - 1;
            if (i4 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    strArr[i5] = jSONArrayNames.getString(i5);
                    if (i6 > i4) {
                        break;
                    }
                    i5 = i6;
                }
            }
            C10801m.m38714o(strArr);
            HashMap map = new HashMap();
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                if (str != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    int i8 = length2 - 1;
                    int i9 = 1;
                    if (i8 >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            iArr[i10] = jSONArray.getInt(i10);
                            i9 *= iArr[i10];
                            if (i11 > i8) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    int i12 = i9 * 4;
                    int i13 = i3 + i12;
                    if (i13 > iAvailable) {
                        return null;
                    }
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i3, i12);
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    C5917f c5917f = new C5917f(iArr);
                    byteBufferWrap2.asFloatBuffer().get(c5917f.m12673a(), 0, i9);
                    map.put(str, c5917f);
                    i3 = i13;
                }
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String m12738b(String str) {
        C9801m.m32346f(str, "str");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = C9801m.m32348h(str.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        Object[] array = new Regex("\\s+").m37440d(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String strJoin = TextUtils.join(" ", (String[]) array);
        C9801m.m32345e(strJoin, "join(\" \", strArray)");
        return strJoin;
    }

    /* renamed from: d */
    public final int[] m12739d(String str, int i2) {
        C9801m.m32346f(str, "texts");
        int[] iArr = new int[i2];
        String strM12738b = m12738b(str);
        Charset charsetForName = Charset.forName("UTF-8");
        C9801m.m32345e(charsetForName, "forName(\"UTF-8\")");
        if (strM12738b == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = strM12738b.getBytes(charsetForName);
        C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 < bytes.length) {
                    iArr[i3] = bytes[i3] & 255;
                } else {
                    iArr[i3] = 0;
                }
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return iArr;
    }
}
