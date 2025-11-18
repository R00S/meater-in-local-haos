package kotlinx.coroutines.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: SystemProps.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m32267d2 = {"AVAILABLE_PROCESSORS", HttpUrl.FRAGMENT_ENCODE_SET, "getAVAILABLE_PROCESSORS", "()I", "systemProp", HttpUrl.FRAGMENT_ENCODE_SET, "propertyName", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kotlinx.coroutines.internal.g0 */
/* loaded from: classes3.dex */
final /* synthetic */ class C10982g0 {

    /* renamed from: a */
    private static final int f41776a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m39473a() {
        return f41776a;
    }

    /* renamed from: b */
    public static final String m39474b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
