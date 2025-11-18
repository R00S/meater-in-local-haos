package kotlinx.coroutines.android;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: HandlerDispatcher.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, m32267d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.android.b, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    private HandlerDispatcher() {
    }

    public /* synthetic */ HandlerDispatcher(C9789g c9789g) {
        this();
    }
}
