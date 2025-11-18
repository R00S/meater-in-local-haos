package kotlin;

import Ba.p;
import kotlin.Metadata;
import ta.g;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbc/i;", "Lta/g;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lta/g;)V", "R", "initial", "Lkotlin/Function2;", "Lta/g$b;", "operation", "L", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "E", "Lta/g$c;", "key", "b", "(Lta/g$c;)Lta/g$b;", "N", "(Lta/g$c;)Lta/g;", "context", "s", "(Lta/g;)Lta/g;", "B", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2293i implements g {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final Throwable e;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ g f30779C;

    public C2293i(Throwable th, g gVar) {
        this.e = th;
        this.f30779C = gVar;
    }

    @Override // ta.g
    public <R> R L(R initial, p<? super R, ? super g.b, ? extends R> operation) {
        return (R) this.f30779C.L(initial, operation);
    }

    @Override // ta.g
    public g N(g.c<?> key) {
        return this.f30779C.N(key);
    }

    @Override // ta.g
    public <E extends g.b> E b(g.c<E> key) {
        return (E) this.f30779C.b(key);
    }

    @Override // ta.g
    public g s(g context) {
        return this.f30779C.s(context);
    }
}
