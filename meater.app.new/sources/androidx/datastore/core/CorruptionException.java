package androidx.datastore.core;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Serializer.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"Landroidx/datastore/core/CorruptionException;", "Ljava/io/IOException;", HttpUrl.FRAGMENT_ENCODE_SET, "message", HttpUrl.FRAGMENT_ENCODE_SET, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "datastore-core"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i2, C9789g c9789g) {
        this(str, (i2 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String str, Throwable th) {
        super(str, th);
        C9801m.m32346f(str, "message");
    }
}
