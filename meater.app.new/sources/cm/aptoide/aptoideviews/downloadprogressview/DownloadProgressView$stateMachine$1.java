package cm.aptoide.aptoideviews.downloadprogressview;

import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import cm.aptoide.aptoideviews.C1103R;
import cm.aptoide.aptoideviews.common.AnimatedImageView;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import cm.aptoide.aptoideviews.downloadprogressview.Event;
import cm.aptoide.aptoideviews.downloadprogressview.State;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import p241e.p316i.C9052a;

/* compiled from: DownloadProgressView.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class DownloadProgressView$stateMachine$1 extends Lambda implements Function1<C9052a.c<State, Event, Object>, C10775u> {
    final /* synthetic */ DownloadProgressView this$0;

    /* compiled from: DownloadProgressView.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1 */
    static final class C11051 extends Lambda implements Function1<C9052a.c<State, Event, Object>.a<State.Queue>, C10775u> {
        final /* synthetic */ DownloadProgressView this$0;

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends Lambda implements Function2<State.Queue, Event, C10775u> {
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DownloadProgressView downloadProgressView) {
                super(2);
                this.this$0 = downloadProgressView;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C10775u invoke(State.Queue queue, Event event) {
                invoke2(queue, event);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(State.Queue queue, Event event) {
                C9801m.m32346f(queue, "$this$onEnter");
                C9801m.m32346f(event, "it");
                Log.d("DownloadProgressView", "State.Queue");
                this.this$0.resetProgress();
                ((ProgressBar) this.this$0._$_findCachedViewById(C1103R.id.progressBar)).setIndeterminate(true);
                ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(4);
                ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).setVisibility(8);
                ((TextView) this.this$0._$_findCachedViewById(C1103R.id.downloadProgressNumber)).setVisibility(8);
                ((TextSwitcher) this.this$0._$_findCachedViewById(C1103R.id.downloadState)).setText(this.this$0.downloadingText);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$DownloadStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends Lambda implements Function2<State.Queue, Event.DownloadStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Queue> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Queue queue, Event.DownloadStart downloadStart) {
                C9801m.m32346f(queue, "$this$on");
                C9801m.m32346f(downloadStart, "it");
                this.this$0.debouncer.reset();
                return C9052a.c.a.m29091g(this.$this_state, queue, State.InProgress.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends Lambda implements Function2<State.Queue, Event.PauseStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Queue> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Queue queue, Event.PauseStart pauseStart) {
                C9801m.m32346f(queue, "$this$on");
                C9801m.m32346f(pauseStart, "it");
                this.this$0.debouncer.reset();
                return C9052a.c.a.m29091g(this.$this_state, queue, State.InitialPaused.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends Lambda implements Function2<State.Queue, Event.Reset, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Queue> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Queue queue, Event.Reset reset) {
                C9801m.m32346f(queue, "$this$on");
                C9801m.m32346f(reset, "it");
                return C9052a.c.a.m29090c(this.$this_state, queue, null, 1, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$CancelClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends Lambda implements Function2<State.Queue, Event.CancelClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Queue> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Queue queue, Event.CancelClick cancelClick) {
                C9801m.m32346f(queue, "$this$on");
                C9801m.m32346f(cancelClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, queue, State.Canceled.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$InstallStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends Lambda implements Function2<State.Queue, Event.InstallStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Queue> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Queue queue, Event.InstallStart installStart) {
                C9801m.m32346f(queue, "$this$on");
                C9801m.m32346f(installStart, "it");
                return C9052a.c.a.m29091g(this.$this_state, queue, State.Installing.INSTANCE, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11051(DownloadProgressView downloadProgressView) {
            super(1);
            this.this$0 = downloadProgressView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
            invoke2(aVar);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9052a.c<State, Event, Object>.a<State.Queue> aVar) {
            C9801m.m32346f(aVar, "$this$state");
            aVar.m29095e(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, aVar);
            C9052a.d.a aVar2 = C9052a.d.f34872a;
            aVar.m29094d(aVar2.m29101a(Event.DownloadStart.class), anonymousClass2);
            aVar.m29094d(aVar2.m29101a(Event.PauseStart.class), new AnonymousClass3(this.this$0, aVar));
            aVar.m29094d(aVar2.m29101a(Event.Reset.class), new AnonymousClass4(aVar));
            aVar.m29094d(aVar2.m29101a(Event.CancelClick.class), new AnonymousClass5(this.this$0, aVar));
            aVar.m29094d(aVar2.m29101a(Event.InstallStart.class), new AnonymousClass6(aVar));
        }
    }

    /* compiled from: DownloadProgressView.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$2 */
    static final class C11062 extends Lambda implements Function1<C9052a.c<State, Event, Object>.a<State.Canceled>, C10775u> {
        final /* synthetic */ DownloadProgressView this$0;

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends Lambda implements Function2<State.Canceled, Event, C10775u> {
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DownloadProgressView downloadProgressView) {
                super(2);
                this.this$0 = downloadProgressView;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C10775u invoke(State.Canceled canceled, Event event) {
                invoke2(canceled, event);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(State.Canceled canceled, Event event) {
                C9801m.m32346f(canceled, "$this$onEnter");
                C9801m.m32346f(event, "it");
                Log.d("DownloadProgressView", "State.Canceled");
                this.this$0.resetProgress();
                ((ProgressBar) this.this$0._$_findCachedViewById(C1103R.id.progressBar)).setIndeterminate(true);
                if (this.this$0.isPausable) {
                    ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(0);
                    ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).setVisibility(8);
                } else {
                    ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(0);
                    ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).setVisibility(8);
                }
                ((TextView) this.this$0._$_findCachedViewById(C1103R.id.downloadProgressNumber)).setVisibility(8);
                ((TextSwitcher) this.this$0._$_findCachedViewById(C1103R.id.downloadState)).setText(this.this$0.downloadingText);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends Lambda implements Function2<State.Canceled, Event.Reset, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Canceled> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(C9052a.c<State, Event, Object>.a<State.Canceled> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Canceled canceled, Event.Reset reset) {
                C9801m.m32346f(canceled, "$this$on");
                C9801m.m32346f(reset, "it");
                return C9052a.c.a.m29091g(this.$this_state, canceled, State.Queue.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$DownloadStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends Lambda implements Function2<State.Canceled, Event.DownloadStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Canceled> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Canceled> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Canceled canceled, Event.DownloadStart downloadStart) {
                C9801m.m32346f(canceled, "$this$on");
                C9801m.m32346f(downloadStart, "it");
                this.this$0.debouncer.reset();
                return C9052a.c.a.m29091g(this.$this_state, canceled, State.InProgress.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends Lambda implements Function2<State.Canceled, Event.PauseStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Canceled> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Canceled> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Canceled canceled, Event.PauseStart pauseStart) {
                C9801m.m32346f(canceled, "$this$on");
                C9801m.m32346f(pauseStart, "it");
                this.this$0.debouncer.reset();
                return C9052a.c.a.m29091g(this.$this_state, canceled, State.InitialPaused.INSTANCE, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11062(DownloadProgressView downloadProgressView) {
            super(1);
            this.this$0 = downloadProgressView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object>.a<State.Canceled> aVar) {
            invoke2(aVar);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9052a.c<State, Event, Object>.a<State.Canceled> aVar) {
            C9801m.m32346f(aVar, "$this$state");
            aVar.m29095e(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar);
            C9052a.d.a aVar2 = C9052a.d.f34872a;
            aVar.m29094d(aVar2.m29101a(Event.Reset.class), anonymousClass2);
            aVar.m29094d(aVar2.m29101a(Event.DownloadStart.class), new AnonymousClass3(this.this$0, aVar));
            aVar.m29094d(aVar2.m29101a(Event.PauseStart.class), new AnonymousClass4(this.this$0, aVar));
        }
    }

    /* compiled from: DownloadProgressView.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3 */
    static final class C11073 extends Lambda implements Function1<C9052a.c<State, Event, Object>.a<State.InProgress>, C10775u> {
        final /* synthetic */ DownloadProgressView this$0;

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends Lambda implements Function2<State.InProgress, Event, C10775u> {
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DownloadProgressView downloadProgressView) {
                super(2);
                this.this$0 = downloadProgressView;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C10775u invoke(State.InProgress inProgress, Event event) {
                invoke2(inProgress, event);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(State.InProgress inProgress, Event event) {
                C9801m.m32346f(inProgress, "$this$onEnter");
                C9801m.m32346f(event, "it");
                Log.d("DownloadProgressView", "State.InProgress");
                DownloadProgressView downloadProgressView = this.this$0;
                downloadProgressView.setProgress(downloadProgressView.currentProgress);
                ((ProgressBar) this.this$0._$_findCachedViewById(C1103R.id.progressBar)).setIndeterminate(false);
                if (this.this$0.isPausable) {
                    ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(8);
                    ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).setVisibility(0);
                } else {
                    ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(0);
                    ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).setVisibility(8);
                }
                ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).play();
                ((TextView) this.this$0._$_findCachedViewById(C1103R.id.downloadProgressNumber)).setVisibility(0);
                ((TextSwitcher) this.this$0._$_findCachedViewById(C1103R.id.downloadState)).setText(this.this$0.downloadingText);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends Lambda implements Function2<State.InProgress, Event.PauseClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InProgress> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InProgress inProgress, Event.PauseClick pauseClick) {
                C9801m.m32346f(inProgress, "$this$on");
                C9801m.m32346f(pauseClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.PAUSE, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, inProgress, State.Paused.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends Lambda implements Function2<State.InProgress, Event.PauseStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InProgress> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InProgress inProgress, Event.PauseStart pauseStart) {
                C9801m.m32346f(inProgress, "$this$on");
                C9801m.m32346f(pauseStart, "it");
                return C9052a.c.a.m29091g(this.$this_state, inProgress, State.Paused.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$InstallStart;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3$4, reason: invalid class name */
        static final class AnonymousClass4 extends Lambda implements Function2<State.InProgress, Event.InstallStart, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InProgress> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InProgress inProgress, Event.InstallStart installStart) {
                C9801m.m32346f(inProgress, "$this$on");
                C9801m.m32346f(installStart, "it");
                return C9052a.c.a.m29091g(this.$this_state, inProgress, State.Installing.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3$5, reason: invalid class name */
        static final class AnonymousClass5 extends Lambda implements Function2<State.InProgress, Event.Reset, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InProgress> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InProgress inProgress, Event.Reset reset) {
                C9801m.m32346f(inProgress, "$this$on");
                C9801m.m32346f(reset, "it");
                return C9052a.c.a.m29091g(this.$this_state, inProgress, State.Queue.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$CancelClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$3$6, reason: invalid class name */
        static final class AnonymousClass6 extends Lambda implements Function2<State.InProgress, Event.CancelClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InProgress> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InProgress inProgress, Event.CancelClick cancelClick) {
                C9801m.m32346f(inProgress, "$this$on");
                C9801m.m32346f(cancelClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, inProgress, State.Canceled.INSTANCE, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11073(DownloadProgressView downloadProgressView) {
            super(1);
            this.this$0 = downloadProgressView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
            invoke2(aVar);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9052a.c<State, Event, Object>.a<State.InProgress> aVar) {
            C9801m.m32346f(aVar, "$this$state");
            aVar.m29095e(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, aVar);
            C9052a.d.a aVar2 = C9052a.d.f34872a;
            aVar.m29094d(aVar2.m29101a(Event.PauseClick.class), anonymousClass2);
            aVar.m29094d(aVar2.m29101a(Event.PauseStart.class), new AnonymousClass3(aVar));
            aVar.m29094d(aVar2.m29101a(Event.InstallStart.class), new AnonymousClass4(aVar));
            aVar.m29094d(aVar2.m29101a(Event.Reset.class), new AnonymousClass5(aVar));
            aVar.m29094d(aVar2.m29101a(Event.CancelClick.class), new AnonymousClass6(this.this$0, aVar));
        }
    }

    /* compiled from: DownloadProgressView.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$4 */
    static final class C11084 extends Lambda implements Function1<C9052a.c<State, Event, Object>.a<State.Paused>, C10775u> {
        final /* synthetic */ DownloadProgressView this$0;

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends Lambda implements Function2<State.Paused, Event, C10775u> {
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DownloadProgressView downloadProgressView) {
                super(2);
                this.this$0 = downloadProgressView;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C10775u invoke(State.Paused paused, Event event) {
                invoke2(paused, event);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(State.Paused paused, Event event) {
                C9801m.m32346f(paused, "$this$onEnter");
                C9801m.m32346f(event, "it");
                Log.d("DownloadProgressView", "State.Paused");
                ((ProgressBar) this.this$0._$_findCachedViewById(C1103R.id.progressBar)).setIndeterminate(false);
                ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(0);
                DownloadProgressView downloadProgressView = this.this$0;
                int i2 = C1103R.id.resumePauseButton;
                ((AnimatedImageView) downloadProgressView._$_findCachedViewById(i2)).setVisibility(0);
                ((AnimatedImageView) this.this$0._$_findCachedViewById(i2)).playReverse();
                ((TextView) this.this$0._$_findCachedViewById(C1103R.id.downloadProgressNumber)).setVisibility(0);
                ((TextSwitcher) this.this$0._$_findCachedViewById(C1103R.id.downloadState)).setText(this.this$0.pausedText);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$ResumeClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends Lambda implements Function2<State.Paused, Event.ResumeClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Paused> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Paused> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Paused paused, Event.ResumeClick resumeClick) {
                C9801m.m32346f(paused, "$this$on");
                C9801m.m32346f(resumeClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.RESUME, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, paused, State.InProgress.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$CancelClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends Lambda implements Function2<State.Paused, Event.CancelClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Paused> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.Paused> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Paused paused, Event.CancelClick cancelClick) {
                C9801m.m32346f(paused, "$this$on");
                C9801m.m32346f(cancelClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, paused, State.Canceled.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$4$4, reason: invalid class name */
        static final class AnonymousClass4 extends Lambda implements Function2<State.Paused, Event.Reset, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Paused> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(C9052a.c<State, Event, Object>.a<State.Paused> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Paused paused, Event.Reset reset) {
                C9801m.m32346f(paused, "$this$on");
                C9801m.m32346f(reset, "it");
                return C9052a.c.a.m29091g(this.$this_state, paused, State.Queue.INSTANCE, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11084(DownloadProgressView downloadProgressView) {
            super(1);
            this.this$0 = downloadProgressView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object>.a<State.Paused> aVar) {
            invoke2(aVar);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9052a.c<State, Event, Object>.a<State.Paused> aVar) {
            C9801m.m32346f(aVar, "$this$state");
            aVar.m29095e(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, aVar);
            C9052a.d.a aVar2 = C9052a.d.f34872a;
            aVar.m29094d(aVar2.m29101a(Event.ResumeClick.class), anonymousClass2);
            aVar.m29094d(aVar2.m29101a(Event.CancelClick.class), new AnonymousClass3(this.this$0, aVar));
            aVar.m29094d(aVar2.m29101a(Event.Reset.class), new AnonymousClass4(aVar));
        }
    }

    /* compiled from: DownloadProgressView.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$5 */
    static final class C11095 extends Lambda implements Function1<C9052a.c<State, Event, Object>.a<State.InitialPaused>, C10775u> {
        final /* synthetic */ DownloadProgressView this$0;

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends Lambda implements Function2<State.InitialPaused, Event, C10775u> {
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DownloadProgressView downloadProgressView) {
                super(2);
                this.this$0 = downloadProgressView;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C10775u invoke(State.InitialPaused initialPaused, Event event) {
                invoke2(initialPaused, event);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(State.InitialPaused initialPaused, Event event) {
                C9801m.m32346f(initialPaused, "$this$onEnter");
                C9801m.m32346f(event, "it");
                Log.d("DownloadProgressView", "State.InitialPaused");
                ((ProgressBar) this.this$0._$_findCachedViewById(C1103R.id.progressBar)).setIndeterminate(false);
                ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(0);
                DownloadProgressView downloadProgressView = this.this$0;
                int i2 = C1103R.id.resumePauseButton;
                ((AnimatedImageView) downloadProgressView._$_findCachedViewById(i2)).setVisibility(0);
                ((AnimatedImageView) this.this$0._$_findCachedViewById(i2)).setReverseAsDefault();
                ((TextView) this.this$0._$_findCachedViewById(C1103R.id.downloadProgressNumber)).setVisibility(0);
                DownloadProgressView downloadProgressView2 = this.this$0;
                downloadProgressView2.setProgress(downloadProgressView2.currentProgress);
                ((TextSwitcher) this.this$0._$_findCachedViewById(C1103R.id.downloadState)).setText(this.this$0.pausedText);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$ResumeClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends Lambda implements Function2<State.InitialPaused, Event.ResumeClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InitialPaused> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.InitialPaused> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InitialPaused initialPaused, Event.ResumeClick resumeClick) {
                C9801m.m32346f(initialPaused, "$this$on");
                C9801m.m32346f(resumeClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.RESUME, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, initialPaused, State.InProgress.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$CancelClick;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends Lambda implements Function2<State.InitialPaused, Event.CancelClick, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InitialPaused> $this_state;
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DownloadProgressView downloadProgressView, C9052a.c<State, Event, Object>.a<State.InitialPaused> aVar) {
                super(2);
                this.this$0 = downloadProgressView;
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InitialPaused initialPaused, Event.CancelClick cancelClick) {
                C9801m.m32346f(initialPaused, "$this$on");
                C9801m.m32346f(cancelClick, "it");
                DownloadEventListener downloadEventListener = this.this$0.eventListener;
                if (downloadEventListener != null) {
                    downloadEventListener.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.payload));
                }
                return C9052a.c.a.m29091g(this.$this_state, initialPaused, State.Canceled.INSTANCE, null, 2, null);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$5$4, reason: invalid class name */
        static final class AnonymousClass4 extends Lambda implements Function2<State.InitialPaused, Event.Reset, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.InitialPaused> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(C9052a.c<State, Event, Object>.a<State.InitialPaused> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.InitialPaused initialPaused, Event.Reset reset) {
                C9801m.m32346f(initialPaused, "$this$on");
                C9801m.m32346f(reset, "it");
                return C9052a.c.a.m29091g(this.$this_state, initialPaused, State.Queue.INSTANCE, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11095(DownloadProgressView downloadProgressView) {
            super(1);
            this.this$0 = downloadProgressView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object>.a<State.InitialPaused> aVar) {
            invoke2(aVar);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9052a.c<State, Event, Object>.a<State.InitialPaused> aVar) {
            C9801m.m32346f(aVar, "$this$state");
            aVar.m29095e(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, aVar);
            C9052a.d.a aVar2 = C9052a.d.f34872a;
            aVar.m29094d(aVar2.m29101a(Event.ResumeClick.class), anonymousClass2);
            aVar.m29094d(aVar2.m29101a(Event.CancelClick.class), new AnonymousClass3(this.this$0, aVar));
            aVar.m29094d(aVar2.m29101a(Event.Reset.class), new AnonymousClass4(aVar));
        }
    }

    /* compiled from: DownloadProgressView.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$6 */
    static final class C11106 extends Lambda implements Function1<C9052a.c<State, Event, Object>.a<State.Installing>, C10775u> {
        final /* synthetic */ DownloadProgressView this$0;

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends Lambda implements Function2<State.Installing, Event, C10775u> {
            final /* synthetic */ DownloadProgressView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DownloadProgressView downloadProgressView) {
                super(2);
                this.this$0 = downloadProgressView;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C10775u invoke(State.Installing installing, Event event) {
                invoke2(installing, event);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(State.Installing installing, Event event) {
                C9801m.m32346f(installing, "$this$onEnter");
                C9801m.m32346f(event, "it");
                Log.d("DownloadProgressView", "State.Installing");
                ((ProgressBar) this.this$0._$_findCachedViewById(C1103R.id.progressBar)).setIndeterminate(true);
                ((ImageView) this.this$0._$_findCachedViewById(C1103R.id.cancelButton)).setVisibility(4);
                ((AnimatedImageView) this.this$0._$_findCachedViewById(C1103R.id.resumePauseButton)).setVisibility(8);
                ((TextView) this.this$0._$_findCachedViewById(C1103R.id.downloadProgressNumber)).setVisibility(8);
                ((TextSwitcher) this.this$0._$_findCachedViewById(C1103R.id.downloadState)).setText(this.this$0.installingText);
            }
        }

        /* compiled from: DownloadProgressView.kt */
        @Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "it", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends Lambda implements Function2<State.Installing, Event.Reset, C9052a.b.a.C11525a<? extends State, ? extends Object>> {
            final /* synthetic */ C9052a.c<State, Event, Object>.a<State.Installing> $this_state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(C9052a.c<State, Event, Object>.a<State.Installing> aVar) {
                super(2);
                this.$this_state = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final C9052a.b.a.C11525a<State, Object> invoke(State.Installing installing, Event.Reset reset) {
                C9801m.m32346f(installing, "$this$on");
                C9801m.m32346f(reset, "it");
                return C9052a.c.a.m29091g(this.$this_state, installing, State.Queue.INSTANCE, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11106(DownloadProgressView downloadProgressView) {
            super(1);
            this.this$0 = downloadProgressView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object>.a<State.Installing> aVar) {
            invoke2(aVar);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9052a.c<State, Event, Object>.a<State.Installing> aVar) {
            C9801m.m32346f(aVar, "$this$state");
            aVar.m29095e(new AnonymousClass1(this.this$0));
            aVar.m29094d(C9052a.d.f34872a.m29101a(Event.Reset.class), new AnonymousClass2(aVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadProgressView$stateMachine$1(DownloadProgressView downloadProgressView) {
        super(1);
        this.this$0 = downloadProgressView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C10775u invoke(C9052a.c<State, Event, Object> cVar) {
        invoke2(cVar);
        return C10775u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C9052a.c<State, Event, Object> cVar) {
        C9801m.m32346f(cVar, "$this$create");
        cVar.m29088b(State.Queue.INSTANCE);
        C11051 c11051 = new C11051(this.this$0);
        C9052a.d.a aVar = C9052a.d.f34872a;
        cVar.m29089c(aVar.m29101a(State.Queue.class), c11051);
        cVar.m29089c(aVar.m29101a(State.Canceled.class), new C11062(this.this$0));
        cVar.m29089c(aVar.m29101a(State.InProgress.class), new C11073(this.this$0));
        cVar.m29089c(aVar.m29101a(State.Paused.class), new C11084(this.this$0));
        cVar.m29089c(aVar.m29101a(State.InitialPaused.class), new C11095(this.this$0));
        cVar.m29089c(aVar.m29101a(State.Installing.class), new C11106(this.this$0));
    }
}
