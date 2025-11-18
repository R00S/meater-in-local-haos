package u3;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SimpleSQLiteQuery.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lu3/a;", "Lu3/j;", "", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Lu3/i;", "statement", "Loa/F;", "b", "(Lu3/i;)V", "B", "Ljava/lang/String;", "C", "[Ljava/lang/Object;", "a", "()Ljava/lang/String;", "sql", "D", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4663a implements j {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String query;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Object[] bindArgs;

    /* compiled from: SimpleSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu3/a$a;", "", "<init>", "()V", "Lu3/i;", "statement", "", "index", "arg", "Loa/F;", "a", "(Lu3/i;ILjava/lang/Object;)V", "", "bindArgs", "b", "(Lu3/i;[Ljava/lang/Object;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u3.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final void a(i statement, int index, Object arg) {
            if (arg == null) {
                statement.W0(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.y0(index, (byte[]) arg);
                return;
            }
            if (arg instanceof Float) {
                statement.Y(index, ((Number) arg).floatValue());
                return;
            }
            if (arg instanceof Double) {
                statement.Y(index, ((Number) arg).doubleValue());
                return;
            }
            if (arg instanceof Long) {
                statement.s0(index, ((Number) arg).longValue());
                return;
            }
            if (arg instanceof Integer) {
                statement.s0(index, ((Number) arg).intValue());
                return;
            }
            if (arg instanceof Short) {
                statement.s0(index, ((Number) arg).shortValue());
                return;
            }
            if (arg instanceof Byte) {
                statement.s0(index, ((Number) arg).byteValue());
                return;
            }
            if (arg instanceof String) {
                statement.J(index, (String) arg);
                return;
            }
            if (arg instanceof Boolean) {
                statement.s0(index, ((Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] bindArgs) {
            C3862t.g(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = bindArgs[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        private Companion() {
        }
    }

    public C4663a(String query, Object[] objArr) {
        C3862t.g(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @Override // u3.j
    /* renamed from: a, reason: from getter */
    public String getQuery() {
        return this.query;
    }

    @Override // u3.j
    public void b(i statement) {
        C3862t.g(statement, "statement");
        INSTANCE.b(statement, this.bindArgs);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4663a(String query) {
        this(query, null);
        C3862t.g(query, "query");
    }
}
