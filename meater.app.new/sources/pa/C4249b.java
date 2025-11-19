package pa;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC3822c;
import kotlin.collections.AbstractC3825f;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\b\u0000\u0018\u0000 \u0001*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003_`aB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0001\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010$J\u001d\u0010'\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b'\u0010(J%\u0010'\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b'\u0010)J\u000f\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010\"J\u001d\u0010.\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b.\u0010(J\u001d\u0010/\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b/\u0010(J%\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u00103J)\u00107\u001a\b\u0012\u0004\u0012\u00028\u000105\"\u0004\b\u0001\u001042\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010905H\u0016¢\u0006\u0004\b7\u0010:J\u001a\u0010<\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b<\u0010\"J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020#H\u0002¢\u0006\u0004\bB\u0010+J\u000f\u0010C\u001a\u00020#H\u0002¢\u0006\u0004\bC\u0010+J\u0017\u0010E\u001a\u00020#2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010\u000bJ\u0017\u0010G\u001a\u00020#2\u0006\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bG\u0010\u000bJ\u001b\u0010H\u001a\u00020\u000e2\n\u0010;\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020#2\u0006\u0010J\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020#2\u0006\u0010J\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010$J-\u0010N\u001a\u00020#2\u0006\u0010J\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00028\u00002\u0006\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0013J\u001f\u0010S\u001a\u00020#2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010LJ5\u0010U\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010T\u001a\u00020\u000eH\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010WR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ER\u0016\u0010\\\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010[R\u0014\u0010^\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010>¨\u0006b"}, d2 = {"Lpa/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Loa/F;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "K", "F", "n", "I", "minCapacity", "H", "G", "(Ljava/util/List;)Z", "i", "J", "(II)V", "D", "B", "(ILjava/util/Collection;I)V", "L", "rangeOffset", "rangeLength", "M", "retain", "O", "(IILjava/util/Collection;Z)I", "[Ljava/lang/Object;", "backing", "C", "length", "Z", "isReadOnly", "getSize", "size", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4249b<E> extends AbstractC3825f<E> implements List<E>, RandomAccess, Serializable, Ca.d {

    /* renamed from: E, reason: collision with root package name */
    private static final C0662b f47675E = new C0662b(null);

    /* renamed from: F, reason: collision with root package name */
    private static final C4249b f47676F;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private E[] backing;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001a\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001`BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010\u0001\u001a\u00020'H\u0002¢\u0006\u0004\b\u0001\u0010/J\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u001b\u0010H\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030GH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020'2\u0006\u0010J\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bK\u0010(J-\u0010M\u001a\u00020'2\u0006\u0010J\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00028\u00012\u0006\u0010J\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010\u0017J\u001f\u0010R\u001a\u00020'2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010SJ5\u0010U\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010T\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010[R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\\R\u0014\u0010^\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010AR\u0014\u0010_\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0014¨\u0006a"}, d2 = {"Lpa/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lpa/b;", "root", "<init>", "([Ljava/lang/Object;IILpa/b$a;Lpa/b;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Loa/F;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "z", "A", "", "B", "(Ljava/util/List;)Z", "i", "y", "n", "x", "(ILjava/util/Collection;I)V", "F", "rangeOffset", "rangeLength", "G", "(II)V", "retain", "H", "(IILjava/util/Collection;Z)I", "[Ljava/lang/Object;", "C", "I", "D", "Lpa/b$a;", "Lpa/b;", "getSize", "size", "isReadOnly", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.b$a */
    public static final class a<E> extends AbstractC3825f<E> implements List<E>, RandomAccess, Serializable, Ca.d {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private E[] backing;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final a<E> parent;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final C4249b<E> root;

        /* compiled from: ListBuilder.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u001e¨\u0006\""}, d2 = {"Lpa/b$a$a;", "E", "", "Lpa/b$a;", "list", "", "index", "<init>", "(Lpa/b$a;I)V", "Loa/F;", "b", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "B", "Lpa/b$a;", "C", "I", "D", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: pa.b$a$a, reason: collision with other inner class name */
        private static final class C0661a<E> implements ListIterator<E>, Ca.a {

            /* renamed from: B, reason: collision with root package name and from kotlin metadata */
            private final a<E> list;

            /* renamed from: C, reason: collision with root package name and from kotlin metadata */
            private int index;

            /* renamed from: D, reason: collision with root package name and from kotlin metadata */
            private int lastIndex;

            /* renamed from: E, reason: collision with root package name and from kotlin metadata */
            private int expectedModCount;

            public C0661a(a<E> list, int i10) {
                C3862t.g(list, "list");
                this.list = list;
                this.index = i10;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) ((a) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                b();
                a<E> aVar = this.list;
                int i10 = this.index;
                this.index = i10 + 1;
                aVar.add(i10, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((a) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                b();
                if (this.index >= ((a) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i10 = this.index;
                this.index = i10 + 1;
                this.lastIndex = i10;
                return (E) ((a) this.list).backing[((a) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                b();
                int i10 = this.index;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.index = i11;
                this.lastIndex = i11;
                return (E) ((a) this.list).backing[((a) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.remove(i10);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                b();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i10, element);
            }
        }

        public a(E[] backing, int i10, int i11, a<E> aVar, C4249b<E> root) {
            C3862t.g(backing, "backing");
            C3862t.g(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = aVar;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void A() {
            if (D()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean B(List<?> other) {
            return C4250c.h(this.backing, this.offset, this.length, other);
        }

        private final boolean D() {
            return ((C4249b) this.root).isReadOnly;
        }

        private final void E() {
            ((AbstractList) this).modCount++;
        }

        private final E F(int i10) {
            E();
            a<E> aVar = this.parent;
            this.length--;
            return aVar != null ? aVar.F(i10) : (E) this.root.L(i10);
        }

        private final void G(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                E();
            }
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.G(rangeOffset, rangeLength);
            } else {
                this.root.M(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int H(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            a<E> aVar = this.parent;
            int iH = aVar != null ? aVar.H(rangeOffset, rangeLength, elements, retain) : this.root.O(rangeOffset, rangeLength, elements, retain);
            if (iH > 0) {
                E();
            }
            this.length -= iH;
            return iH;
        }

        private final void x(int i10, Collection<? extends E> elements, int n10) {
            E();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.x(i10, elements, n10);
            } else {
                this.root.B(i10, elements, n10);
            }
            this.backing = (E[]) ((C4249b) this.root).backing;
            this.length += n10;
        }

        private final void y(int i10, E element) {
            E();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.y(i10, element);
            } else {
                this.root.D(i10, element);
            }
            this.backing = (E[]) ((C4249b) this.root).backing;
            this.length++;
        }

        private final void z() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            A();
            z();
            y(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            C3862t.g(elements, "elements");
            A();
            z();
            int size = elements.size();
            x(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            A();
            z();
            G(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            z();
            return other == this || ((other instanceof List) && B((List) other));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            z();
            AbstractC3822c.INSTANCE.b(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // kotlin.collections.AbstractC3825f
        public int getSize() {
            z();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            z();
            return C4250c.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            z();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (C3862t.b(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            z();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            z();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (C3862t.b(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            A();
            z();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<? extends Object> elements) {
            C3862t.g(elements, "elements");
            A();
            z();
            return H(this.offset, this.length, elements, false) > 0;
        }

        @Override // kotlin.collections.AbstractC3825f
        public E removeAt(int index) {
            A();
            z();
            AbstractC3822c.INSTANCE.b(index, this.length);
            return F(this.offset + index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<? extends Object> elements) {
            C3862t.g(elements, "elements");
            A();
            z();
            return H(this.offset, this.length, elements, true) > 0;
        }

        @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            A();
            z();
            AbstractC3822c.INSTANCE.b(index, this.length);
            E[] eArr = this.backing;
            int i10 = this.offset;
            E e10 = eArr[i10 + index];
            eArr[i10 + index] = element;
            return e10;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            AbstractC3822c.INSTANCE.d(fromIndex, toIndex, this.length);
            return new a(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            C3862t.g(array, "array");
            z();
            int length = array.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                C3831l.l(eArr, array, 0, i11, i10 + i11);
                return (T[]) r.f(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, array.getClass());
            C3862t.f(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            z();
            return C4250c.j(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            z();
            AbstractC3822c.INSTANCE.c(index, this.length);
            return new C0661a(this, index);
        }

        @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            A();
            z();
            AbstractC3822c.INSTANCE.c(index, this.length);
            y(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            C3862t.g(elements, "elements");
            A();
            z();
            AbstractC3822c.INSTANCE.c(index, this.length);
            int size = elements.size();
            x(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            z();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return C3831l.r(eArr, i10, this.length + i10);
        }
    }

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpa/b$b;", "", "<init>", "()V", "Lpa/b;", "", "Empty", "Lpa/b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.b$b, reason: collision with other inner class name */
    private static final class C0662b {
        public /* synthetic */ C0662b(C3854k c3854k) {
            this();
        }

        private C0662b() {
        }
    }

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u001e¨\u0006\""}, d2 = {"Lpa/b$c;", "E", "", "Lpa/b;", "list", "", "index", "<init>", "(Lpa/b;I)V", "Loa/F;", "b", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "B", "Lpa/b;", "C", "I", "D", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pa.b$c */
    private static final class c<E> implements ListIterator<E>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final C4249b<E> list;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public c(C4249b<E> list, int i10) {
            C3862t.g(list, "list");
            this.list = list;
            this.index = i10;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            b();
            C4249b<E> c4249b = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            c4249b.add(i10, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((C4249b) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.index >= ((C4249b) this.list).length) {
                throw new NoSuchElementException();
            }
            int i10 = this.index;
            this.index = i10 + 1;
            this.lastIndex = i10;
            return (E) ((C4249b) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i10 = this.index;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.index = i11;
            this.lastIndex = i11;
            return (E) ((C4249b) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.remove(i10);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            b();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i10, element);
        }
    }

    static {
        C4249b c4249b = new C4249b(0);
        c4249b.isReadOnly = true;
        f47676F = c4249b;
    }

    public C4249b() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i10, Collection<? extends E> elements, int n10) {
        K();
        J(i10, n10);
        Iterator<? extends E> it = elements.iterator();
        for (int i11 = 0; i11 < n10; i11++) {
            this.backing[i10 + i11] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i10, E element) {
        K();
        J(i10, 1);
        this.backing[i10] = element;
    }

    private final void F() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean G(List<?> other) {
        return C4250c.h(this.backing, 0, this.length, other);
    }

    private final void H(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) C4250c.e(this.backing, AbstractC3822c.INSTANCE.e(eArr.length, minCapacity));
        }
    }

    private final void I(int n10) {
        H(this.length + n10);
    }

    private final void J(int i10, int n10) {
        I(n10);
        E[] eArr = this.backing;
        C3831l.l(eArr, eArr, i10 + n10, i10, this.length);
        this.length += n10;
    }

    private final void K() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E L(int i10) {
        K();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        C3831l.l(eArr, eArr, i10, i10 + 1, this.length);
        C4250c.f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            K();
        }
        E[] eArr = this.backing;
        C3831l.l(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i10 = this.length;
        C4250c.g(eArr2, i10 - rangeLength, i10);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < rangeLength) {
            int i12 = rangeOffset + i10;
            if (elements.contains(this.backing[i12]) == retain) {
                E[] eArr = this.backing;
                i10++;
                eArr[i11 + rangeOffset] = eArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = rangeLength - i11;
        E[] eArr2 = this.backing;
        C3831l.l(eArr2, eArr2, rangeOffset + i11, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i14 = this.length;
        C4250c.g(eArr3, i14 - i13, i14);
        if (i13 > 0) {
            K();
        }
        this.length -= i13;
        return i13;
    }

    public final List<E> E() {
        F();
        this.isReadOnly = true;
        return this.length > 0 ? this : f47676F;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        F();
        D(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C3862t.g(elements, "elements");
        F();
        int size = elements.size();
        B(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        F();
        M(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        return other == this || ((other instanceof List) && G((List) other));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractC3822c.INSTANCE.b(index, this.length);
        return this.backing[index];
    }

    @Override // kotlin.collections.AbstractC3825f
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return C4250c.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (C3862t.b(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (C3862t.b(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        F();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        C3862t.g(elements, "elements");
        F();
        return O(0, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractC3825f
    public E removeAt(int index) {
        F();
        AbstractC3822c.INSTANCE.b(index, this.length);
        return L(index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        C3862t.g(elements, "elements");
        F();
        return O(0, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        F();
        AbstractC3822c.INSTANCE.b(index, this.length);
        E[] eArr = this.backing;
        E e10 = eArr[index];
        eArr[index] = element;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractC3822c.INSTANCE.d(fromIndex, toIndex, this.length);
        return new a(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        C3862t.g(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length >= i10) {
            C3831l.l(this.backing, array, 0, 0, i10);
            return (T[]) r.f(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
        C3862t.f(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return C4250c.j(this.backing, 0, this.length, this);
    }

    public C4249b(int i10) {
        this.backing = (E[]) C4250c.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        AbstractC3822c.INSTANCE.c(index, this.length);
        return new c(this, index);
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        F();
        AbstractC3822c.INSTANCE.c(index, this.length);
        D(index, element);
    }

    public /* synthetic */ C4249b(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        C3862t.g(elements, "elements");
        F();
        AbstractC3822c.INSTANCE.c(index, this.length);
        int size = elements.size();
        B(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return C3831l.r(this.backing, 0, this.length);
    }
}
