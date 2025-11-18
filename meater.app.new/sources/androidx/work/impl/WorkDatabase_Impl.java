package androidx.work.impl;

import android.database.SQLException;
import android.os.Build;
import androidx.room.AbstractC0651j;
import androidx.room.C0642a;
import androidx.room.C0648g;
import androidx.room.C0653l;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0667g;
import androidx.work.impl.p016n.C0762c;
import androidx.work.impl.p016n.C0765f;
import androidx.work.impl.p016n.C0768i;
import androidx.work.impl.p016n.C0771l;
import androidx.work.impl.p016n.C0774o;
import androidx.work.impl.p016n.C0777r;
import androidx.work.impl.p016n.C0780u;
import androidx.work.impl.p016n.InterfaceC0761b;
import androidx.work.impl.p016n.InterfaceC0764e;
import androidx.work.impl.p016n.InterfaceC0767h;
import androidx.work.impl.p016n.InterfaceC0770k;
import androidx.work.impl.p016n.InterfaceC0773n;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.p016n.InterfaceC0779t;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b */
    private volatile InterfaceC0776q f4527b;

    /* renamed from: c */
    private volatile InterfaceC0761b f4528c;

    /* renamed from: d */
    private volatile InterfaceC0779t f4529d;

    /* renamed from: e */
    private volatile InterfaceC0767h f4530e;

    /* renamed from: f */
    private volatile InterfaceC0770k f4531f;

    /* renamed from: g */
    private volatile InterfaceC0773n f4532g;

    /* renamed from: h */
    private volatile InterfaceC0764e f4533h;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C0713a extends C0653l.a {
        C0713a(int i2) {
            super(i2);
        }

        @Override // androidx.room.C0653l.a
        public void createAllTables(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC1008b.mo6461v("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC1008b.mo6461v("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.C0653l.a
        public void dropAllTables(InterfaceC1008b interfaceC1008b) throws SQLException {
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `Dependency`");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `WorkName`");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC1008b.mo6461v("DROP TABLE IF EXISTS `Preference`");
            if (((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0651j.b) ((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks.get(i2)).m4625b(interfaceC1008b);
                }
            }
        }

        @Override // androidx.room.C0653l.a
        protected void onCreate(InterfaceC1008b interfaceC1008b) {
            if (((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0651j.b) ((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks.get(i2)).m4624a(interfaceC1008b);
                }
            }
        }

        @Override // androidx.room.C0653l.a
        public void onOpen(InterfaceC1008b interfaceC1008b) throws SQLException {
            ((AbstractC0651j) WorkDatabase_Impl.this).mDatabase = interfaceC1008b;
            interfaceC1008b.mo6461v("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(interfaceC1008b);
            if (((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0651j.b) ((AbstractC0651j) WorkDatabase_Impl.this).mCallbacks.get(i2)).mo4626c(interfaceC1008b);
                }
            }
        }

        @Override // androidx.room.C0653l.a
        public void onPostMigrate(InterfaceC1008b interfaceC1008b) {
        }

        @Override // androidx.room.C0653l.a
        public void onPreMigrate(InterfaceC1008b interfaceC1008b) throws SQLException {
            C0663c.m4674a(interfaceC1008b);
        }

        @Override // androidx.room.C0653l.a
        protected C0653l.b onValidateSchema(InterfaceC1008b interfaceC1008b) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new C0667g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new C0667g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C0667g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
            hashSet.add(new C0667g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0667g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C0667g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C0667g c0667g = new C0667g("Dependency", map, hashSet, hashSet2);
            C0667g c0667gM4682a = C0667g.m4682a(interfaceC1008b, "Dependency");
            if (!c0667g.equals(c0667gM4682a)) {
                return new C0653l.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c0667g + "\n Found:\n" + c0667gM4682a);
            }
            HashMap map2 = new HashMap(25);
            map2.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, new C0667g.a(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, "TEXT", true, 1, null, 1));
            map2.put("state", new C0667g.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new C0667g.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new C0667g.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new C0667g.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new C0667g.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new C0667g.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new C0667g.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new C0667g.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new C0667g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new C0667g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new C0667g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new C0667g.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new C0667g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new C0667g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new C0667g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new C0667g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new C0667g.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new C0667g.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new C0667g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new C0667g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new C0667g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new C0667g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new C0667g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new C0667g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C0667g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C0667g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C0667g c0667g2 = new C0667g("WorkSpec", map2, hashSet3, hashSet4);
            C0667g c0667gM4682a2 = C0667g.m4682a(interfaceC1008b, "WorkSpec");
            if (!c0667g2.equals(c0667gM4682a2)) {
                return new C0653l.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c0667g2 + "\n Found:\n" + c0667gM4682a2);
            }
            HashMap map3 = new HashMap(2);
            map3.put(StoreTabGridRecyclerFragment.BundleCons.TAG, new C0667g.a(StoreTabGridRecyclerFragment.BundleCons.TAG, "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new C0667g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C0667g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C0667g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C0667g c0667g3 = new C0667g("WorkTag", map3, hashSet5, hashSet6);
            C0667g c0667gM4682a3 = C0667g.m4682a(interfaceC1008b, "WorkTag");
            if (!c0667g3.equals(c0667gM4682a3)) {
                return new C0653l.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c0667g3 + "\n Found:\n" + c0667gM4682a3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new C0667g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new C0667g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C0667g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
            C0667g c0667g4 = new C0667g("SystemIdInfo", map4, hashSet7, new HashSet(0));
            C0667g c0667gM4682a4 = C0667g.m4682a(interfaceC1008b, "SystemIdInfo");
            if (!c0667g4.equals(c0667gM4682a4)) {
                return new C0653l.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c0667g4 + "\n Found:\n" + c0667gM4682a4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new C0667g.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new C0667g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C0667g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C0667g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C0667g c0667g5 = new C0667g("WorkName", map5, hashSet8, hashSet9);
            C0667g c0667gM4682a5 = C0667g.m4682a(interfaceC1008b, "WorkName");
            if (!c0667g5.equals(c0667gM4682a5)) {
                return new C0653l.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c0667g5 + "\n Found:\n" + c0667gM4682a5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new C0667g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new C0667g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C0667g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
            C0667g c0667g6 = new C0667g("WorkProgress", map6, hashSet10, new HashSet(0));
            C0667g c0667gM4682a6 = C0667g.m4682a(interfaceC1008b, "WorkProgress");
            if (!c0667g6.equals(c0667gM4682a6)) {
                return new C0653l.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c0667g6 + "\n Found:\n" + c0667gM4682a6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(RoomNotification.KEY, new C0667g.a(RoomNotification.KEY, "TEXT", true, 1, null, 1));
            map7.put("long_value", new C0667g.a("long_value", "INTEGER", false, 0, null, 1));
            C0667g c0667g7 = new C0667g("Preference", map7, new HashSet(0), new HashSet(0));
            C0667g c0667gM4682a7 = C0667g.m4682a(interfaceC1008b, "Preference");
            if (c0667g7.equals(c0667gM4682a7)) {
                return new C0653l.b(true, null);
            }
            return new C0653l.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c0667g7 + "\n Found:\n" + c0667gM4682a7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: b */
    public InterfaceC0761b mo4849b() {
        InterfaceC0761b interfaceC0761b;
        if (this.f4528c != null) {
            return this.f4528c;
        }
        synchronized (this) {
            if (this.f4528c == null) {
                this.f4528c = new C0762c(this);
            }
            interfaceC0761b = this.f4528c;
        }
        return interfaceC0761b;
    }

    @Override // androidx.room.AbstractC0651j
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        InterfaceC1008b interfaceC1008bMo4666s0 = super.getOpenHelper().mo4666s0();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                interfaceC1008bMo4666s0.mo6461v("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z) {
                    interfaceC1008bMo4666s0.mo6461v("PRAGMA foreign_keys = TRUE");
                }
                interfaceC1008bMo4666s0.mo6460u0("PRAGMA wal_checkpoint(FULL)").close();
                if (!interfaceC1008bMo4666s0.mo6453P0()) {
                    interfaceC1008bMo4666s0.mo6461v("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z) {
            interfaceC1008bMo4666s0.mo6461v("PRAGMA defer_foreign_keys = TRUE");
        }
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `Dependency`");
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `WorkSpec`");
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `WorkTag`");
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `SystemIdInfo`");
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `WorkName`");
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `WorkProgress`");
        interfaceC1008bMo4666s0.mo6461v("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.room.AbstractC0651j
    protected C0648g createInvalidationTracker() {
        return new C0648g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.AbstractC0651j
    protected InterfaceC1009c createOpenHelper(C0642a c0642a) {
        return c0642a.f4236a.mo4667a(InterfaceC1009c.b.m6465a(c0642a.f4237b).m6468c(c0642a.f4238c).m6467b(new C0653l(c0642a, new C0713a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).m6466a());
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: f */
    public InterfaceC0764e mo4850f() {
        InterfaceC0764e interfaceC0764e;
        if (this.f4533h != null) {
            return this.f4533h;
        }
        synchronized (this) {
            if (this.f4533h == null) {
                this.f4533h = new C0765f(this);
            }
            interfaceC0764e = this.f4533h;
        }
        return interfaceC0764e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: g */
    public InterfaceC0767h mo4851g() {
        InterfaceC0767h interfaceC0767h;
        if (this.f4530e != null) {
            return this.f4530e;
        }
        synchronized (this) {
            if (this.f4530e == null) {
                this.f4530e = new C0768i(this);
            }
            interfaceC0767h = this.f4530e;
        }
        return interfaceC0767h;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: h */
    public InterfaceC0770k mo4852h() {
        InterfaceC0770k interfaceC0770k;
        if (this.f4531f != null) {
            return this.f4531f;
        }
        synchronized (this) {
            if (this.f4531f == null) {
                this.f4531f = new C0771l(this);
            }
            interfaceC0770k = this.f4531f;
        }
        return interfaceC0770k;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: i */
    public InterfaceC0773n mo4853i() {
        InterfaceC0773n interfaceC0773n;
        if (this.f4532g != null) {
            return this.f4532g;
        }
        synchronized (this) {
            if (this.f4532g == null) {
                this.f4532g = new C0774o(this);
            }
            interfaceC0773n = this.f4532g;
        }
        return interfaceC0773n;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: j */
    public InterfaceC0776q mo4854j() {
        InterfaceC0776q interfaceC0776q;
        if (this.f4527b != null) {
            return this.f4527b;
        }
        synchronized (this) {
            if (this.f4527b == null) {
                this.f4527b = new C0777r(this);
            }
            interfaceC0776q = this.f4527b;
        }
        return interfaceC0776q;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: k */
    public InterfaceC0779t mo4855k() {
        InterfaceC0779t interfaceC0779t;
        if (this.f4529d != null) {
            return this.f4529d;
        }
        synchronized (this) {
            if (this.f4529d == null) {
                this.f4529d = new C0780u(this);
            }
            interfaceC0779t = this.f4529d;
        }
        return interfaceC0779t;
    }
}
