package kotlin.collections.builders;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C10801m;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;

/* compiled from: MapBuilder.kt */
@Metadata(m32266d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 {*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\u0007{|}~\u007f\u0080\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00107J\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109J\r\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\b<J\b\u0010=\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020;H\u0002J\u0019\u0010?\u001a\u00020!2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030AH\u0000¢\u0006\u0002\bBJ!\u0010C\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020!2\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010HJ\u0018\u0010K\u001a\u00020!2\u000e\u0010L\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000309H\u0002J\u0010\u0010M\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020\bH\u0002J\u0019\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010QH\u0000¢\u0006\u0002\bRJ\u0013\u0010S\u001a\u00020!2\b\u0010L\u001a\u0004\u0018\u00010TH\u0096\u0002J\u0015\u0010U\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\u0015\u0010V\u001a\u00020\b2\u0006\u0010J\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00105J\u0018\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\b\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020!H\u0016J\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0002\b^J\u001f\u0010_\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010`J\u001e\u0010a\u001a\u00020;2\u0014\u0010b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0016J\"\u0010c\u001a\u00020!2\u0018\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0AH\u0002J\u001c\u0010d\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0002J\u0010\u0010e\u001a\u00020!2\u0006\u0010f\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020;2\u0006\u0010h\u001a\u00020\bH\u0002J\u0017\u0010i\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ!\u0010j\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u00020;2\u0006\u0010m\u001a\u00020\bH\u0002J\u0017\u0010n\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\bo\u00105J\u0010\u0010p\u001a\u00020;2\u0006\u0010q\u001a\u00020\bH\u0002J\u0017\u0010r\u001a\u00020!2\u0006\u0010s\u001a\u00028\u0001H\u0000¢\u0006\u0004\bt\u0010HJ\b\u0010u\u001a\u00020vH\u0016J\u0019\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010xH\u0000¢\u0006\u0002\byJ\b\u0010z\u001a\u00020TH\u0002R\u0014\u0010\u0013\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "keysArray", HttpUrl.FRAGMENT_ENCODE_SET, "valuesArray", "presenceArray", HttpUrl.FRAGMENT_ENCODE_SET, "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity", "()I", "entries", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", HttpUrl.FRAGMENT_ENCODE_SET, "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "keys", "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "size", "getSize", "values", HttpUrl.FRAGMENT_ENCODE_SET, "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", RoomNotification.KEY, "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", HttpUrl.FRAGMENT_ENCODE_SET, "checkIsMutable", HttpUrl.FRAGMENT_ENCODE_SET, "checkIsMutable$kotlin_stdlib", "clear", "compact", "containsAllEntries", "m", HttpUrl.FRAGMENT_ENCODE_SET, "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", HttpUrl.FRAGMENT_ENCODE_SET, "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "contentEquals", "other", "ensureCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "putAllEntries", "putEntry", "putRehash", "i", "rehash", "newHashSize", "remove", "removeEntry", "removeEntry$kotlin_stdlib", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeKeyAt", "index", "removeValue", "element", "removeValue$kotlin_stdlib", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* renamed from: f */
    private static final a f41490f = new a(null);

    /* renamed from: g */
    private K[] f41491g;

    /* renamed from: h */
    private V[] f41492h;

    /* renamed from: i */
    private int[] f41493i;

    /* renamed from: j */
    private int[] f41494j;

    /* renamed from: k */
    private int f41495k;

    /* renamed from: l */
    private int f41496l;

    /* renamed from: m */
    private int f41497m;

    /* renamed from: n */
    private int f41498n;

    /* renamed from: o */
    private MapBuilderKeys<K> f41499o;

    /* renamed from: p */
    private MapBuilderValues<V> f41500p;

    /* renamed from: q */
    private MapBuilderEntries<K, V> f41501q;

    /* renamed from: r */
    private boolean f41502r;

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "INITIAL_CAPACITY", HttpUrl.FRAGMENT_ENCODE_SET, "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.d$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m39002c(int i2) {
            return Integer.highestOneBit(C9848l.m32419b(i2, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m39003d(int i2) {
            return Integer.numberOfLeadingZeros(i2) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", HttpUrl.FRAGMENT_ENCODE_SET, "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", HttpUrl.FRAGMENT_ENCODE_SET, "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.d$b */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C9801m.m32346f(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (getF41506g() >= ((MapBuilder) m39009d()).f41496l) {
                throw new NoSuchElementException();
            }
            int f41506g = getF41506g();
            m39011h(f41506g + 1);
            m39012i(f41506g);
            c<K, V> cVar = new c<>(m39009d(), getF41507h());
            m39010e();
            return cVar;
        }

        /* renamed from: k */
        public final void m39005k(StringBuilder sb) {
            C9801m.m32346f(sb, "sb");
            if (getF41506g() >= ((MapBuilder) m39009d()).f41496l) {
                throw new NoSuchElementException();
            }
            int f41506g = getF41506g();
            m39011h(f41506g + 1);
            m39012i(f41506g);
            Object obj = ((MapBuilder) m39009d()).f41491g[getF41507h()];
            if (C9801m.m32341a(obj, m39009d())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((MapBuilder) m39009d()).f41492h;
            C9801m.m32343c(objArr);
            Object obj2 = objArr[getF41507h()];
            if (C9801m.m32341a(obj2, m39009d())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            m39010e();
        }

        /* renamed from: m */
        public final int m39006m() {
            if (getF41506g() >= ((MapBuilder) m39009d()).f41496l) {
                throw new NoSuchElementException();
            }
            int f41506g = getF41506g();
            m39011h(f41506g + 1);
            m39012i(f41506g);
            Object obj = ((MapBuilder) m39009d()).f41491g[getF41507h()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) m39009d()).f41492h;
            C9801m.m32343c(objArr);
            Object obj2 = objArr[getF41507h()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m39010e();
            return iHashCode2;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/collections/builders/MapBuilder;I)V", RoomNotification.KEY, "getKey", "()Ljava/lang/Object;", "value", "getValue", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.d$c */
    public static final class c<K, V> implements Map.Entry<K, V>, KMappedMarker {

        /* renamed from: f */
        private final MapBuilder<K, V> f41503f;

        /* renamed from: g */
        private final int f41504g;

        public c(MapBuilder<K, V> mapBuilder, int i2) {
            C9801m.m32346f(mapBuilder, "map");
            this.f41503f = mapBuilder;
            this.f41504g = i2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (other instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) other;
                if (C9801m.m32341a(entry.getKey(), getKey()) && C9801m.m32341a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.f41503f).f41491g[this.f41504g];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.f41503f).f41492h;
            C9801m.m32343c(objArr);
            return (V) objArr[this.f41504g];
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
            this.f41503f.m38993k();
            Object[] objArrM38975i = this.f41503f.m38975i();
            int i2 = this.f41504g;
            V v = (V) objArrM38975i[i2];
            objArrM38975i[i2] = newValue;
            return v;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "initNext", HttpUrl.FRAGMENT_ENCODE_SET, "initNext$kotlin_stdlib", "remove", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.d$d */
    public static class d<K, V> {

        /* renamed from: f */
        private final MapBuilder<K, V> f41505f;

        /* renamed from: g */
        private int f41506g;

        /* renamed from: h */
        private int f41507h;

        public d(MapBuilder<K, V> mapBuilder) {
            C9801m.m32346f(mapBuilder, "map");
            this.f41505f = mapBuilder;
            this.f41507h = -1;
            m39010e();
        }

        /* renamed from: b, reason: from getter */
        public final int getF41506g() {
            return this.f41506g;
        }

        /* renamed from: c, reason: from getter */
        public final int getF41507h() {
            return this.f41507h;
        }

        /* renamed from: d */
        public final MapBuilder<K, V> m39009d() {
            return this.f41505f;
        }

        /* renamed from: e */
        public final void m39010e() {
            while (this.f41506g < ((MapBuilder) this.f41505f).f41496l) {
                int[] iArr = ((MapBuilder) this.f41505f).f41493i;
                int i2 = this.f41506g;
                if (iArr[i2] >= 0) {
                    return;
                } else {
                    this.f41506g = i2 + 1;
                }
            }
        }

        /* renamed from: h */
        public final void m39011h(int i2) {
            this.f41506g = i2;
        }

        public final boolean hasNext() {
            return this.f41506g < ((MapBuilder) this.f41505f).f41496l;
        }

        /* renamed from: i */
        public final void m39012i(int i2) {
            this.f41507h = i2;
        }

        public final void remove() {
            if (!(this.f41507h != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f41505f.m38993k();
            this.f41505f.m38968L(this.f41507h);
            this.f41507h = -1;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.d$e */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C9801m.m32346f(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (getF41506g() >= ((MapBuilder) m39009d()).f41496l) {
                throw new NoSuchElementException();
            }
            int f41506g = getF41506g();
            m39011h(f41506g + 1);
            m39012i(f41506g);
            K k2 = (K) ((MapBuilder) m39009d()).f41491g[getF41507h()];
            m39010e();
            return k2;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.d$f */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C9801m.m32346f(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (getF41506g() >= ((MapBuilder) m39009d()).f41496l) {
                throw new NoSuchElementException();
            }
            int f41506g = getF41506g();
            m39011h(f41506g + 1);
            m39012i(f41506g);
            Object[] objArr = ((MapBuilder) m39009d()).f41492h;
            C9801m.m32343c(objArr);
            V v = (V) objArr[getF41507h()];
            m39010e();
            return v;
        }
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i2, int i3) {
        this.f41491g = kArr;
        this.f41492h = vArr;
        this.f41493i = iArr;
        this.f41494j = iArr2;
        this.f41495k = i2;
        this.f41496l = i3;
        this.f41497m = f41490f.m39003d(m38983x());
    }

    /* renamed from: B */
    private final int m38962B(K k2) {
        return ((k2 != null ? k2.hashCode() : 0) * (-1640531527)) >>> this.f41497m;
    }

    /* renamed from: E */
    private final boolean m38963E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m38979r(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (m38964F(it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F */
    private final boolean m38964F(Map.Entry<? extends K, ? extends V> entry) {
        int iM38991h = m38991h(entry.getKey());
        V[] vArrM38975i = m38975i();
        if (iM38991h >= 0) {
            vArrM38975i[iM38991h] = entry.getValue();
            return true;
        }
        int i2 = (-iM38991h) - 1;
        if (C9801m.m32341a(entry.getValue(), vArrM38975i[i2])) {
            return false;
        }
        vArrM38975i[i2] = entry.getValue();
        return true;
    }

    /* renamed from: G */
    private final boolean m38965G(int i2) {
        int iM38962B = m38962B(this.f41491g[i2]);
        int i3 = this.f41495k;
        while (true) {
            int[] iArr = this.f41494j;
            if (iArr[iM38962B] == 0) {
                iArr[iM38962B] = i2 + 1;
                this.f41493i[i2] = iM38962B;
                return true;
            }
            i3--;
            if (i3 < 0) {
                return false;
            }
            iM38962B = iM38962B == 0 ? m38983x() - 1 : iM38962B - 1;
        }
    }

    /* renamed from: H */
    private final void m38966H(int i2) {
        if (this.f41496l > size()) {
            m38976m();
        }
        int i3 = 0;
        if (i2 != m38983x()) {
            this.f41494j = new int[i2];
            this.f41497m = f41490f.m39003d(i2);
        } else {
            C10801m.m38709j(this.f41494j, 0, 0, m38983x());
        }
        while (i3 < this.f41496l) {
            int i4 = i3 + 1;
            if (!m38965G(i3)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i3 = i4;
        }
    }

    /* renamed from: J */
    private final void m38967J(int i2) {
        int iM32421d = C9848l.m32421d(this.f41495k * 2, m38983x() / 2);
        int i3 = 0;
        int i4 = i2;
        do {
            i2 = i2 == 0 ? m38983x() - 1 : i2 - 1;
            i3++;
            if (i3 > this.f41495k) {
                this.f41494j[i4] = 0;
                return;
            }
            int[] iArr = this.f41494j;
            int i5 = iArr[i2];
            if (i5 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i4] = -1;
            } else {
                int i6 = i5 - 1;
                if (((m38962B(this.f41491g[i6]) - i2) & (m38983x() - 1)) >= i3) {
                    this.f41494j[i4] = i5;
                    this.f41493i[i6] = i4;
                }
                iM32421d--;
            }
            i4 = i2;
            i3 = 0;
            iM32421d--;
        } while (iM32421d >= 0);
        this.f41494j[i4] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m38968L(int i2) {
        C10830c.m38957f(this.f41491g, i2);
        m38967J(this.f41493i[i2]);
        this.f41493i[i2] = -1;
        this.f41498n = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final V[] m38975i() {
        V[] vArr = this.f41492h;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C10830c.m38955d(m38982v());
        this.f41492h = vArr2;
        return vArr2;
    }

    /* renamed from: m */
    private final void m38976m() {
        int i2;
        V[] vArr = this.f41492h;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.f41496l;
            if (i3 >= i2) {
                break;
            }
            if (this.f41493i[i3] >= 0) {
                K[] kArr = this.f41491g;
                kArr[i4] = kArr[i3];
                if (vArr != null) {
                    vArr[i4] = vArr[i3];
                }
                i4++;
            }
            i3++;
        }
        C10830c.m38958g(this.f41491g, i4, i2);
        if (vArr != null) {
            C10830c.m38958g(vArr, i4, this.f41496l);
        }
        this.f41496l = i4;
    }

    /* renamed from: p */
    private final boolean m38977p(Map<?, ?> map) {
        return size() == map.size() && m38994n(map.entrySet());
    }

    /* renamed from: q */
    private final void m38978q(int i2) {
        if (i2 < 0) {
            throw new OutOfMemoryError();
        }
        if (i2 <= m38982v()) {
            if ((this.f41496l + i2) - size() > m38982v()) {
                m38966H(m38983x());
                return;
            }
            return;
        }
        int iM38982v = (m38982v() * 3) / 2;
        if (i2 <= iM38982v) {
            i2 = iM38982v;
        }
        this.f41491g = (K[]) C10830c.m38956e(this.f41491g, i2);
        V[] vArr = this.f41492h;
        this.f41492h = vArr != null ? (V[]) C10830c.m38956e(vArr, i2) : null;
        int[] iArrCopyOf = Arrays.copyOf(this.f41493i, i2);
        C9801m.m32345e(iArrCopyOf, "copyOf(this, newSize)");
        this.f41493i = iArrCopyOf;
        int iM39002c = f41490f.m39002c(i2);
        if (iM39002c > m38983x()) {
            m38966H(iM39002c);
        }
    }

    /* renamed from: r */
    private final void m38979r(int i2) {
        m38978q(this.f41496l + i2);
    }

    /* renamed from: t */
    private final int m38980t(K k2) {
        int iM38962B = m38962B(k2);
        int i2 = this.f41495k;
        while (true) {
            int i3 = this.f41494j[iM38962B];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (C9801m.m32341a(this.f41491g[i4], k2)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            iM38962B = iM38962B == 0 ? m38983x() - 1 : iM38962B - 1;
        }
    }

    /* renamed from: u */
    private final int m38981u(V v) {
        int i2 = this.f41496l;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f41493i[i2] >= 0) {
                V[] vArr = this.f41492h;
                C9801m.m32343c(vArr);
                if (C9801m.m32341a(vArr[i2], v)) {
                    return i2;
                }
            }
        }
    }

    /* renamed from: v */
    private final int m38982v() {
        return this.f41491g.length;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f41502r) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final int m38983x() {
        return this.f41494j.length;
    }

    /* renamed from: A */
    public Collection<V> m38984A() {
        MapBuilderValues<V> mapBuilderValues = this.f41500p;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.f41500p = mapBuilderValues2;
        return mapBuilderValues2;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getF41502r() {
        return this.f41502r;
    }

    /* renamed from: D */
    public final e<K, V> m38986D() {
        return new e<>(this);
    }

    /* renamed from: I */
    public final boolean m38987I(Map.Entry<? extends K, ? extends V> entry) {
        C9801m.m32346f(entry, "entry");
        m38993k();
        int iM38980t = m38980t(entry.getKey());
        if (iM38980t < 0) {
            return false;
        }
        V[] vArr = this.f41492h;
        C9801m.m32343c(vArr);
        if (!C9801m.m32341a(vArr[iM38980t], entry.getValue())) {
            return false;
        }
        m38968L(iM38980t);
        return true;
    }

    /* renamed from: K */
    public final int m38988K(K k2) {
        m38993k();
        int iM38980t = m38980t(k2);
        if (iM38980t < 0) {
            return -1;
        }
        m38968L(iM38980t);
        return iM38980t;
    }

    /* renamed from: M */
    public final boolean m38989M(V v) {
        m38993k();
        int iM38981u = m38981u(v);
        if (iM38981u < 0) {
            return false;
        }
        m38968L(iM38981u);
        return true;
    }

    /* renamed from: N */
    public final f<K, V> m38990N() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m38993k();
        IntIterator it = new IntRange(0, this.f41496l - 1).iterator();
        while (it.hasNext()) {
            int iMo32397b = it.mo32397b();
            int[] iArr = this.f41493i;
            int i2 = iArr[iMo32397b];
            if (i2 >= 0) {
                this.f41494j[i2] = 0;
                iArr[iMo32397b] = -1;
            }
        }
        C10830c.m38958g(this.f41491g, 0, this.f41496l);
        V[] vArr = this.f41492h;
        if (vArr != null) {
            C10830c.m38958g(vArr, 0, this.f41496l);
        }
        this.f41498n = 0;
        this.f41496l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return m38980t(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return m38981u(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m38997w();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return other == this || ((other instanceof Map) && m38977p((Map) other));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iM38980t = m38980t(key);
        if (iM38980t < 0) {
            return null;
        }
        V[] vArr = this.f41492h;
        C9801m.m32343c(vArr);
        return vArr[iM38980t];
    }

    /* renamed from: h */
    public final int m38991h(K k2) {
        m38993k();
        while (true) {
            int iM38962B = m38962B(k2);
            int iM32421d = C9848l.m32421d(this.f41495k * 2, m38983x() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.f41494j[iM38962B];
                if (i3 <= 0) {
                    if (this.f41496l < m38982v()) {
                        int i4 = this.f41496l;
                        int i5 = i4 + 1;
                        this.f41496l = i5;
                        this.f41491g[i4] = k2;
                        this.f41493i[i4] = iM38962B;
                        this.f41494j[iM38962B] = i5;
                        this.f41498n = size() + 1;
                        if (i2 > this.f41495k) {
                            this.f41495k = i2;
                        }
                        return i4;
                    }
                    m38979r(1);
                } else {
                    if (C9801m.m32341a(this.f41491g[i3 - 1], k2)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > iM32421d) {
                        m38966H(m38983x() * 2);
                        break;
                    }
                    iM38962B = iM38962B == 0 ? m38983x() - 1 : iM38962B - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarM38996s = m38996s();
        int iM39006m = 0;
        while (bVarM38996s.hasNext()) {
            iM39006m += bVarM38996s.m39006m();
        }
        return iM39006m;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final Map<K, V> m38992j() {
        m38993k();
        this.f41502r = true;
        return this;
    }

    /* renamed from: k */
    public final void m38993k() {
        if (this.f41502r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m38998y();
    }

    /* renamed from: n */
    public final boolean m38994n(Collection<?> collection) {
        C9801m.m32346f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m38995o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m38995o(Map.Entry<? extends K, ? extends V> entry) {
        C9801m.m32346f(entry, "entry");
        int iM38980t = m38980t(entry.getKey());
        if (iM38980t < 0) {
            return false;
        }
        V[] vArr = this.f41492h;
        C9801m.m32343c(vArr);
        return C9801m.m32341a(vArr[iM38980t], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        m38993k();
        int iM38991h = m38991h(key);
        V[] vArrM38975i = m38975i();
        if (iM38991h >= 0) {
            vArrM38975i[iM38991h] = value;
            return null;
        }
        int i2 = (-iM38991h) - 1;
        V v = vArrM38975i[i2];
        vArrM38975i[i2] = value;
        return v;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        C9801m.m32346f(from, "from");
        m38993k();
        m38963E(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        int iM38988K = m38988K(key);
        if (iM38988K < 0) {
            return null;
        }
        V[] vArr = this.f41492h;
        C9801m.m32343c(vArr);
        V v = vArr[iM38988K];
        C10830c.m38957f(vArr, iM38988K);
        return v;
    }

    /* renamed from: s */
    public final b<K, V> m38996s() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getF41498n();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> bVarM38996s = m38996s();
        int i2 = 0;
        while (bVarM38996s.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            bVarM38996s.m39005k(sb);
            i2++;
        }
        sb.append("}");
        String string = sb.toString();
        C9801m.m32345e(string, "sb.toString()");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m38984A();
    }

    /* renamed from: w */
    public Set<Map.Entry<K, V>> m38997w() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.f41501q;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.f41501q = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    /* renamed from: y */
    public Set<K> m38998y() {
        MapBuilderKeys<K> mapBuilderKeys = this.f41499o;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.f41499o = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    /* renamed from: z, reason: from getter */
    public int getF41498n() {
        return this.f41498n;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i2) {
        this(C10830c.m38955d(i2), null, new int[i2], new int[f41490f.m39002c(i2)], 2, 0);
    }
}
