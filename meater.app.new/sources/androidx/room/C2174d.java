package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.InterfaceC4156a;
import u3.C4665c;
import u3.C4667e;
import u3.C4668f;
import u3.InterfaceC4669g;
import u3.InterfaceC4670h;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0011!\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/room/d;", "Lu3/h;", "Landroidx/room/i;", "delegate", "Landroidx/room/c;", "autoCloser", "<init>", "(Lu3/h;Landroidx/room/c;)V", "", "enabled", "Loa/F;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "B", "Lu3/h;", "a", "()Lu3/h;", "C", "Landroidx/room/c;", "Landroidx/room/d$a;", "D", "Landroidx/room/d$a;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lu3/g;", "getWritableDatabase", "()Lu3/g;", "writableDatabase", "b", "c", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2174d implements InterfaceC4670h, InterfaceC2179i {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4670h delegate;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final C2173c autoCloser;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final a autoClosingDb;

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010#0\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0016\u0010-\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0014R(\u00104\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t01\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/room/d$a;", "Lu3/g;", "Landroidx/room/c;", "autoCloser", "<init>", "(Landroidx/room/c;)V", "Loa/F;", "a", "()V", "", "sql", "Lu3/k;", "T", "(Ljava/lang/String;)Lu3/k;", "A", "x0", "F0", "u0", "", "e1", "()Z", "query", "Landroid/database/Cursor;", "D0", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lu3/j;", "c1", "(Lu3/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "r1", "(Lu3/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "I", "(Ljava/lang/String;)V", "", "", "bindArgs", "w0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "B", "Landroidx/room/c;", "isOpen", "h", "()Ljava/lang/String;", "path", "l1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "F", "()Ljava/util/List;", "attachedDbs", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.d$a */
    public static final class a implements InterfaceC4669g {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final C2173c autoCloser;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu3/g;", "obj", "", "Landroid/util/Pair;", "", "a", "(Lu3/g;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        static final class C0395a extends AbstractC3864v implements Ba.l<InterfaceC4669g, List<? extends Pair<String, String>>> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0395a f29115B = new C0395a();

            C0395a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Pair<String, String>> invoke(InterfaceC4669g obj) {
                C3862t.g(obj, "obj");
                return obj.F();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "db", "", "a", "(Lu3/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$b */
        static final class b extends AbstractC3864v implements Ba.l<InterfaceC4669g, Object> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ String f29116B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f29116B = str;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4669g db2) {
                C3862t.g(db2, "db");
                db2.I(this.f29116B);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "db", "", "a", "(Lu3/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$c */
        static final class c extends AbstractC3864v implements Ba.l<InterfaceC4669g, Object> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ String f29117B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Object[] f29118C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f29117B = str;
                this.f29118C = objArr;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4669g db2) {
                C3862t.g(db2, "db");
                db2.w0(this.f29117B, this.f29118C);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.d$a$d, reason: collision with other inner class name */
        /* synthetic */ class C0396d extends C3860q implements Ba.l<InterfaceC4669g, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0396d f29119B = new C0396d();

            C0396d() {
                super(1, InterfaceC4669g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // Ba.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC4669g p02) {
                C3862t.g(p02, "p0");
                return Boolean.valueOf(p02.e1());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "db", "", "a", "(Lu3/g;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$e */
        static final class e extends AbstractC3864v implements Ba.l<InterfaceC4669g, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            public static final e f29120B = new e();

            e() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC4669g db2) {
                C3862t.g(db2, "db");
                return Boolean.valueOf(db2.l1());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "obj", "", "a", "(Lu3/g;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$f */
        static final class f extends AbstractC3864v implements Ba.l<InterfaceC4669g, String> {

            /* renamed from: B, reason: collision with root package name */
            public static final f f29121B = new f();

            f() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(InterfaceC4669g obj) {
                C3862t.g(obj, "obj");
                return obj.h();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/g;", "it", "", "a", "(Lu3/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$g */
        static final class g extends AbstractC3864v implements Ba.l<InterfaceC4669g, Object> {

            /* renamed from: B, reason: collision with root package name */
            public static final g f29122B = new g();

            g() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4669g it) {
                C3862t.g(it, "it");
                return null;
            }
        }

        public a(C2173c autoCloser) {
            C3862t.g(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        @Override // u3.InterfaceC4669g
        public void A() {
            try {
                this.autoCloser.j().A();
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // u3.InterfaceC4669g
        public Cursor D0(String query) {
            C3862t.g(query, "query");
            try {
                return new c(this.autoCloser.j().D0(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // u3.InterfaceC4669g
        public List<Pair<String, String>> F() {
            return (List) this.autoCloser.g(C0395a.f29115B);
        }

        @Override // u3.InterfaceC4669g
        public void F0() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                InterfaceC4669g delegateDatabase = this.autoCloser.getDelegateDatabase();
                C3862t.d(delegateDatabase);
                delegateDatabase.F0();
            } finally {
                this.autoCloser.e();
            }
        }

        @Override // u3.InterfaceC4669g
        public void I(String sql) {
            C3862t.g(sql, "sql");
            this.autoCloser.g(new b(sql));
        }

        @Override // u3.InterfaceC4669g
        public u3.k T(String sql) {
            C3862t.g(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        public final void a() {
            this.autoCloser.g(g.f29122B);
        }

        @Override // u3.InterfaceC4669g
        public Cursor c1(u3.j query) {
            C3862t.g(query, "query");
            try {
                return new c(this.autoCloser.j().c1(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.d();
        }

        @Override // u3.InterfaceC4669g
        public boolean e1() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.g(C0396d.f29119B)).booleanValue();
        }

        @Override // u3.InterfaceC4669g
        public String h() {
            return (String) this.autoCloser.g(f.f29121B);
        }

        @Override // u3.InterfaceC4669g
        public boolean isOpen() {
            InterfaceC4669g delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // u3.InterfaceC4669g
        public boolean l1() {
            return ((Boolean) this.autoCloser.g(e.f29120B)).booleanValue();
        }

        @Override // u3.InterfaceC4669g
        public Cursor r1(u3.j query, CancellationSignal cancellationSignal) {
            C3862t.g(query, "query");
            try {
                return new c(this.autoCloser.j().r1(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // u3.InterfaceC4669g
        public void u0() {
            C4153F c4153f;
            InterfaceC4669g delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.u0();
                c4153f = C4153F.f46609a;
            } else {
                c4153f = null;
            }
            if (c4153f == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // u3.InterfaceC4669g
        public void w0(String sql, Object[] bindArgs) {
            C3862t.g(sql, "sql");
            C3862t.g(bindArgs, "bindArgs");
            this.autoCloser.g(new c(sql, bindArgs));
        }

        @Override // u3.InterfaceC4669g
        public void x0() {
            try {
                this.autoCloser.j().x0();
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\n \n*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a(\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u0016 \n*\u0014\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0018\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b.\u0010\u0015J\u0018\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b0\u00101J \u00102\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b3\u0010*J\u0010\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0096\u0001¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u000204H\u0096\u0001¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u000204H\u0096\u0001¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u000204H\u0096\u0001¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u000204H\u0096\u0001¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u000204H\u0096\u0001¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u000204H\u0096\u0001¢\u0006\u0004\b@\u00106J\u0010\u0010A\u001a\u000204H\u0096\u0001¢\u0006\u0004\bA\u00106J\u0018\u0010B\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bB\u0010=J\u0010\u0010C\u001a\u000204H\u0096\u0001¢\u0006\u0004\bC\u00106J \u0010E\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000204H\u0097\u0001¢\u0006\u0004\bJ\u00106J(\u0010K\u001a\n \n*\u0004\u0018\u00010#0#2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\bK\u0010LJ0\u0010O\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010M0M2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010N0NH\u0096\u0001¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bQ\u0010FJ \u0010R\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010\u0010J%\u0010W\u001a\u00020\f2\u0006\u0010T\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020NH\u0017¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020#H\u0017¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, d2 = {"Landroidx/room/d$c;", "Landroid/database/Cursor;", "delegate", "Landroidx/room/c;", "autoCloser", "<init>", "(Landroid/database/Cursor;Landroidx/room/c;)V", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "Loa/F;", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "()V", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "(Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUri", "()Landroid/net/Uri;", "getNotificationUris", "()Ljava/util/List;", "extras", "setExtras", "(Landroid/os/Bundle;)V", "B", "Landroid/database/Cursor;", "C", "Landroidx/room/c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.d$c */
    private static final class c implements Cursor {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Cursor delegate;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final C2173c autoCloser;

        public c(Cursor delegate, C2173c autoCloser) {
            C3862t.g(delegate, "delegate");
            C3862t.g(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p02, CharArrayBuffer p12) {
            this.delegate.copyStringToBuffer(p02, p12);
        }

        @Override // android.database.Cursor
        @InterfaceC4156a
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p02) {
            return this.delegate.getBlob(p02);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p02) {
            return this.delegate.getColumnIndex(p02);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p02) {
            return this.delegate.getColumnIndexOrThrow(p02);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p02) {
            return this.delegate.getColumnName(p02);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p02) {
            return this.delegate.getDouble(p02);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p02) {
            return this.delegate.getFloat(p02);
        }

        @Override // android.database.Cursor
        public int getInt(int p02) {
            return this.delegate.getInt(p02);
        }

        @Override // android.database.Cursor
        public long getLong(int p02) {
            return this.delegate.getLong(p02);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C4665c.a(this.delegate);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return C4668f.a(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p02) {
            return this.delegate.getShort(p02);
        }

        @Override // android.database.Cursor
        public String getString(int p02) {
            return this.delegate.getString(p02);
        }

        @Override // android.database.Cursor
        public int getType(int p02) {
            return this.delegate.getType(p02);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p02) {
            return this.delegate.isNull(p02);
        }

        @Override // android.database.Cursor
        public boolean move(int p02) {
            return this.delegate.move(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p02) {
            return this.delegate.moveToPosition(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p02) {
            this.delegate.registerContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p02) {
            this.delegate.registerDataSetObserver(p02);
        }

        @Override // android.database.Cursor
        @InterfaceC4156a
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p02) {
            return this.delegate.respond(p02);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            C3862t.g(extras, "extras");
            C4667e.a(this.delegate, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p02, Uri p12) {
            this.delegate.setNotificationUri(p02, p12);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List<? extends Uri> uris) {
            C3862t.g(cr, "cr");
            C3862t.g(uris, "uris");
            C4668f.b(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p02) {
            this.delegate.unregisterContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p02) {
            this.delegate.unregisterDataSetObserver(p02);
        }
    }

    public C2174d(InterfaceC4670h delegate, C2173c autoCloser) {
        C3862t.g(delegate, "delegate");
        C3862t.g(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.k(getDelegate());
        this.autoClosingDb = new a(autoCloser);
    }

    @Override // androidx.room.InterfaceC2179i
    /* renamed from: a, reason: from getter */
    public InterfaceC4670h getDelegate() {
        return this.delegate;
    }

    @Override // u3.InterfaceC4670h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // u3.InterfaceC4670h
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // u3.InterfaceC4670h
    public InterfaceC4669g getWritableDatabase() {
        this.autoClosingDb.a();
        return this.autoClosingDb;
    }

    @Override // u3.InterfaceC4670h
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R(\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00130/j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/room/d$b;", "Lu3/k;", "", "sql", "Landroidx/room/c;", "autoCloser", "<init>", "(Ljava/lang/String;Landroidx/room/c;)V", "T", "Lkotlin/Function1;", "block", "d", "(LBa/l;)Ljava/lang/Object;", "supportSQLiteStatement", "Loa/F;", "c", "(Lu3/k;)V", "", "bindIndex", "", "value", "e", "(ILjava/lang/Object;)V", "close", "()V", "R", "()I", "", "w1", "()J", "index", "W0", "(I)V", "s0", "(IJ)V", "", "Y", "(ID)V", "J", "(ILjava/lang/String;)V", "", "y0", "(I[B)V", "B", "Ljava/lang/String;", "C", "Landroidx/room/c;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "binds", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.d$b */
    private static final class b implements u3.k {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final String sql;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final C2173c autoCloser;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<Object> binds;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/k;", "obj", "", "a", "(Lu3/k;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$b$a */
        static final class a extends AbstractC3864v implements Ba.l<u3.k, Long> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f29126B = new a();

            a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(u3.k obj) {
                C3862t.g(obj, "obj");
                return Long.valueOf(obj.w1());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lu3/g;", "db", "a", "(Lu3/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$b$b, reason: collision with other inner class name */
        static final class C0397b<T> extends AbstractC3864v implements Ba.l<InterfaceC4669g, T> {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Ba.l<u3.k, T> f29128C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0397b(Ba.l<? super u3.k, ? extends T> lVar) {
                super(1);
                this.f29128C = lVar;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(InterfaceC4669g db2) {
                C3862t.g(db2, "db");
                u3.k kVarT = db2.T(b.this.sql);
                b.this.c(kVarT);
                return this.f29128C.invoke(kVarT);
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3/k;", "obj", "", "a", "(Lu3/k;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$b$c */
        static final class c extends AbstractC3864v implements Ba.l<u3.k, Integer> {

            /* renamed from: B, reason: collision with root package name */
            public static final c f29129B = new c();

            c() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(u3.k obj) {
                C3862t.g(obj, "obj");
                return Integer.valueOf(obj.R());
            }
        }

        public b(String sql, C2173c autoCloser) {
            C3862t.g(sql, "sql");
            C3862t.g(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(u3.k supportSQLiteStatement) {
            Iterator<T> it = this.binds.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kotlin.collections.r.w();
                }
                Object obj = this.binds.get(i10);
                if (obj == null) {
                    supportSQLiteStatement.W0(i11);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.s0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.Y(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.J(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.y0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final <T> T d(Ba.l<? super u3.k, ? extends T> block) {
            return (T) this.autoCloser.g(new C0397b(block));
        }

        private final void e(int bindIndex, Object value) {
            int size;
            int i10 = bindIndex - 1;
            if (i10 >= this.binds.size() && (size = this.binds.size()) <= i10) {
                while (true) {
                    this.binds.add(null);
                    if (size == i10) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i10, value);
        }

        @Override // u3.i
        public void J(int index, String value) {
            C3862t.g(value, "value");
            e(index, value);
        }

        @Override // u3.k
        public int R() {
            return ((Number) d(c.f29129B)).intValue();
        }

        @Override // u3.i
        public void W0(int index) {
            e(index, null);
        }

        @Override // u3.i
        public void Y(int index, double value) {
            e(index, Double.valueOf(value));
        }

        @Override // u3.i
        public void s0(int index, long value) {
            e(index, Long.valueOf(value));
        }

        @Override // u3.k
        public long w1() {
            return ((Number) d(a.f29126B)).longValue();
        }

        @Override // u3.i
        public void y0(int index, byte[] value) {
            C3862t.g(value, "value");
            e(index, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
