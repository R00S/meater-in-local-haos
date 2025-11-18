package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import android.os.Build;
import androidx.room.p009s.AbstractC0660a;
import androidx.work.impl.utils.C0784c;
import androidx.work.impl.utils.C0786e;
import p024c.p082u.p083a.InterfaceC1008b;

/* compiled from: WorkDatabaseMigrations.java */
/* renamed from: androidx.work.impl.h */
/* loaded from: classes.dex */
public class C0735h {

    /* renamed from: a */
    public static AbstractC0660a f4653a = new a(1, 2);

    /* renamed from: b */
    public static AbstractC0660a f4654b = new b(3, 4);

    /* renamed from: c */
    public static AbstractC0660a f4655c = new c(4, 5);

    /* renamed from: d */
    public static AbstractC0660a f4656d = new d(6, 7);

    /* renamed from: e */
    public static AbstractC0660a f4657e = new e(7, 8);

    /* renamed from: f */
    public static AbstractC0660a f4658f = new f(8, 9);

    /* renamed from: g */
    public static AbstractC0660a f4659g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$a */
    class a extends AbstractC0660a {
        a(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC1008b.mo6461v("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS alarmInfo");
            interfaceC1008b.mo6461v("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$b */
    class b extends AbstractC0660a {
        b(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            if (Build.VERSION.SDK_INT >= 23) {
                interfaceC1008b.mo6461v("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$c */
    class c extends AbstractC0660a {
        c(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC1008b.mo6461v("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$d */
    class d extends AbstractC0660a {
        d(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$e */
    class e extends AbstractC0660a {
        e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$f */
    class f extends AbstractC0660a {
        f(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$g */
    class g extends AbstractC0660a {
        g(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$h */
    public static class h extends AbstractC0660a {

        /* renamed from: a */
        final Context f4660a;

        public h(Context context, int i2, int i3) {
            super(i2, i3);
            this.f4660a = context;
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            if (this.endVersion >= 10) {
                interfaceC1008b.mo6457l0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f4660a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$i */
    public static class i extends AbstractC0660a {

        /* renamed from: a */
        final Context f4661a;

        public i(Context context) {
            super(9, 10);
            this.f4661a = context;
        }

        @Override // androidx.room.p009s.AbstractC0660a
        public void migrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C0786e.m5163b(this.f4661a, interfaceC1008b);
            C0784c.m5157a(this.f4661a, interfaceC1008b);
        }
    }
}
