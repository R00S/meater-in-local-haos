package s3;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import s3.C4477d;
import u3.InterfaceC4669g;
import za.C5220a;

/* compiled from: TableInfo.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lu3/g;", "database", "", "tableName", "Ls3/d;", "f", "(Lu3/g;Ljava/lang/String;)Ls3/d;", "", "Ls3/d$c;", "c", "(Lu3/g;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", "", "Ls3/d$d;", "b", "(Landroid/database/Cursor;)Ljava/util/List;", "", "Ls3/d$a;", "a", "(Lu3/g;Ljava/lang/String;)Ljava/util/Map;", "Ls3/d$e;", "e", "name", "", "unique", "d", "(Lu3/g;Ljava/lang/String;Z)Ls3/d$e;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4478e {
    private static final Map<String, C4477d.a> a(InterfaceC4669g interfaceC4669g, String str) {
        Cursor cursorD0 = interfaceC4669g.D0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorD0.getColumnCount() <= 0) {
                Map<String, C4477d.a> mapH = M.h();
                C5220a.a(cursorD0, null);
                return mapH;
            }
            int columnIndex = cursorD0.getColumnIndex("name");
            int columnIndex2 = cursorD0.getColumnIndex("type");
            int columnIndex3 = cursorD0.getColumnIndex("notnull");
            int columnIndex4 = cursorD0.getColumnIndex("pk");
            int columnIndex5 = cursorD0.getColumnIndex("dflt_value");
            Map mapC = M.c();
            while (cursorD0.moveToNext()) {
                String name = cursorD0.getString(columnIndex);
                String type = cursorD0.getString(columnIndex2);
                boolean z10 = cursorD0.getInt(columnIndex3) != 0;
                int i10 = cursorD0.getInt(columnIndex4);
                String string = cursorD0.getString(columnIndex5);
                C3862t.f(name, "name");
                C3862t.f(type, "type");
                mapC.put(name, new C4477d.a(name, type, z10, i10, string, 2));
            }
            Map<String, C4477d.a> mapB = M.b(mapC);
            C5220a.a(cursorD0, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5220a.a(cursorD0, th);
                throw th2;
            }
        }
    }

    private static final List<C4477d.C0695d> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = r.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C3862t.f(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            C3862t.f(string2, "cursor.getString(toColumnIndex)");
            listC.add(new C4477d.C0695d(i10, i11, string, string2));
        }
        return r.N0(r.a(listC));
    }

    private static final Set<C4477d.c> c(InterfaceC4669g interfaceC4669g, String str) {
        Cursor cursorD0 = interfaceC4669g.D0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorD0.getColumnIndex("id");
            int columnIndex2 = cursorD0.getColumnIndex("seq");
            int columnIndex3 = cursorD0.getColumnIndex("table");
            int columnIndex4 = cursorD0.getColumnIndex("on_delete");
            int columnIndex5 = cursorD0.getColumnIndex("on_update");
            List<C4477d.C0695d> listB = b(cursorD0);
            cursorD0.moveToPosition(-1);
            Set setB = V.b();
            while (cursorD0.moveToNext()) {
                if (cursorD0.getInt(columnIndex2) == 0) {
                    int i10 = cursorD0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C4477d.C0695d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((C4477d.C0695d) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C4477d.C0695d c0695d : arrayList3) {
                        arrayList.add(c0695d.getFrom());
                        arrayList2.add(c0695d.getTo());
                    }
                    String string = cursorD0.getString(columnIndex3);
                    C3862t.f(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorD0.getString(columnIndex4);
                    C3862t.f(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorD0.getString(columnIndex5);
                    C3862t.f(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new C4477d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<C4477d.c> setA = V.a(setB);
            C5220a.a(cursorD0, null);
            return setA;
        } finally {
        }
    }

    private static final C4477d.e d(InterfaceC4669g interfaceC4669g, String str, boolean z10) {
        Cursor cursorD0 = interfaceC4669g.D0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorD0.getColumnIndex("seqno");
            int columnIndex2 = cursorD0.getColumnIndex("cid");
            int columnIndex3 = cursorD0.getColumnIndex("name");
            int columnIndex4 = cursorD0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorD0.moveToNext()) {
                    if (cursorD0.getInt(columnIndex2) >= 0) {
                        int i10 = cursorD0.getInt(columnIndex);
                        String columnName = cursorD0.getString(columnIndex3);
                        String str2 = cursorD0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        C3862t.f(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                C3862t.f(collectionValues, "columnsMap.values");
                List listW0 = r.W0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                C3862t.f(collectionValues2, "ordersMap.values");
                C4477d.e eVar = new C4477d.e(str, z10, listW0, r.W0(collectionValues2));
                C5220a.a(cursorD0, null);
                return eVar;
            }
            C5220a.a(cursorD0, null);
            return null;
        } finally {
        }
    }

    private static final Set<C4477d.e> e(InterfaceC4669g interfaceC4669g, String str) {
        Cursor cursorD0 = interfaceC4669g.D0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorD0.getColumnIndex("name");
            int columnIndex2 = cursorD0.getColumnIndex("origin");
            int columnIndex3 = cursorD0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = V.b();
                while (cursorD0.moveToNext()) {
                    if (C3862t.b("c", cursorD0.getString(columnIndex2))) {
                        String name = cursorD0.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorD0.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        C3862t.f(name, "name");
                        C4477d.e eVarD = d(interfaceC4669g, name, z10);
                        if (eVarD == null) {
                            C5220a.a(cursorD0, null);
                            return null;
                        }
                        setB.add(eVarD);
                    }
                }
                Set<C4477d.e> setA = V.a(setB);
                C5220a.a(cursorD0, null);
                return setA;
            }
            C5220a.a(cursorD0, null);
            return null;
        } finally {
        }
    }

    public static final C4477d f(InterfaceC4669g database, String tableName) {
        C3862t.g(database, "database");
        C3862t.g(tableName, "tableName");
        return new C4477d(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
