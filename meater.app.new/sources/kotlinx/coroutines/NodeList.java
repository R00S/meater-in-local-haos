package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", HttpUrl.FRAGMENT_ENCODE_SET, "state", "toString", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.j2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    /* renamed from: G */
    public final String m39615G(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM39558r = (LockFreeLinkedListNode) m39557q(); !C9801m.m32341a(lockFreeLinkedListNodeM39558r, this); lockFreeLinkedListNodeM39558r = lockFreeLinkedListNodeM39558r.m39558r()) {
            if (lockFreeLinkedListNodeM39558r instanceof JobNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNodeM39558r;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(jobNode);
            }
        }
        sb.append("]");
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: b */
    public boolean mo39305b() {
        return true;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: e */
    public NodeList mo39306e() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return C11045s0.m39683c() ? m39615G("Active") : super.toString();
    }
}
