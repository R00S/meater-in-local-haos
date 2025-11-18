package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: SchemaManager.java */
/* renamed from: e.e.b.a.i.b0.j.t0 */
/* loaded from: classes2.dex */
final class C8845t0 extends SQLiteOpenHelper {

    /* renamed from: f */
    private static final String f33535f = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: g */
    static int f33536g = 5;

    /* renamed from: h */
    private static final a f33537h;

    /* renamed from: i */
    private static final a f33538i;

    /* renamed from: j */
    private static final a f33539j;

    /* renamed from: k */
    private static final a f33540k;

    /* renamed from: l */
    private static final a f33541l;

    /* renamed from: m */
    private static final List<a> f33542m;

    /* renamed from: n */
    private final int f33543n;

    /* renamed from: o */
    private boolean f33544o;

    /* compiled from: SchemaManager.java */
    /* renamed from: e.e.b.a.i.b0.j.t0$a */
    public interface a {
        /* renamed from: a */
        void mo27975a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C8811c0 c8811c0 = new a() { // from class: e.e.b.a.i.b0.j.c0
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8845t0.a
            /* renamed from: a */
            public final void mo27975a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                C8845t0.m28086b(sQLiteDatabase);
            }
        };
        f33537h = c8811c0;
        C8852z c8852z = new a() { // from class: e.e.b.a.i.b0.j.z
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8845t0.a
            /* renamed from: a */
            public final void mo27975a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                C8845t0.m28087c(sQLiteDatabase);
            }
        };
        f33538i = c8852z;
        C8807a0 c8807a0 = new a() { // from class: e.e.b.a.i.b0.j.a0
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8845t0.a
            /* renamed from: a */
            public final void mo27975a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f33539j = c8807a0;
        C8809b0 c8809b0 = new a() { // from class: e.e.b.a.i.b0.j.b0
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8845t0.a
            /* renamed from: a */
            public final void mo27975a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                C8845t0.m28089e(sQLiteDatabase);
            }
        };
        f33540k = c8809b0;
        C8813d0 c8813d0 = new a() { // from class: e.e.b.a.i.b0.j.d0
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8845t0.a
            /* renamed from: a */
            public final void mo27975a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                C8845t0.m28090f(sQLiteDatabase);
            }
        };
        f33541l = c8813d0;
        f33542m = Arrays.asList(c8811c0, c8852z, c8807a0, c8809b0, c8813d0);
    }

    @Inject
    C8845t0(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f33544o = false;
        this.f33543n = i2;
    }

    /* renamed from: a */
    private void m28085a(SQLiteDatabase sQLiteDatabase) {
        if (this.f33544o) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* renamed from: b */
    static /* synthetic */ void m28086b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: c */
    static /* synthetic */ void m28087c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: e */
    static /* synthetic */ void m28089e(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: f */
    static /* synthetic */ void m28090f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f33535f);
    }

    /* renamed from: j */
    private void m28091j(SQLiteDatabase sQLiteDatabase, int i2) {
        m28085a(sQLiteDatabase);
        m28092k(sQLiteDatabase, 0, i2);
    }

    /* renamed from: k */
    private void m28092k(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = f33542m;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                f33542m.get(i2).mo27975a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f33544o = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m28091j(sQLiteDatabase, this.f33543n);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m28091j(sQLiteDatabase, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m28085a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        m28085a(sQLiteDatabase);
        m28092k(sQLiteDatabase, i2, i3);
    }
}
