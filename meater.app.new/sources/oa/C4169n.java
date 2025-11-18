package oa;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Standard.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loa/n;", "Ljava/lang/Error;", "Lkotlin/Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4169n extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169n(String message) {
        super(message);
        C3862t.g(message, "message");
    }

    public /* synthetic */ C4169n(String str, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
