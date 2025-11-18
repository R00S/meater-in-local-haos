package kotlinx.coroutines.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m32266d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00020\u0001H\u0001\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u001c\u0010\t\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\u0016\u0010\f\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u0016\u0010\u000e\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003*\n\u0010\u0013\"\u00020\u00142\u00020\u0014*\u001c\u0010\u0015\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u0002H\u00160\u00172\b\u0012\u0004\u0012\u0002H\u00160\u0017*\f\b\u0002\u0010\u0018\"\u00020\u00112\u00020\u0011*\n\u0010\u0019\"\u00020\u001a2\u00020\u001a*\u001c\u0010\u001b\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u0002H\u00160\u001c2\b\u0012\u0004\u0012\u0002H\u00160\u001c¨\u0006\u001d"}, m32267d2 = {"CONDITION_FALSE", HttpUrl.FRAGMENT_ENCODE_SET, "getCONDITION_FALSE$annotations", "()V", "getCONDITION_FALSE", "()Ljava/lang/Object;", "FAILURE", HttpUrl.FRAGMENT_ENCODE_SET, "getFAILURE$annotations", "LIST_EMPTY", "getLIST_EMPTY$annotations", "getLIST_EMPTY", "SUCCESS", "getSUCCESS$annotations", "UNDECIDED", "getUNDECIDED$annotations", "unwrap", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "AbstractAtomicDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "AddLastDesc", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Node", "PrepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "RemoveFirstDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.q */
/* loaded from: classes3.dex */
public final class C10998q {

    /* renamed from: a */
    private static final Object f41813a = new Symbol("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f41814b = new Symbol("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m39544a() {
        return f41813a;
    }

    /* renamed from: b */
    public static final LockFreeLinkedListNode m39545b(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        return (removed == null || (lockFreeLinkedListNode = removed.f41764a) == null) ? (LockFreeLinkedListNode) obj : lockFreeLinkedListNode;
    }
}
