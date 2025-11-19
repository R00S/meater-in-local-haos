package ka;

import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SimpleMessageLogger.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u001d"}, d2 = {"Lka/b;", "Lka/a;", "", "tag", "", "showDebug", "<init>", "(Ljava/lang/String;Z)V", "message", "Loa/F;", "a", "(Ljava/lang/String;)V", "Lja/a;", "state", "b", "(Lja/a;)V", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "c", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Z", "getShowDebug", "()Z", "threadTag", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ka.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3814b implements InterfaceC3813a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean showDebug;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String threadTag;

    public C3814b(String tag, boolean z10) {
        String string;
        C3862t.g(tag, "tag");
        this.tag = tag;
        this.showDebug = z10;
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            sb2.append((Object) Thread.currentThread().getName());
            sb2.append(']');
            string = sb2.toString();
        } else {
            string = "";
        }
        this.threadTag = string;
    }

    @Override // ka.InterfaceC3813a
    public void a(String message) {
        C3862t.g(message, "message");
        if (this.showDebug) {
            System.out.println((Object) (this.tag + this.threadTag + " - " + message));
        }
    }

    @Override // ka.InterfaceC3813a
    public void b(C3756a state) {
        C3862t.g(state, "state");
        System.out.println((Object) (this.tag + this.threadTag + " [STATE] - " + state));
    }

    @Override // ka.InterfaceC3813a
    public void c(String errorMessage, Exception error) {
        String strN;
        C3862t.g(errorMessage, "errorMessage");
        String str = "";
        if (error != null && (strN = C3862t.n(":: ", error)) != null) {
            str = strN;
        }
        System.err.println(this.tag + this.threadTag + " !ERROR! - " + errorMessage + ' ' + str);
    }

    public /* synthetic */ C3814b(String str, boolean z10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? "[UniFlow]" : str, (i10 & 2) != 0 ? false : z10);
    }
}
