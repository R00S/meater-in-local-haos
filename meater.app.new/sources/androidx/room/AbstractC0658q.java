package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: SharedSQLiteStatement.java */
/* renamed from: androidx.room.q */
/* loaded from: classes.dex */
public abstract class AbstractC0658q {
    private final AbstractC0651j mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile InterfaceC1012f mStmt;

    public AbstractC0658q(AbstractC0651j abstractC0651j) {
        this.mDatabase = abstractC0651j;
    }

    private InterfaceC1012f createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private InterfaceC1012f getStmt(boolean z) {
        if (!z) {
            return createNewStatement();
        }
        if (this.mStmt == null) {
            this.mStmt = createNewStatement();
        }
        return this.mStmt;
    }

    public InterfaceC1012f acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(InterfaceC1012f interfaceC1012f) {
        if (interfaceC1012f == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
