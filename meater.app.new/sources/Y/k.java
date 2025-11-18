package Y;

import Ba.p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: Saver.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a[\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\b\"\u0004\b\u0000\u0010\u000b¢\u0006\u0004\b\f\u0010\r\"\"\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "LY/l;", "save", "Lkotlin/Function1;", "restore", "LY/j;", "a", "(LBa/p;LBa/l;)LY/j;", "T", "b", "()LY/j;", "LY/j;", "AutoSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final j<Object, Object> f19181a = a(a.f19182B, b.f19183B);

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Y/k$c", "LY/j;", "LY/l;", "value", "b", "(LY/l;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c<Original, Saveable> implements j<Original, Saveable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<l, Original, Saveable> f19184a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ba.l<Saveable, Original> f19185b;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super l, ? super Original, ? extends Saveable> pVar, Ba.l<? super Saveable, ? extends Original> lVar) {
            this.f19184a = pVar;
            this.f19185b = lVar;
        }

        @Override // Y.j
        public Original a(Saveable value) {
            return this.f19185b.invoke(value);
        }

        @Override // Y.j
        public Saveable b(l lVar, Original original) {
            return this.f19184a.invoke(lVar, original);
        }
    }

    public static final <Original, Saveable> j<Original, Saveable> a(p<? super l, ? super Original, ? extends Saveable> pVar, Ba.l<? super Saveable, ? extends Original> lVar) {
        return new c(pVar, lVar);
    }

    public static final <T> j<T, Object> b() {
        j<T, Object> jVar = (j<T, Object>) f19181a;
        C3862t.e(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return jVar;
    }

    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends AbstractC3864v implements Ba.l<Object, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f19183B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LY/l;", "", "it", "a", "(LY/l;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements p<l, Object, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f19182B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Object obj) {
            return obj;
        }
    }
}
