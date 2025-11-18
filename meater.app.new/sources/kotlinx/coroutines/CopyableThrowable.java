package kotlinx.coroutines;

import java.lang.Throwable;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;
import okhttp3.HttpUrl;

/* compiled from: Debug.common.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"Lkotlinx/coroutines/CopyableThrowable;", "T", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "createCopy", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.g0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public interface CopyableThrowable<T extends Throwable & CopyableThrowable<T>> {
    /* renamed from: a */
    T mo39074a();
}
