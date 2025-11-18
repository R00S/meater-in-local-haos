package kotlin.collections;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: AbstractIterator.kt */
@Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/collections/State;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.y0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
enum State {
    Ready,
    NotReady,
    Done,
    Failed
}
