package F3;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowMetricsCalculator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LF3/l;", "", "Landroid/app/Activity;", "activity", "LF3/k;", "a", "(Landroid/app/Activity;)LF3/k;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f4523a;

    /* compiled from: WindowMetricsCalculator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LF3/l$a;", "", "<init>", "()V", "LF3/l;", "a", "()LF3/l;", "Lkotlin/Function1;", "b", "LBa/l;", "decorator", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: F3.l$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4523a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static Ba.l<? super l, ? extends l> decorator = C0087a.f4525B;

        /* compiled from: WindowMetricsCalculator.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF3/l;", "it", "a", "(LF3/l;)LF3/l;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: F3.l$a$a, reason: collision with other inner class name */
        static final class C0087a extends AbstractC3864v implements Ba.l<l, l> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0087a f4525B = new C0087a();

            C0087a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke(l it) {
                C3862t.g(it, "it");
                return it;
            }
        }

        private Companion() {
        }

        public final l a() {
            return decorator.invoke(o.f4526b);
        }
    }

    WindowMetrics a(Activity activity);
}
