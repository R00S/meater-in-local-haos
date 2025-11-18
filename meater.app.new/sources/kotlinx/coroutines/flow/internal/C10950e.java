package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;

/* compiled from: FlowExceptions.common.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¨\u0006\b"}, m32267d2 = {"checkIndexOverflow", HttpUrl.FRAGMENT_ENCODE_SET, "index", "checkOwnership", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/flow/internal/AbortFlowException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.e */
/* loaded from: classes3.dex */
public final class C10950e {
    /* renamed from: a */
    public static final void m39389a(AbortFlowException abortFlowException, FlowCollector<?> flowCollector) {
        if (abortFlowException.f41719f != flowCollector) {
            throw abortFlowException;
        }
    }
}
