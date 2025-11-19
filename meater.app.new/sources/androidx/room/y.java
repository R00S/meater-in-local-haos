package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;
import r3.AbstractC4343a;
import u3.C4663a;
import u3.InterfaceC4669g;
import u3.InterfaceC4670h;
import za.C5220a;

/* compiled from: RoomOpenHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0003\u001f\u0012\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/y;", "Lu3/h$a;", "Landroidx/room/h;", "configuration", "Landroidx/room/y$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/h;Landroidx/room/y$b;Ljava/lang/String;Ljava/lang/String;)V", "Lu3/g;", "db", "Loa/F;", "h", "(Lu3/g;)V", "j", "i", "b", "d", "", "oldVersion", "newVersion", "g", "(Lu3/g;II)V", "e", "f", "c", "Landroidx/room/h;", "Landroidx/room/y$b;", "Ljava/lang/String;", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class y extends InterfaceC4670h.a {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C2178h configuration;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b delegate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String identityHash;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String legacyHash;

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/room/y$a;", "", "<init>", "()V", "Lu3/g;", "db", "", "b", "(Lu3/g;)Z", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final boolean a(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
            Cursor cursorD0 = db2.D0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorD0.moveToFirst()) {
                    if (cursorD0.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                C5220a.a(cursorD0, null);
                return z10;
            } finally {
            }
        }

        public final boolean b(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
            Cursor cursorD0 = db2.D0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorD0.moveToFirst()) {
                    if (cursorD0.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                C5220a.a(cursorD0, null);
                return z10;
            } finally {
            }
        }

        private Companion() {
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/y$b;", "", "", "version", "<init>", "(I)V", "Lu3/g;", "db", "Loa/F;", "dropAllTables", "(Lu3/g;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/y$c;", "onValidateSchema", "(Lu3/g;)Landroidx/room/y$c;", "onPreMigrate", "onPostMigrate", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(InterfaceC4669g db2);

        public abstract void dropAllTables(InterfaceC4669g db2);

        public abstract void onCreate(InterfaceC4669g db2);

        public abstract void onOpen(InterfaceC4669g db2);

        public void onPostMigrate(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }

        public void onPreMigrate(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
        }

        public c onValidateSchema(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
            validateMigration(db2);
            return new c(true, null);
        }

        @InterfaceC4156a
        protected void validateMigration(InterfaceC4669g db2) {
            C3862t.g(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/y$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean isValid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String expectedFoundMsg;

        public c(boolean z10, String str) {
            this.isValid = z10;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C2178h configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        C3862t.g(configuration, "configuration");
        C3862t.g(delegate, "delegate");
        C3862t.g(identityHash, "identityHash");
        C3862t.g(legacyHash, "legacyHash");
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void h(InterfaceC4669g db2) {
        if (!INSTANCE.b(db2)) {
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (cVarOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                j(db2);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        Cursor cursorC1 = db2.c1(new C4663a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorC1.moveToFirst() ? cursorC1.getString(0) : null;
            C5220a.a(cursorC1, null);
            if (C3862t.b(this.identityHash, string) || C3862t.b(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5220a.a(cursorC1, th);
                throw th2;
            }
        }
    }

    private final void i(InterfaceC4669g db2) {
        db2.I("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(InterfaceC4669g db2) {
        i(db2);
        db2.I(x.a(this.identityHash));
    }

    @Override // u3.InterfaceC4670h.a
    public void b(InterfaceC4669g db2) {
        C3862t.g(db2, "db");
        super.b(db2);
    }

    @Override // u3.InterfaceC4670h.a
    public void d(InterfaceC4669g db2) {
        C3862t.g(db2, "db");
        boolean zA = INSTANCE.a(db2);
        this.delegate.createAllTables(db2);
        if (!zA) {
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (!cVarOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        j(db2);
        this.delegate.onCreate(db2);
    }

    @Override // u3.InterfaceC4670h.a
    public void e(InterfaceC4669g db2, int oldVersion, int newVersion) {
        C3862t.g(db2, "db");
        g(db2, oldVersion, newVersion);
    }

    @Override // u3.InterfaceC4670h.a
    public void f(InterfaceC4669g db2) {
        C3862t.g(db2, "db");
        super.f(db2);
        h(db2);
        this.delegate.onOpen(db2);
        this.configuration = null;
    }

    @Override // u3.InterfaceC4670h.a
    public void g(InterfaceC4669g db2, int oldVersion, int newVersion) {
        List<AbstractC4343a> listD;
        C3862t.g(db2, "db");
        C2178h c2178h = this.configuration;
        if (c2178h == null || (listD = c2178h.migrationContainer.d(oldVersion, newVersion)) == null) {
            C2178h c2178h2 = this.configuration;
            if (c2178h2 != null && !c2178h2.a(oldVersion, newVersion)) {
                this.delegate.dropAllTables(db2);
                this.delegate.createAllTables(db2);
                return;
            }
            throw new IllegalStateException("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.delegate.onPreMigrate(db2);
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            ((AbstractC4343a) it.next()).migrate(db2);
        }
        c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
        if (cVarOnValidateSchema.isValid) {
            this.delegate.onPostMigrate(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.expectedFoundMsg);
        }
    }
}
