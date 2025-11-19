package pa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC3822c;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\t\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\f\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010\"J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0004\b,\u0010\"J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0013J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u001f\u00103\u001a\u00020\u00192\u000e\u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b3\u00104J#\u0010\u0001\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0002¢\u0006\u0004\b\u0001\u00107J)\u0010:\u001a\u00020\u00192\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010508H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0019H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00192\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010FJ%\u0010G\u001a\u00020\u00142\u0014\u00109\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010DJ\u000f\u0010J\u001a\u00020\u0014H\u0016¢\u0006\u0004\bJ\u0010\u0011J\u001a\u0010L\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u00010KH\u0096\u0002¢\u0006\u0004\bL\u0010AJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010R\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\bR\u0010\"J\u0017\u0010S\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\bS\u0010AJ#\u0010T\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bT\u00107J\u001b\u0010U\u001a\u00020\u00192\n\u0010<\u001a\u0006\u0012\u0002\b\u000308H\u0000¢\u0006\u0004\bU\u0010;J#\u0010V\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bV\u00107J\u0017\u0010X\u001a\u00020\u00192\u0006\u0010W\u001a\u00028\u0001H\u0000¢\u0006\u0004\bX\u0010AJ\u001b\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010YH\u0000¢\u0006\u0004\bZ\u0010[J\u001b\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\\H\u0000¢\u0006\u0004\b\u0002\u0010]J\u001b\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010^H\u0000¢\u0006\u0004\b_\u0010`R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010ZR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010ZR\u0016\u0010i\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010ZR\u0016\u0010j\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010ZR$\u0010l\u001a\u00020\f2\u0006\u0010k\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b:\u0010Z\u001a\u0004\bg\u0010NR\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010nR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010qR$\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010tR$\u0010x\u001a\u00020\u00192\u0006\u0010k\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010v\u001a\u0004\bw\u0010?R\u0014\u0010y\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010NR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010{R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00010}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010~R(\u0010\u0081\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0080\u00010z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010{R\u0015\u0010\u0082\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010N¨\u0006\u0089\u0001"}, d2 = {"Lpa/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "Loa/F;", "M", "n", "x", "extraCapacity", "", "U", "(I)Z", "minCapacity", "w", "l", "()[Ljava/lang/Object;", "key", "H", "(Ljava/lang/Object;)I", "updateHashArray", "p", "(Z)V", "newHashSize", "N", "i", "L", "z", "value", "A", "index", "Q", "removedHash", "R", "", "other", "u", "(Ljava/util/Map;)Z", "", "entry", "(Ljava/util/Map$Entry;)Z", "", "from", "J", "(Ljava/util/Collection;)Z", "m", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "k", "S", "s", "q", "O", "element", "T", "Lpa/d$e;", "I", "()Lpa/d$e;", "Lpa/d$f;", "()Lpa/d$f;", "Lpa/d$b;", "y", "()Lpa/d$b;", "B", "[Ljava/lang/Object;", "C", "D", "[I", "E", "F", "G", "hashShift", "modCount", "<set-?>", "size", "Lpa/f;", "Lpa/f;", "keysView", "Lpa/g;", "Lpa/g;", "valuesView", "Lpa/e;", "Lpa/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "hashSize", "", "()Ljava/util/Set;", "keys", "", "()Ljava/util/Collection;", "values", "", "entries", "capacity", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pa.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4251d<K, V> implements Map<K, V>, Serializable, Ca.e {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: P, reason: collision with root package name */
    private static final C4251d f47694P;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private K[] keysArray;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private V[] valuesArray;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int[] presenceArray;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int[] hashArray;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int maxProbeDistance;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private int hashShift;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private C4253f<K> keysView;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private C4254g<V> valuesView;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private C4252e<K, V> entriesView;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpa/d$a;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", "d", "Lpa/d;", "", "Empty", "Lpa/d;", "e", "()Lpa/d;", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int capacity) {
            return Integer.highestOneBit(Ha.g.d(capacity, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        public final C4251d e() {
            return C4251d.f47694P;
        }

        private Companion() {
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpa/d$b;", "K", "V", "Lpa/d$d;", "", "", "Lpa/d;", "map", "<init>", "(Lpa/d;)V", "Lpa/d$c;", "l", "()Lpa/d$c;", "", "n", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Loa/F;", "m", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.d$b */
    public static final class b<K, V> extends C0663d<K, V> implements Iterator<Map.Entry<K, V>>, Ca.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4251d<K, V> map) {
            super(map);
            C3862t.g(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            if (getIndex() >= ((C4251d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            c<K, V> cVar = new c<>(h(), getLastIndex());
            i();
            return cVar;
        }

        public final void m(StringBuilder sb2) {
            C3862t.g(sb2, "sb");
            if (getIndex() >= ((C4251d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            Object obj = ((C4251d) h()).keysArray[getLastIndex()];
            if (obj == h()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((C4251d) h()).valuesArray;
            C3862t.d(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == h()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            i();
        }

        public final int n() {
            if (getIndex() >= ((C4251d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            Object obj = ((C4251d) h()).keysArray[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((C4251d) h()).valuesArray;
            C3862t.d(objArr);
            Object obj2 = objArr[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            i();
            return iHashCode2;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00032\u0006\u0010\n\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lpa/d$c;", "K", "V", "", "Lpa/d;", "map", "", "index", "<init>", "(Lpa/d;I)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "Lpa/d;", "C", "I", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.d$c */
    public static final class c<K, V> implements Map.Entry<K, V>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final C4251d<K, V> map;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final int index;

        public c(C4251d<K, V> map, int i10) {
            C3862t.g(map, "map");
            this.map = map;
            this.index = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (other instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) other;
                if (C3862t.b(entry.getKey(), getKey()) && C3862t.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C4251d) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C4251d) this.map).valuesArray;
            C3862t.d(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            this.map.n();
            Object[] objArrL = this.map.l();
            int i10 = this.index;
            V v10 = (V) objArrL[i10];
            objArrL[i10] = newValue;
            return v10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0016\u0010!\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0016¨\u0006\""}, d2 = {"Lpa/d$d;", "K", "V", "", "Lpa/d;", "map", "<init>", "(Lpa/d;)V", "Loa/F;", "i", "()V", "", "hasNext", "()Z", "remove", "b", "B", "Lpa/d;", "h", "()Lpa/d;", "", "C", "I", "d", "()I", "j", "(I)V", "index", "D", "g", "k", "lastIndex", "E", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.d$d, reason: collision with other inner class name */
    public static class C0663d<K, V> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final C4251d<K, V> map;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public C0663d(C4251d<K, V> map) {
            C3862t.g(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((C4251d) map).modCount;
            i();
        }

        public final void b() {
            if (((C4251d) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: d, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: g, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final C4251d<K, V> h() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < ((C4251d) this.map).length;
        }

        public final void i() {
            while (this.index < ((C4251d) this.map).length) {
                int[] iArr = ((C4251d) this.map).presenceArray;
                int i10 = this.index;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.index = i10 + 1;
                }
            }
        }

        public final void j(int i10) {
            this.index = i10;
        }

        public final void k(int i10) {
            this.lastIndex = i10;
        }

        public final void remove() {
            b();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.n();
            this.map.Q(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((C4251d) this.map).modCount;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpa/d$e;", "K", "V", "Lpa/d$d;", "", "Lpa/d;", "map", "<init>", "(Lpa/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.d$e */
    public static final class e<K, V> extends C0663d<K, V> implements Iterator<K>, Ca.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C4251d<K, V> map) {
            super(map);
            C3862t.g(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (getIndex() >= ((C4251d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            K k10 = (K) ((C4251d) h()).keysArray[getLastIndex()];
            i();
            return k10;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpa/d$f;", "K", "V", "Lpa/d$d;", "", "Lpa/d;", "map", "<init>", "(Lpa/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.d$f */
    public static final class f<K, V> extends C0663d<K, V> implements Iterator<V>, Ca.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C4251d<K, V> map) {
            super(map);
            C3862t.g(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (getIndex() >= ((C4251d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            Object[] objArr = ((C4251d) h()).valuesArray;
            C3862t.d(objArr);
            V v10 = (V) objArr[getLastIndex()];
            i();
            return v10;
        }
    }

    static {
        C4251d c4251d = new C4251d(0);
        c4251d.isReadOnly = true;
        f47694P = c4251d;
    }

    private C4251d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = INSTANCE.d(D());
    }

    private final int A(V value) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                C3862t.d(vArr);
                if (C3862t.b(vArr[i10], value)) {
                    return i10;
                }
            }
        }
    }

    private final int D() {
        return this.hashArray.length;
    }

    private final int H(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean J(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z10 = false;
        if (from.isEmpty()) {
            return false;
        }
        x(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (K(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean K(Map.Entry<? extends K, ? extends V> entry) {
        int iK = k(entry.getKey());
        V[] vArrL = l();
        if (iK >= 0) {
            vArrL[iK] = entry.getValue();
            return true;
        }
        int i10 = (-iK) - 1;
        if (C3862t.b(entry.getValue(), vArrL[i10])) {
            return false;
        }
        vArrL[i10] = entry.getValue();
        return true;
    }

    private final boolean L(int i10) {
        int iH = H(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iH] == 0) {
                iArr[iH] = i10 + 1;
                this.presenceArray[i10] = iH;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iH = iH == 0 ? D() - 1 : iH - 1;
        }
    }

    private final void M() {
        this.modCount++;
    }

    private final void N(int newHashSize) {
        M();
        int i10 = 0;
        if (this.length > size()) {
            p(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.d(newHashSize);
        while (i10 < this.length) {
            int i11 = i10 + 1;
            if (!L(i10)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int index) {
        C4250c.f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C4250c.f(vArr, index);
        }
        R(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        M();
    }

    private final void R(int removedHash) {
        int iG = Ha.g.g(this.maxProbeDistance * 2, D() / 2);
        int i10 = 0;
        int i11 = removedHash;
        do {
            removedHash = removedHash == 0 ? D() - 1 : removedHash - 1;
            i10++;
            if (i10 > this.maxProbeDistance) {
                this.hashArray[i11] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i12 = iArr[removedHash];
            if (i12 == 0) {
                iArr[i11] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                if (((H(this.keysArray[i13]) - removedHash) & (D() - 1)) >= i10) {
                    this.hashArray[i11] = i12;
                    this.presenceArray[i13] = i11;
                }
                iG--;
            }
            i11 = removedHash;
            i10 = 0;
            iG--;
        } while (iG >= 0);
        this.hashArray[i11] = -1;
    }

    private final boolean U(int extraCapacity) {
        int iB = B();
        int i10 = this.length;
        int i11 = iB - i10;
        int size = i10 - size();
        return i11 < extraCapacity && i11 + size >= extraCapacity && size >= B() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] l() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C4250c.d(B());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void p(boolean updateHashArray) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (updateHashArray) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        C4250c.g(this.keysArray, i12, i10);
        if (vArr != null) {
            C4250c.g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    private final boolean u(Map<?, ?> other) {
        return size() == other.size() && q(other.entrySet());
    }

    private final void w(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > B()) {
            int iE = AbstractC3822c.INSTANCE.e(B(), minCapacity);
            this.keysArray = (K[]) C4250c.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) C4250c.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            C3862t.f(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = INSTANCE.c(iE);
            if (iC > D()) {
                N(iC);
            }
        }
    }

    private final void x(int n10) {
        if (U(n10)) {
            p(true);
        } else {
            w(this.length + n10);
        }
    }

    private final int z(K key) {
        int iH = H(key);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iH];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (C3862t.b(this.keysArray[i12], key)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iH = iH == 0 ? D() - 1 : iH - 1;
        }
    }

    public final int B() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> C() {
        C4252e<K, V> c4252e = this.entriesView;
        if (c4252e != null) {
            return c4252e;
        }
        C4252e<K, V> c4252e2 = new C4252e<>(this);
        this.entriesView = c4252e2;
        return c4252e2;
    }

    public Set<K> E() {
        C4253f<K> c4253f = this.keysView;
        if (c4253f != null) {
            return c4253f;
        }
        C4253f<K> c4253f2 = new C4253f<>(this);
        this.keysView = c4253f2;
        return c4253f2;
    }

    /* renamed from: F, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public Collection<V> G() {
        C4254g<V> c4254g = this.valuesView;
        if (c4254g != null) {
            return c4254g;
        }
        C4254g<V> c4254g2 = new C4254g<>(this);
        this.valuesView = c4254g2;
        return c4254g2;
    }

    public final e<K, V> I() {
        return new e<>(this);
    }

    public final boolean O(Map.Entry<? extends K, ? extends V> entry) {
        C3862t.g(entry, "entry");
        n();
        int iZ = z(entry.getKey());
        if (iZ < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C3862t.d(vArr);
        if (!C3862t.b(vArr[iZ], entry.getValue())) {
            return false;
        }
        Q(iZ);
        return true;
    }

    public final boolean S(K key) {
        n();
        int iZ = z(key);
        if (iZ < 0) {
            return false;
        }
        Q(iZ);
        return true;
    }

    public final boolean T(V element) {
        n();
        int iA = A(element);
        if (iA < 0) {
            return false;
        }
        Q(iA);
        return true;
    }

    public final f<K, V> V() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        C4250c.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C4250c.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return z(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return A(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return C();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return other == this || ((other instanceof Map) && u((Map) other));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iZ = z(key);
        if (iZ < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C3862t.d(vArr);
        return vArr[iZ];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarY = y();
        int iN = 0;
        while (bVarY.hasNext()) {
            iN += bVarY.n();
        }
        return iN;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(K key) {
        n();
        while (true) {
            int iH = H(key);
            int iG = Ha.g.g(this.maxProbeDistance * 2, D() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iH];
                if (i11 <= 0) {
                    if (this.length < B()) {
                        int i12 = this.length;
                        int i13 = i12 + 1;
                        this.length = i13;
                        this.keysArray[i12] = key;
                        this.presenceArray[i12] = iH;
                        this.hashArray[iH] = i13;
                        this.size = size() + 1;
                        M();
                        if (i10 > this.maxProbeDistance) {
                            this.maxProbeDistance = i10;
                        }
                        return i12;
                    }
                    x(1);
                } else {
                    if (C3862t.b(this.keysArray[i11 - 1], key)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iG) {
                        N(D() * 2);
                        break;
                    }
                    iH = iH == 0 ? D() - 1 : iH - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return E();
    }

    public final Map<K, V> m() {
        n();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        C4251d c4251d = f47694P;
        C3862t.e(c4251d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c4251d;
    }

    public final void n() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        n();
        int iK = k(key);
        V[] vArrL = l();
        if (iK >= 0) {
            vArrL[iK] = value;
            return null;
        }
        int i10 = (-iK) - 1;
        V v10 = vArrL[i10];
        vArrL[i10] = value;
        return v10;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        C3862t.g(from, "from");
        n();
        J(from.entrySet());
    }

    public final boolean q(Collection<?> m10) {
        C3862t.g(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!s((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        n();
        int iZ = z(key);
        if (iZ < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C3862t.d(vArr);
        V v10 = vArr[iZ];
        Q(iZ);
        return v10;
    }

    public final boolean s(Map.Entry<? extends K, ? extends V> entry) {
        C3862t.g(entry, "entry");
        int iZ = z(entry.getKey());
        if (iZ < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C3862t.d(vArr);
        return C3862t.b(vArr[iZ], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarY = y();
        int i10 = 0;
        while (bVarY.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarY.m(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return G();
    }

    public final b<K, V> y() {
        return new b<>(this);
    }

    public C4251d() {
        this(8);
    }

    public C4251d(int i10) {
        this(C4250c.d(i10), null, new int[i10], new int[INSTANCE.c(i10)], 2, 0);
    }
}
