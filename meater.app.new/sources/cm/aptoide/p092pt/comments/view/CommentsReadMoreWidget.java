package cm.aptoide.p092pt.comments.view;

import android.view.View;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListCommentsRequest;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class CommentsReadMoreWidget extends Widget<CommentsReadMoreDisplayable> {
    private TextView readMoreButton;

    public CommentsReadMoreWidget(View view) {
        super(view);
    }

    static /* synthetic */ C11234e lambda$bindView$0(C11234e c11234e, Void r1) {
        return c11234e;
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.readMoreButton = (TextView) view.findViewById(C1146R.id.read_more_button);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final CommentsReadMoreDisplayable commentsReadMoreDisplayable, int i2) {
        final C11234e<ListComments> c11234eObserve = ListCommentsRequest.m7448of(commentsReadMoreDisplayable.getResourceId(), commentsReadMoreDisplayable.getNext(), 100, commentsReadMoreDisplayable.isReview(), ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient(), WebService.getDefaultConverter(), ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).observe();
        this.compositeSubscription.m40667a(C8975a.m28573a(this.readMoreButton).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                C11234e c11234e = c11234eObserve;
                CommentsReadMoreWidget.lambda$bindView$0(c11234e, (Void) obj);
                return c11234e;
            }
        }).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                commentsReadMoreDisplayable.getCommentAdder().addComment(((ListComments) obj).getDataList().getList());
            }
        }));
    }
}
