package kotlin.reflect.p371y.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: KotlinReflectionInternalError.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.y, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KotlinReflectionInternalError extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinReflectionInternalError(String str) {
        super(str);
        C9801m.m32346f(str, "message");
    }
}
