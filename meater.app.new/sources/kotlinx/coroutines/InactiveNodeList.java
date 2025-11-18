package kotlinx.coroutines;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m32267d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "(Lkotlinx/coroutines/NodeList;)V", "isActive", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "getList", "()Lkotlinx/coroutines/NodeList;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.s1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class InactiveNodeList implements Incomplete {

    /* renamed from: f */
    private final NodeList f41883f;

    public InactiveNodeList(NodeList nodeList) {
        this.f41883f = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: b */
    public boolean getF41754f() {
        return false;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: e, reason: from getter */
    public NodeList getF41883f() {
        return this.f41883f;
    }

    public String toString() {
        return C11045s0.m39683c() ? getF41883f().m39615G("New") : super.toString();
    }
}
