package Tb;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0012\u0010\f\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "", "LTb/h;", "c", "(Ljava/util/Iterator;)LTb/h;", "", "elements", "j", "([Ljava/lang/Object;)LTb/h;", "e", "()LTb/h;", "f", "(LTb/h;)LTb/h;", "R", "Lkotlin/Function1;", "iterator", "g", "(LTb/h;LBa/l;)LTb/h;", "d", "", "Lkotlin/Function0;", "nextFunction", "h", "(LBa/a;)LTb/h;", "seed", "i", "(Ljava/lang/Object;LBa/l;)LTb/h;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class n extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Tb/n$a", "LTb/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f16693a;

        public a(Iterator it) {
            this.f16693a = it;
        }

        @Override // Tb.h
        public Iterator<T> iterator() {
            return this.f16693a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LTb/h;", "it", "", "a", "(LTb/h;)Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
    static final class b<T> extends AbstractC3864v implements Ba.l<h<? extends T>, Iterator<? extends T>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f16694B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(h<? extends T> it) {
            C3862t.g(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d<T> extends AbstractC3864v implements Ba.l<T, T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<T> f16696B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Ba.a<? extends T> aVar) {
            super(1);
            this.f16696B = aVar;
        }

        @Override // Ba.l
        public final T invoke(T it) {
            C3862t.g(it, "it");
            return this.f16696B.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e<T> extends AbstractC3864v implements Ba.a<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ T f16697B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t10) {
            super(0);
            this.f16697B = t10;
        }

        @Override // Ba.a
        public final T invoke() {
            return this.f16697B;
        }
    }

    public static <T> h<T> c(Iterator<? extends T> it) {
        C3862t.g(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> d(h<? extends T> hVar) {
        C3862t.g(hVar, "<this>");
        return hVar instanceof Tb.a ? hVar : new Tb.a(hVar);
    }

    public static <T> h<T> e() {
        return Tb.d.f16668a;
    }

    public static final <T> h<T> f(h<? extends h<? extends T>> hVar) {
        C3862t.g(hVar, "<this>");
        return g(hVar, b.f16694B);
    }

    private static final <T, R> h<R> g(h<? extends T> hVar, Ba.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return hVar instanceof r ? ((r) hVar).d(lVar) : new f(hVar, c.f16695B, lVar);
    }

    public static <T> h<T> h(Ba.a<? extends T> nextFunction) {
        C3862t.g(nextFunction, "nextFunction");
        return d(new g(nextFunction, new d(nextFunction)));
    }

    public static <T> h<T> i(T t10, Ba.l<? super T, ? extends T> nextFunction) {
        C3862t.g(nextFunction, "nextFunction");
        return t10 == null ? Tb.d.f16668a : new g(new e(t10), nextFunction);
    }

    public static <T> h<T> j(T... elements) {
        C3862t.g(elements, "elements");
        return C3831l.O(elements);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c<T> extends AbstractC3864v implements Ba.l<T, T> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f16695B = new c();

        c() {
            super(1);
        }

        @Override // Ba.l
        public final T invoke(T t10) {
            return t10;
        }
    }
}
