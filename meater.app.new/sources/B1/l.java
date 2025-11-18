package B1;

import Xb.C1868w;
import Xb.I;
import Xb.InterfaceC1864u;
import ac.C1972g;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import ac.J;
import ac.t;
import gc.InterfaceC3460a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.O;
import oa.C4153F;
import oa.C4165j;
import oa.C4173r;
import oa.InterfaceC4164i;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 S*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001602Br\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00120\b\u0002\u0010\u000e\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t0\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0016\u001a\u00028\u00002\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010$J\u0013\u0010&\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u0013\u0010'\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010$J\u0013\u0010(\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010$J?\u0010+\u001a\u00028\u00002\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u0006\u0010*\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010;\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010=R\u001b\u0010C\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000E0D8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010IRC\u0010M\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bK\u0010LR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"LB1/l;", "T", "LB1/e;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB1/j;", "serializer", "", "Lkotlin/Function2;", "LB1/h;", "Lta/d;", "Loa/F;", "", "initTasksList", "LB1/a;", "corruptionHandler", "LXb/I;", "scope", "<init>", "(LBa/a;LB1/j;Ljava/util/List;LB1/a;LXb/I;)V", "transform", "a", "(LBa/p;Lta/d;)Ljava/lang/Object;", "newData", "A", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "LB1/l$b$a;", "read", "s", "(LB1/l$b$a;Lta/d;)Ljava/lang/Object;", "LB1/l$b$b;", "update", "t", "(LB1/l$b$b;Lta/d;)Ljava/lang/Object;", "v", "(Lta/d;)Ljava/lang/Object;", "w", "u", "y", "x", "Lta/g;", "callerContext", "z", "(LBa/p;Lta/g;Lta/d;)Ljava/lang/Object;", "q", "(Ljava/io/File;)V", "LBa/a;", "b", "LB1/j;", "c", "LB1/a;", "d", "LXb/I;", "Lac/e;", "e", "Lac/e;", "f", "()Lac/e;", "data", "", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Loa/i;", "r", "()Ljava/io/File;", "file", "Lac/t;", "LB1/m;", "h", "Lac/t;", "getDownstreamFlow$annotations", "()V", "downstreamFlow", "i", "Ljava/util/List;", "initTasks", "LB1/k;", "LB1/l$b;", "j", "LB1/k;", "actor", "k", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class l<T> implements B1.e<T> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Set<String> f1433l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f1434m = new Object();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<File> produceFile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B1.j<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a<T> corruptionHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final I scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1970e<T> data;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String SCRATCH_SUFFIX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i file;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<B1.m<T>> downstreamFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<? extends Ba.p<? super B1.h<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object>> initTasks;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final B1.k<b<T>> actor;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LB1/l$a;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: B1.l$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Set<String> a() {
            return l.f1433l;
        }

        public final Object b() {
            return l.f1434m;
        }

        private Companion() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"LB1/l$b;", "T", "", "<init>", "()V", "a", "b", "LB1/l$b$a;", "LB1/l$b$b;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LB1/l$b$a;", "T", "LB1/l$b;", "LB1/m;", "lastState", "<init>", "(LB1/m;)V", "a", "LB1/m;", "()LB1/m;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final B1.m<T> lastState;

            public a(B1.m<T> mVar) {
                super(null);
                this.lastState = mVar;
            }

            public B1.m<T> a() {
                return this.lastState;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002BT\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR6\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"LB1/l$b$b;", "T", "LB1/l$b;", "Lkotlin/Function2;", "Lta/d;", "", "transform", "LXb/u;", "ack", "LB1/m;", "lastState", "Lta/g;", "callerContext", "<init>", "(LBa/p;LXb/u;LB1/m;Lta/g;)V", "a", "LBa/p;", "d", "()LBa/p;", "b", "LXb/u;", "()LXb/u;", "c", "LB1/m;", "()LB1/m;", "Lta/g;", "()Lta/g;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: B1.l$b$b, reason: collision with other inner class name */
        public static final class C0025b<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Ba.p<T, InterfaceC4588d<? super T>, Object> transform;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final InterfaceC1864u<T> ack;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final B1.m<T> lastState;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final ta.g callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0025b(Ba.p<? super T, ? super InterfaceC4588d<? super T>, ? extends Object> transform, InterfaceC1864u<T> ack, B1.m<T> mVar, ta.g callerContext) {
                super(null);
                C3862t.g(transform, "transform");
                C3862t.g(ack, "ack");
                C3862t.g(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = mVar;
                this.callerContext = callerContext;
            }

            public final InterfaceC1864u<T> a() {
                return this.ack;
            }

            /* renamed from: b, reason: from getter */
            public final ta.g getCallerContext() {
                return this.callerContext;
            }

            public B1.m<T> c() {
                return this.lastState;
            }

            public final Ba.p<T, InterfaceC4588d<? super T>, Object> d() {
                return this.transform;
            }
        }

        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LB1/l$c;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "Loa/F;", "write", "(I)V", "", "([B)V", "bytes", "off", "len", "([BII)V", "close", "()V", "flush", "B", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class c extends OutputStream {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final FileOutputStream fileOutputStream;

        public c(FileOutputStream fileOutputStream) {
            C3862t.g(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(int b10) throws IOException {
            this.fileOutputStream.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) throws IOException {
            C3862t.g(b10, "b");
            this.fileOutputStream.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) throws IOException {
            C3862t.g(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Loa/F;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class d extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l<T> f1451B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l<T> lVar) {
            super(1);
            this.f1451B = lVar;
        }

        public final void a(Throwable th) {
            if (th != null) {
                ((l) this.f1451B).downstreamFlow.setValue(new B1.g(th));
            }
            Companion companion = l.INSTANCE;
            Object objB = companion.b();
            l<T> lVar = this.f1451B;
            synchronized (objB) {
                companion.a().remove(lVar.r().getAbsolutePath());
                C4153F c4153f = C4153F.f46609a;
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "LB1/l$b;", "msg", "", "ex", "Loa/F;", "<anonymous>", "(LB1/l$b;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends AbstractC3864v implements Ba.p<b<T>, Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f1452B = new e();

        e() {
            super(2);
        }

        public final void a(b<T> msg, Throwable th) {
            C3862t.g(msg, "msg");
            if (msg instanceof b.C0025b) {
                InterfaceC1864u<T> interfaceC1864uA = ((b.C0025b) msg).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                interfaceC1864uA.d(th);
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj, Throwable th) {
            a((b) obj, th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB1/l$b;", "msg", "Loa/F;", "<anonymous>", "(LB1/l$b;)V"}, k = 3, mv = {1, 5, 1})
    static final class f extends kotlin.coroutines.jvm.internal.l implements Ba.p<b<T>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1453B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f1454C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l<T> f1455D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l<T> lVar, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1455D = lVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<T> bVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(bVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = new f(this.f1455D, interfaceC4588d);
            fVar.f1454C = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f1453B;
            if (i10 == 0) {
                C4173r.b(obj);
                b bVar = (b) this.f1454C;
                if (bVar instanceof b.a) {
                    this.f1453B = 1;
                    if (this.f1455D.s((b.a) bVar, this) == objE) {
                        return objE;
                    }
                } else if (bVar instanceof b.C0025b) {
                    this.f1453B = 2;
                    if (this.f1455D.t((b.C0025b) bVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lac/f;", "Loa/F;", "<anonymous>", "(Lac/f;)V"}, k = 3, mv = {1, 5, 1})
    static final class g extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC1971f<? super T>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1456B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f1457C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l<T> f1458D;

        /* compiled from: SingleProcessDataStore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB1/m;", "it", "", "<anonymous>", "(LB1/m;)Z"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<B1.m<T>, InterfaceC4588d<? super Boolean>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f1459B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f1460C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ B1.m<T> f1461D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B1.m<T> mVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f1461D = mVar;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(B1.m<T> mVar, InterfaceC4588d<? super Boolean> interfaceC4588d) {
                return ((a) create(mVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f1461D, interfaceC4588d);
                aVar.f1460C = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f1459B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                B1.m<T> mVar = (B1.m) this.f1460C;
                B1.m<T> mVar2 = this.f1461D;
                boolean z10 = false;
                if (!(mVar2 instanceof B1.b) && !(mVar2 instanceof B1.g) && mVar == mVar2) {
                    z10 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lac/e;", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b implements InterfaceC1970e<T> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC1970e f1462B;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lac/f;", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class a implements InterfaceC1971f<B1.m<T>> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ InterfaceC1971f f1463B;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: B1.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0026a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: B, reason: collision with root package name */
                    /* synthetic */ Object f1464B;

                    /* renamed from: C, reason: collision with root package name */
                    int f1465C;

                    public C0026a(InterfaceC4588d interfaceC4588d) {
                        super(interfaceC4588d);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f1464B = obj;
                        this.f1465C |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(InterfaceC1971f interfaceC1971f) {
                    this.f1463B = interfaceC1971f;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // ac.InterfaceC1971f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object a(java.lang.Object r5, ta.InterfaceC4588d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof B1.l.g.b.a.C0026a
                        if (r0 == 0) goto L13
                        r0 = r6
                        B1.l$g$b$a$a r0 = (B1.l.g.b.a.C0026a) r0
                        int r1 = r0.f1465C
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1465C = r1
                        goto L18
                    L13:
                        B1.l$g$b$a$a r0 = new B1.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f1464B
                        java.lang.Object r1 = ua.C4696b.e()
                        int r2 = r0.f1465C
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        oa.C4173r.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        oa.C4173r.b(r6)
                        ac.f r6 = r4.f1463B
                        B1.m r5 = (B1.m) r5
                        boolean r2 = r5 instanceof B1.i
                        if (r2 != 0) goto L6f
                        boolean r2 = r5 instanceof B1.g
                        if (r2 != 0) goto L68
                        boolean r2 = r5 instanceof B1.b
                        if (r2 == 0) goto L56
                        B1.b r5 = (B1.b) r5
                        java.lang.Object r5 = r5.b()
                        r0.f1465C = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        oa.F r5 = oa.C4153F.f46609a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof B1.n
                        if (r5 == 0) goto L62
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L62:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L68:
                        B1.g r5 = (B1.g) r5
                        java.lang.Throwable r5 = r5.getFinalException()
                        throw r5
                    L6f:
                        B1.i r5 = (B1.i) r5
                        java.lang.Throwable r5 = r5.getReadException()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B1.l.g.b.a.a(java.lang.Object, ta.d):java.lang.Object");
                }
            }

            public b(InterfaceC1970e interfaceC1970e) {
                this.f1462B = interfaceC1970e;
            }

            @Override // ac.InterfaceC1970e
            public Object b(InterfaceC1971f interfaceC1971f, InterfaceC4588d interfaceC4588d) {
                Object objB = this.f1462B.b(new a(interfaceC1971f), interfaceC4588d);
                return objB == C4696b.e() ? objB : C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l<T> lVar, InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1458D = lVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((g) create(interfaceC1971f, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            g gVar = new g(this.f1458D, interfaceC4588d);
            gVar.f1457C = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = C4696b.e();
            int i10 = this.f1456B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1971f interfaceC1971f = (InterfaceC1971f) this.f1457C;
                B1.m mVar = (B1.m) ((l) this.f1458D).downstreamFlow.getValue();
                if (!(mVar instanceof B1.b)) {
                    ((l) this.f1458D).actor.e(new b.a(mVar));
                }
                b bVar = new b(C1972g.l(((l) this.f1458D).downstreamFlow, new a(mVar, null)));
                this.f1456B = 1;
                if (C1972g.n(interfaceC1971f, bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h extends AbstractC3864v implements Ba.a<File> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l<T> f1467B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(l<T> lVar) {
            super(0);
            this.f1467B = lVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((l) this.f1467B).produceFile.invoke();
            String it = file.getAbsolutePath();
            Companion companion = l.INSTANCE;
            synchronized (companion.b()) {
                if (companion.a().contains(it)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> setA = companion.a();
                C3862t.f(it, "it");
                setA.add(it);
            }
            return file;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1468B;

        /* renamed from: C, reason: collision with root package name */
        Object f1469C;

        /* renamed from: D, reason: collision with root package name */
        Object f1470D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f1471E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l<T> f1472F;

        /* renamed from: G, reason: collision with root package name */
        int f1473G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(l<T> lVar, InterfaceC4588d<? super i> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1472F = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1471E = obj;
            this.f1473G |= Integer.MIN_VALUE;
            return this.f1472F.t(null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1474B;

        /* renamed from: C, reason: collision with root package name */
        Object f1475C;

        /* renamed from: D, reason: collision with root package name */
        Object f1476D;

        /* renamed from: E, reason: collision with root package name */
        Object f1477E;

        /* renamed from: F, reason: collision with root package name */
        Object f1478F;

        /* renamed from: G, reason: collision with root package name */
        Object f1479G;

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f1480H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ l<T> f1481I;

        /* renamed from: J, reason: collision with root package name */
        int f1482J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(l<T> lVar, InterfaceC4588d<? super j> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1481I = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1480H = obj;
            this.f1482J |= Integer.MIN_VALUE;
            return this.f1481I.u(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J7\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"B1/l$k", "LB1/h;", "Lkotlin/Function2;", "Lta/d;", "", "transform", "a", "(LBa/p;Lta/d;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class k implements B1.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3460a f1483a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f1484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O<T> f1485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f1486d;

        /* compiled from: SingleProcessDataStore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f1487B;

            /* renamed from: C, reason: collision with root package name */
            Object f1488C;

            /* renamed from: D, reason: collision with root package name */
            Object f1489D;

            /* renamed from: E, reason: collision with root package name */
            Object f1490E;

            /* renamed from: F, reason: collision with root package name */
            Object f1491F;

            /* renamed from: G, reason: collision with root package name */
            /* synthetic */ Object f1492G;

            /* renamed from: I, reason: collision with root package name */
            int f1494I;

            a(InterfaceC4588d<? super a> interfaceC4588d) {
                super(interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f1492G = obj;
                this.f1494I |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(InterfaceC3460a interfaceC3460a, K k10, O<T> o10, l<T> lVar) {
            this.f1483a = interfaceC3460a;
            this.f1484b = k10;
            this.f1485c = o10;
            this.f1486d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // B1.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(Ba.p<? super T, ? super ta.InterfaceC4588d<? super T>, ? extends java.lang.Object> r11, ta.InterfaceC4588d<? super T> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B1.l.k.a(Ba.p, ta.d):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: B1.l$l, reason: collision with other inner class name */
    static final class C0027l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1495B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f1496C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l<T> f1497D;

        /* renamed from: E, reason: collision with root package name */
        int f1498E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0027l(l<T> lVar, InterfaceC4588d<? super C0027l> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1497D = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1496C = obj;
            this.f1498E |= Integer.MIN_VALUE;
            return this.f1497D.v(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1499B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f1500C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l<T> f1501D;

        /* renamed from: E, reason: collision with root package name */
        int f1502E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(l<T> lVar, InterfaceC4588d<? super m> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1501D = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1500C = obj;
            this.f1502E |= Integer.MIN_VALUE;
            return this.f1501D.w(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1503B;

        /* renamed from: C, reason: collision with root package name */
        Object f1504C;

        /* renamed from: D, reason: collision with root package name */
        Object f1505D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f1506E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l<T> f1507F;

        /* renamed from: G, reason: collision with root package name */
        int f1508G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(l<T> lVar, InterfaceC4588d<? super n> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1507F = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1506E = obj;
            this.f1508G |= Integer.MIN_VALUE;
            return this.f1507F.x(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1509B;

        /* renamed from: C, reason: collision with root package name */
        Object f1510C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f1511D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ l<T> f1512E;

        /* renamed from: F, reason: collision with root package name */
        int f1513F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(l<T> lVar, InterfaceC4588d<? super o> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1512E = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1511D = obj;
            this.f1513F |= Integer.MIN_VALUE;
            return this.f1512E.y(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1514B;

        /* renamed from: C, reason: collision with root package name */
        Object f1515C;

        /* renamed from: D, reason: collision with root package name */
        Object f1516D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f1517E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l<T> f1518F;

        /* renamed from: G, reason: collision with root package name */
        int f1519G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(l<T> lVar, InterfaceC4588d<? super p> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1518F = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1517E = obj;
            this.f1519G |= Integer.MIN_VALUE;
            return this.f1518F.z(null, null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LXb/I;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class q extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super T>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1520B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p<T, InterfaceC4588d<? super T>, Object> f1521C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ T f1522D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Ba.p<? super T, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, T t10, InterfaceC4588d<? super q> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1521C = pVar;
            this.f1522D = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new q(this.f1521C, this.f1522D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super T> interfaceC4588d) {
            return ((q) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f1520B;
            if (i10 == 0) {
                C4173r.b(obj);
                Ba.p<T, InterfaceC4588d<? super T>, Object> pVar = this.f1521C;
                T t10 = this.f1522D;
                this.f1520B = 1;
                obj = pVar.invoke(t10, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1523B;

        /* renamed from: C, reason: collision with root package name */
        Object f1524C;

        /* renamed from: D, reason: collision with root package name */
        Object f1525D;

        /* renamed from: E, reason: collision with root package name */
        Object f1526E;

        /* renamed from: F, reason: collision with root package name */
        Object f1527F;

        /* renamed from: G, reason: collision with root package name */
        /* synthetic */ Object f1528G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ l<T> f1529H;

        /* renamed from: I, reason: collision with root package name */
        int f1530I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(l<T> lVar, InterfaceC4588d<? super r> interfaceC4588d) {
            super(interfaceC4588d);
            this.f1529H = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1528G = obj;
            this.f1530I |= Integer.MIN_VALUE;
            return this.f1529H.A(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(Ba.a<? extends File> produceFile, B1.j<T> serializer, List<? extends Ba.p<? super B1.h<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object>> initTasksList, a<T> corruptionHandler, I scope) {
        C3862t.g(produceFile, "produceFile");
        C3862t.g(serializer, "serializer");
        C3862t.g(initTasksList, "initTasksList");
        C3862t.g(corruptionHandler, "corruptionHandler");
        C3862t.g(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = C1972g.r(new g(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = C4165j.a(new h(this));
        this.downstreamFlow = J.a(B1.n.f1531a);
        this.initTasks = kotlin.collections.r.W0(initTasksList);
        this.actor = new B1.k<>(scope, new d(this), e.f1452B, new f(this, null));
    }

    private final void q(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(C3862t.n("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File r() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(b.a<T> aVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        B1.m<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof B1.b)) {
            if (value instanceof B1.i) {
                if (value == aVar.a()) {
                    Object objW = w(interfaceC4588d);
                    return objW == C4696b.e() ? objW : C4153F.f46609a;
                }
            } else {
                if (C3862t.b(value, B1.n.f1531a)) {
                    Object objW2 = w(interfaceC4588d);
                    return objW2 == C4696b.e() ? objW2 : C4153F.f46609a;
                }
                if (value instanceof B1.g) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [B1.l, B1.l<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [Xb.u] */
    /* JADX WARN: Type inference failed for: r9v3, types: [Xb.u] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(B1.l.b.C0025b<T> r9, ta.InterfaceC4588d<? super oa.C4153F> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.t(B1.l$b$b, ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(ta.InterfaceC4588d<? super oa.C4153F> r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.u(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(ta.InterfaceC4588d<? super oa.C4153F> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof B1.l.C0027l
            if (r0 == 0) goto L13
            r0 = r5
            B1.l$l r0 = (B1.l.C0027l) r0
            int r1 = r0.f1498E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1498E = r1
            goto L18
        L13:
            B1.l$l r0 = new B1.l$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1496C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1498E
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f1495B
            B1.l r0 = (B1.l) r0
            oa.C4173r.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            oa.C4173r.b(r5)
            r0.f1495B = r4     // Catch: java.lang.Throwable -> L48
            r0.f1498E = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            oa.F r5 = oa.C4153F.f46609a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            ac.t<B1.m<T>> r0 = r0.downstreamFlow
            B1.i r1 = new B1.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.v(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(ta.InterfaceC4588d<? super oa.C4153F> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof B1.l.m
            if (r0 == 0) goto L13
            r0 = r5
            B1.l$m r0 = (B1.l.m) r0
            int r1 = r0.f1502E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1502E = r1
            goto L18
        L13:
            B1.l$m r0 = new B1.l$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1500C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1502E
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f1499B
            B1.l r0 = (B1.l) r0
            oa.C4173r.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            oa.C4173r.b(r5)
            r0.f1499B = r4     // Catch: java.lang.Throwable -> L45
            r0.f1502E = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            ac.t<B1.m<T>> r0 = r0.downstreamFlow
            B1.i r1 = new B1.i
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.w(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [B1.l] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [B1.l$n, ta.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [B1.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [B1.j, B1.j<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(ta.InterfaceC4588d<? super T> r6) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof B1.l.n
            if (r0 == 0) goto L13
            r0 = r6
            B1.l$n r0 = (B1.l.n) r0
            int r1 = r0.f1508G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1508G = r1
            goto L18
        L13:
            B1.l$n r0 = new B1.l$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1506E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1508G
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f1505D
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f1504C
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f1503B
            B1.l r0 = (B1.l) r0
            oa.C4173r.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            oa.C4173r.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            B1.j<T> r6 = r5.serializer     // Catch: java.lang.Throwable -> L65
            r0.f1503B = r5     // Catch: java.lang.Throwable -> L65
            r0.f1504C = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f1505D = r4     // Catch: java.lang.Throwable -> L65
            r0.f1508G = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            za.C5220a.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            za.C5220a.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            B1.j<T> r6 = r0.serializer
            java.lang.Object r6 = r6.a()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.x(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(ta.InterfaceC4588d<? super T> r8) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof B1.l.o
            if (r0 == 0) goto L13
            r0 = r8
            B1.l$o r0 = (B1.l.o) r0
            int r1 = r0.f1513F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1513F = r1
            goto L18
        L13:
            B1.l$o r0 = new B1.l$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1511D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1513F
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f1510C
            java.lang.Object r0 = r0.f1509B
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            oa.C4173r.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f1510C
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f1509B
            B1.l r4 = (B1.l) r4
            oa.C4173r.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f1509B
            B1.l r2 = (B1.l) r2
            oa.C4173r.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            oa.C4173r.b(r8)
            r0.f1509B = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.f1513F = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.x(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            B1.a<T> r5 = r2.corruptionHandler
            r0.f1509B = r2
            r0.f1510C = r8
            r0.f1513F = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f1509B = r2     // Catch: java.io.IOException -> L88
            r0.f1510C = r8     // Catch: java.io.IOException -> L88
            r0.f1513F = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            oa.C4158c.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.y(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(Ba.p<? super T, ? super ta.InterfaceC4588d<? super T>, ? extends java.lang.Object> r8, ta.g r9, ta.InterfaceC4588d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof B1.l.p
            if (r0 == 0) goto L13
            r0 = r10
            B1.l$p r0 = (B1.l.p) r0
            int r1 = r0.f1519G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1519G = r1
            goto L18
        L13:
            B1.l$p r0 = new B1.l$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f1517E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1519G
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f1515C
            java.lang.Object r9 = r0.f1514B
            B1.l r9 = (B1.l) r9
            oa.C4173r.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f1516D
            java.lang.Object r9 = r0.f1515C
            B1.b r9 = (B1.b) r9
            java.lang.Object r2 = r0.f1514B
            B1.l r2 = (B1.l) r2
            oa.C4173r.b(r10)
            goto L73
        L49:
            oa.C4173r.b(r10)
            ac.t<B1.m<T>> r10 = r7.downstreamFlow
            java.lang.Object r10 = r10.getValue()
            B1.b r10 = (B1.b) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            B1.l$q r6 = new B1.l$q
            r6.<init>(r8, r2, r3)
            r0.f1514B = r7
            r0.f1515C = r10
            r0.f1516D = r2
            r0.f1519G = r5
            java.lang.Object r8 = Xb.C1837g.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = kotlin.jvm.internal.C3862t.b(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f1514B = r2
            r0.f1515C = r10
            r0.f1516D = r3
            r0.f1519G = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            ac.t<B1.m<T>> r9 = r9.downstreamFlow
            B1.b r10 = new B1.b
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.z(Ba.p, ta.g, ta.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(T r8, ta.InterfaceC4588d<? super oa.C4153F> r9) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof B1.l.r
            if (r0 == 0) goto L13
            r0 = r9
            B1.l$r r0 = (B1.l.r) r0
            int r1 = r0.f1530I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1530I = r1
            goto L18
        L13:
            B1.l$r r0 = new B1.l$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f1528G
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1530I
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f1527F
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f1526E
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f1525D
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f1524C
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f1523B
            B1.l r0 = (B1.l) r0
            oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            oa.C4173r.b(r9)
            java.io.File r9 = r7.r()
            r7.q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.SCRATCH_SUFFIX
            java.lang.String r2 = kotlin.jvm.internal.C3862t.n(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            B1.j<T> r4 = r7.serializer     // Catch: java.lang.Throwable -> Lc1
            B1.l$c r5 = new B1.l$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.f1523B = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f1524C = r9     // Catch: java.lang.Throwable -> Lc1
            r0.f1525D = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.f1526E = r6     // Catch: java.lang.Throwable -> Lc1
            r0.f1527F = r2     // Catch: java.lang.Throwable -> Lc1
            r0.f1530I = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.b(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            oa.F r8 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L3d
            za.C5220a.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.r()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            oa.F r8 = oa.C4153F.f46609a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            za.C5220a.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.l.A(java.lang.Object, ta.d):java.lang.Object");
    }

    @Override // B1.e
    public Object a(Ba.p<? super T, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) throws Throwable {
        InterfaceC1864u interfaceC1864uB = C1868w.b(null, 1, null);
        this.actor.e(new b.C0025b(pVar, interfaceC1864uB, this.downstreamFlow.getValue(), interfaceC4588d.getContext()));
        return interfaceC1864uB.n(interfaceC4588d);
    }

    @Override // B1.e
    public InterfaceC1970e<T> f() {
        return this.data;
    }
}
