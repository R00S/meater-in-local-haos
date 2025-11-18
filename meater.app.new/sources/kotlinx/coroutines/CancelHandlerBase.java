package kotlinx.coroutines;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* compiled from: CompletionHandler.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦\u0002¨\u0006\n"}, m32267d2 = {"Lkotlinx/coroutines/CancelHandlerBase;", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ParameterName;", "name", "cause", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CompletionHandler;", "()V", "invoke", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.m, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class CancelHandlerBase implements Function1<Throwable, C10775u> {
    /* renamed from: b */
    public abstract void mo39222b(Throwable th);
}
