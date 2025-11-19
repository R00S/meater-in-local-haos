package C1;

import Ba.l;
import androidx.datastore.core.CorruptionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.InterfaceC4588d;

/* compiled from: ReplaceFileCorruptionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"LC1/b;", "T", "LB1/a;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(LBa/l;)V", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lta/d;)Ljava/lang/Object;", "LBa/l;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class b<T> implements B1.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super CorruptionException, ? extends T> produceNewData) {
        C3862t.g(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // B1.a
    public Object a(CorruptionException corruptionException, InterfaceC4588d<? super T> interfaceC4588d) {
        return this.produceNewData.invoke(corruptionException);
    }
}
