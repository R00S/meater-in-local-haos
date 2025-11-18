package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: SharedSQLiteStatement.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Landroidx/room/F;", "", "Landroidx/room/w;", "database", "<init>", "(Landroidx/room/w;)V", "Lu3/k;", "d", "()Lu3/k;", "", "canUseCached", "g", "(Z)Lu3/k;", "", "e", "()Ljava/lang/String;", "Loa/F;", "c", "()V", "b", "statement", "h", "(Lu3/k;)V", "a", "Landroidx/room/w;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Loa/i;", "f", "stmt", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean lock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i stmt;

    /* compiled from: SharedSQLiteStatement.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu3/k;", "a", "()Lu3/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<u3.k> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u3.k invoke() {
            return F.this.d();
        }
    }

    public F(w database) {
        C3862t.g(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt = C4165j.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u3.k d() {
        return this.database.compileStatement(e());
    }

    private final u3.k f() {
        return (u3.k) this.stmt.getValue();
    }

    private final u3.k g(boolean canUseCached) {
        return canUseCached ? f() : d();
    }

    public u3.k b() {
        c();
        return g(this.lock.compareAndSet(false, true));
    }

    protected void c() {
        this.database.assertNotMainThread();
    }

    protected abstract String e();

    public void h(u3.k statement) {
        C3862t.g(statement, "statement");
        if (statement == f()) {
            this.lock.set(false);
        }
    }
}
