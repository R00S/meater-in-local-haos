package kotlinx.coroutines.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\b\"\u000e\b\u0000\u0010\t\u0018\u0001*\u00060\u0001j\u0002`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\b0\fH\u0086\bJ\u0010\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0012"}, m32267d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "()V", "isEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isRemoved", "forEach", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlinx/coroutines/internal/Node;", "block", "Lkotlin/Function1;", "nextIfRemoved", "remove", HttpUrl.FRAGMENT_ENCODE_SET, "validate", "validate$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.p, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    /* renamed from: E */
    public final boolean m39540E() {
        return m39557q() == this;
    }

    /* renamed from: F */
    public final Void m39541F() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* renamed from: y */
    public boolean mo39542y() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* renamed from: z */
    public /* bridge */ /* synthetic */ boolean mo39543z() {
        return ((Boolean) m39541F()).booleanValue();
    }
}
