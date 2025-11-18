package p353j;

import kotlin.jvm.internal.C9801m;
import kotlin.text.Charsets;

/* compiled from: -Platform.kt */
/* renamed from: j.b */
/* loaded from: classes3.dex */
public final class C9695b {
    /* renamed from: a */
    public static final byte[] m31979a(String str) {
        C9801m.m32346f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(Charsets.f40651b);
        C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m31980b(byte[] bArr) {
        C9801m.m32346f(bArr, "$this$toUtf8String");
        return new String(bArr, Charsets.f40651b);
    }
}
