package kotlin;

import Ha.f;
import Ha.g;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;
import kotlin.x1;

/* compiled from: LazyLayoutNearestRangeState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"LC/y;", "LO/x1;", "LHa/f;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "Loa/F;", "j", "(I)V", "B", "I", "C", "<set-?>", "D", "LO/p0;", "h", "()LHa/f;", "i", "(LHa/f;)V", "value", "E", "lastFirstVisibleItem", "F", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y implements x1<f> {

    /* renamed from: F, reason: collision with root package name */
    private static final a f2100F = new a(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int slidingWindowSize;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int extraItemCount;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 value;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int lastFirstVisibleItem;

    /* compiled from: LazyLayoutNearestRangeState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LC/y$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "LHa/f;", "b", "(III)LHa/f;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i10 = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return g.p(Math.max(i10 - extraItemCount, 0), i10 + slidingWindowSize + extraItemCount);
        }

        private a() {
        }
    }

    public y(int i10, int i11, int i12) {
        this.slidingWindowSize = i11;
        this.extraItemCount = i12;
        this.value = m1.g(f2100F.b(i10, i11, i12), m1.o());
        this.lastFirstVisibleItem = i10;
    }

    private void i(f fVar) {
        this.value.setValue(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.x1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f getValue() {
        return (f) this.value.getValue();
    }

    public final void j(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            i(f2100F.b(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }
}
