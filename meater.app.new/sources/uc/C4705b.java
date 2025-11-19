package uc;

import kotlin.Metadata;
import oc.w;

/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Luc/b;", "Loc/w;", "", "forWebSocket", "<init>", "(Z)V", "", "code", "b", "(I)Z", "Loc/w$a;", "chain", "Loc/D;", "a", "(Loc/w$a;)Loc/D;", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: uc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4705b implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    public C4705b(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean b(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:46:0x00e5, B:48:0x00ee, B:49:0x00f1, B:50:0x0115, B:54:0x0120, B:56:0x013f, B:58:0x014d, B:65:0x0163, B:67:0x0169, B:71:0x0176, B:73:0x0190, B:74:0x0198, B:75:0x01a2, B:60:0x0158, B:55:0x012f), top: B:87:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // oc.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oc.C4180D a(oc.w.a r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.C4705b.a(oc.w$a):oc.D");
    }
}
