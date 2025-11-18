package D5;

import Ba.p;
import Ub.n;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.net.Uri;
import android.view.Z;
import androidx.media3.datasource.cache.a;
import b2.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import o4.EnumC4125A;
import o4.Step;
import o4.StepContent;
import o4.StepContentMeta;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import y5.AbstractC5128a;

/* compiled from: RecipeSummaryViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LD5/g;", "Ly5/a;", "LG5/a;", "preferences", "LI5/a;", "cacheManager", "<init>", "(LG5/a;LI5/a;)V", "La2/g;", "dataSpec", "Lb2/d$a;", "progressListener", "Landroidx/media3/datasource/cache/a$c;", "cacheDataSource", "Loa/F;", "a0", "(La2/g;Lb2/d$a;Landroidx/media3/datasource/cache/a$c;)V", "d0", "()V", "b0", "g", "t", "LG5/a;", "getPreferences", "()LG5/a;", "u", "LI5/a;", "Lb2/d;", "v", "Lb2/d;", "cacheWriterJob", "LXb/v0;", "w", "LXb/v0;", "cachingJob", "", "x", "Z", "shouldCacheRunning", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g extends AbstractC5128a {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final G5.a preferences;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final I5.a cacheManager;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private b2.d cacheWriterJob;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 cachingJob;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCacheRunning;

    /* compiled from: RecipeSummaryViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.summary.RecipeSummaryViewModel$preloadFirstStepOfRecipe$1$1$1$1$1", f = "RecipeSummaryViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f3395B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ a2.g f3397D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d.a f3398E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2.g gVar, d.a aVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f3397D = gVar;
            this.f3398E = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return g.this.new a(this.f3397D, this.f3398E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f3395B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            g gVar = g.this;
            gVar.a0(this.f3397D, this.f3398E, gVar.cacheManager.getCacheDataSourceFactory());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(G5.a preferences, I5.a cacheManager) {
        super(preferences);
        C3862t.g(preferences, "preferences");
        C3862t.g(cacheManager, "cacheManager");
        this.preferences = preferences;
        this.cacheManager = cacheManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(a2.g dataSpec, d.a progressListener, a.c cacheDataSource) {
        Object objA;
        try {
            C4172q.Companion companion = C4172q.INSTANCE;
            b2.d dVar = new b2.d(cacheDataSource.a(), dataSpec, null, progressListener);
            this.cacheWriterJob = dVar;
            dVar.a();
            objA = C4172q.a(C4153F.f46609a);
        } catch (Throwable th) {
            C4172q.Companion companion2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        Throwable thB = C4172q.b(objA);
        if (thB != null) {
            thB.printStackTrace();
        }
    }

    private final void d0() {
        b2.d dVar = this.cacheWriterJob;
        if (dVar != null) {
            dVar.b();
        }
        InterfaceC1867v0 interfaceC1867v0 = this.cachingJob;
        if (interfaceC1867v0 == null || !interfaceC1867v0.a()) {
            return;
        }
        InterfaceC1867v0 interfaceC1867v02 = this.cachingJob;
        C3862t.d(interfaceC1867v02);
        InterfaceC1867v0.a.a(interfaceC1867v02, null, 1, null);
        this.shouldCacheRunning = false;
    }

    public final void b0() {
        StepContent stepContent;
        StepContentMeta meta;
        String video;
        Object next;
        List<StepContent> listD = ((Step) r.j0(z().n())).d();
        if (listD != null) {
            Iterator<T> it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((StepContent) next).getType() == EnumC4125A.f46413J) {
                        break;
                    }
                }
            }
            stepContent = (StepContent) next;
        } else {
            stepContent = null;
        }
        if (stepContent == null || (meta = stepContent.getMeta()) == null || (video = meta.getVideo()) == null || n.a0(video)) {
            return;
        }
        this.cachingJob = C1841i.d(Z.a(this), Xb.Z.b(), null, new a(new a2.g(Uri.parse(video)), new d.a() { // from class: D5.f
            @Override // b2.d.a
            public final void a(long j10, long j11, long j12) {
                g.c0(j10, j11, j12);
            }
        }, null), 2, null);
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(long j10, long j11, long j12) {
    }
}
