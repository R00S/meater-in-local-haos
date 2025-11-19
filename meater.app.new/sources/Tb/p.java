package Tb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sequences.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\n\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0012\u0010\u000f\u001a+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u0018\u0010\u0017\u001a)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001c\u0010\u0017\u001a7\u0010 \u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u001e*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010$\u001aC\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\n¢\u0006\u0004\b)\u0010\u0017\u001a=\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b*\u0010\u0017\u001aC\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010'*\u00020\u0019*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n¢\u0006\u0004\b+\u0010\u0017\u001a\u001d\u0010,\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b,\u0010-\u001a.\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b.\u0010/\u001a4\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0086\u0002¢\u0006\u0004\b2\u00103\u001a4\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\u001e\u00104\u001a}\u0010>\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010**\u000605j\u0002`6*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00107\u001a\u00028\u00012\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020\u00062\b\b\u0002\u0010=\u001a\u0002082\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000208\u0018\u00010\n¢\u0006\u0004\b>\u0010?\u001ag\u0010A\u001a\u00020@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020\u00062\b\b\u0002\u0010=\u001a\u0002082\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000208\u0018\u00010\n¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\b\u0012\u0004\u0012\u00028\u000000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bC\u0010D¨\u0006E"}, d2 = {"T", "LTb/h;", "element", "", "l", "(LTb/h;Ljava/lang/Object;)Z", "", "index", "o", "(LTb/h;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "p", "(LTb/h;ILBa/l;)Ljava/lang/Object;", "t", "(LTb/h;)Ljava/lang/Object;", "v", "(LTb/h;Ljava/lang/Object;)I", "z", "n", "(LTb/h;I)LTb/h;", "predicate", "q", "(LTb/h;LBa/l;)LTb/h;", "r", "", "s", "(LTb/h;)LTb/h;", "F", "", "C", "destination", "G", "(LTb/h;Ljava/util/Collection;)Ljava/util/Collection;", "", "H", "(LTb/h;)Ljava/util/List;", "", "I", "R", "transform", "u", "A", "B", "m", "(LTb/h;)I", "E", "(LTb/h;Ljava/lang/Object;)LTb/h;", "", "elements", "D", "(LTb/h;Ljava/lang/Iterable;)LTb/h;", "(LTb/h;LTb/h;)LTb/h;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "w", "(LTb/h;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/Appendable;", "", "x", "(LTb/h;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/String;", "k", "(LTb/h;)Ljava/lang/Iterable;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class p extends o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Tb/p$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements Iterable<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ h f16698B;

        public a(h hVar) {
            this.f16698B = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f16698B.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class b<T> extends AbstractC3864v implements Ba.l<Integer, T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f16699B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f16699B = i10;
        }

        public final T a(int i10) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f16699B + '.');
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c<T> extends AbstractC3864v implements Ba.l<T, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f16700B = new c();

        c() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(t10 == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: _Sequences.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class d<R> extends C3860q implements Ba.l<h<? extends R>, Iterator<? extends R>> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f16701B = new d();

        d() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(h<? extends R> p02) {
            C3862t.g(p02, "p0");
            return p02.iterator();
        }
    }

    public static <T, R> h<R> A(h<? extends T> hVar, Ba.l<? super T, ? extends R> transform) {
        C3862t.g(hVar, "<this>");
        C3862t.g(transform, "transform");
        return new r(hVar, transform);
    }

    public static <T, R> h<R> B(h<? extends T> hVar, Ba.l<? super T, ? extends R> transform) {
        C3862t.g(hVar, "<this>");
        C3862t.g(transform, "transform");
        return k.s(new r(hVar, transform));
    }

    public static <T> h<T> C(h<? extends T> hVar, h<? extends T> elements) {
        C3862t.g(hVar, "<this>");
        C3862t.g(elements, "elements");
        return n.f(k.j(hVar, elements));
    }

    public static <T> h<T> D(h<? extends T> hVar, Iterable<? extends T> elements) {
        C3862t.g(hVar, "<this>");
        C3862t.g(elements, "elements");
        return n.f(k.j(hVar, kotlin.collections.r.Z(elements)));
    }

    public static <T> h<T> E(h<? extends T> hVar, T t10) {
        C3862t.g(hVar, "<this>");
        return n.f(k.j(hVar, k.j(t10)));
    }

    public static <T> h<T> F(h<? extends T> hVar, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(hVar, "<this>");
        C3862t.g(predicate, "predicate");
        return new q(hVar, predicate);
    }

    public static final <T, C extends Collection<? super T>> C G(h<? extends T> hVar, C destination) {
        C3862t.g(hVar, "<this>");
        C3862t.g(destination, "destination");
        Iterator<? extends T> it = hVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> List<T> H(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return kotlin.collections.r.m();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.r.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> I(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        return (List) G(hVar, new ArrayList());
    }

    public static <T> Iterable<T> k(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        return new a(hVar);
    }

    public static <T> boolean l(h<? extends T> hVar, T t10) {
        C3862t.g(hVar, "<this>");
        return v(hVar, t10) >= 0;
    }

    public static <T> int m(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                kotlin.collections.r.v();
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> h<T> n(h<? extends T> hVar, int i10) {
        C3862t.g(hVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? hVar : hVar instanceof Tb.c ? ((Tb.c) hVar).a(i10) : new Tb.b(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> T o(h<? extends T> hVar, int i10) {
        C3862t.g(hVar, "<this>");
        return (T) p(hVar, i10, new b(i10));
    }

    public static final <T> T p(h<? extends T> hVar, int i10, Ba.l<? super Integer, ? extends T> defaultValue) {
        C3862t.g(hVar, "<this>");
        C3862t.g(defaultValue, "defaultValue");
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : hVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    public static <T> h<T> q(h<? extends T> hVar, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(hVar, "<this>");
        C3862t.g(predicate, "predicate");
        return new e(hVar, true, predicate);
    }

    public static <T> h<T> r(h<? extends T> hVar, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(hVar, "<this>");
        C3862t.g(predicate, "predicate");
        return new e(hVar, false, predicate);
    }

    public static <T> h<T> s(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        h<T> hVarR = k.r(hVar, c.f16700B);
        C3862t.e(hVarR, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return hVarR;
    }

    public static <T> T t(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T, R> h<R> u(h<? extends T> hVar, Ba.l<? super T, ? extends h<? extends R>> transform) {
        C3862t.g(hVar, "<this>");
        C3862t.g(transform, "transform");
        return new f(hVar, transform, d.f16701B);
    }

    public static final <T> int v(h<? extends T> hVar, T t10) {
        C3862t.g(hVar, "<this>");
        int i10 = 0;
        for (T t11 : hVar) {
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            if (C3862t.b(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A w(h<? extends T> hVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ba.l<? super T, ? extends CharSequence> lVar) throws IOException {
        C3862t.g(hVar, "<this>");
        C3862t.g(buffer, "buffer");
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : hVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Ub.n.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String x(h<? extends T> hVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ba.l<? super T, ? extends CharSequence> lVar) {
        C3862t.g(hVar, "<this>");
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        String string = ((StringBuilder) w(hVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String y(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Ba.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return x(hVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T> T z(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
