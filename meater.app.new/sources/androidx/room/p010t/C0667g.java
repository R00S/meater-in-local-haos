package androidx.room.p010t;

import android.database.Cursor;
import android.os.Build;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p024c.p082u.p083a.InterfaceC1008b;

/* compiled from: TableInfo.java */
/* renamed from: androidx.room.t.g */
/* loaded from: classes.dex */
public class C0667g {

    /* renamed from: a */
    public final String f4367a;

    /* renamed from: b */
    public final Map<String, a> f4368b;

    /* renamed from: c */
    public final Set<b> f4369c;

    /* renamed from: d */
    public final Set<d> f4370d;

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.t.g$a */
    public static class a {

        /* renamed from: a */
        public final String f4371a;

        /* renamed from: b */
        public final String f4372b;

        /* renamed from: c */
        public final int f4373c;

        /* renamed from: d */
        public final boolean f4374d;

        /* renamed from: e */
        public final int f4375e;

        /* renamed from: f */
        public final String f4376f;

        /* renamed from: g */
        private final int f4377g;

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.f4371a = str;
            this.f4372b = str2;
            this.f4374d = z;
            this.f4375e = i2;
            this.f4373c = m4688a(str2);
            this.f4376f = str3;
            this.f4377g = i3;
        }

        /* renamed from: a */
        private static int m4688a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean m4689b() {
            return this.f4375e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f4375e != aVar.f4375e) {
                    return false;
                }
            } else if (m4689b() != aVar.m4689b()) {
                return false;
            }
            if (!this.f4371a.equals(aVar.f4371a) || this.f4374d != aVar.f4374d) {
                return false;
            }
            if (this.f4377g == 1 && aVar.f4377g == 2 && (str3 = this.f4376f) != null && !str3.equals(aVar.f4376f)) {
                return false;
            }
            if (this.f4377g == 2 && aVar.f4377g == 1 && (str2 = aVar.f4376f) != null && !str2.equals(this.f4376f)) {
                return false;
            }
            int i2 = this.f4377g;
            return (i2 == 0 || i2 != aVar.f4377g || ((str = this.f4376f) == null ? aVar.f4376f == null : str.equals(aVar.f4376f))) && this.f4373c == aVar.f4373c;
        }

        public int hashCode() {
            return (((((this.f4371a.hashCode() * 31) + this.f4373c) * 31) + (this.f4374d ? 1231 : 1237)) * 31) + this.f4375e;
        }

        public String toString() {
            return "Column{name='" + this.f4371a + "', type='" + this.f4372b + "', affinity='" + this.f4373c + "', notNull=" + this.f4374d + ", primaryKeyPosition=" + this.f4375e + ", defaultValue='" + this.f4376f + "'}";
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.t.g$b */
    public static class b {

        /* renamed from: a */
        public final String f4378a;

        /* renamed from: b */
        public final String f4379b;

        /* renamed from: c */
        public final String f4380c;

        /* renamed from: d */
        public final List<String> f4381d;

        /* renamed from: e */
        public final List<String> f4382e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f4378a = str;
            this.f4379b = str2;
            this.f4380c = str3;
            this.f4381d = Collections.unmodifiableList(list);
            this.f4382e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4378a.equals(bVar.f4378a) && this.f4379b.equals(bVar.f4379b) && this.f4380c.equals(bVar.f4380c) && this.f4381d.equals(bVar.f4381d)) {
                return this.f4382e.equals(bVar.f4382e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f4378a.hashCode() * 31) + this.f4379b.hashCode()) * 31) + this.f4380c.hashCode()) * 31) + this.f4381d.hashCode()) * 31) + this.f4382e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f4378a + "', onDelete='" + this.f4379b + "', onUpdate='" + this.f4380c + "', columnNames=" + this.f4381d + ", referenceColumnNames=" + this.f4382e + '}';
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.t.g$c */
    static class c implements Comparable<c> {

        /* renamed from: f */
        final int f4383f;

        /* renamed from: g */
        final int f4384g;

        /* renamed from: h */
        final String f4385h;

        /* renamed from: i */
        final String f4386i;

        c(int i2, int i3, String str, String str2) {
            this.f4383f = i2;
            this.f4384g = i3;
            this.f4385h = str;
            this.f4386i = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i2 = this.f4383f - cVar.f4383f;
            return i2 == 0 ? this.f4384g - cVar.f4384g : i2;
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.t.g$d */
    public static class d {

        /* renamed from: a */
        public final String f4387a;

        /* renamed from: b */
        public final boolean f4388b;

        /* renamed from: c */
        public final List<String> f4389c;

        public d(String str, boolean z, List<String> list) {
            this.f4387a = str;
            this.f4388b = z;
            this.f4389c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f4388b == dVar.f4388b && this.f4389c.equals(dVar.f4389c)) {
                return this.f4387a.startsWith("index_") ? dVar.f4387a.startsWith("index_") : this.f4387a.equals(dVar.f4387a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f4387a.startsWith("index_") ? -1184239155 : this.f4387a.hashCode()) * 31) + (this.f4388b ? 1 : 0)) * 31) + this.f4389c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f4387a + "', unique=" + this.f4388b + ", columns=" + this.f4389c + '}';
        }
    }

    public C0667g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f4367a = str;
        this.f4368b = Collections.unmodifiableMap(map);
        this.f4369c = Collections.unmodifiableSet(set);
        this.f4370d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static C0667g m4682a(InterfaceC1008b interfaceC1008b, String str) {
        return new C0667g(str, m4683b(interfaceC1008b, str), m4685d(interfaceC1008b, str), m4687f(interfaceC1008b, str));
    }

    /* renamed from: b */
    private static Map<String, a> m4683b(InterfaceC1008b interfaceC1008b, String str) {
        Cursor cursorMo6460u0 = interfaceC1008b.mo6460u0("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorMo6460u0.getColumnCount() > 0) {
                int columnIndex = cursorMo6460u0.getColumnIndex("name");
                int columnIndex2 = cursorMo6460u0.getColumnIndex("type");
                int columnIndex3 = cursorMo6460u0.getColumnIndex("notnull");
                int columnIndex4 = cursorMo6460u0.getColumnIndex("pk");
                int columnIndex5 = cursorMo6460u0.getColumnIndex("dflt_value");
                while (cursorMo6460u0.moveToNext()) {
                    String string = cursorMo6460u0.getString(columnIndex);
                    map.put(string, new a(string, cursorMo6460u0.getString(columnIndex2), cursorMo6460u0.getInt(columnIndex3) != 0, cursorMo6460u0.getInt(columnIndex4), cursorMo6460u0.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorMo6460u0.close();
        }
    }

    /* renamed from: c */
    private static List<c> m4684c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<b> m4685d(InterfaceC1008b interfaceC1008b, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorMo6460u0 = interfaceC1008b.mo6460u0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorMo6460u0.getColumnIndex(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int columnIndex2 = cursorMo6460u0.getColumnIndex("seq");
            int columnIndex3 = cursorMo6460u0.getColumnIndex("table");
            int columnIndex4 = cursorMo6460u0.getColumnIndex("on_delete");
            int columnIndex5 = cursorMo6460u0.getColumnIndex("on_update");
            List<c> listM4684c = m4684c(cursorMo6460u0);
            int count = cursorMo6460u0.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                cursorMo6460u0.moveToPosition(i2);
                if (cursorMo6460u0.getInt(columnIndex2) == 0) {
                    int i3 = cursorMo6460u0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listM4684c) {
                        if (cVar.f4383f == i3) {
                            arrayList.add(cVar.f4385h);
                            arrayList2.add(cVar.f4386i);
                        }
                    }
                    hashSet.add(new b(cursorMo6460u0.getString(columnIndex3), cursorMo6460u0.getString(columnIndex4), cursorMo6460u0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorMo6460u0.close();
        }
    }

    /* renamed from: e */
    private static d m4686e(InterfaceC1008b interfaceC1008b, String str, boolean z) {
        Cursor cursorMo6460u0 = interfaceC1008b.mo6460u0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorMo6460u0.getColumnIndex("seqno");
            int columnIndex2 = cursorMo6460u0.getColumnIndex("cid");
            int columnIndex3 = cursorMo6460u0.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorMo6460u0.moveToNext()) {
                    if (cursorMo6460u0.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorMo6460u0.getInt(columnIndex)), cursorMo6460u0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            cursorMo6460u0.close();
        }
    }

    /* renamed from: f */
    private static Set<d> m4687f(InterfaceC1008b interfaceC1008b, String str) {
        Cursor cursorMo6460u0 = interfaceC1008b.mo6460u0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorMo6460u0.getColumnIndex("name");
            int columnIndex2 = cursorMo6460u0.getColumnIndex("origin");
            int columnIndex3 = cursorMo6460u0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorMo6460u0.moveToNext()) {
                    if ("c".equals(cursorMo6460u0.getString(columnIndex2))) {
                        String string = cursorMo6460u0.getString(columnIndex);
                        boolean z = true;
                        if (cursorMo6460u0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d dVarM4686e = m4686e(interfaceC1008b, string, z);
                        if (dVarM4686e == null) {
                            return null;
                        }
                        hashSet.add(dVarM4686e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorMo6460u0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0667g.class != obj.getClass()) {
            return false;
        }
        C0667g c0667g = (C0667g) obj;
        String str = this.f4367a;
        if (str == null ? c0667g.f4367a != null : !str.equals(c0667g.f4367a)) {
            return false;
        }
        Map<String, a> map = this.f4368b;
        if (map == null ? c0667g.f4368b != null : !map.equals(c0667g.f4368b)) {
            return false;
        }
        Set<b> set2 = this.f4369c;
        if (set2 == null ? c0667g.f4369c != null : !set2.equals(c0667g.f4369c)) {
            return false;
        }
        Set<d> set3 = this.f4370d;
        if (set3 == null || (set = c0667g.f4370d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f4367a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f4368b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f4369c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f4367a + "', columns=" + this.f4368b + ", foreignKeys=" + this.f4369c + ", indices=" + this.f4370d + '}';
    }
}
