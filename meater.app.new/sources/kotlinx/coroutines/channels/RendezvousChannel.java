package kotlinx.coroutines.channels;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* compiled from: RendezvousChannel.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/channels/RendezvousChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.channels.o, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class RendezvousChannel<E> extends AbstractChannel<E> {
    public RendezvousChannel(Function1<? super E, C10775u> function1) {
        super(function1);
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: v */
    protected final boolean mo39212v() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: w */
    protected final boolean mo39213w() {
        return true;
    }
}
