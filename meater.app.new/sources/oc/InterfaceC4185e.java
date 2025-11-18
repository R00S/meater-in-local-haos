package oc;

import kotlin.Metadata;

/* compiled from: Call.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Loc/e;", "", "Loc/B;", "request", "()Loc/B;", "Loc/D;", "execute", "()Loc/D;", "Loc/f;", "responseCallback", "Loa/F;", "v0", "(Loc/f;)V", "cancel", "()V", "", "isCanceled", "()Z", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4185e extends Cloneable {

    /* compiled from: Call.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loc/e$a;", "", "Loc/B;", "request", "Loc/e;", "b", "(Loc/B;)Loc/e;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.e$a */
    public interface a {
        InterfaceC4185e b(C4178B request);
    }

    void cancel();

    C4180D execute();

    boolean isCanceled();

    C4178B request();

    void v0(InterfaceC4186f responseCallback);
}
