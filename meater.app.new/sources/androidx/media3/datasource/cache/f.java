package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.C1805b;
import X1.L;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m8.AbstractC3979B;
import m8.j0;

/* compiled from: CachedContentIndex.java */
/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, e> f26253a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f26254b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f26255c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f26256d;

    /* renamed from: e, reason: collision with root package name */
    private c f26257e;

    /* renamed from: f, reason: collision with root package name */
    private c f26258f;

    /* compiled from: CachedContentIndex.java */
    private static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f26259e = {"id", "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        private final Z1.a f26260a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<e> f26261b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private String f26262c;

        /* renamed from: d, reason: collision with root package name */
        private String f26263d;

        public a(Z1.a aVar) {
            this.f26260a = aVar;
        }

        private void i(SQLiteDatabase sQLiteDatabase, e eVar) throws IOException, SQLException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f.r(eVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(eVar.f26246a));
            contentValues.put("key", eVar.f26247b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C1804a.e(this.f26263d), null, contentValues);
        }

        private static void j(Z1.a aVar, String str) throws DatabaseIOException {
            try {
                String strN = n(str);
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    Z1.c.c(writableDatabase, 1, str);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        private void k(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) C1804a.e(this.f26263d), "id = ?", new String[]{Integer.toString(i10)});
        }

        private static void l(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor m() {
            return this.f26260a.getReadableDatabase().query((String) C1804a.e(this.f26263d), f26259e, null, null, null, null, null);
        }

        private static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void o(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException, SQLException {
            Z1.c.d(sQLiteDatabase, 1, (String) C1804a.e(this.f26262c), 1);
            l(sQLiteDatabase, (String) C1804a.e(this.f26263d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f26263d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void a() throws DatabaseIOException {
            j(this.f26260a, (String) C1804a.e(this.f26262c));
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void b(HashMap<String, e> map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f26260a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator<e> it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f26261b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public boolean c() throws DatabaseIOException {
            try {
                return Z1.c.b(this.f26260a.getReadableDatabase(), 1, (String) C1804a.e(this.f26262c)) != -1;
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void d(HashMap<String, e> map) throws DatabaseIOException {
            if (this.f26261b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f26260a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f26261b.size(); i10++) {
                    try {
                        e eVarValueAt = this.f26261b.valueAt(i10);
                        if (eVarValueAt == null) {
                            k(writableDatabase, this.f26261b.keyAt(i10));
                        } else {
                            i(writableDatabase, eVarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f26261b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void e(long j10) {
            String hexString = Long.toHexString(j10);
            this.f26262c = hexString;
            this.f26263d = n(hexString);
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void f(e eVar) {
            this.f26261b.put(eVar.f26246a, eVar);
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void g(e eVar, boolean z10) {
            if (z10) {
                this.f26261b.delete(eVar.f26246a);
            } else {
                this.f26261b.put(eVar.f26246a, null);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void h(HashMap<String, e> map, SparseArray<String> sparseArray) throws DatabaseIOException {
            C1804a.g(this.f26261b.size() == 0);
            try {
                if (Z1.c.b(this.f26260a.getReadableDatabase(), 1, (String) C1804a.e(this.f26262c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f26260a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorM = m();
                while (cursorM.moveToNext()) {
                    try {
                        e eVar = new e(cursorM.getInt(0), (String) C1804a.e(cursorM.getString(1)), f.o(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        map.put(eVar.f26247b, eVar);
                        sparseArray.put(eVar.f26246a, eVar.f26247b);
                    } finally {
                    }
                }
                cursorM.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e10);
            }
        }
    }

    /* compiled from: CachedContentIndex.java */
    private interface c {
        void a();

        void b(HashMap<String, e> map);

        boolean c();

        void d(HashMap<String, e> map);

        void e(long j10);

        void f(e eVar);

        void g(e eVar, boolean z10);

        void h(HashMap<String, e> map, SparseArray<String> sparseArray);
    }

    public f(Z1.a aVar, File file, byte[] bArr, boolean z10, boolean z11) {
        C1804a.g((aVar == null && file == null) ? false : true);
        this.f26253a = new HashMap<>();
        this.f26254b = new SparseArray<>();
        this.f26255c = new SparseBooleanArray();
        this.f26256d = new SparseBooleanArray();
        a aVar2 = aVar != null ? new a(aVar) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : null;
        if (aVar2 == null || (bVar != null && z11)) {
            this.f26257e = (c) L.i(bVar);
            this.f26258f = aVar2;
        } else {
            this.f26257e = aVar2;
            this.f26258f = bVar;
        }
    }

    private e c(String str) {
        int iJ = j(this.f26254b);
        e eVar = new e(iJ, str);
        this.f26253a.put(str, eVar);
        this.f26254b.put(iJ, str);
        this.f26256d.put(iJ, true);
        this.f26257e.f(eVar);
        return eVar;
    }

    static int j(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean m(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b2.g o(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException("Invalid value size: " + i12);
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = L.f18631f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new b2.g(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(b2.g gVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setH = gVar.h();
        dataOutputStream.writeInt(setH.size());
        for (Map.Entry<String, byte[]> entry : setH) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void d(String str, b2.f fVar) {
        e eVarK = k(str);
        if (eVarK.b(fVar)) {
            this.f26257e.f(eVarK);
        }
    }

    public int e(String str) {
        return k(str).f26246a;
    }

    public e f(String str) {
        return this.f26253a.get(str);
    }

    public Collection<e> g() {
        return Collections.unmodifiableCollection(this.f26253a.values());
    }

    public b2.e h(String str) {
        e eVarF = f(str);
        return eVarF != null ? eVarF.d() : b2.g.f30108c;
    }

    public String i(int i10) {
        return this.f26254b.get(i10);
    }

    public e k(String str) {
        e eVar = this.f26253a.get(str);
        return eVar == null ? c(str) : eVar;
    }

    public void l(long j10) {
        c cVar;
        this.f26257e.e(j10);
        c cVar2 = this.f26258f;
        if (cVar2 != null) {
            cVar2.e(j10);
        }
        if (this.f26257e.c() || (cVar = this.f26258f) == null || !cVar.c()) {
            this.f26257e.h(this.f26253a, this.f26254b);
        } else {
            this.f26258f.h(this.f26253a, this.f26254b);
            this.f26257e.b(this.f26253a);
        }
        c cVar3 = this.f26258f;
        if (cVar3 != null) {
            cVar3.a();
            this.f26258f = null;
        }
    }

    public void n(String str) {
        e eVar = this.f26253a.get(str);
        if (eVar != null && eVar.g() && eVar.i()) {
            this.f26253a.remove(str);
            int i10 = eVar.f26246a;
            boolean z10 = this.f26256d.get(i10);
            this.f26257e.g(eVar, z10);
            if (z10) {
                this.f26254b.remove(i10);
                this.f26256d.delete(i10);
            } else {
                this.f26254b.put(i10, null);
                this.f26255c.put(i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p() {
        j0 it = AbstractC3979B.D(this.f26253a.keySet()).iterator();
        while (it.hasNext()) {
            n((String) it.next());
        }
    }

    public void q() {
        this.f26257e.d(this.f26253a);
        int size = this.f26255c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26254b.remove(this.f26255c.keyAt(i10));
        }
        this.f26255c.clear();
        this.f26256d.clear();
    }

    /* compiled from: CachedContentIndex.java */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26264a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f26265b;

        /* renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f26266c;

        /* renamed from: d, reason: collision with root package name */
        private final SecureRandom f26267d;

        /* renamed from: e, reason: collision with root package name */
        private final C1805b f26268e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26269f;

        /* renamed from: g, reason: collision with root package name */
        private g f26270g;

        public b(File file, byte[] bArr, boolean z10) throws NoSuchPaddingException, NoSuchAlgorithmException {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            C1804a.g((bArr == null && z10) ? false : true);
            if (bArr != null) {
                C1804a.a(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                C1804a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f26264a = z10;
            this.f26265b = cipher;
            this.f26266c = secretKeySpec;
            this.f26267d = z10 ? new SecureRandom() : null;
            this.f26268e = new C1805b(file);
        }

        private int i(e eVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (eVar.f26246a * 31) + eVar.f26247b.hashCode();
            if (i10 < 2) {
                long jD = b2.e.d(eVar.d());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jD ^ (jD >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = eVar.d().hashCode();
            }
            return i11 + iHashCode;
        }

        private e j(int i10, DataInputStream dataInputStream) throws IOException {
            b2.g gVarO;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                b2.f fVar = new b2.f();
                b2.f.g(fVar, j10);
                gVarO = b2.g.f30108c.g(fVar);
            } else {
                gVarO = f.o(dataInputStream);
            }
            return new e(i11, utf, gVarO);
        }

        private boolean k(HashMap<String, e> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f26268e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f26268e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f26265b == null) {
                                L.m(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f26265b.init(2, (Key) L.i(this.f26266c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f26265b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f26264a) {
                            this.f26269f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int i12 = 0;
                        for (int i13 = 0; i13 < i11; i13++) {
                            e eVarJ = j(i10, dataInputStream2);
                            map.put(eVarJ.f26247b, eVarJ);
                            sparseArray.put(eVarJ.f26246a, eVarJ.f26247b);
                            i12 += i(eVarJ, i10);
                        }
                        int i14 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i14 == i12 && z10) {
                            L.m(dataInputStream2);
                            return true;
                        }
                        L.m(dataInputStream2);
                        return false;
                    }
                    L.m(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        L.m(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        L.m(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private void l(e eVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(eVar.f26246a);
            dataOutputStream.writeUTF(eVar.f26247b);
            f.r(eVar.d(), dataOutputStream);
        }

        private void m(HashMap<String, e> map) throws Throwable {
            Closeable closeable = null;
            try {
                OutputStream outputStreamF = this.f26268e.f();
                g gVar = this.f26270g;
                if (gVar == null) {
                    this.f26270g = new g(outputStreamF);
                } else {
                    gVar.a(outputStreamF);
                }
                g gVar2 = this.f26270g;
                DataOutputStream dataOutputStream = new DataOutputStream(gVar2);
                try {
                    dataOutputStream.writeInt(2);
                    int i10 = 0;
                    dataOutputStream.writeInt(this.f26264a ? 1 : 0);
                    if (this.f26264a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) L.i(this.f26267d)).nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            ((Cipher) L.i(this.f26265b)).init(1, (Key) L.i(this.f26266c), new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(gVar2, this.f26265b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream.writeInt(map.size());
                    for (e eVar : map.values()) {
                        l(eVar, dataOutputStream);
                        i10 += i(eVar, 2);
                    }
                    dataOutputStream.writeInt(i10);
                    this.f26268e.b(dataOutputStream);
                    L.m(null);
                } catch (Throwable th) {
                    th = th;
                    closeable = dataOutputStream;
                    L.m(closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void a() {
            this.f26268e.a();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void b(HashMap<String, e> map) throws Throwable {
            m(map);
            this.f26269f = false;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public boolean c() {
            return this.f26268e.c();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void d(HashMap<String, e> map) throws Throwable {
            if (this.f26269f) {
                b(map);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void f(e eVar) {
            this.f26269f = true;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void g(e eVar, boolean z10) {
            this.f26269f = true;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void h(HashMap<String, e> map, SparseArray<String> sparseArray) {
            C1804a.g(!this.f26269f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f26268e.a();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void e(long j10) {
        }
    }
}
