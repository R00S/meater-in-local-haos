package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: RoomSQLiteQuery.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u000eR\u001a\u00100\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u000eR\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010\u000eR\"\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u000eR\u001a\u0010>\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b;\u0010<\u0012\u0004\b=\u0010\u000eR$\u0010A\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\"\u0010\"\u001a\u0004\b@\u0010$R\u0014\u0010D\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Landroidx/room/z;", "Lu3/j;", "Lu3/i;", "", "capacity", "<init>", "(I)V", "", "query", "initArgCount", "Loa/F;", "e", "(Ljava/lang/String;I)V", "f", "()V", "statement", "b", "(Lu3/i;)V", "index", "W0", "", "value", "s0", "(IJ)V", "", "Y", "(ID)V", "J", "(ILjava/lang/String;)V", "", "y0", "(I[B)V", "close", "B", "I", "getCapacity", "()I", "C", "Ljava/lang/String;", "", "D", "[J", "getLongBindings$annotations", "longBindings", "", "E", "[D", "getDoubleBindings$annotations", "doubleBindings", "", "F", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "G", "[[B", "getBlobBindings$annotations", "blobBindings", "", "H", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "d", "argCount", "a", "()Ljava/lang/String;", "sql", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z implements u3.j, u3.i {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: K, reason: collision with root package name */
    public static final TreeMap<Integer, z> f29274K = new TreeMap<>();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private volatile String query;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final long[] longBindings;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final double[] doubleBindings;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final String[] stringBindings;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public final byte[][] blobBindings;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final int[] bindingTypes;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int argCount;

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/room/z$a;", "", "<init>", "()V", "", "query", "", "argumentCount", "Landroidx/room/z;", "a", "(Ljava/lang/String;I)Landroidx/room/z;", "Loa/F;", "b", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final z a(String query, int argumentCount) {
            C3862t.g(query, "query");
            TreeMap<Integer, z> treeMap = z.f29274K;
            synchronized (treeMap) {
                Map.Entry<Integer, z> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry == null) {
                    C4153F c4153f = C4153F.f46609a;
                    z zVar = new z(argumentCount, null);
                    zVar.e(query, argumentCount);
                    return zVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                z sqliteQuery = entryCeilingEntry.getValue();
                sqliteQuery.e(query, argumentCount);
                C3862t.f(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap<Integer, z> treeMap = z.f29274K;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            C3862t.f(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ z(int i10, C3854k c3854k) {
        this(i10);
    }

    public static final z c(String str, int i10) {
        return INSTANCE.a(str, i10);
    }

    @Override // u3.i
    public void J(int index, String value) {
        C3862t.g(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // u3.i
    public void W0(int index) {
        this.bindingTypes[index] = 1;
    }

    @Override // u3.i
    public void Y(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override // u3.j
    /* renamed from: a */
    public String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // u3.j
    public void b(u3.i statement) {
        C3862t.g(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.bindingTypes[i10];
            if (i11 == 1) {
                statement.W0(i10);
            } else if (i11 == 2) {
                statement.s0(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.Y(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.J(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.blobBindings[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.y0(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: d, reason: from getter */
    public int getArgCount() {
        return this.argCount;
    }

    public final void e(String query, int initArgCount) {
        C3862t.g(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void f() {
        TreeMap<Integer, z> treeMap = f29274K;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.b();
            C4153F c4153f = C4153F.f46609a;
        }
    }

    @Override // u3.i
    public void s0(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // u3.i
    public void y0(int index, byte[] value) {
        C3862t.g(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    private z(int i10) {
        this.capacity = i10;
        int i11 = i10 + 1;
        this.bindingTypes = new int[i11];
        this.longBindings = new long[i11];
        this.doubleBindings = new double[i11];
        this.stringBindings = new String[i11];
        this.blobBindings = new byte[i11][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
