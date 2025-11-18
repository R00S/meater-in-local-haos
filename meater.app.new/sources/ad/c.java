package ad;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u001d\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"Lad/c;", "", "Lad/b;", "level", "<init>", "(Lad/b;)V", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Loa/F;", "b", "(Lad/b;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)V", "e", "g", "c", "lvl", "f", "Lad/b;", "d", "()Lad/b;", "setLevel", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b level;

    public c(b level) {
        C3862t.g(level, "level");
        this.level = level;
    }

    public final void a(String msg) {
        C3862t.g(msg, "msg");
        f(b.f20456B, msg);
    }

    public abstract void b(b level, String msg);

    public final void c(String msg) {
        C3862t.g(msg, "msg");
        f(b.f20459E, msg);
    }

    /* renamed from: d, reason: from getter */
    public final b getLevel() {
        return this.level;
    }

    public final void e(String msg) {
        C3862t.g(msg, "msg");
        f(b.f20457C, msg);
    }

    public final void f(b lvl, String msg) {
        C3862t.g(lvl, "lvl");
        C3862t.g(msg, "msg");
        if (getLevel().compareTo(lvl) <= 0) {
            b(lvl, msg);
        }
    }

    public final void g(String msg) {
        C3862t.g(msg, "msg");
        f(b.f20458D, msg);
    }
}
